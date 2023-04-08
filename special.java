// Java Program to Check Whether String contains Special
// Characters Using Character Class

// Importing input output classes
import java.util.Scanner;
import java.io.*;

// Main class
class special {

 // Method 1
 // Main driver method
 public static void main(String[] args)
 {
  // Declaring and initializing count for
  // special characters
  int count = 0;
  str s;

  // Input custom string
 Scanner sc=new  Scanner(System.in);
System.out.println("character:");
string s=sc.nextStr();
  // Iterating through the string
  // using standard length() method
  for (int i = 0; i < s.length(); i++) {

   // Checking the character for not being a
   // letter,digit or space
   if (!Character.isDigit(s.charAt(i))
    && !Character.isLetter(s.charAt(i))
    && !Character.isWhitespace(s.charAt(i))) {
    // Incrementing the countr for spl
    // characters by unity
    count++;
   }
  }

  // When there is no special character encountered
  if (count == 0)

   // Display the print statement
   System.out.println(
    "No Special Characters found.");
  else

   // Special character/s found then
   // Display the print statement
   System.out.println(
    "String has Special Characters\n" + count + " "
    + "Special Characters found.");
 }
}
