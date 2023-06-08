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
    BlackJackGUI2 gui;

   
    //Game Constructor Makes Player, Dealer and Deck.
    Game(String name, BlackJackGUI2 gui) throws IOException
    {
        fileio = new FILEIO("balances.txt");
        player = new Player(name, fileio.readBalance(name));
        dealer = new Dealer("Dealer");
        deck = new Deck();
        playerBalance = fileio.readBalance(name);
        this.gui = gui;
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
        boolean playersTurn = true; 
        
        /*gui.updatePlayerCards("\n" + player.getName() + "'s cards: \n" + player.getHand());
        gui.updateDealerHandValue("Hand Value: " + player.getHand().getValue());
        gui.updatePlayerBalance("Current Balance: " + playerBalance);

        gui.updateDealerCards("\n" + dealer.getName() + "'s cards: \n" + dealer.getHand());
        gui.updateDealerHandValue("Hand Value: " + dealer.getHand().getValue());*/
        
        gui.showGamePanel();
        gui.updateUI();


        while (player.wantsToHit() == true && player.getHand().getValue() < 21)
        {
            System.out.println("You have hit!\n");
            gui.updatePlayerCards("Your Hand: \n" + player.getHand());
            gui.updatePlayerHandValue("Hand Value: " + player.getHand().getValue());

            if (player.getHand().getValue() >= 21 || player.wantsToStand() == true)
            {
                player.stand = true;
                break;
            }
        }
                     playersTurn = false;

        if (player.getHand().getValue() <= 21) {
            System.out.println("Player Stands!");
        }

        while (dealer.wantsToHit() == true && playersTurn == false)
        {
            System.out.println("Dealer has hit!\n");
            dealer.getHand().addCard(deck.removeCard());
            /*gui.updateDealerCards("Dealer Hand: \n" + dealer.getHand());
            gui.updateDealerHandValue("Hand Value: " + dealer.getHand().getValue());*/
            if (dealer.getHand().getValue() >= 21)
            {
                break;
            }
        }
                    gui.updateUI();
       
        if (dealer.getHand().getValue() <= 21) {
            System.out.println("Dealer Stands!");
        }

        if (player.getHand().getValue() > 21 && dealer.getHand().getValue() <= 21)
        {
            gui.updateGameStatus("Player Busts, Dealer Wins!");
            player.updateBalance(-100);
        }
        else if (dealer.getHand().getValue() > 21 && player.getHand().getValue() <= 21)
        {
            gui.updateGameStatus("Dealer Busts, Player Wins!");
            player.updateBalance(100);
        }
        else if (dealer.getHand().getValue() > player.getHand().getValue())
        {
           gui.updateGameStatus("Dealer Wins!");
            player.updateBalance(-100);
        }
        else if (player.getHand().getValue() > dealer.getHand().getValue())
        {
            gui.updateGameStatus("Player wins!");
            player.updateBalance(100);
        }
        else if (player.getHand().getValue() == dealer.getHand().getValue())
        {
            gui.updateGameStatus("You tied with the dealer!");
        }
        else if (player.getHand().getValue() > 21 && dealer.getHand().getValue() > 21)
        {
           gui.updateGameStatus("All Players Bust No Winner!");
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
