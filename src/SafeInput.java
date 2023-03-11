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
}
