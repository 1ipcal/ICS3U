/*
 * Name: Calvin Ip
 * Date: November 7, 2019
 * Version: 0.1
 * Description: 
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) throws FileNotFoundException {
        //Objects
        File file = new File ("RandomNumbers.txt");
        PrintWriter output = new PrintWriter (file);
        
        //Variables
        int numbers;
        
        //Processing
        for (int i = 0; i < 100 ; i++) {
            output.println(numbers = (int) (Math.random() * 100) + 1);
        }
        output.close();
        
        //Reader
        Scanner input = new Scanner (file);
        
        while(input.hasNext()){
            System.out.println( input.nextLine());
        }
        input.close();
    }
    
}
