/*
 * Name: Calvin Ip
 * Date: Sept. 26, 2019 
 * Version: 0.1
 * Description: This program will calculate the average of the
 * user's marks using four subjects
 */
package edu.hdsb.gwss.ip.ics3.u2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author gwss
 */
public class StudentAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();

        //Splash Screen
        System.out.println("Average Marks Calculator Vesrion 1.0\n");
        System.out.println("This program will calculate your average using 4 subjects");
        System.out.println("Use Decimal Numbers Please\n");

        //Variables
        double firstSubject, secondSubject, thirdSubject, fourthSubject, average;
        String name;

        //Input
        System.out.println("Please Enter Your Name:");
        name = input.nextLine();
        System.out.println("Please Enter What You got in the First Subject");
        firstSubject = input.nextDouble();
        System.out.println("Please Enter What You got in the Second Subject");
        secondSubject = input.nextDouble();
        System.out.println("Please Enter What You got in the Thrid Subject");
        thirdSubject = input.nextDouble();
        System.out.println("Please Enter What You got in the Fourth Subject");
        fourthSubject = input.nextDouble();

        //Processing
        average = (firstSubject + secondSubject + thirdSubject + fourthSubject) / 4;

        //Output
        System.out.println("-------Report-Card-------\n");
        System.out.format("%5s %15s\n\n", "Name: ", name);
        System.out.format("%15s %10s\n", "First Subject:", percent.format( firstSubject ));
        System.out.format("%15s %10s\n", "Second Subject:", percent.format( secondSubject ));
        System.out.format("%15s %10s\n", "Third Subject:", percent.format( thirdSubject ));
        System.out.format("%15s %10s\n", "Fourth Subject:", percent.format( fourthSubject ));
        System.out.println("-------------------------\n");
        System.out.format("%15s %10s", "Final Mark:", percent.format( average ));

    }

}
