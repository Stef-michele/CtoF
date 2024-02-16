import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        // Import Scanner
        Scanner in = new Scanner(System.in);
        // Declare variables
        double celsius = 0;
        double fahrenheit = 0;
        boolean validInput = false;
        // Ask for temperature in a do-while loop for valid input
        do {
            System.out.print("Enter temperature in Celsius: ");
            // Check if the input is a double
            if (in.hasNextDouble()) {
                // Assign Celsius value
                celsius = in.nextDouble();
                // Switch value to exit the loop
                validInput = true;
                // Calculate Fahrenheit
                fahrenheit = (celsius * 9 / 5) + 32;
                // Output temperature
                System.out.println("Equivalent temperature in Fahrenheit is: " + fahrenheit);
            } else { // If not a double
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.nextLine(); // Clear the buffer
            }

            // Keep looping until valid input is provided
        } while (!validInput);

        // Close the Scanner
        in.close();
    }
}
