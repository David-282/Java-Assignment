import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CheckOut{ 
public static void main(String...args){
             LocalDateTime now = LocalDateTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = now.format(formatter);
     Scanner input = new Scanner(System.in);

     System.out.print("What is the Customers Name: ");
     String customerName = input.nextLine();

     System.out.print("What did the Customer buy: ");
     String itemBought = input.nextLine();

     System.out.print("How many pieces did the customer buy: ");
     int noOfItems = input.nextInt();

     System.out.print("How much per unit: ");
     float price = input.nextFloat();     

     System.out.print("Add more items(true/false): ");
     boolean moreItems = input.nextBoolean();
     input.nextLine();
      int newItems=0;
     if (moreItems){
     System.out.print("How many Items do you want to add: ");
     newItems = input.nextInt();
     input.nextLine();}

     int count=0;
     String [] itemBoughtArray = new String [newItems];
     int [] noOfItemsArray = new int [newItems];
     float [] priceArray = new float [newItems]; 


     while(moreItems){

     System.out.print("What did the Customer buy: ");
     itemBoughtArray[count] = input.nextLine();

     System.out.print("How many pieces did the customer buy: ");
     noOfItemsArray[count] = input.nextInt();

     System.out.print("How much per unit: ");
     priceArray[count] = input.nextInt();  
     input.nextLine();
    
     count++;

        if (newItems==count){
     moreItems=false;}   

}
     System.out.print("What is your Name: ");
     String cashierName = input.nextLine();

     System.out.print("How much discount will he/she get: ");
     float discount = input.nextFloat();

     float total = price*(float)noOfItems; 
     
     float calculatingDiscount= (discount/100)*total;
     
     float vat = (float)(17.50/100)*total;
     
     float newTotal =total -calculatingDiscount+vat;
System.out.print("\n");

     System.out.print("""
             SEMICOLON STORES
             MAIN BRANCH 
             LOCATION; 321, HEBERT MACAULAY WAY, SABO YABA, LAGOS.
             TEL: 03293828343
               """);
System.out.println("Date: "+formattedTime);
System.out.println("Cashier: "+cashierName );
System.out.println("Customer Name: "+customerName );
System.out.println("=====================================================================================");
System.out.println("""
                           ITEMS        QTY         PRICE            TOTAL(NGN)
-------------------------------------------------------------------------------------
""");
float costOfItems= 0;
float total2=0;
float newCost=0;
if (newItems!=0){
System.out.println("                        "+ itemBought+"/t             "+noOfItems+"\t          "+price+" \t              "+(price*noOfItems));

   for(int index=0;index<newItems;index++){
     
System.out.println("                            "+ itemBoughtArray[index]+"             "+noOfItemsArray[index]+"          "+priceArray[index]+"               "+(priceArray[index]*noOfItemsArray[index]));
     costOfItems= priceArray[index]*noOfItemsArray[index];
     total2+=costOfItems;
     costOfItems=0;}
 
          total2+=(price*noOfItems);  
          newCost= total2-(((discount/100)*total2))+((float)(17.50/100)*total2);
System.out.println("""
--------------------------------------------------------------------------------------
""");
System.out.println("                            "+ "Sub Total:"+"             "+total2);
System.out.println("                            "+ "Discount:"+"             "+((discount/100)*total2));
System.out.println("                            "+ "VAT  @ 17.50%:"+"             "+((float)(17.50/100)*total2));
System.out.println("=====================================================================================");
System.out.println("                            "+ "Bill Total:"+"             "+newCost);
System.out.println("=====================================================================================");
System.out.println("THIS IS NOT A RECEIPT, KINDLY PAY " +newCost);
System.out.println("=====================================================================================");



}
else{
System.out.println("                            "+ itemBought+"             "+noOfItems+"          "+price+"               "+(price*noOfItems));
System.out.println("""
--------------------------------------------------------------------------------------
""");
System.out.println("                            "+ "Sub Total:"+"             "+total);
System.out.println("                            "+ "Discount:"+"             "+calculatingDiscount);
System.out.println("                            "+ "VAT  @ 17.50%:"+"             "+vat);
System.out.println("=====================================================================================");
System.out.println("                            "+ "Bill Total:"+"             "+newTotal);
System.out.println("=====================================================================================");
System.out.println("THIS IS NOT A RECEIPT, KINDLY PAY  "+newTotal);
System.out.println("=====================================================================================");
}

System.out.print("How much did the customer give to you ? ");
float moneyPaid= input.nextFloat();


System.out.println("\nPlease Wait While we process your Payment.............");
System.out.println("Payment Successfull👍️\n");

     System.out.print("""
             SEMICOLON STORES
             MAIN BRANCH 
             LOCATION; 321, HEBERT MACAULAY WAY, SABO YABA, LAGOS.
             TEL: 03293828343
               """);
System.out.println("Date: "+formattedTime);
System.out.println("Cashier: "+cashierName );
System.out.println("Customer Name: "+customerName );
System.out.println("=====================================================================================");
System.out.println("""
                           ITEMS        QTY         PRICE            TOTAL(NGN)
-------------------------------------------------------------------------------------
""");

if (newItems!=0){
//costOfItems= 0;
//
//newCost=0;
System.out.println("                        "+ itemBought+"             "+noOfItems+"          "+price+"               "+(price*noOfItems));

   for(int index2=0;index2<newItems;index2++){
     
System.out.println("                            "+ itemBoughtArray[index2]+"             "+noOfItemsArray[index2]+"          "+priceArray[index2]+"               "+(priceArray[index2]*noOfItemsArray[index2]));

}
  
System.out.println("""
--------------------------------------------------------------------------------------
""");
System.out.println("                            "+ "Sub Total:"+"             "+total2);
System.out.println("                            "+ "Discount:"+"             "+((discount/100)*total2));
System.out.println("                            "+ "VAT  @ 17.50%:"+"             "+((float)(17.50/100)*total2));
System.out.println("=====================================================================================");
System.out.println("                            "+ "Bill Total:"+"             "+newCost);
System.out.println("                            "+ "Amount Paid:"+"            "+moneyPaid);
System.out.println("                            "+ "Balance: "+"               "+ (float)(moneyPaid-newCost));
System.out.println("=====================================================================================");
System.out.println("        "+"THANK YOU FOR YOUR PATRONAGE");
System.out.println("=====================================================================================");





}
else{
System.out.println("                            "+ itemBought+"             "+noOfItems+"          "+price+"               "+(price*noOfItems));
System.out.println("""
--------------------------------------------------------------------------------------
""");
System.out.println("                            "+ "Sub Total:"+"             "+total);
System.out.println("                            "+ "Discount:"+"             "+calculatingDiscount);
System.out.println("                            "+ "VAT  @ 17.50%:"+"             "+vat);
System.out.println("=====================================================================================");
System.out.println("                            "+ "Bill Total:"+"             "+newTotal);
System.out.println("                            "+ "Amount Paid:"+"            "+moneyPaid);
System.out.println("                            "+ "Balance: "+"               "+ (moneyPaid-newTotal));
System.out.println("=====================================================================================");
System.out.println("        "+"THANK YOU FOR YOUR PATRONAGE");
System.out.println("=====================================================================================");
}



    }
}
