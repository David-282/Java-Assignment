import java.util.Scanner;
public class LargestSmallest{
    public static void main(String[] args){
    
    Scanner key = new Scanner(System.in);  
    System.out.print("Enter any number(0 to stop the program): ");
    
    int number = key.nextInt();
    int largestNumber = number;
    int smallestNumber = number;

    while(number != 0){
    System.out.print("Enter any number(0 to stop the program): ");
    number = key.nextInt(); 

    if(number == 0){
    break;
    }
    if(number > largestNumber){
        largestNumber = number;
    }   
    if(number < smallestNumber){
        smallestNumber = number;
    }
    }
    
    System.out.printf("The smallest is %d and the largest is %d ",smallestNumber,largestNumber);



}
}
