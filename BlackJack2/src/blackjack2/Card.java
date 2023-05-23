/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack2;

/**
 *
 * @author brook
 */
public class Card 
{
    //Instance Variables
    private Suit suit;
    private Rank rank;
    
    //Card contains a suit and a rank.
    public Card(Suit suit, Rank rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    
    //Gets rank of card
    public Rank getRank()
    {
        return rank;
    }
    
    //Gets suit of card
    public Suit getSuit()
    {
        return suit;
    }
    
    //Gets value of card
    public int getValue()
    {
        return rank.cardValue;
    }
    
    //Prints a String containing information of the current card
    @Override
    public String toString()
    {
        return "[rank: "+rank +" suit: "+suit +"]" +this.getValue();
    }
}
