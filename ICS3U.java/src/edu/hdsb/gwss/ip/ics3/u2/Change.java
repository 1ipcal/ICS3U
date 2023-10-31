/*
 * Name: Calvin Ip
 * Date: Sept. 24, 2019
 * Version: 0.2
 * Description: This program will tell the user the minimum amount of coins needed for change
 */
package edu.hdsb.gwss.ip.ics3.u2;

public class Change {

    public static void main(String[] args) {
        //Splash Screen
        System.out.println("This program will caculate the minimum amount of coins needed for change\n");
        
        //Input
        //q = Quarters, d = Dimes, n = Nickles, p = Pennnies, c = change
        int q, d, n, p, c;
        c = 216;
        
        //Processing
        q = c / 25;
        c = c % 25;
        d = c / 10;
        c = c % 10;
        n = c / 5;
        c = c % 5;
        p = c / 1;
        
        //Output
        System.out.println("The minimum ammount of coins is\n");
        System.out.format("%10s %5s\n", "Quarters:", q );
        System.out.format("%10s %5s\n", "Dimes:", d );
        System.out.format("%10s %5s\n", "Nickles:", n );
        System.out.format("%10s %5s\n", "Pennies:", p );
        
    }
    
}
