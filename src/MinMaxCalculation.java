import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.next();

            if (input.equals("q")) {
                break; // Exit the loop if the user enters 'q'
            }

            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
        } else {
            double min = numbers.get(0);
            double max = numbers.get(0);

            for (double number : numbers) {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }

            System.out.println("Minimum : " + min);
            System.out.println("Maximum : " + max);
        }

        scanner.close();
    }
}

