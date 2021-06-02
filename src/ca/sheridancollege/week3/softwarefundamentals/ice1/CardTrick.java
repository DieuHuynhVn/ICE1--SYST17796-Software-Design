/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * username: huthitha
 * Full name: Huynh Thi Thanh Dieu
 * 6/1/2021- ICE 1
 * This is my Branch file - I completed the code to create 7 random cards
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setSuit(Card.SUITS[(int)(Math.floor(Math.random()*3))]);
            c.setValue((int)(Math.random()*12+1));
            magicHand[i]=c;
            System.out.println(magicHand[i].getValue()+ magicHand[i].getSuit());
        }
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your card: ");
    int enterValue= input.nextInt();
    String enterSuit= input.next();
    for(int i =0; i< 1; i++){
        if (magicHand[i].getValue()== enterValue && magicHand[i].getSuit().equals(enterSuit)){
            System.out.println("Magic Hand contain your card");
        }
            else System.out.println("Magic Hand do not contain your card");
     
        }
    }
    
    }