/*
 * Name: Calvin Ip
 * Date: December 11, 2019
 * Version: 1.0.1
 * Description: 
 */
package edu.hdsb.gwss.ip.ics3.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReduceFraction {

    public static void main(String[] args) throws FileNotFoundException {
        //Objects
        File inputFile = new File("ReduceInput.txt");
        File outputFile = new File("ReduceOutput.txt");
        Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile);
        StringTokenizer st;

        //Variables
        int firstNumber, secondNumber;
        int GCD;

        //Splash Screen
        displaySplashScreen();

        //Processing and Output
        while (input.hasNext()) {
            st = new StringTokenizer(input.nextLine(), "/");
            firstNumber = Integer.parseInt(st.nextToken());
            secondNumber = Integer.parseInt(st.nextToken());
            output.println(reduceFractions(firstNumber, secondNumber));

        }
        input.close();
        output.close();
    }

    public static void displaySplashScreen() {
        System.out.println("REDUCE FRACTIONS\n");
        System.out.println("This program will reduce any fraction into its lowest terms.");
    }

    public static int findGCD(int numerator, int denominator) {
        int GDC = 1;

        if (Math.max(numerator, denominator) % Math.min(numerator, denominator) == 0) {
            GDC = Math.min(numerator, denominator);
            return GDC;
        } else {
            for (int i = 1; i <= Math.min(numerator, denominator) / 2; i++) {
                if (numerator % i == 0 && denominator % i == 0) {
                    GDC = i;
                }
            }
            return GDC;
        }

    }

    public static String reduceFractions(int numerator, int denominator) {
        String result;

        if (denominator == 0) {
            result = "UNDEFINED";
        } else if (numerator == 0) {
            result = "" + numerator;
        } else {

            int GCD = findGCD(Math.abs(numerator), Math.abs(denominator));

            numerator = numerator / GCD;
            denominator = denominator / GCD;

            if (denominator < 0 ){
                numerator = numerator * -1;
                denominator = denominator * -1;
            }
                    
            if (denominator == 1) {
                result = "" + numerator;
            } else {
                result = numerator + "/" + denominator;
            }
        }

        return result;

    }

}
