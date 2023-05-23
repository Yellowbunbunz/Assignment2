/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package blackjack2;

/**
 *
 * @author brook
 */
public enum Suit 
{
    DIAMOND("Diamonds"),
    SPADE("Spades"),
    CLUB("Clubs"),
    HEART("Hearts");
    
    String suitName;
    
    Suit(String suitName)
    {
        this.suitName = suitName;
    }
    
    public String toString()
    {
        return suitName;
    }

}
