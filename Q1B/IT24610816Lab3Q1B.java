import java.util.Scanner;

public class IT24610816Lab3Q1B{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        System.out.println("Enter the number of kilograms of rice you want to buy: ");
        double kilograms = input.nextDouble();

        double totalAmount = pricePerKg * kilograms;

        double discount = totalAmount * 0.10;

        double amountAfterDiscount = totalAmount - discount;

              
        System.out.println("Total amount after discount: " + amountAfterDiscount);

        input.close();

    }
}