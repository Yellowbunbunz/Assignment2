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
public class Player extends Person
{
    //Instance Variables
    private Scanner scanner;
    private double balance;
   
    //Player Constructor
    public Player(String name, double balance)
    {
        super(name);  
        this.balance = balance;
        scanner = new Scanner(System.in);
    }

    //Gets the current balance
    public double getBalance()
    {
        return balance;
    }

    //Sets the current balance
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
   
    //Updates the current balance
    public void updateBalance(double amount)
    {
        balance += amount;
    }
   
   
    //Wants to hit inherited method.
    @Override
    public boolean wantsToHit()
    {
        char decision = '0';  

        while(decision != 'y' && decision != 'Y' && decision != 'n' && decision != 'N')
        {
              //System.out.println("Do you want to hit (y/n)");
             // decision = scanner.next().charAt(0);
        }
       
        if(decision == 'y' || decision == 'Y')
        {
            return true;
        }
       
        else
        {
            return false;
        }
    }
}
