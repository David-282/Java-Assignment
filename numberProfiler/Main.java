package numberProfiler;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number, to see the profile of that number: ");
        int number = input.nextInt();


        Utilities.numberProfiling(number);
    }
}
