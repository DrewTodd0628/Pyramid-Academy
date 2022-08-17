import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

public class Main {
    static String name;
    static int score;
    static int iLoop;
    static String word = "cat";
    static String[] wordArray = word.split("");
    static ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(wordArray));
    static Map<String, String> wordMap = new HashMap<>();


    public static void main(String[] args) {
        start();
    }

    static void game() {
        System.out.println("Score: " + score);
        drawFrame();
        word();
    }

    private static void word() {

        if (score<=0 || !wordMap.containsValue("_")) {
            end();
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Guess a letter." + "\n    " + wordMap.get("c") + wordMap.get("a") + wordMap.get("t"));
        String guess = "";
        try {
            guess = input.nextLine().toLowerCase();
        }
        catch (Exception e) {
            System.out.println("Please only enter a letter.");
        }


        if (wordList.contains(guess)) {
            wordMap.put(guess, guess);


        } else {
            score = score - 25;
        }
        System.out.flush();
        game();
    }

    private static void end() {
             setScore(score);
        if (score<=0) {
            System.out.println("You ran out of attempts.\nWould you like to try again? (Y/N)");
        } else {
            System.out.println("You won with a score of " + score + "!" + " \nWould you like to try again? (Y/N)");
        }
        Scanner input = new Scanner(System.in);
        String user = input.nextLine().toLowerCase();

        if (user.equals("y")) {
            start();
        } else if (user.equals("n")) {
            System.exit(0);
        } else {
            System.out.println("Not a valid option.");
            end();
        }
    }

    private static void drawFrame() {
        Scanner input = null;
        try {
            input = new Scanner(new File("art.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[] lines = new int[0];
        if (score == 25) {
            lines = new int[24];
        } else if (score == 50) {
            lines = new int[18];
        } else if (score == 75) {
            lines = new int[12];
        } else if (score == 100) {
            lines = new int[6];
        } else {
            lines = new int[30];
        }

        final int[] linesF = lines;
        final Scanner inputF = input;
        iLoop = 0;
        Arrays.stream(lines).forEach(l->{
            if ( (iLoop>=(linesF.length-6)) &&  (iLoop<=(linesF.length))) {
                System.out.println(inputF.nextLine());
            } else {
                inputF.nextLine();
            }
            iLoop = iLoop + 1;
        });
    }

    private static void start() {
        score = 100;
        wordMap.put("c", "_");
        wordMap.put("a", "_");
        wordMap.put("t", "_");
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Hangman!\nMay I know your name?\nName: ");
        setName(input.nextLine());
        game();
    }

    private static void setName(String str) {
        name = str;
        save(String.valueOf(LocalDateTime.now()));
        save("Name: " + str);
    }

    private static void setScore(int num) {
        score = num;
        save("Score: " + num + "\n");
    }

    private static void save(String str) {
        try (
            FileWriter writer = new FileWriter("save.txt", true);
            BufferedWriter buff = new BufferedWriter(writer);
            PrintWriter saveTo = new PrintWriter(buff))
        {
            saveTo.println(str);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}