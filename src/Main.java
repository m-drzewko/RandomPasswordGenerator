import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // character range for the password
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String symbols = "!@#$%^&*()-_=+<>?,./;':[]{}`|~\\";

        String characters = lowercase + uppercase + numbers + symbols;

        // random number generator
        Random rand = new Random();

        // taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many characters would you like your password to have?");
        int passLength = scanner.nextInt();
        scanner.nextLine(); //consume end of line char

        StringBuilder sb = new StringBuilder();

        // generate password
        for (int i = 0; i < passLength; i++) {
            int seed = rand.nextInt();
            if (seed < 0) {
                seed *= -1;
            }
            sb.append(characters.charAt(seed % 93));
        }

        String password = sb.toString();

        System.out.println("Your new random password is: " + password);
        scanner.nextLine(); // prevent cmd window from closing after printing password
        scanner.close();
    }
}