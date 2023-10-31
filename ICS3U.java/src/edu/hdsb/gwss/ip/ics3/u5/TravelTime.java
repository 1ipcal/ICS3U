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

public class TravelTime {

    public static void main(String[] args) throws FileNotFoundException {
        //Objects
        File file = new File("TRAVEL11.txt");
        File outFile = new File ("OUT1.txt");
        StringTokenizer st;
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(outFile);

        //Variables
        int hour, minute, seconds, journeyTime, timeDifference;

        // Read from File, until you reach the end of the file
        while (input.hasNext()) {
            st = new StringTokenizer( input.nextLine(), " :" );
             
            hour = Integer.parseInt( st.nextToken() );
            minute = Integer.parseInt( st.nextToken() );
            seconds = Integer.parseInt( st.nextToken() );
            journeyTime = Integer.parseInt( st.nextToken() );
            timeDifference = Integer.parseInt( st.nextToken() );
            
            hour = hour + journeyTime + timeDifference;
            hour = hour % 24;
            
            if (hour < 0){
                hour = hour + 24;
            }
            
            if(hour < 10){
                output.print("0");
            }
            output.println(hour + ":" + minute + ":" + seconds);
            
        }

        // Close File
        input.close();
        output.close();

    }

}
