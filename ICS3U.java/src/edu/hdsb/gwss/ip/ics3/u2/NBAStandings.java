/*
 * Name: Calvin Ip
 * Date: Sept. 18, 2019
 * Version: 0.1
 * Description: This program prints a table of the NBA standings
 */
package edu.hdsb.gwss.ip.ics3.u2;

/**
 *
 * @author gwss
 */
public class NBAStandings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        System.out.format("%18s | %6s | %6s | %6s | %6s\n", "Team Name", "W", "L", "W/L%", "GB");
        System.out.format("%18s | %6s | %6s | %6.3f | %6s\n", "Milwaukee Bucks", "60", "22", 60/22.0, "-");
    }    
}
