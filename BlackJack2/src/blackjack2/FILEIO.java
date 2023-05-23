/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack2;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FILEIO {
    //Instance Variables
    private String filename;
    HashMap<String, Double> player_balance;

    //File I/O Constructor
    public FILEIO(String filename) {
        this.filename = filename;
        player_balance = new HashMap<>();
    }

    //Read Balance of the player, if they don't exist write them into the file.
    public double readBalance(String playerName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        String name;
        double balance;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(":");
            name = parts[0];
            balance = Double.parseDouble(parts[1]);
            player_balance.put(name, balance);
        }

        br.close();

        if (player_balance.containsKey(playerName)) {
            return player_balance.get(playerName);
        } 
        else 
        {
            // add player to file with default balance of 100.0
            player_balance.put(playerName, 500.0);
            FileWriter writer = new FileWriter(filename, true);
            writer.write(playerName + ":500\n");
            writer.close();

            return 500.0;
        }
    }
    
    //Writes balance to the player
    public void writeBalance(String playerName, double balance) throws IOException {
        // First, read in the existing balances from the file
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        String name;
        double oldBalance;
        boolean playerFound = false;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(":");
            name = parts[0];
            oldBalance = Double.parseDouble(parts[1]);
            player_balance.put(name, oldBalance);
            if (name.equals(playerName)) {
                playerFound = true;
            }
        }
        br.close();

        // Update the hashmap with the new balance for the new player
        if (playerFound) {
            player_balance.put(playerName, balance);
        } else {
            throw new IllegalArgumentException("Player not found in file.");
        }

        // Write the updated balances to the file
        FileWriter writer = new FileWriter(filename);
        for (String key : player_balance.keySet()) {
            writer.write(key + ":" + player_balance.get(key) + "\n");
        }
        writer.close();
    }
}
