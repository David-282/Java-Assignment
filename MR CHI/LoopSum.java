import java.util.Scanner;
     public class LoopSum{
     public static void main(String[]args){

     Scanner key = new Scanner(System.in);

     System.out.print("Enter the First number: ");
     int firstInteger = key.nextInt();
     
     System.out.print("Enter the Second number: ");
     int secondInteger = key.nextInt();

    int sum = firstInteger + secondInteger;
          
     System.out.println("The addtion of the two integers is " + sum);  
     
     int stop = 0;
     int numStop; 
     
     do{ System.out.println("Press any number apart from 0 to continue the operation");
           numStop = key.nextInt();
     if (numStop == stop)
          {System.out.println("Bye,Thanks for coming");

}
     else{
    
     System.out.print("Enter the First number: ");
     int firstNumber = key.nextInt();
     
     System.out.print("Enter the Second number: ");
     int secondNumber = key.nextInt();

    int sumTwo = firstNumber + secondNumber;
          
     System.out.println("The addtion of the two integers is " + sumTwo);    
} 
     }
       while(stop != numStop);











}
}
