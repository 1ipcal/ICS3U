/*
 * Name: Calvin Ip
 * Date: November 7, 2019
 * Version: 0.1
 * Description: This program prints a square out of the letters of a word entered by the user.
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.util.Scanner;

public class WordSquare {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        char partOne;
        String word, partTwo;

        //Splash Screen
        System.out.println("Word Square\n");
        System.out.println("This program prints a square out of the letters of a word entered by the user.\n");

        //Input
        System.out.println("Please Enter a Word/Sentence");
        word = input.nextLine();

        //Processing & Output
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);

            partOne = word.charAt(0);
            partTwo = word.substring(1, word.length());
            word = partTwo + partOne;

        }

    }

}
