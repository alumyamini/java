package cf.java.string;

import java.util.Scanner;

public class Vowelsconsonants {

	public static void main(String[] args) {
		// Declare a variables
		String str = null;
                                      int c=0,c1=0;
		Scanner sc = new Scanner(System.in);
		// Accept any string from user
		System.out.print("Enter any String: ");
		str = sc.nextLine();
		// Convert String to lower case letter
		str = str.toLowerCase();

		// Print all vowels
		// For loop to iterate String
		for (int i = 0; i < str.length(); i++) {
			// Check a character is vowel or not
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				// Display each vowel
                                                                   c++;
                                                                    System.out.print("\n vowels in string are " + str.charAt(i));
                                                          }
                                                         else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                                                                     c1++;
                                                                      System.out.print(" \n consonants in string are:" +str.charAt(i));
                                                           
			}
                                                        else{
                                                                  System.out.print("\n invalid");
                                                        }
		}
                                                 
                                                 System.out.print("\nnumber of vowels:"+c);
                                                 System.out.print("\n number of consonants:"+c1);

	}

}