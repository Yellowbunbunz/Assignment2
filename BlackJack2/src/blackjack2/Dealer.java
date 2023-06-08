/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack2;

/**
 *
 * @author brook
 */
public class Dealer extends Person
{   
    
    public Dealer(String name) 
    {
        super(name);
    }

    @Override
    public boolean wantsToHit() 
    {
        return getHand().getValue() < 17;
    }

    @Override
    public boolean wantsToStand() {
        return getHand().getValue() < 17;
    }
    
    
}
