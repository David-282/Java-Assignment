public class Kata{
   
     public static boolean isEven(int number){
     boolean isEven =true;
     
     if(number % 2 == 0){
     return true;
     } 
     else{
     return false;
}
     }

         
     public static boolean isPrimeNumber(int number){
     boolean isPrimeNumber = true;
     for(int counter =1;counter <=(number/2);counter++){
          if(number % counter == 0){
              isPrimeNumber = false;     
}
          else isPrimeNumber=true;
}     
          return isPrimeNumber;
}



}
              
     public static int subtract(int firstNumber,int secondNumber){
     int subtraction = 0;
     if (firstNumber > secondNumber){
     subtraction = firstNumber - secondNumber;                
     }
     else{
          subtraction = secondNumber - firstNumber;

  
     

}
          return subtraction;   
}
              
     public static float divide(int firstInteger,int secondInteger){
     float division = (float)firstInteger/ (float)secondInteger;
     
     if (secondInteger == 0){
          return  0;
     }
     else{
          return division;     
}
 

}
               

     public static int factorOf(int number){
      int factors = 0;
      for(int count = 1; count <= number; count++){
          if (number % count == 0){
               factors += 1;
          }
               }
          return factors;
          
}

  

     public static long squareOf(int number){
     long square = number * number;
     return square;
}

              
     public static boolean isPalindrome(int number){
     int digitOne = number/10000;
     int digitTwo = (number/1000)%10;
     int digitThree = (number/100)%10;
     int digitFour = (number/10)%10;
     int digitFive = number%10;

     boolean isPalindrome = true;
          
     if (digitOne == digitFive && digitTwo ==digitFour)
          return true;
     else{return false;}
   
}
              
     public static long factorialOf(int integer){
     int factorial =1;     
     for(int count= 1; count <= integer; count++){
          factorial *= count;}

          return factorial;
}


    

          








    

}
