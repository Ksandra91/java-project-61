package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String Name = scanner.nextLine();
        System.out.println("Hello, " + Name + "!");
        scanner.close();
    }
}