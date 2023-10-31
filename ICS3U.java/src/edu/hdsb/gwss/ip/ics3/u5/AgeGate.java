/*
 * Name: Calvin Ip
 * Date: November 18, 2019
 * Version: 1.0.1
 * Description: This Program will check if the age of the person is at least 14 years old
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AgeGate {

    public static void main(String[] args) throws FileNotFoundException {
        //Objects
        File inputFile = new File("DATA11.txt");
        File outputFile = new File("OUT.DATA11.txt");
        Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile);
        StringTokenizer st;

        //Variables
        int month, day, year, ageOnDec31;
        boolean tooYoung;

        //Constants
        final int CURRENT_MONTH = 11;
        final int CURRENT_DAY = 14;
        final int CURRENT_YEAR = 2019;
        
        //Splash Screen
        System.out.println("AGE GATE\n");
        System.out.println("This program will process whether or not someone is at least 14 years of age.");
        System.out.println("It will read from a file and print the output in another file.");

        //Processing and Output
        while (input.hasNext()) {
            tooYoung = true;
            st = new StringTokenizer(input.nextLine());

            month = Integer.parseInt(st.nextToken());
            day = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());
            ageOnDec31 = CURRENT_YEAR - year;

            if (ageOnDec31 > 14) {
                tooYoung = false;
            } else if (ageOnDec31 == 14) {
                if (CURRENT_MONTH - month > 0) {
                    tooYoung = false;
                } else if (CURRENT_MONTH - month == 0 && CURRENT_DAY - day >= 0) {
                    tooYoung = false;
                }
            }

            if (tooYoung) {
                output.println("Too Young");
            } else {
                output.println("Old Enough");
            }

        }

        input.close();
        output.close();

    }

}
