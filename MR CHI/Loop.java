import java.util.Scanner;
import java.util.Random;
     public class Loop{
     public static void main(String[]args){

     Scanner input = new Scanner(System.in);
     Random key = new Random();

     int counter = 0;
     int random = key.nextInt(0,10);

     System.out.print("Enter any number between 0 and 10 to guess the random nunber: ");
          int digits = input.nextInt();

     while(digits!= random){

     System.out.println("Not correct ");
     digits= input.nextInt();

     if(digits > random){
          System.out.println("Too high, try again ");}

     else{ 
               if(digits< random){
          System.out.println("Too low,try again ");}}
counter++;
}

     System.out.println("The number is corect, it is "+random);

}
}
