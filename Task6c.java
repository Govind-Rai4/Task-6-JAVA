import java.util.Scanner;

public class Task6c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: $");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0.0;

        if (purchaseAmount > 500) {
            discount=purchaseAmount*0.20;
        } else if (purchaseAmount >= 300) {
            discount = purchaseAmount * 0.10;
        } 

         double finalAmount = purchaseAmount - discount;

         System.out.println("Final amount to pay: $" + finalAmount);


        scanner.close();
    }
}
