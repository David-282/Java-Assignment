import java.util.Arrays;
public class LargestAndSmallest{

     public static void main(String ... args){


        int  numbers [][]={{5,6},{7,1},{3,2}};
        int result [][] = findLargestSmallest(numbers);

      System.out.println(Arrays.deepToString(result));
}


     public static int [][] findLargestSmallest (int [][]numbers){

     int largest = 0;
     int smallest =numbers[0][0];

      int [][] largestAndSmallest = new int [2] [2];

     for(int count=0;count<numbers.length;count++){
          
          for (int index =0; index<numbers[0].length;index++){
          
          if(numbers[count][index]>largest){
          largest = numbers[count][index];
          largestAndSmallest [0][0] = count;
          largestAndSmallest [0][1] = index;
          
          }
          if(numbers[count][index]<smallest){
          smallest = numbers[count][index];
          largestAndSmallest [1][0] = count;
          largestAndSmallest [1][1] = index;
          
          }

        }  
     }
          return largestAndSmallest;
}


}
