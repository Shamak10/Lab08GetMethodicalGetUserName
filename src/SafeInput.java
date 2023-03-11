import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + " : ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int min, int max) {
        int retInt = 0;
        do {
            System.out.print("\n" + prompt + " : ");
            while (!pipe.hasNextInt()) {
                System.out.print("Invalid input. " + prompt + " : ");
                pipe.next();
            }
            retInt = pipe.nextInt();
        } while (retInt < min || retInt > max);

        pipe.nextLine(); // clear the input buffer
        return retInt;
    }
public static double getRangedDouble(Scanner scanner, String prompt, double min, double max) {
        double value = 0;
        boolean valid = false;
        do {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value >= min && value <= max) {
                    valid = true;
                } else {
                    System.out.println("Please enter a value between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        } while (!valid);
        return value;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        do {
            System.out.print(prompt + " (Y/N): ");
            response = pipe.nextLine().toUpperCase();
        } while (!response.equals("Y") && !response.equals("N"));

        return response.equals("Y");
    }
}
