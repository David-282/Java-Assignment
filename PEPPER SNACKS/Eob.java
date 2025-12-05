import java.util.Arrays;
public class Eob{
public static void main(String[]args){
          int[] num= {1,2,3,4,5,6,7,8};
          int[]number={10,20,30,40,50};
    System.out.println(Arrays.toString(arrayConcatenation(num,number)));
   

}

public static int largestElement(int[] userInput){
     int largest=0;
     for(int count=0;count<userInput.length;count++){
     if (userInput[count]>largest){
          largest=userInput[count];}     

}
     return largest;

     }


public static int addtion(int [] number){
     int sumOfArray=0;
     for(int count=0;count<number.length;count++){
          sumOfArray+=number[count];
          }
     return sumOfArray;
}

public static int [] reversedOrder(int[] userInput){
     int[] result= new int[userInput.length]; 
     int reverseCount=0; 
     for(int count =userInput.length-1;count>=0;count--){
          result[reverseCount]=userInput[count];
          reverseCount++;
}  
          
               return result;


}



public static int [] oddElement(int [] numbers){
     int oddArray[]= new int[numbers.length/2];
     int counter=0;
     for(int count =0;count<numbers.length-1;count+=2){
          oddArray[counter]=numbers[count];
               counter++;
}
     return oddArray;
     
}




public static int [] evenElement(int [] numbers){
     int evenArray[]= new int[numbers.length/2];
     int counter=0;
     for(int count =1;count<numbers.length-1;count+=2){
          evenArray[counter]=numbers[count];
               counter++;
}
     return evenArray;
     
}



public static boolean elementComparing(int [] userInput,int element){
     for(int count=0;count<userInput.length;count++){
          if (element == userInput[count])

          return true;}

          {return false;
               }
}

 
public static int [] arrayConcatenation(int [] firstArr,int [] secondArr){
            int [] newArr= new int [firstArr.length+secondArr.length];
               int firstArrcount=0;            
               int secondArrcount=0;
               for(int count=0;count<newArr.length-1;count++){
               if (firstArrcount <firstArr.length){
               newArr[count]=firstArr[firstArrcount];
                    firstArrcount++;
}
         if ((secondArrcount <secondArr.length)){
           newArr[++count]=secondArr[secondArrcount];
                    secondArrcount++;
          }


}               
          

               return newArr;
                    
}










}
