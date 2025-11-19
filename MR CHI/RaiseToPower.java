import java.util.Scanner;
     public class RaiseToPower{
     public static void main(String[]args){

     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter the first Number: ");
     int numberOne = input.nextInt(); 

     System.out.print("Enter the Second Number: ");
     int numberTwo = input.nextInt(); 
     
     int exponential = 1;

     for(int counter = 1; counter <= numberTwo; counter++)
{
     exponential *= numberOne;

}
     


     System.out.printf("%d raise to the power of %d is %d%n",numberOne,numberTwo,exponential);



}
}
