/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package blackjack2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Database
{
    
    private static final String userName = "BlackJackDB"; 
    private static final String password = "BlackJackDB"; 
    private static final String URL = "jdbc:derby:BlackJackDB_Edb; create=true";  
    
    Connection conn;
    private Statement statement;
    
    public Database()
    {
        setConnection();
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
    
    public void setConnection()
    {
        try
        {
            conn = DriverManager.getConnection(URL, userName, password);
            System.out.println("Connected to the database");
        } 
        catch (SQLException e)
        {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        }
    }
    
    public void createCurrencyTable(Statement statement) 
    {
        try
        {
            if (!tableExists(statement, "Currency"))
            {
                String sql = "CREATE TABLE Currency (" +
                        "playerID INT PRIMARY KEY, " +
                        "playerName VARCHAR(50), " +
                        "playerCurrency DOUBLE" +
                        ")";
                
                statement.execute(sql);
                
                System.out.println("Currency table created.");
            } 
            else
            {
                System.out.println("Currency table already exists");
            }
        } 
        catch (SQLException e)
        {
            System.out.println("Failed to create the Currency table.");
            e.printStackTrace();
        }
    }
    
    public boolean tableExists(Statement statement, String tableName) throws SQLException
    {
        String sql = "SELECT 1 FROM " + tableName + " FETCH FIRST ROW ONLY";
        try 
        {
            statement.execute(sql);
            return true;
        }
        catch (SQLException e)
        {
            return false;
        }
    }
    
    public void insertPlayerData(int playerID, String playerName, double playerCurrency)
    {
        String sql = "INSERT INTO Currency (playerID, playerName, playerCurrency) VALUES (?, ?, ?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) 
        {
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
    
    public int getLastAssignedPlayerID() 
    {
        try
        {
            String sql = "SELECT MAX(playerID) FROM Currency";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next())
            {
                return resultSet.getInt(1);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return 0;
    }
    
    public void showTables()
    {
        try 
        {
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet rs = metaData.getTables(null, null, null, new String[] { "TABLE" });
            
            while (rs.next()) 
            {
                String tableName = rs.getString("TABLE_NAME");
                System.out.println("Table: " + tableName);
                System.out.println("----------");
                
                try (Statement statement = conn.createStatement();
                        ResultSet tableData = statement.executeQuery("SELECT * FROM " + tableName)) {
                    ResultSetMetaData metadata = tableData.getMetaData();
                    int columnCount = metadata.getColumnCount();
                    
                    for (int i = 1; i <= columnCount; i++) 
                    {
                        System.out.print(metadata.getColumnName(i) + "\t");
                    }
                    System.out.println();
                    
                    while (tableData.next()) 
                    {
                        for (int i = 1; i <= columnCount; i++) 
                        {
                            System.out.print(tableData.getString(i) + "\t");
                        }
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }
}

