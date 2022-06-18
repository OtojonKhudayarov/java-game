

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String userName = input.nextLine();
        System.out.println("" +
                "       ⢠⣾⣿⣿⠿⠿⠿⠿⠿⢿⣿⠿⢿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿1-exit         ⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿2-calculator   ⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿3-guess game⠀  ⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿4-wordgame     ⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿5-rockpapergame⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿6-to do list   ⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀ ⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀ ⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀ ⠀⠀⠀⠀⠀⠀  ⠀⠀⠀ ⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀ ⠀⠀⠀⠀⠀⠀⠀  ⠀⠀ ⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀ ⠀⠀⠀⠀⠀⠀⠀⠀  ⠀  ⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣦⣤⣤⣤⣤⣤⣤⣴⣿⣿⣿⣿⡿⠃");
       
        char useroption = input.nextLine().trim().charAt(0);
        while (true) {
            if (useroption=='6')
                 todolist(input, userName);
            else if (useroption == '5')
                rockPaperGame(input, userName);
            else if (useroption == '4')
                wordGame(input, userName);
            else if (useroption == '3')
                guessNumber(input, userName);
            else if (useroption == '2')
                calculator(input, userName);
            else if (useroption == '1')
                break;
            else
                System.out.print("---Wrong option! Try again!---");
            System.out.print(
                    "Main menu\n(5 - RockPaperScissors, 4-word game, 3-guess number, 2-calculator, 1-exit)\nChoose Option: ");
            useroption = input.next().trim().charAt(0);
        }
        System.out.println("Thank you for using our service!");
        input.close();
    }

    public static void rockPaperGame(Scanner scanner, String userName) {
        System.out.println("Welcome " + userName + " to \"RockPaperScissors\"!");
        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rounds; i++) {
            playRockPaperScissors(scanner, userName);
        }
    }

    // ROCK PAPER SCISSORS
    static void playRockPaperScissors(Scanner scanner, String userName) {
        // Getting input from the user
        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        // Print results
        if (playerMove.equals(computerMove)) {
            System.out.println("It's a draw!");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Bot  wins!");
        }
    }

    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }

    public static void calculator(Scanner input, String userName) {
        System.out.println(userName + " welcome to Calculator!");

        char operator;
        Double number1, number2, result;

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

    public static void guessNumber(Scanner input, String userName) {
        System.out.println(userName + " welcome to \"Guess number\".");
        int level = 1, randNum, userGuess;
        while (true) {
            int rangeStart = (int) Math.pow(level, 2), rangeEnd = rangeStart + level * level + 2;
            randNum = (int) ((Math.random() * Math.pow(10, level)) % (level * level + 2)) + rangeStart;
            System.out.print("Level " + level + ". The random number has been created in the range " + rangeStart + "-"
                    + rangeEnd + "!\nTry to guess: ");
            while (!input.hasNextInt()) {
                System.out.print("---Invalid input!---\nOnly integer: ");
                input.next();
            }
            userGuess = input.nextInt();
            if (userGuess == randNum) {
                System.out.println("Great you found it!");
            } else {
                System.out.println("It was: " + randNum);
            }
            level++;
            System.out.print("Do you want to continue?\n(1-reset level)yes/no: ");
            char exit = input.next().trim().toLowerCase().charAt(0);
            if (exit == 'n')
                break;
            if (exit == '1')
                level = 1;
        }
    }

    public static void wordGame(Scanner input, String userName) {
        System.out.println(userName + ", welcome to WordGame!");
        String[] wordList = { "apple", "book", "banana", "amount", "argument", "beautiful", "cause", "belief", "chance",
                "change", "desire", "connection", "property", "education", "different", "question", "event", "nation",
                "opposite", "number", "order", "power", "quality" };
        int ch, randIndex = (int) (Math.pow((Math.random() * 100), 2) % wordList.length);
        String randWord = wordList[randIndex];
        System.out.println("The random word created, and it contains " + randWord.length() + " characters.");
        System.out.print("Enter your guess: ");
        String userGuess = input.next().trim().toLowerCase();
        while (!userGuess.equals("1")) {
            if (userGuess.equals("2")) {
                System.out.println("The word was \"" + randWord + "\".");
                break;
            } else if (userGuess.equals("3")) {
                System.out.print("Which letter of the word do you want to see" +
                        "\nenter a number between 1 to " + randWord.length() + ": ");
                while (!input.hasNextInt()) {
                    System.out.print("Only integer in the range: ");
                    input.next();
                }
                ch = input.nextInt();
                if (ch > 0 && ch < randWord.length())
                    System.out.println(ch + "-letter is: " + randWord.charAt(ch - 1));
                else
                    System.out.println("Out of range!");
            }
            int n = 0;
            String result = "";
            if (userGuess.length() == randWord.length()) {
                for (int k = 0; k < userGuess.length(); k++) {
                    System.out.println("");
                    if (userGuess.charAt(k) == randWord.charAt(k)) {
                        result += "[" + userGuess.charAt(k) + "]";
                        n++;
                    } else
                        result += userGuess.charAt(k);
                }
            } else {
                System.out.print(
                        "Please, enter " + randWord.length() + " character word\n(1-exit, 2-give up, 3-get a hint): ");
                userGuess = input.next().trim().toLowerCase();
                continue;
            }
            if (n == randWord.length()) {
                System.out.println("Great, " + userName + ", you found it!");
                break;
            } else {
                System.out.println("You found " + n + " character(s) correct: " + result);
                System.out.print("(1-exit, 2-give up, 3-get a hint)\nTry again: ");
                userGuess = input.next().trim().toLowerCase();
            }
        }
    }
    public static void todolist(Scanner input, String userName)
    {
        int menuItem = -1;

        while(menuItem !=0) {
            menuItem = menu();
    
            switch(menuItem) {
    
            case 1: 
                showList();
                break;
    
            case 2: 
                addItem();
                break;
    
            case 3: 
                removeItem();
                break;
    
            case 0: 
                break;
               }
    
        }
    }
    
    public static int menu() {
    
    int choice; 
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("welcome to our To Do list program");
    System.out.println("Main Menu");
    System.out.println();
    System.out.println("0. Exit the program");
    System.out.println("1. Display to-do list");
    System.out.println("2. Add item to list");
    System.out.println("3. Remove item from list");
    System.out.println();
    System.out.print("Enter choice: ");
    choice = keyboard.nextInt();
    
    return choice;
    }
    
    public static void showList() {
    
    System.out.println("To-Do List");
    
    Scanner input = new Scanner(System.in);
    String line;
    int number = 1;
    
    while (input.hasNextLine()){
        line = input.nextLine();
        System.out.println(number + " ");
        System.out.println(line);
        ++number;
    }
    
    System.out.println();
    
    
    }
    
    public static void addItem() {
    
    System.out.println("Add Item");
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an item: ");
    String item = input.nextLine();
    System.out.println(item);
    
    
    }
    
    public static void removeItem() {
    
    int choice;
    showList();
    
    Scanner input = new Scanner(System.in);
    System.out.println("What do you want to remove?");
    choice = input.nextInt();
    
    ArrayList<String> items = new ArrayList<String>();
    int number = 1;
    
    Scanner input2 = new Scanner(System.in);
    String item; 
    
    while (input2.hasNextLine()) {
        item = input2.nextLine();
    
        if (number != choice) 
            items.add(item);
    
        ++number;   
    }
    
    for(int i = 0; i < items.size(); i++)
        System.out.println(items.get(i));
    }
}
