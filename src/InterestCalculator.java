import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interestRate = 5.5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        double total_interest;
        total_interest = money * (interestRate/100)/12 * month;
        System.out.println("Total of interest: " + total_interest);
    }
}
