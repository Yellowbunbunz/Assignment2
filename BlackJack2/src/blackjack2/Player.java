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
    public boolean hit;
    public boolean stand;
   
    //Player Constructor
    public Player(String name, double balance)
    {
        super(name);  
        this.balance = balance;
        scanner = new Scanner(System.in);
        hit = false;
        stand = false;
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
        return hit;
    }

    @Override
    public boolean wantsToStand() {
       return stand;
    }
}
