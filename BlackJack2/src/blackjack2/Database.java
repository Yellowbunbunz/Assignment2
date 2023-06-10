/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package blackjack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database
{
    
    private static final String userName = "BlackJackDB"; //your DB username
    private static final String password = "BlackJackDB"; //your DB password
    private static final String URL = "jdbc:derby://localhost:1527/BlackJackDB";  //url of the DB host
    
    Connection conn;
    private Statement statement;
    
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
    
    public void createCurrencyTable(Statement statement)
    {
        try {
            // SQL statement to create the currency table
            String sql = "CREATE TABLE Currency (" +
                    "playerID INT PRIMARY KEY, " +
                    "playerName VARCHAR(50), " +
                    "playerCurrency DOUBLE" +
                    ")";
            
            statement.execute(sql);
            
            System.out.println("Currency table created.");
        } catch (SQLException e) {
            System.out.println("Failed to create the Currency table.");
            e.printStackTrace();
        }
    }
    
    public void insertPlayerData(int playerID, String playerName, double playerCurrency)
    {
        String sql = "INSERT INTO Currency (playerID, playerName, playerCurrency) VALUES (?, ?, ?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, playerID);
            statement.setString(2, playerName);
            statement.setDouble(3, playerCurrency);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0)
            {
                System.out.println("Player data inserted successfully!");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public int getLastAssignedPlayerID() {
        try {
            String sql = "SELECT MAX(playerID) FROM Currency";
            Statement statement = conn.createStatement(); // Create a new statement object
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

