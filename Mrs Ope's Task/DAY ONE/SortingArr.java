import java.util.Arrays;
public class SortingArr{

     public static void main(String...args){

     int [] numbers = {6,30,4,6,-1000,9,0};

     int result []  = sortingElementsWithout(numbers);  

     System.out.println(Arrays.toString(result));

}

      public static int [] sortingElementsWithout (int [] numbers){
     
     int sort=0;
     for(int count =0; count<numbers.length-1;count++){

            for(int index =0; index<numbers.length- 1;index++){
          if(numbers[index]>numbers[index+1]){
               numbers[index] = numbers[index]+numbers[index+1];
               numbers[index+1] = numbers[index]- numbers[index+1] ;
               numbers[index]=  numbers[index]- numbers[index+1];
                    }
               }

          }
     return numbers;

}

}
