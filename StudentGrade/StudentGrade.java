import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
     static Scanner input =new Scanner(System.in);
     public static void main(String []args){

     System.out.print("How many students do you have ?: ");
     int noOfStudents = input.nextInt();
          
     System.out.print("How may subjects do they offer ?: ");
     int noOfSubjects = input.nextInt();
     System.out.println("Saving >>>>>>>>>>>>>>");
     System.out.println("Saved Successfully");

     int [] [] studentsResults = new int [noOfStudents][noOfSubjects];

          //   System.out.println(Arrays.deepToString(inputResults(studentsResults)));
          inputResults(studentsResults);
               
          int [] totalArray=  (totalPerStudent(studentsResults));
          double [] averageArray =  averagePerStudent(totalArray,noOfSubjects);
          int [] positionArray =    position(totalArray);
          int [] subjectsTotal=  totalPerSubject(studentsResults,noOfSubjects);
          double [] subjectAverageArray = subjectAverage(subjectsTotal,noOfStudents);
//          System.out.println(Arrays.toString(position(totalArray)));
          //     position(totalArray);
           System.out.println("=".repeat(70));

          System.out.print("STUDENT\t\t");
           for(int count=1;count<=noOfSubjects;count++){
               System.out.printf("SUB%d \t",count);
           }
          System.out.println("TOT\t Ave\t POS" );
           for (int index=0;index <noOfStudents;index++){
               System.out.printf("Student %d\t",(index+1));
              for (int element =0;element <noOfSubjects;element++){
             System.out.print(studentsResults[index][element]);
             System.out.print("\t");
          //    System.out.print(totalArray
              }
               System.out.print(totalArray[index]);
             System.out.print("\t");
              System.out.printf("%.2f",averageArray[index]);
             System.out.print("\t");
              System.out.printf("%d",positionArray[index]);
              System.out.println();
           }
           System.out.println("=".repeat(70));
           System.out.println();


           System.out.println("SUBJECT SUMMARY");
          //  for(int position=0 ;position<noOfSubjects;position++){
                         subjectSummary(studentsResults, noOfStudents, noOfSubjects,subjectsTotal,subjectAverageArray);
                         hardestAndEasiest (studentsResults);
                         classSummary( totalArray,noOfStudents);
          //                System.out.printf("Total Score is %d%n",subjectsTotal[position]);
          //                System.out.printf("Average Score is: %.2f",subjectAverageArray[position]);
          // //  }

               // totalPerSubject(studentsResults,noOfSubjects);
               // subjectAverage((totalPerSubject(studentsResults,noOfSubjects)),noOfStudents);
}
//          {{1,2,1},{2,3,4},{2,5,7}}
     public static int [][]  inputResults(int [][] studentsResults){


     for(int count=0; count<studentsResults.length;count++){

          for (int index=0; index<studentsResults[count].length; index++){
                    System.out.println("Entering Score for Student  "+(count+1));
                    System.out.println("Enter Score for Subject  "+(index+1));
                    studentsResults[count][index] = input.nextInt();
                    System.out.println("Saving >>>>>>>>>>>>>>");
                    System.out.println("Saved Successfully");
                    System.out.println();          
}
}
             return studentsResults;
   }

     public static  int [] totalPerStudent (int [][] studentsResults){
     
     int [] totalArray = new int [studentsResults.length]; 

     for(int count=0; count<totalArray.length;count++){

          for (int index=0; index<studentsResults[count].length; index++){

          totalArray[count]+= studentsResults[count][index];
}
}

          return totalArray;
}

 
     public static double [] averagePerStudent (int [] totalArray,int noOfSubjects){
     double [] averageArray = new double   [totalArray.length];
     
     for(int count=0; count<averageArray.length;count++){
          
       averageArray[count] =((double) totalArray[count]) /noOfSubjects;
     
}

     return averageArray;

}

      public static int [] position (int  [] totalArray){

     int [] positionArray = new int [totalArray.length];

     for (int count =0; count <totalArray.length;count++){
          int position =1;
          for(int index=0; index<totalArray.length;index++){
          
          if(totalArray[index]>totalArray[count]){
               position++;    
}

}     

               positionArray[count]=position;
}
     // System.out.println(Arrays.toString(positionArray));
               return positionArray;
} 


public static int [] totalPerSubject (int [][] studentsResults, int noOfSubjects){
               int [] subjectsTotal = new int[noOfSubjects];

     for(int count=0;count <studentsResults.length;count++){

          for(int index=0;index<subjectsTotal.length;index++){
               subjectsTotal [index] += studentsResults[count] [index];
               
          }

     }
          // System.out.println(Arrays.toString(subjectsTotal));

          return  subjectsTotal;
}

public static double [] subjectAverage (int [] subjectsTotal,int noOfStudents){

     double [] subjectAverageArray =new double [subjectsTotal.length];

          for (int count =0;count<subjectAverageArray.length;count++){
               subjectAverageArray[count]=((double)subjectsTotal[count])/ noOfStudents;
          }
               // System.out.println(Arrays.toString(subjectAverageArray));
               return subjectAverageArray;
}

