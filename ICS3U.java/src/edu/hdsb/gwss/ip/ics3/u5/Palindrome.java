/*
 * Name: Calvin Ip
 * Date: November 7, 2019
 * Version: 0.1
 * Description: 
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        String word, wordBackwards = "";
        
        //Splash Screen
        System.out.println("PALINDROME\n");
        System.out.println("Words that are the same forwards and backwards are called palindromes.");
        System.out.println("This program determine if a word is a palindrome.\n");
        
        //Input
        System.out.println("Please Enter a Word");
        word = input.next();
        
        //Processing & Output
        for (int i = 0, incrementor = 1; i < word.length(); i++, incrementor++) {
            wordBackwards = wordBackwards + word.charAt(word.length() - incrementor);
        }
        System.out.println(word + " backwards is: " + wordBackwards);
        
        if (word.equalsIgnoreCase( wordBackwards )){
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
        
    }
    
}
