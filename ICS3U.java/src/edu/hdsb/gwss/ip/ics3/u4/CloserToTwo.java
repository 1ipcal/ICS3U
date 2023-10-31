/*
 * Name: Calvin Ip
 * Date: November 3, 2019
 * Version: 1.0
 * Description: This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ... 
 * `            and so on gets closer to 2 without becoming 2.         
 */
package edu.hdsb.gwss.ip.ics3.u4;

public class CloserToTwo {

    public static void main(String[] args) {
        //Variables
        double sum = 0, firstNumber = 0;
        long denominator = 1;

        //Splash Screen
        System.out.println("Closer to Two\n");
        System.out.println("This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ...");
        System.out.println("and so on gets closer to 2 without becoming 2.");

        //Processing
        while (sum < 2) {
            sum = firstNumber + (1.0 / denominator );
            System.out.println(firstNumber  + " + " + "1/" + denominator + " = " + sum );
            
            firstNumber = sum;
            denominator = denominator * 2;
        }

    }

}
