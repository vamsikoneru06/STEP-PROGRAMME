import java.util.Scanner; 
 
public class BasicCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter first number: "); 
        float number1 = scanner.nextFloat(); 
 
        System.out.print("Enter second number: "); 
        float number2 = scanner.nextFloat(); 
 
        float addition = number1 + number2; 
        float subtraction = number1 - number2; 
        float multiplication = number1 * number2; 
        float division = number1 / number2; 
 
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n",number1, number2, addition, subtraction, multiplication, division); 
         
        scanner.close(); 
    } 
}