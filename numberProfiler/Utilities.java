package numberProfiler;

public class Utilities {


    public boolean isEven(int number) {

        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrimeNumber(int number) {
        if(number <= 1){
            return false;
                 }
        for (int counter = 2; counter <= (number / 2); counter++) {
            if (number % counter == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCompositeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        return !isPrimeNumber(number);
    }

    public static boolean PerfectNumber(int number) {
        int sumOfFactors = 0;
        int factors = 1;
        for (factors = 1; factors < number; factors++) {
            if (number % factors == 0) {
                sumOfFactors += factors;
            }
        }
        if (number == sumOfFactors) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isArmStrongNumber(int number) {
        int digit = number;
        int sumOfExponential = 0;
        int numberLength = digits.length();
        while (digit != 0) {
            int separateDigits = digit % 10;
            int exponential = (int) Math.pow(separateDigits, numberLength);
            sumOfExponential += exponential;
            digit = digit / 10;
        }
        return sumOfExponential == number;
    }

    public static String getDiviors(int number) {

        String divisiors = "";

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                divisiors += count + ",";
            }
        }
        return divisiors;
    }

    public static boolen isNaturalNumber(int number) {
        return number >= 1;

    }
    public static boolean isAbundant (int number){
        int sumOfDivisors=0;
        if (number <0){
            return false;
        }
        for(int count =1; count <number ;count++){
            if(number % count == 0){
                sumOfDivisors+= count;
            }
        }
        return sumOfDivisors > number;
    }

    public static boolean isDeficient (int number){

        int sumOfDivisors = 0;
             for(int count = 1; count < number; count++){
                     if(number % count == 0){
                            sumOfDivisors += count;
                     }
             }
            return sumOfDivisors < number;
         }

    public static int digitalSum(int number){
            int sum = 0;

            while(number != 0){

                    int digit = number % 10;
                    sum = sum + digit;
                    number = number / 10;
            }
            return sum;
         }



    public static void base10to2(int number) {

        if (number == 0) {
            System.out.println("0");
            return;
        }

        if (number < 0)
            number *= -1;

        int originalNumber = number;
        int division = 0;
        int multiplication = 0;
        String convertedNum = "";
        int subtraction = 0;

        for (int count = 0; count < number; count++) {

            division = originalNumber / 2;
            multiplication = division * 2;
            subtraction = originalNumber - multiplication;

            convertedNum += subtraction;

            if (division == 0) {
                break;
            }

            originalNumber = division;
        }

        String reversed = "";

        for (int index = convertedNum.length() - 1; index >= 0; index--) {
            reversed += convertedNum.charAt(index);
        }

        System.out.println("THE CONVERTED NUMBER IS --> " + reversed);
    }


    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        return originalNumber == reversedNumber;
    }
}