public static void subjectSummary(int [] [] studentsResults,int noOfStudents, int noOfSubjects, int [] subjectsTotal, double[] subjectAverageArray) {
     
     for(int count =0;count<noOfSubjects;count++){
          int highestScore = studentsResults[0][count];
          int lowestScore = studentsResults[0][count];
          int highestScoringStudent = 1;
          int lowestScoringStudent = 1;
          int pass =0;
          int fail =0;

               for (int index=0;index<noOfStudents;index++){
                    int result = studentsResults[index][count];

                    if(result >highestScore){
                         highestScore=result;
                         highestScoringStudent = index+1;
                    }
                    if (result <lowestScore){
                         lowestScore = result;
                         lowestScoringStudent = index+1;
                    }
                     if (result>= 50){
                         pass++;
                     }
                     else{
                         fail++;
                     }

               }


                     System.out.println();
                     System.out.println("Subject "+(count+1));
                     System.out.printf("Highest scoring Student is: Student %d scoring %d%n",highestScoringStudent,highestScore );
                     System.out.printf("Lowest scoring Student is: Student %d scoring %d%n",(lowestScoringStudent),lowestScore );
                     System.out.println("Number of passes: "+pass);
                     System.out.println("Number of fails: "+fail);
                       System.out.printf("Total Score is %d%n",subjectsTotal[count]);
                        System.out.printf("Average Score is: %.2f",subjectAverageArray[count]);
                        System.out.println();

     }
}

public static void classSummary (int[] totalArray,int noOfStudents){
     int sum =0;
     int highest =totalArray[0];
     int lowest = totalArray[0];
     int highestScoringStudent = 1 ;
     int lowestScoringStudent = 1;
     for (int count=0;count<noOfStudents;count++){
           int result = totalArray[count];
               sum += result;
                    if(result >highest){
                         highest=result;
                         highestScoringStudent = count+1;
                    }
                    if (result <lowest){
                         lowest = result;
                         lowestScoringStudent = count+1;
                    }


     }

     double classAverage =((double)sum)/noOfStudents;
     System.out.println();
     System.out.println("CLASS SUMMARY");
     System.out.println("=".repeat(50));
     System.out.printf("Best Graduating Student is: Student %d scoring %d%n",highestScoringStudent,highest);
     System.out.println("=".repeat(50));
     System.out.println();
     System.out.println("!".repeat(50));
     System.out.printf("Worst Graduating Student is: Student %d scoring %d%n",(lowestScoringStudent),lowest);
     System.out.println("!".repeat(50));
     System.out.println();
     System.out.println("=".repeat(50));
     System.out.println("Class Total Score is: "+sum);
     System.out.printf("Class Average is: %.2f%n", classAverage);




}

public static void hardestAndEasiest (int [][] studentsResults){
     int highestScore = studentsResults[0][0];
     int lowestScore = studentsResults[0][0];
     int highestScoringStudent =1;
     int lowestScoringStudent =1;
     int highestSubject=1;
     int lowestSubject=1;
     int [] passArray = new int [studentsResults[0].length];
     // int highPass = passArray[0];
     // int highPassSubject = 0;
     // int lowPass = passArray[0];
     // int lowPassSubject=0; 

     for (int count =0;count< studentsResults[0].length;count++){
          
          for(int index=0;index<studentsResults.length;index++){
               int result =studentsResults[index][count];

                if (result>= 50){
                         passArray[count] +=1;
                     }
               if(result >highestScore){
                         highestScore=result;
                         highestScoringStudent = index+1;
                         highestSubject=count+1;

                    }
                    if(result <lowestScore){
                         lowestScore = result;
                         lowestScoringStudent = index+1;
                         lowestSubject= count+1;
                    }
          }
     }

     int highPass = passArray[0];
     int highPassSubject = 1;
     int lowPass = passArray[0];
     int lowPassSubject=1; 


          for (int element =0;element<passArray.length;element++){
               int pass = passArray[element];
               if(pass >highPass){
                         highPass=pass;
                         highPassSubject = element+1;

                    }
                    if (pass <lowPass){
                         lowPass = pass;
                         lowPassSubject = element+1;
                         
          }
          }
                    int failures = studentsResults.length - lowPass;

          System.out.println();
          System.out.printf("The Hardest subject is subject %d with %d failures%n",lowPassSubject,failures);
          System.out.printf("The Easiest subject is subject %d with %d passes%n",highPassSubject,highPass);

          System.out.printf("The overall Highest Score is scored by Student %d in subject %d scoring %d%n",highestScoringStudent,highestSubject,highestScore);
          System.out.printf("The overall lowest Score is scored by Student %d in subject %d scoring %d%n",lowestScoringStudent,lowestSubject,lowestScore);
          System.out.println();
}

}

