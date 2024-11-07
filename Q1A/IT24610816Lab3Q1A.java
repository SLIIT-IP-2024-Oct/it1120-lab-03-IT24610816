import java.util.Scanner;

public class IT24610816Lab3Q1A{

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        // Ask the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms of rice you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        // Calculate the total amount
        double totalAmount = pricePerKg * kilograms;
        
        // Display the total amount to be paid
        System.out.println("The total amount you have to pay for " + kilograms + " kg of rice is: " + totalAmount);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}