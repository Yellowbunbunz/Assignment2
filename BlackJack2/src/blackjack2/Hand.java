/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack2;

import java.util.ArrayList;

/**
 *
 * @author brook
 */
public class Hand
{
    private ArrayList<Card> hand;
    
    public Hand()
    {
        hand = new ArrayList<Card>();
    }
    
    public void addCard(Card card)
    {
        hand.add(card);
    }
    
    public int getValue()
    {
        int value = 0;

        for(Card card : hand)
        {
            value += card.getValue();
        }

        return value;
    }
    
     public String toString()
    {
        String output = "";
        
        for (Card card : hand)
        {
            output += card;
            output += "\n";
        }
        return output;
    }
}
