
def encrypt (plainText,number):
     encryptedText="";
     for count in range (0,(len(plainText))):
          letter= plainText[count]
          if letter >= 'A' and letter <= 'Z':
               encryption=chr((ord(letter) - ord('A') - number) % 26 + ord('A'))

               encryptedText += encryption
  
          elif letter >= 'a' and letter <= 'z':
               encryption = chr((ord(letter) - ord('A') - number) % 26 + ord('A'))

               encryptedText += encryption
          else:
               encryptedText += letter
    
     return encryptedText


def decrypt (cryptedText,number):
     decryptedText=""
     for count in range (0,(len(cryptedText))):
          letter= cryptedText[count]
          if letter >= 'A' and letter <= 'Z':
               decryption=chr((ord(letter) - ord('A') - number) % 26 + ord('A'))

               decryptedText += decryption
  
          elif letter >= 'a' and letter <= 'z':
               decryption = chr((ord(letter) - ord('A') - number) % 26 + ord('A'))

               decryptedText += decryption
          else:
               decryptedText += letter
    
     return decryptedText
    


print("Welocme to the CAESAR CIPHER program")
choice= input("Would you like to decrypt or encrypt a message: ")

match choice:

     case "encrypt":
          plainText=input("Enter the plain text: ")
          number= int(input("Enter a number between 0 and 25: "))
          print(encrypt(plainText,number))
          
     case  "decrypt":
          cryptedText= input("Enter the Crypted text: ")
          number=int(input("Enter a number between 0 and 25: "))
          print(decrypt(cryptedText,number))
     case _:
          print("Enter ENCRYPT or DECRYPT")











