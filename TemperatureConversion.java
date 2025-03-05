import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        //applying formula
        double fahrenheitResult = (celsius * 9/5) + 32;
        
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        
        scanner.close();
    }
}
