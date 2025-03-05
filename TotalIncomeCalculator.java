import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your bonus: ");
        double bonus = scanner.nextDouble();

        double totalIncome = salary + bonus;

        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence, the total income is INR %.2f%n", salary, bonus, totalIncome);

        scanner.close();
    }
}
