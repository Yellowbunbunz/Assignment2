/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author brook
 */
public class Deck
{
    // Create an arraylist for the deck
    private ArrayList<Card> deck;
    
    // Constructor for the deck 
    public Deck()
    {
        deck = new ArrayList<Card>();
    }
    
    // Method to add a card to the deck
    public void addCard(Card card)
    {
        deck.add(card);
    }
    
    public Card removeCard()
    {
        return deck.remove(0);
    }
    
    // toString of everything together
    public String toString()
    {
        String output = "";
        
        // Iterate through each card within the deck
        for (Card card : deck)
        {
            output += card;
            output += "\n";
        }
        return output;
    }
    
    //Loop that makes every card then adds them to the ArrayList.
    public ArrayList makeDeck()
    {
        for(Rank rank : Rank.values())
        {
            for(Suit suit : Suit.values())
            {
                Card newcard = new Card(suit,rank);
                this.addCard(newcard);
            }
        }
        
        return deck;
    }
    
    public ArrayList shuffleCards()
    {
        Collections.shuffle(deck);
        return deck;
    }
}
