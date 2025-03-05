import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = scanner.nextDouble();

        double areaInInches = 0.5 * baseInches * heightInches;
        double areaInCm = areaInInches * 6.4516; // 1 square inch = 6.4516 square cm

        double heightFeet = heightInches / 12;
        double heightCm = heightInches * 2.54; // 1 inch = 2.54 cm

        System.out.printf("Your height in cm is %.2f, in feet is %.2f, and in inches is %.2f.%n", heightCm, heightFeet, heightInches);
        System.out.printf("Area of the triangle is %.2f square inches and %.2f square centimeters.%n", areaInInches, areaInCm);

        scanner.close();
    }
}