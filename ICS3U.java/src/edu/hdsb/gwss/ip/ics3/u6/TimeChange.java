/*
 * Name: Calvin Ip
 * Date: December 5, 2019
 * Version: 1.0.2
 * Description: This program will convert a time from 
 *              standard format to traditional and vice versa.     
 */
package edu.hdsb.gwss.ip.ics3.u6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TimeChange {

    public static void main(String[] args) {
        //Splash Screen
        displaySplashScreen();
        
        //Input
        String time = getTime();

        //Processing and Output
        if (time.length() < 6) {
            System.out.println(convertToTraditional(time));
        } else {
            System.out.println(convertToStandard(time));
        }

    }

    public static void displaySplashScreen() {
        System.out.println("STANDARD TIME\n");
        System.out.println("This Program Will Convert an Inputed Time Into the Opposite Time ");
        System.out.println("E.g. Standard Time to Traditional Time And Vice Versa\n");
        System.out.println("The Format is: ##:## for Standard and ##:## XX for Traditional");
    }

    public static String getTime() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Time:");
        String time = input.nextLine();
        return time;
    }

    public static String convertToTraditional(String time) {
        //##:##
        StringTokenizer st;
        st = new StringTokenizer(time, ":");
        int hour = Integer.parseInt(st.nextToken());
        String minutes = st.nextToken();
        boolean pm = false;

        if (time.length() != 5 || hour < 0 || hour > 23 || minutes.contains("-") || Integer.parseInt(minutes) > 59) {
            time = "Invalid Time";
            return time;
        } else {
            //Conversion
            if (hour == 12) {
                pm = true;
            } else if (hour > 12) {
                hour = hour - 12;
                pm = true;
            }

            //00:00 or 12:00 
            if (hour == 0 && !pm) {
                hour = hour + 12;
            }

            time = hour + ":" + minutes;

            if (pm) {
                time = time + " PM";
            } else {
                time = time + " AM";
            }
            return time;
        }

    }

    public static String convertToStandard(String time) {
        //##:## XX
        StringTokenizer st;
        st = new StringTokenizer(time, ": ");
        String hour = st.nextToken().trim();
        String minutes = st.nextToken().trim();
        boolean isPM = false;
        String pmam = st.nextToken().toUpperCase();

        if (time.length() > 8 && time.length() < 7 || hour.contains("-") || Integer.parseInt(hour) > 12 || minutes.contains("-") || Integer.parseInt(minutes) > 59 || !pmam.equals("AM") && !pmam.equals("PM")) {
            time = "Invalid Time";
            return time;
        } else {
            switch (pmam) {
                case "PM":
                    if (Integer.parseInt(hour) != 12) {
                        hour = Integer.toString(Integer.parseInt(hour) + 12);
                        break;
                    }
                    isPM = true;
            }

            if (Integer.parseInt(hour) < 10) {
                hour = "0" + hour;
            }

            if (Integer.parseInt(hour) == 12 && !isPM) {
                hour = "00";
            }

            time = hour + ":" + minutes;

            return time;
        }

    }
}
