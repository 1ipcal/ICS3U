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

public class RandomStrings {

    public static void main(String[] args) throws FileNotFoundException {
        //Objects
        File file = new File ("RandomStrings.txt");
        PrintWriter output = new PrintWriter (file);
        
        //Variables
        int letter;
        
        for (int i = 0; i < 100; i++) {
            
            for (int j = 0; j < 6; j++) {
                output.print((char) ( ( Math.random() * 26) + 'A' ) );
            }
            output.println();
            
        }
        output.close();
        
        //Reader
        Scanner input = new Scanner (file);
        
        while(input.hasNext()){
            System.out.println(input.nextLine());
        }
        input.close();
    }
    
}
