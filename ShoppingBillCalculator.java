import java.util.Scanner;

public class ShoppingBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of Product 1: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter quantity of Product 1: ");
        int quantity1 = sc.nextInt();

        System.out.print("Enter price of Product 2: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter quantity of Product 2: ");
        int quantity2 = sc.nextInt();

        System.out.print("Enter price of Product 3: ");
        double price3 = sc.nextDouble();

        System.out.print("Enter quantity of Product 3: ");
        int quantity3 = sc.nextInt();

        double amount1 = price1 * quantity1;
        double amount2 = price2 * quantity2;
        double amount3 = price3 * quantity3;

        double totalBill = amount1 + amount2 + amount3;

        double discount = 0;

        if (totalBill >= 500) {
            discount = totalBill * 0.10;
        }

        double finalAmount = totalBill - discount;

        System.out.println("\n===== SHOPPING BILL =====");
        System.out.println("Product 1 Amount: " + amount1);
        System.out.println("Product 2 Amount: " + amount2);
        System.out.println("Product 3 Amount: " + amount3);
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}
