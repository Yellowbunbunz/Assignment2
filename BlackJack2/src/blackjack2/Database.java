/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package blackjack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database
{
    
    private static final String userName = "BlackJackDB"; //your DB username
    private static final String password = "BlackJackDB"; //your DB password
    private static final String URL = "jdbc:derby://localhost:1527/BlackJackDB";  //url of the DB host
    
    Connection conn;
    
    public Database()
    {
        establishConnection();
    }
    
    public static void main(String[] args)
    {
        Database database = new Database();
        System.out.println(database.getConnection());
    }
    
    public Connection getConnection()
    {
        return this.conn;
    }
    
    //Establish connection
    public void establishConnection()
    {
        try
        {
            conn = DriverManager.getConnection(URL, userName, password);
            System.out.println("Connected to the database.");
        } catch (SQLException e)
        {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
        
    }
    
    public static void insertPlayerData(Connection connection, int playerID, String playerName, double playerCurrency) {
        String sql = "INSERT INTO players (playerID, playerName, playerCurrency) VALUES (?, ?, ?)";
        
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, playerID);
            statement.setString(2, playerName);
            statement.setDouble(3, playerCurrency);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Player data inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

