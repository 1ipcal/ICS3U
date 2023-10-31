/*
 * Name: Calvin Ip
 * Date: November 7, 2019
 * Version: 0.1
 * Description: This program will count how many vowels are in an inputed Sentence. 
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.util.Scanner;

public class CountingVowels {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        String word;
        int vowelCount = 0;

        //Slash Screen
        System.out.println("VOWEL COUNTER\n");
        System.out.println("This program will count how many vowels are in an inputed Sentence.");

        //Input
        System.out.println("Please Input a Sentence:");
        word = input.nextLine().toLowerCase();

        //Porcessing
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;

            }
            
        }
        
        //Output
        System.out.println("There Are " + vowelCount + " Vowels in That Sentence.");

    }

}
