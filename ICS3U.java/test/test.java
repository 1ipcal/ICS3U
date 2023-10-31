/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Calvin
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test Data
        double money = 3.141592;

        // Dollars (with Rounding)
        int rounded = (int) Math.round( money * 100 );
        int dollars =  rounded / 100;
        int tenthCents = (rounded / 10) % 10;
        int onesCents = rounded % 10;

        // Formatted & Rounded
        System.out.println( "$" + dollars + "."  + tenthCents +  "" + onesCents );
        System.out.println(rounded);
    }
    
}
