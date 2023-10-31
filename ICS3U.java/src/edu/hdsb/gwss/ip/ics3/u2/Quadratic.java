/*
 * Name: Calvin Ip
 * Date: Sept. 20, 2019
 * Version: 0.3
 * Description: This program is used to calculate the 
 *              quadratic equation by giving it x values
 */
package edu.hdsb.gwss.ip.ics3.u2;

public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Splash Screen
        System.out.println("This program will solve the ");
        System.out.println("quadratic equation: 3x^2 - 8x + 4\n");

        //Varibles
        double x, y;
        
        System.out.format("%10s %10s\n", "x", "Value");
        //Input
        x = 0.0;

        //Processing
        y = 3 * x * x - 8 * x + 4;
        
        //Output
        System.out.format("%10s %10s\n", "0.0", (y));
       
        //Input
        x = 2.0;

        //Processing
        y = 3 * x * x - 8 * x + 4;
        
        //Output
        System.out.format("%10s %10s\n", "2.0", (y));
        
        //Input
        x = 4.0;

        //Processing
        y = 3 * x * x - 8 * x + 4;
        
        //Output
        System.out.format("%10s %10s", "4.0", (y));
       
    }

}
