package java;

import java.util.Scanner;

public class GuessTheNumber {
    public static void game() {
        Scanner input = new Scanner(System.in);
        String username;
        String userStr;
        int userNum = 0;

        System.out.println("Hello! What is your name?");
        username = input.nextLine();

        int rand = (int )(Math.random() * 20 + 1);
        System.out.println("Well, " + username + ", I am thinking of a number between 1 and 20.");

        boolean gotNum = false;
        while (!gotNum) {
            System.out.println("Take a guess.");

            boolean answer = false;
            while (!answer) {
                try {
                    Scanner tryInput = new Scanner(System.in);
                    userNum = tryInput.nextInt();
                    answer = true;
                }
                catch (Exception e) {
                    System.out.println("Please enter a number.");
                }
            }

            if (userNum == rand) {
                System.out.println("Good job, " + username + " You guessed my number in " + rand + " guesses!");
                System.out.println("Would you like to play again? (y or n)");

                userStr = input.next();
                if (userStr.equals("n")) {
                    gotNum = true;
                }
            } else {
                if (userNum>rand) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }

        }



    }
}
