import java.util.Scanner;
public class MultiplicationOfNumbers{

     public static void main(String []args){
     Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number:  ");
     int firstNumber = input.nextInt();

     System.out.print("Enter the second number:  ");
       int secondNumber = input.nextInt();

     System.out.println(multiplyingNumbers(firstNumber,secondNumber));   
}

     public static int multiplyingNumbers (int firstNumber, int secondNumber ){
 

     int multiplication =0;

     for(int count = 0;count<firstNumber;count++){

          multiplication+=secondNumber;
          }

     return multiplication;

}
}
