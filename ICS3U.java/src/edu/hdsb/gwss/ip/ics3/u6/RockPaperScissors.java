/*
 * Name: Calvin Ip
 * Date: December 9, 2019
 * Version: 0.1
 * Description:   
 */
package edu.hdsb.gwss.ip.ics3.u6;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        int userScore = 0;
        int computerScore = 0;
        int ties = 0;
        int test = 0;
        String result;

        String userChoice, computerChoice;
        displaySplashScreen();

        do {
            //Input
            userChoice = convertNumberToWords(getUserChoice());
            computerChoice = convertNumberToWords(getComputerChoice());

            //Processing
            result = determineOutcome(userChoice, computerChoice);

            userScore = storeUserWins( result, userScore);
            computerScore = storeComputerWins(result, computerScore);
            ties = storeTies(result, ties);

            //Output
            displayScore(userScore, computerScore, ties);

        } while (test == 0);
    }

    public static void displaySplashScreen() {
        System.out.println("ROCK PAPER SCISSORS\n");
        System.out.println("HELLO HUMAN. LET'S PLAY ROCK PAPER SCISSORS.");

    }

    public static String getUserChoice() {
        Scanner input = new Scanner(System.in);
        String userChoice;
        do {
            System.out.println("PLEASE ENTER YOUR CHOICE");
            System.out.println("1 = ROCK, 2 = PAPER, 3 = SCISSORS");
            userChoice = input.nextLine();

            if (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")) {
                System.out.println("HUMAN, THAT IS NOT A CHOICE. PLEASE TRY AGAIN.\n");
            }
        } while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3"));
        return userChoice;
    }

    public static String getComputerChoice() {
        String computerChoice = Integer.toString((int) (Math.random() * 3) + 1);
        return computerChoice;
    }

    public static String convertNumberToWords(String number) {
        switch (number) {
            case "1":
                number = "ROCK";
                break;
            case "2":
                number = "PAPER";
                break;
            case "3":
                number = "SCISSORS";
                break;
        }
        return number;
    }

    public static String determineOutcome(String userChoice, String computerChoice) {
        String result = "W";
        System.out.println("YOU PLAYED " + userChoice + " AND I PLAYED " + computerChoice + ".");

        if (userChoice.equals(computerChoice)) {
            System.out.println("IT'S A TIE!");
            result = "T";
        } else if (userChoice.equals("ROCK")) {
            if (computerChoice.equals("SCISSORS")) {
                System.out.println("ROCK CRUSHES SCISSORS. YOU WIN!!");
            }
            if (computerChoice.equals("PAPER")) {
                System.out.println("PAPER COVERS ROCK. YOU LOSE!!");
                result = "L";
            }
        } else if (userChoice.equals("PAPER")) {
            if (computerChoice.equals("ROCK")) {
                System.out.println("PAPER COVERS ROCK. YOU WIN!!");
            }
            if (computerChoice.equals("SCISSORS")) {
                System.out.println("SCISSORS CUTS PAPER. YOU LOSE!!");
                result = "L";
            }
        } else if (userChoice.equals("SCISSORS")) {
            if (computerChoice.equals("PAPER")) {
                System.out.println("SCISSORS CUTS PAPER. YOU WIN!!");
            }
            if (computerChoice.equals("ROCK")) {
                System.out.println("ROCK CRUSHES SCISSORS. YOU LOSE!!");
                result = "L";
            }
        }
        return result;
    }

    public static void displayScore(int userScore, int computerScore, int ties) {

        System.out.println("\nUSER: " + userScore + " COMPUTER: " + computerScore + " TIES: " + ties + "\n");


    }

    public static int storeUserWins(String result, int userScore) {
        if (result.equals("W")) {
            return ++userScore;
        } else {
            return userScore;
        }

    }

    public static int storeComputerWins(String result, int computerScore) {
        if (result.equals("L")) {
            return ++computerScore;
        } else {
            return computerScore;
        }

    }

    public static int storeTies(String result, int ties) {
        if (result.equals("T")) {
            return ++ties;
        } else {
            return ties;
        }

    }

}
