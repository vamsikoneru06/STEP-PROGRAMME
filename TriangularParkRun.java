import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side 1 (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter side 2 (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter side 3 (in meters): ");
        double side3 = scanner.nextDouble();
        
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000; // 5 km in meters
        double rounds = distanceToRun / perimeter;
        
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km%n", rounds);
        
        scanner.close();
    }
}
