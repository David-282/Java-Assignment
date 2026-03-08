package numberProfiler;

public class Utilities {


    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
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

    public static boolean isPerfectNumber(int number) {
        int sumOfFactors = 0;
        int factors = 1;
        for (factors = 1; factors < number; factors++) {
            if (number % factors == 0) {
                sumOfFactors += factors;
            }
        }
        return number == sumOfFactors;
    }

    public static boolean isArmStrongNumber(int number) {
        String digits =""+number;
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

    public static String getDivisors(int number) {

        String divisiors = "";

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                divisiors += count + ",";
            }
        }
        return divisiors.substring(0,(divisiors.length()-1));
    }

    public static boolean isNaturalNumber(int number) {
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
                    sum += digit;
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

        System.out.printf("%d CONVERTED TO BASE TWO  IS -->  %s%n",number,reversed);
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

    public static boolean isSquareNumber (int number){
        for (int count = 1 ; count < number ;count++){
            if (count * count== number){
                return true;
            }
        }
        return false;
    }

    public static boolean isCubeNumber (int number){
        for (int count = 1 ; count < number ; count++){
            if ((int)Math.pow(count,3)== number){
                return true;
            }
        }
        return false;
    }


    public static void numberProfiling (int number){

//        condition ? value_if_true : value_if_false

        if (isEven(number)) System.out.println(number + " is an Even number ");
        if (isOdd(number)) System.out.println(number + " is a Odd number ");
        if (isPrimeNumber(number)) System.out.println(number + " is a Prime number ");
        if (isCompositeNumber(number)) System.out.println(number + " is a Composite number ");
        if (isPerfectNumber(number)) System.out.println(number + " is a Perfect number ");
        if (isArmStrongNumber(number)) System.out.println(number + " is an Armstrong number ");
        if (isNaturalNumber(number)) System.out.println(number + " is a Natural number ");
        if (isSquareNumber(number)) System.out.println(number + " is a Square number ");
        if (isAbundant(number)) System.out.println(number + " is an Abundant number ");
        if (isDeficient(number)) System.out.println(number + " is a Deficient  number ");
            base10to2(number);
        if (isPalindrome(number)) System.out.println(number + " is a Palindrome number ");
        if (isCubeNumber(number)) System.out.println(number + " is a Cube number ");
        System.out.printf("The Digital Sum of %d is %d%n",number,digitalSum(number));
        System.out.printf("The Divisors of %d are %s%n",number,getDivisors(number));




    }
}

