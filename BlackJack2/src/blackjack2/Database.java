/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package blackjack2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database
{

    public static void insertPlayerData(Connection connection, int playerID, String playerName, int playerCurrency) {
        String sql = "INSERT INTO players (playerID, playerName, playerCurrency) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, playerID);
            statement.setString(2, playerName);
            statement.setInt(3, playerCurrency);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Player data inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

