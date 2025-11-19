import java.util.Scanner;
     public class PrimeNumbers{
     public static void main(String[]args){
     
     Scanner door = new Scanner(System.in);
    
     System.out.print("Enter a number to check if it is a prime number: ");
     int number = door.nextInt();
     boolean condition = true;
     
          for(int count = 2;count <=(number/2);count++){
               if (number % count == 0){
                    condition = false;
               }
}
               if (condition){
                    System.out.print("The number is prime");
               }else{
                    System.out.print("The number is not a prime");
               }


}

}




