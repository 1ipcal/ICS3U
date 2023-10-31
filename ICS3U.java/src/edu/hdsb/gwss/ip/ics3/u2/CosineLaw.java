/*
 * Name: Calvin Ip
 * Date: Sept. 24, 2019
 * Version: 0.1
 * Description: This Program lets you enter two sides of a triangle and the  
 * contained angle, and that will use the cosine law to calculate the third side
 */
package edu.hdsb.gwss.ip.ics3.u2;

public class CosineLaw {

    public static void main(String[] args) {
        //Splash Screen
        System.out.println("This Program will solve the 3rd side of a triangle using 2 sides and an angle\n");

        //Input
        //a and b = sides, c = angle
        double a, b, c, subtotal;
        a = 30;
        b = 10;
        c = 20;
        //Processing
        subtotal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - ((2 * a * b) * Math.cos(c)));
        
        //Output
        System.out.println("The thrid side is " + subtotal + " long");

    }

}
