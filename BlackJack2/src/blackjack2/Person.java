/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack2;

/**
 *
 * @author brook
 */
public abstract class Person
{
    private String name;
    private Hand hand;
    
    public Person(String name)
    {
        this.name = name;
        hand = new Hand();
    }
    
    public String getName()
    {
        return name;
    }
    
    public Hand getHand()
    {
        return hand;
    }
    
    public abstract boolean wantsToHit();
    
    public abstract boolean wantsToStand();
}
