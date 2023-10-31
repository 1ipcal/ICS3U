/*
 * Name: Calvin Ip
 * Date: November 18, 2019
 * Version: 1.0.1
 * Description: This program will determine if the names have the same structure or not.
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PatternMatching {

    public static void main(String[] args) throws FileNotFoundException {
        //Objects
        File inputFile = new File("PatternMatchingInput.txt");
        File outputFile = new File("PatternMatchingOutput.txt");
        Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile);
        StringTokenizer st;

        //Variables
        String word1, word2, result;
        boolean same, vowelOne, vowelTwo;
        
        //Splash Screen
        System.out.println("PATTERN MATCHING\n");
        System.out.println("This program will process and determine if two words have the same");
        System.out.println("structure or not. (Constants and Vowels)");
        System.out.println("It will read from a file and print the output in another file.");

        //Processing and Output
        while (input.hasNext()) {
            same = true;
            st = new StringTokenizer(input.nextLine());

            word1 = st.nextToken().toLowerCase();
            word2 = st.nextToken().toLowerCase();

            if (word1.length() != word2.length()) {
                same = false;
            } else {
                for (int i = 0; i < word1.length() && same; i++) {
                    vowelOne = false;
                    vowelTwo = false;
                    
                    switch (word1.charAt(i)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vowelOne = true;
                            break;

                    }

                    switch (word2.charAt(i)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vowelTwo = true;
                            break;

                    }
                    if (vowelOne != vowelTwo) {
                        same = false;
                    } //Comparrison

                } //End of Vowel Checker

            } //End of Word Checker

            if (same) {
                output.println("Same");
            } else {
                output.println("Different");
            }

        }

        input.close();
        output.close();

    }

}
