/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author brook
 */
public class BlackJack2
{

    
    public static void main(String[] args) throws IOException 
    {
        String name = "";
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Player insert your name: ");
        name = scanner.nextLine();
        
        Game game = new Game(name);
        
        game.Start();
    }
    
}
