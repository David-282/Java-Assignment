import java.util.Scanner;
     public class PositiveNegative{
     public static void main(String[]args){

     Scanner key = new Scanner(System.in);

     int sentinel = -50;
     int positiveNumber = 0;
     int negativeNumber = 0;
     int zeros = 0;
     
     
     System.out.print("Enter a number(-50 to end the program): ");
     int number = key.nextInt();
     
     if (number == sentinel){
     System.out.print("End of program");}

     while(number != sentinel) {
          System.out.print("Enter a number(-50 to end the program): ");
           number = key.nextInt();

            if (number == 0)
               {zeros +=1;}
            if (number > 0)
               {positiveNumber += 1;}
             if (number < 0)
               {negativeNumber+= 1;}
}

            System.out.printf("%d zeros was enter,and %d positive numbers, finally  %d negative number was entered", zeros,positiveNumber,negativeNumber);
          
   
}
}
