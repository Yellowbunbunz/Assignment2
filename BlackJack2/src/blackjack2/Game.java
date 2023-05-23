/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package blackjack2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author brook
 */
public class Game
{
    //Instance Variables
    Player player;
    Dealer dealer;
    Deck deck;
    private FILEIO fileio;
    private double playerBalance;

   
    //Game Constructor Makes Player, Dealer and Deck.
    Game(String name) throws IOException
    {
        fileio = new FILEIO("balances.txt");
        player = new Player(name, fileio.readBalance(name));
        dealer = new Dealer("Dealer");
        deck = new Deck();
        playerBalance = fileio.readBalance(name);
    }
   
    //Start method
    public void Start()
    {
        deck.makeDeck();
        deck.shuffleCards();
        deal();
        play();
    }
   
    //Play method.
    public void play()
    {
        System.out.println("\n" + player.getName() + "'s cards: \n" + player.getHand());
        System.out.println("Hand Value: " + player.getHand().getValue());
        System.out.println("Current Balance: " + playerBalance);

        System.out.println("\n" + dealer.getName() + "'s cards: \n" + dealer.getHand());
        System.out.println("Hand Value: " + dealer.getHand().getValue());

        while (player.wantsToHit() == true && player.getHand().getValue() < 21)
        {
            System.out.println("You have hit!\n");
            player.getHand().addCard(deck.removeCard());
            System.out.println("Your Hand: \n" + player.getHand());
            System.out.println("Hand Value: " + player.getHand().getValue());

            if (player.getHand().getValue() >= 21)
            {
                break;
            }
        }

        if (player.getHand().getValue() <= 21) {
            System.out.println("Player Stands!");
        }

        while (dealer.wantsToHit() == true && dealer.getHand().getValue() < 17)
        {
            System.out.println("Dealer has hit!\n");
            dealer.getHand().addCard(deck.removeCard());
            System.out.println("Dealer Hand: \n" + dealer.getHand());
            System.out.println("Hand Value: " + dealer.getHand().getValue());

            if (dealer.getHand().getValue() >= 21)
            {
                break;
            }
        }
       
        if (dealer.getHand().getValue() <= 21) {
            System.out.println("Dealer Stands!");
        }

        if (player.getHand().getValue() > 21 && dealer.getHand().getValue() <= 21)
        {
            System.out.println("Player Busts, Dealer Wins!");
            player.updateBalance(-100);
        }
        else if (dealer.getHand().getValue() > 21 && player.getHand().getValue() <= 21)
        {
            System.out.println("Dealer Busts, Player Wins!");
            player.updateBalance(100);
        }
        else if (dealer.getHand().getValue() > player.getHand().getValue())
        {
            System.out.println("Dealer Wins!");
            player.updateBalance(-100);
        }
        else if (player.getHand().getValue() > dealer.getHand().getValue())
        {
            System.out.println("Player wins!");
            player.updateBalance(100);
        }
        else if (player.getHand().getValue() == dealer.getHand().getValue())
        {
            System.out.println("You tied with the dealer!");
        }
        else if (player.getHand().getValue() > 21 && dealer.getHand().getValue() > 21)
        {
            System.out.println("All Players Bust No Winner!");
        }

        // Make sure balance doesn't go below zero
        if (player.getBalance() < 0) {
            player.setBalance(0);
        }

        try {
            fileio.writeBalance(player.getName(), player.getBalance());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println(player.getName() + " has a current balance of: " + player.getBalance());
    }
    //Deals the cards
    public void deal()
    {
        player.getHand().addCard(deck.removeCard());
        player.getHand().addCard(deck.removeCard());
        dealer.getHand().addCard(deck.removeCard());
        dealer.getHand().addCard(deck.removeCard());
    }
}
