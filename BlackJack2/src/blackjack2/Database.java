/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package blackjack2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Database
{
    private static final String DB_URL = "jdbc:derby://localhost:1527/BlackJackDB [BlackJackDB on BLACKJACKDB]";
    private static final String DB_USER = "BlackJackDB";
    private static final String DB_PASSWORD = "BlackJackDB";
    
    public static void insertDataFromTextFile(String filePath)
    {
        try (Connection conn = getConnection();
                BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            
            String sql = "INSERT INTO players (playerid, playername, playerpassword, playercurrency) VALUES (?, ?, ?, ?)";
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    String playerId = parts[0];
                    String playerName = parts[1];
                    String playerPassword = parts[2];
                    String playerCurrency = parts[3];
                    
                    setStatementParameters(stmt, playerId, playerName, playerPassword, playerCurrency);
                    stmt.executeUpdate();
                }
                System.out.println("Data inserted successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    
    private static void setStatementParameters(PreparedStatement stmt, String playerId, String playerName,
            String playerPassword, String playerCurrency) throws SQLException 
    {
        stmt.setString(1, playerId);
        stmt.setString(2, playerName);
        stmt.setString(3, playerPassword);
        stmt.setString(4, playerCurrency);
    }
}

