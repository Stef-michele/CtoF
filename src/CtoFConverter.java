import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        //import scanner
        Scanner in = new Scanner(System.in);
        //declaring variables
        double celcius = 0;
        double fahrenheit = 0;
        boolean done = false;
        String trash = "";
        //do if for valid input (bulletproofing)
        do {
            System.out.print("Enter temperature in Celcius: ");
            if(in.hasNextDouble()) {
                celcius = in.nextDouble();
                in.nextLine(); //clears buffer
                //converting teperature
                fahrenheit = (celcius * 9 / 5) + 32;
                System.out.println("Equivalent temperature in Fahrenheit is: " + fahrenheit);
                done = true; //finish loop
            }else{
                //invalid input
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a valid number not " + trash);
            }
        } while (!done);
    }
}