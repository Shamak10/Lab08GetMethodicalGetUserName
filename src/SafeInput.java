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

    public static String getRegExString(Scanner pipe, String prompt, String regex) {
        String retString;
        boolean validInput;

        do {
            System.out.print(prompt);
            retString = pipe.nextLine();
            validInput = retString.matches(regex);
            if (!validInput) {
                System.out.println("Invalid input format. Please try again.");
            }
        } while (!validInput);

        return retString;
    }

    public static void prettyHeader(String msg) {
        int headerWidth = 60;
        int msgWidth = msg.length();
        int leftWidth = (headerWidth - msgWidth) / 2 - 3;
        int rightWidth = headerWidth - msgWidth - leftWidth - 6;

        String stars = "";
        for (int i = 0; i < headerWidth; i++) {
            stars += "*";
        }

        String leftSpaces = "";
        for (int i = 0; i < leftWidth; i++) {
            leftSpaces += " ";
        }

        String rightSpaces = "";
        for (int i = 0; i < rightWidth; i++) {
            rightSpaces += " ";
        }

        System.out.println(stars);
        System.out.printf("***%s%s%s***%n", leftSpaces, msg, rightSpaces);
        System.out.println(stars);
    }

    public static String getNonEmptyString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (input.trim().isEmpty()) {
            System.out.print(prompt);
            input = scanner.nextLine();
        }

        return input;
    }
}
