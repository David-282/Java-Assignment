import java.util.Scanner;

public class LargestSmall {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int sentinel = 0;

        System.out.print("Enter a number (0 to stop): ");
        int number = key.nextInt();
        
        if (number == sentinel) {
            System.out.println("No number entered.");
            
        }

        int largest = number;
        int smallest = number;

        while (number != sentinel) {
            System.out.print("Enter a new number (0 to stop): ");
            number = key.nextInt();

            if (number == sentinel) 

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);
    }
}

