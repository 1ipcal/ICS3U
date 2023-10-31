/*
 * Name: Calvin Ip
 * Date: May 1, 2020
 * Version: 1.0
 * Description: This program will ask for key points, k, h, a, and c values for mapping notation and give you cordinates
 *              
 */
package math.stuff;

import java.util.Scanner;

public class MappingNotation {


    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        
        //Variables
        double[] keyPointsX = new double[10];
        double[] keyPointsY = new double[10];

        double k, h, a, c;
        
        //Splash Screen
        displaySplashScreen();
        
        //Input
        getKeyPoints(keyPointsX, keyPointsY);
        
        //This is fucking terrible pls fix later. This is insanity. Fucking spahgetti code.
        System.out.println("k?");
        k = input.nextDouble();
        
        System.out.println("h?");
        h = input.nextDouble();
        
        System.out.println("a?");
        a = input.nextDouble();
        
        System.out.println("c?");
        c = input.nextDouble();
        
        doMath(k, h, a, c, keyPointsX, keyPointsY);
        
    }
    
    public static void displaySplashScreen() {
        System.out.println("Mapping Notation\n");
        System.out.println("This Program Will will ask for key points, k, h, a, and c values for mapping notation and give you cordinates. (10 Points)");

    }
    
    public static void getKeyPoints(double keyPointsX[], double keyPointsY[]) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++ ){
            System.out.println("x # " + ( i + 1) + "?");
            int number = input.nextInt();
            keyPointsX[i] = number;
            
            System.out.println("y # " + ( i + 1) + "?");
            number = input.nextInt();
            keyPointsY[i] = number;
        }
        
    }
    
    public static void doMath(double k, double h, double a, double c, double keyPointsX[], double keyPointsY[] ){

        for (int i = 0; i < 10; i++ ){
            double x = keyPointsX[i];
            x = (x/k) + h;
            
            double y = keyPointsY[i];
            y = (y*a) + c;
            
            System.out.println("(" + keyPointsX[i] + "," + keyPointsY[i] + " --> (" + x + "," + y + ")");
        }
    }

    
}
