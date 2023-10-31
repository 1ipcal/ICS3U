/*
 * Name: Calvin Ip
 * Date: November 18, 2019
 * Version: 1.0.2
 * Description: This program converts a sentence to Arablish 
 *              (Read left to right, numbers are an exception)
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arablish {

    public static void main(String[] args) throws FileNotFoundException {
        //Objects
        File inputFile = new File("Arablish.Input.txt");
        File outputFile = new File("Arablish.Output.txt");
        Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile);
        StringTokenizer st;

        //Variables
        String originalWord, newWord, sentence;
        boolean number;
        
        //Splash Screen
        System.out.println("ARABLISH/n");
        System.out.println("This program will read and reverse a sentence much like the Arabic language.");
        System.out.println("It will read from a file and print the output in another file.");

        //Processing
        while (input.hasNext()) {
            st = new StringTokenizer(input.nextLine());
            sentence = "";
            
            //Sentence Maker
            while (st.hasMoreTokens()) {
                number = true;
                newWord = "";

                originalWord = st.nextToken();
                
                //Checking if it number by itself
                for (int i = 0; i < originalWord.length(); i++) {
                    if (number && ( originalWord.charAt(i) < 48 || originalWord.charAt(i) > 57 )) {
                        number = false;
                    }
                    newWord = originalWord.charAt(i) + newWord;
                } 

                if( number ) newWord = originalWord;

                //Sentence Builder
                sentence = newWord + " " + sentence;
                
            } 
            
            //Output
            output.println(sentence);
            
        }

        input.close();
        output.close();

    } //END OF MAIN

} //END OF CLASS
