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
        BlackJack2 blackjack2 = new BlackJack2();
        BlackJackGUI blackjackGUI = new BlackJackGUI(blackjack2);
        blackjackGUI.playGame();

        // Set up the JFrame
        blackjackGUI.pack();
        blackjackGUI.setVisible(true);
    }
    
    public String getPlayerName()
    {
        String name = "";
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Player insert your name: ");
        name = scanner.nextLine();
       
        return name;
    }
    
}
