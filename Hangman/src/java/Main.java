import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main() {
        game();
    }

    private static void game() {
        String word = "cat";
        ArrayList<String> bodyList = new ArrayList<String>();
        bodyList.add(" ");
        bodyList.add(" ");
        bodyList.add(" ");
        bodyList.add(" ");
        bodyList.add(" ");
        ArrayList<String> wordList = new ArrayList<String>();
        ArrayList<String> guessList = new ArrayList<String>();
        guessList.add("_");
        guessList.add("_");
        guessList.add("_");
        for (int i=0; i<word.length(); i++) {
            wordList.add(String.valueOf(word.charAt(i)));
        }
        Scanner input = new Scanner(System.in);
        int fails = 0;


        System.out.println("HANGMAN");

        boolean finished = false;
        while (!finished) {
            System.out.println("+---+ \n\n" + bodyList.get(0) + "   | \n\n" + bodyList.get(1) + "   | \n\n" + bodyList.get(2) + "   | \n\n" + bodyList.get(3) + "" + bodyList.get(4) + " ===");
            System.out.println("Missed letters: \n" + guessList.get(0) + guessList.get(1) + guessList.get(2));

            System.out.println("Guess a letter.");
            String guess = "";
            try {
                guess = input.nextLine();
            }
            catch (Exception e) {
                System.out.println("Please only enter a letter.");
            }


            if (wordList.contains(guess)) {
                int num = wordList.indexOf(guess);
                guessList.set(num, guess);

            } else {
                if (fails==0) {
                    bodyList.set(fails, "O");
                } else if (fails==1) {
                    bodyList.set(fails, "|");
                } else if (fails==2) {
                    bodyList.set(fails, "|");
                } else if (fails==3) {
                    bodyList.set(fails, "/");
                } else if (fails==4) {
                    bodyList.set(fails, "\\");
                } else {
                    System.out.println("You failed the game.");
                    finished = again();
                }

                fails++;
            }

            if(!guessList.contains("_")) {
                System.out.println("Yes! The secret word is \"" + word + "\"! You have won!");
                finished = again();
                System.out.flush();
            }
        }
    }

    private static boolean again() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play again? (yes or no)");
        if (input.nextLine().equals("yes")) {
            game();
        }
        return true;
    }
}
