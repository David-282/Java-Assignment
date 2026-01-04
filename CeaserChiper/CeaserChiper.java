import java.util.Scanner;
public class CeaserChiper{
     public static void main(String...args){

     Scanner input = new Scanner (System.in);
     System.out.println("Welocme to the CAESAR CIPHER program");
     System.out.print("Would you like to decrypt or encrypt a message: ");
     String choice = input.nextLine().toLowerCase();

     switch(choice){
            
               case "encrypt"->{
     System.out.print("Enter the plain text: ");
     String plainText = input.nextLine();
     System.out.print("Enter a number between 0 and 25: ");
     int number = input.nextInt();
     System.out.println(encrypt(plainText,number));
}
               case  "decrypt"->{
     System.out.print("Enter the Crypted text: ");
     String cryptedText = input.nextLine();
     System.out.print("Enter a number between 0 and 25: ");
     int number = input.nextInt();
     System.out.println(decrypt(cryptedText,number));
}
               default -> {
     System.out.println("Enter ENCRYPT or DECRYPT");
}

}   
}

//public static String encrypt (String plainText, int number){
//          String encryptedText=" ";
//       for(int letter=0, letter<plainText.length(); letter++){
//          
//     String encryption = (letter-number)%26;
//     encryptedText +=encryption;
//     encryption="";
//}
//     return encryptedText;
//}
//

public static String encrypt (String plainText, int number){
          String encryptedText="";
       for(int count=0; count<plainText.length(); count++){
     char letter= plainText.charAt(count);
//     char encryption = (letter+number)%26;
//     char encryption = (letter-)
if( letter >= 'A' && letter <= 'Z'){
            char encryption = (char) ((letter - 'A' + number) % 26 + 'A');
            encryptedText += encryption;
            } 
       else if( letter >= 'a' && letter <= 'z'){
            char encryption = (char) ((letter - 'a' + number) % 26 + 'a');
            encryptedText += encryption;
            } 
        else {
                encryptedText += letter;
        }
//     encryptedText +=encryption;

}
     return encryptedText;
}

public static String decrypt (String cryptedText, int number){
          String decryptedText="";
       for(int count=0; count<cryptedText.length(); count++){
 char letter= cryptedText.charAt(count);
//     char encryption = (letter+number)%26;
//     char encryption = (letter-)
if( letter >= 'A' && letter <= 'Z'){
            char decryption = (char) ((letter - 'A' - number) % 26 + 'A');
            decryptedText += decryption;
            } 
       else if( letter >= 'a' && letter <= 'z'){
            char decryption = (char) ((letter - 'a' - number) % 26 + 'a');
            decryptedText += decryption;
            } 
        else {
                decryptedText += letter;
        }
    
}
     return decryptedText;
}
}












