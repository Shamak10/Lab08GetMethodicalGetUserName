import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt = getInt(in, "Enter your favorite integer: ");
        System.out.println("Your favorite integer is " + favInt);

        double favDouble = getDouble(in, "Enter your favorite double: ");
        System.out.println("Your favorite double is " + favDouble);
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retValue = 0;
        boolean inputIsGood = false;
        do {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                inputIsGood = true;
            } else {
                pipe.nextLine(); // clear the invalid input from the scanner
                System.out.println("Invalid input; please enter an integer.");
            }
        } while (!inputIsGood);
        pipe.nextLine(); // clear the input buffer
        return retValue;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retValue = 0.0;
        boolean inputIsGood = false;
        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                inputIsGood = true;
            } else {
                pipe.nextLine(); // clear the invalid input from the scanner
                System.out.println("Invalid input; please enter a double.");
            }
        } while (!inputIsGood);
        pipe.nextLine(); // clear the input buffer
        return retValue;
    }
}
