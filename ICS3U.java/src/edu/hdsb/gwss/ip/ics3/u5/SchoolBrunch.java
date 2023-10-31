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
import java.util.StringTokenizer;

public class SchoolBrunch {

    public static void main(String[] args) throws FileNotFoundException {
        //Objects
        File inputFile = new File ("BRUNCH.11.txt");
        File outFile = new File ("OUT.BRUNCH.11.txt");
        Scanner input = new Scanner (inputFile);
        StringTokenizer st;
        PrintWriter output = new PrintWriter (outFile);
        
        //Variables
        int cost, attendingStudents;
        double year1, year2, year3, year4, temp;
        boolean valid;
        
        //Processing and Output
        while(input.hasNext()){
            cost = Integer.parseInt(input.nextLine());
            
            st = new StringTokenizer( input.nextLine() );
            year1 = Double.parseDouble(st.nextToken());
            year2 = Double.parseDouble(st.nextToken());
            year3 = Double.parseDouble(st.nextToken());
            year4 = Double.parseDouble(st.nextToken());
            
            attendingStudents = Integer.parseInt(input.nextLine());
            
            if (year1 > year2) {
                temp = year1;
                year1 = year2;
                year2 = temp;
            }
            if (year2 > year3) {
                temp = year2;
                year2 = year3;
                year3 = temp;
            }
            if (year3 > year4) {
                temp = year3;
                year3 = year4;
                year4 = temp;
            }
        }   
        //Close
        input.close();
        output.close();
    }
    
}
