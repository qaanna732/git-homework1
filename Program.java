package HW_Lecture1_TemperatureConverter;
// Temperature converter application
//Version: 1.0
//Updated Version 1.1
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what you want to convert 1 or 2");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter 1 or 2");
        int choice = scanner.nextInt();

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();
//condition 1 or 2
        if (choice == 1) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println("Fahrenheit is " + fahrenheit);
        } else if (choice == 2) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println("Celsius is " + celsius);
        } else {
            System.out.println("Invalid choice");
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5 + 32);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
            return ((fahrenheit - 32) * 5 /9);
        }
    }

