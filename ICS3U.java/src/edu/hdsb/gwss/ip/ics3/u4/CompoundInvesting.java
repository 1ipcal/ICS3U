/*
 * Name: Calvin Ip
 * Date: November 3, 2019
 * Version: 1.0
 * Description: This program will print out a title table that will display the amount 
 *              of a yearly investment over a period of up to 15 years.
 */
package edu.hdsb.gwss.ip.ics3.u4;

import java.text.NumberFormat;
import java.util.Scanner;

public class CompoundInvesting {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //Variables
        double yearlyInvestment = 0, interestRate;
        int year;

        //Splash Screen
        System.out.println("COMPOUNT INVESTING\n");
        System.out.println("This Program Will Print Out a Table That Will Display The Amount");
        System.out.println("Of a Yearly Investment Over a Period Of Up to 15 Years.\n");
        System.out.println("Your Yearly Investment needs to be a minium of 5 Dollars");
        System.out.println("There needs to be a Minimum of 1 year and a Maximum of 15 years\n");

        //Input
        do {
            System.out.println("Please Enter the Yearly Investment");
            yearlyInvestment = input.nextDouble();

            if (yearlyInvestment < 5) {
                System.out.println("INVAID YEARLY INVESTMENT, TRY AGAIN");
            }
        } while (yearlyInvestment < 5);

        do {
            System.out.println("Please Enter the Interest Rate");
            interestRate = input.nextDouble();

            if (interestRate <= 0 || interestRate > 100) {
                System.out.println("INVAID INTEREST RATE, TRY AGAIN");
            }
        } while (interestRate <= 0 || interestRate > 100);

        do {
            System.out.println("Please Enter the Number of Years");
            year = input.nextInt();

            if (year <= 0 | year > 15) {
                System.out.println("INVAID NUMBER OF YEARS, TRY AGAIN");
            }
        } while (year <= 0 | year > 15);

        //Processing & Output
        System.out.format("%5s | %15s | %10s | %10s\n", "Year", "Account Balance", "Interest", "Total");

        for (double currentYear = 1, accountBalance = 0, interestTotal = 0, totalSum = 0; currentYear <= year; currentYear++, accountBalance = totalSum) {
            accountBalance = accountBalance + yearlyInvestment;
            interestTotal = (accountBalance / 100) * interestRate;
            totalSum = accountBalance + interestTotal;

            System.out.format("%5s | %15s | %10s | %10s\n", (int) currentYear, money.format(accountBalance), money.format(interestTotal), money.format(totalSum));
        }

    }

}
