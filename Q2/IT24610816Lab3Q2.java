import java.util.Scanner;

public class IT24610816Lab3Q2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        System.out.println("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();
   
        System.out.print("Enter the number of OT hours worked: ");
        double otHours = input.nextDouble();
    
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = input.nextDouble();
        
        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;
        
        
        System.out.println("The OT Amount is: " + otAmount);
        System.out.println("The Total Salary (including OT) is: " + totalSalary);
    
    }
}
