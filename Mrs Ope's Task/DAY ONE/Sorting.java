import java.util.Arrays;
public class Sorting{

      public static void main(String...args){

     int [] [] numbers = {{5,6},{7,1},{3,2}};

     int result []  =  addingElements(numbers);
     int []sortedResult = SquareArrayElement.sortingElements(result);

     System.out.println(Arrays.toString(sortedResult));

}

     public static int [] addingElements (int [][] numbers){

     int [] sumArray = new int [numbers.length];

     for(int count=0;count<numbers.length;count++){
          
          for (int index =0; index<numbers[0].length;index++){
          
          sumArray[count]+= numbers[count][index];        
     
               }
                    
          }

     return sumArray;

}

    
}
