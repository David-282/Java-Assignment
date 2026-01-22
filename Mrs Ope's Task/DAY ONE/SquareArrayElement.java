import java.util.Arrays;
public class SquareArrayElement{

     public static void main(String...args){

     int [] numbers = {-6,2,3,-0,1,0,0};

     int result []  = sqaureElements(sortingElements(numbers));  

     System.out.println(Arrays.toString(result));

}

     public static int [] sqaureElements(int [] numbers){

     for(int count =0; count<numbers.length;count++){

     numbers[count]= numbers[count]*numbers[count];

     }

     return numbers;
}

     public static int [] sortingElements (int [] numbers){
     
     int sort=0;
     for(int count =0; count<numbers.length;count++){
//                    sort =0;
            for(int index =0; index<numbers.length;index++){
          if(numbers[index]>numbers[count]){
               sort=numbers[count];
               numbers[count]=numbers[index];
               numbers[index]=sort;
                    }
               }

          }
     return numbers;

}




}
