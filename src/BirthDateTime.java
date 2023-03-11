import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get year of birth (1950-2010)
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth (1950-2010): ", 1950, 2010);

        // Get month of birth (1-12)
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth (1-12): ", 1, 12);

        // Get day of birth (1-31, depending on month and year)
        int maxDays;
        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    maxDays = 29; // leap year
                } else {
                    maxDays = 28; // non-leap year
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }
        int day = SafeInput.getRangedInt(in, "Enter the day of your birth (1-" + maxDays + "): ", 1, maxDays);

        // Get hour of birth (1-24)
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24): ", 1, 24);

        // Get minute of birth (1-59)
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth (1-59): ", 1, 59);

        // Print out birth date and time
        System.out.println("Your birthdate and time is: " + month + "/" + day + "/" + year + " " + hour + ":" + minute);
    }
}
