/*
 * Name: Calvin Ip
 * Date: Sept. 24, 2019
 * Version: 0.1
 * Description: This program will show the Hundreds,
 * tens and ones place digit of a three digit number
 */
package edu.hdsb.gwss.ip.ics3.u2;

public class Digits {

    public static void main(String[] args) {
        //Splash Screen
        System.out.println("This program will show the Hundreds, tens and ones place digit of a three digit number\n");
        
        //Input
        //x = number, h = hundreds, t =tens, 0 = ones
        int x, h, t, o;
        x = 187;
        
        System.out.println("If the 3 digit number is " + x + ", then\n");
        
        //Processing
        h = x / 100;
        x = x - (h * 100);
        t = x / 10;
        x = x - (t * 10);
        o = x / 1;
        
        //Output
        System.out.format("%30s %2s\n", "The Hundreds Place Digit is:", h);
        System.out.format("%30s %2s\n", "The Tens Place Digit is:", t);
        System.out.format("%30s %2s\n", "The Ones Place Digit is:", o);
               
    }
    
}
