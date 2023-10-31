/*
 * Name: Calvin Ip
 * Date: October 22, 2019
 * Version: 0.1
 * Description: 
 *           
 */
package edu.hdsb.gwss.ip.ics3.u4;

import java.util.Scanner;

public class Length30 {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        
        //Variables
        String firstWord, secondWord;
        int wordLength1, wordLength2, amountOfDots = 30;
        
        //Splash Screen
        System.out.println("This Program Will Seperate two Inputed Words with dots");
        System.out.println("And Will Print Enought Dots so that the Total Line Length is 30\n");
        
        //Input
        do {
            System.out.println("Please Enter The First Word");
            firstWord = input.nextLine();
            System.out.println("Please Enter The Second Word");
            secondWord = input.nextLine();
            
            wordLength1 = firstWord.length();
            wordLength2 = secondWord.length();
            if(wordLength1 + wordLength2 > 30){
                System.out.println("\nSorry, the two word length is greater that 30. Please try again");
            }
        } while (wordLength1 + wordLength2 > 30);
        
        //Processing & Output
        amountOfDots = amountOfDots - wordLength1 - wordLength2;
        
        System.out.print(firstWord);
        for (int i = 0; i < amountOfDots ; i++){
            System.out.print(".");
        }
//        i = 0;
//        while (i < amountOfDots ){
//            System.out.print(".");
//            i++;
//        }
        System.out.println(secondWord);
    }
    
}
