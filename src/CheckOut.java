import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double totalCost = 0;
        boolean hasMoreItems = true;

        while (hasMoreItems) {
            // Prompt user for item price
            double itemPrice = SafeInput.getRangedDouble(in, "Enter item price (.50 to 9.99): ", 0.5, 9.99);
            // Add item price to total cost
            totalCost += itemPrice;

            // Check if user has more items to input
            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items to input? (y/n): ");
        }

        // Print total cost of items
        System.out.println("Your total cost is $" + String.format("%.2f", totalCost));
    }
}
