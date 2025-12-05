public class Logistics{
public static void main(String[]args){

          System.out.println(wageCalculator(25));


}

public static int wageCalculator(int succesfullDelivery){
     int amountPerParcel=0;     
     int basePay=5000;

     if (succesfullDelivery<50)
       {amountPerParcel =160;}


     if (succesfullDelivery>=70)
          {amountPerParcel=500;}  


     if (succesfullDelivery>59&&succesfullDelivery<70)

          {amountPerParcel=250;}


     if (succesfullDelivery>49 && succesfullDelivery<60)
               {amountPerParcel=200;}
     
     int wages = (succesfullDelivery*amountPerParcel)+basePay;

          return wages;








}








}
