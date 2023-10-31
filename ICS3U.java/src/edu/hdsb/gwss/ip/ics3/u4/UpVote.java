/*
 * Name: Calvin Ip
 * Date: October 25, 2019
 * Version: 0.1
 * Description: 
 *           
 */
package edu.hdsb.gwss.ip.ics3.u4;

import java.util.Scanner;

public class UpVote {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        int numberOfRows;

        //Splash Screen
        System.out.println("REDDIT UPVOTE MAKER\n");
        System.out.println("This Program will Make an Upvote\n");

        //Input
        do {
            System.out.println("How Many Rows Will It Have");
            numberOfRows = input.nextInt();
            
            if(numberOfRows <= 0){
                System.out.println("Invalid Input. Rows Cannot be Equal or Less Than 0. Please Try Again");
            }
        } while (numberOfRows <= 0);

        //Processing && Output
        
        
        
    }

}
