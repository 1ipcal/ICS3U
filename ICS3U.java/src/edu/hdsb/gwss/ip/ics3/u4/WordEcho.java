/*
 * Name: Calvin Ip
 * Date: October 22, 2019
 * Version: 0.1
 * Description: This program that asks the user to enter a word. 
 * The program will then repeat the word for as many times as it has characters             
 */
package edu.hdsb.gwss.ip.ics3.u4;

import java.util.Scanner;

public class WordEcho {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        String word;
        int wordLength;
        int i = 0;

        //Splash Screen
        System.out.println("This Program Will Repeat the Inputed Word");
        System.out.println("As Many Times As The Amount of Letters In That Word\n");

        //Input
        System.out.println("Please Input a Word");
        word = input.nextLine();

        //Processing & Output
        wordLength = word.length();
        System.out.println("The Word \"" + word + "\" contains " + wordLength + " Characters");

        while (i < wordLength) {
            System.out.print(word + " ");
            i = i + 1;
        }

    }

}
