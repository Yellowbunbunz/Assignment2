/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package blackjack2;

/**
 *
 * @author brook
 */
public enum Rank 
{
    ACE ("ONE",11),
    TWO("TWO",2),
    THREE("THREE",3),
    FOUR("FOUR",4),
    FIVE("FIVE",5),
    SIX("SIX",6),
    SEVEN("SEVEN",7),
    EIGHT("EIGHT",8),
    NINE("NINE",9),
    TEN("TEN",10),
    JACK("JACK",10),
    QUEEN("QUEEN",10),
    KING("KING",10);
    
    String cardRank;
    int cardValue;
    
   Rank(String cardRank, int cardValue)
   {
       this.cardRank = cardRank;
       this.cardValue = cardValue;
   } 
}
