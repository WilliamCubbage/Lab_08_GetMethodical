import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0.0;
        boolean hasMoreItems;

        do { //Asking for price of item
            double price = SafeInput.getRangedDouble(scanner, "Enter the price of the item ($0.50 to $10.00): ", 0.50, 10.00);
            totalCost += price;

            hasMoreItems = SafeInput.getYNConfirm(scanner, "Do you have anymore items? (Y/N): "); //Asking if you have more items
        }

        while (hasMoreItems);

        System.out.printf("Total cost of the items: $%.2f%n", totalCost); //total of every entered

        scanner.close();
    }
}
