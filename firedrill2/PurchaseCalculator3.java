import java.util.Scanner;

public class PurchaseCalculator3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to E-Store");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the number of items purchased: ");
        int numberOfItems = input.nextInt();

        System.out.print("Please enter the percentage discount: ");
        int percentage = input.nextInt();

        System.out.print("Enter the cost for each item (or -1 to end): ");
        int cost = input.nextInt();

        int counter = 0;
        int total = 0;
        int discountPrice = 200;

        while (cost != -1) {
            total += cost;
            counter++;

            System.out.print("Enter the cost for the next item (or -1 to end): ");
            cost = input.nextInt();

            if (cost == -1) {
                break;
            }
        }

        if (total != 0) {
            System.out.println("Original cost: $" + total);

            double percent = (double) percentage / 100;
            double discount = total * percent;
            double discountCost = total - discount;

            System.out.println("Customer Name: " + name);
            if (total >= discountPrice) {
                System.out.println("Discounted price: $" + discountCost + " (Discount applied)");
            } else {
                System.out.println("No Discount");
            }
        }

        System.out.println("Thanks for your patronage!");
    }
}
