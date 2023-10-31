/*
 * Name: Calvin Ip
 * Date: November 3, 2019
 * Version: 1.0
 * Description: This program converts one number counting system to another 
 *              (example: decimal to binary)        
 */
package edu.hdsb.gwss.ip.ics3.u4;

import java.util.Scanner;

public class NumberConversion {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        boolean valid;
        String answerS;
        int choice, exponent = 0, number = 0, r, answer;

        //Constants
        final int BINARY_TO_DECIMAL = 1;
        final int OCTAL_TO_DECIMAL = 2;
        final int DECIMAL_TO_BINARY = 3;
        final int DECIMAL_TO_OCTAL = 4;
        final int EXIT = 5;

        //Splash Screen
        System.out.println("NUMBER CONVERSION\n");
        System.out.println("This program will convert numbers into a different counting system");

        do {
            //Input
            System.out.println("\nWhat Conversion Would You Like To Do? (Input the Number)\n");
            System.out.println("1.  Binary to Decimal");
            System.out.println("2.  Octal to Decimal");
            System.out.println("3.  Decimal to Binary");
            System.out.println("4.  Decimal to Octal");
            System.out.println("5.  Exit");
            choice = Integer.parseInt(input.nextLine());

            //Proccessing
            switch (choice) {
                case BINARY_TO_DECIMAL:
                    System.out.println("BINARY TO DECIMAL CONVERSION SELECTED\n");
                    System.out.format("%-30s : ", "Please Enter a Binary Number");
                    number = Integer.parseInt(input.nextLine());
                    valid = true;
                    answer = 0;
                    exponent = 0;

                    while (number > 0 && valid) {

                        r = number % 10;
                        if (r > 1) {
                            valid = false;
                        } else {
                            number = number / 10;
                            answer = answer + r * (int) Math.pow(2, exponent);
                            exponent++;
                        }
                    }
                    if (!valid) {
                        System.out.println("INVALID BINARY NUMBER");
                    } else if (number < 0 ) {
                        System.out.println("INVALID BINARY NUMBER");
                    } else {
                        System.out.format("%-30s : %-15s\n", "Decimal Number", answer);
                    }
                    break;
                case OCTAL_TO_DECIMAL:
                    System.out.println("OCTAL TO DECIMAL CONVERSION SELECTED\n");
                    System.out.format("%-30s : ", "Please Enter a Octal Number");
                    number = Integer.parseInt(input.nextLine());
                    valid = true;
                    answer = 0;
                    exponent = 0;

                    while (number > 0 && valid) {

                        r = number % 10;
                        if (r > 7) {
                            valid = false;
                        } else {
                            number = number / 10;
                            answer = answer + r * (int) Math.pow(8, exponent);
                            exponent++;
                        }
                    }
                    if (!valid) {
                        System.out.println("INVALID OCTAL NUMBER");
                    } else if (number < 0 ) {
                        System.out.println("INVALID OCTAL NUMBER");
                    } else {
                        System.out.format("%-30s : %-15s\n", "Decimal Number", answer);
                    }
                    break;
                case DECIMAL_TO_BINARY:
                    System.out.println("DECIMAL TO BINARY CONVERSION SELECTED\n");
                    System.out.format("%-30s : ", "Please Enter a Decimal Number");
                    number = Integer.parseInt(input.nextLine());
                    valid = true;
                    answerS = "";

                    while (number > 0 && valid) {
                        if (number < 0) {
                            valid = false;
                        } else {
                            r = number % 2;
                            number = number / 2;
                            answerS = r + answerS;
                        }

                    }
                    if (!valid) {
                        System.out.println("INVAID DECIMAL NUMBER");
                    } else if (number < 0 ) {
                        System.out.println("INVALID DECIMAL NUMBER");
                    } else {
                        System.out.format("%-30s : %-15s\n", "Binary Number", answerS);
                    }
                    break;
                case DECIMAL_TO_OCTAL:
                    System.out.println("DECIMAL TO OCTAL CONVERSION SELECTED\n");
                    System.out.format("%-30s : ", "Please Enter a Decimal Number");
                    number = Integer.parseInt(input.nextLine());
                    valid = true;
                    answerS = "";

                    while (number > 0 && valid) {
                        if (number < 0) {
                            valid = false;
                        } else {
                            r = number % 8;
                            number = number / 8;
                            answerS = r + answerS;
                        }

                    }
                    if (!valid) {
                        System.out.println("INVAID DECIMAL NUMBER");
                    } else if (number < 0 ) {
                        System.out.println("INVALID DECIMAL NUMBER");
                    } else {
                        System.out.format("%-30s : %-15s\n", "Octal Number", answerS);
                    }
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("UNKNOWN CHOICE");
            }
        } while (choice != 5);

    }

}
