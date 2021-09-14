/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        double tax = 0;

        System.out.print("What is the order amount? ");
        double amount = in.nextDouble();
        System.out.print("What is the state? ");
        String state = in.next();

        if(state.equals("WI")){
            tax = 0.055*amount;
            total = amount+tax;
            System.out.println("The subtotal is $"+amount+".");
            System.out.println("The tax is $"+tax+".");
            System.out.println("The total is $"+total+".");
        }
        else {
            total = amount;
            System.out.println("The total is $" + total + ".");
        }

    }
}
