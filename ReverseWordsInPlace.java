import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class ReverseWordsInPlace {
    // Function to reverse the string
    static String reverseString(String str) {
        String[] words = str.split(" ");
        String rev = "";
        int i, j;
        for (i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer(words[i]);
            rev+=sb.reverse().toString();
            rev+=" ";
        }
        return rev;
    }
    // Function to read the input and display the output
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the text string");
        String str;
        try{
            str=br.readLine();
        }
        catch(Exception e){
            System.out.println("Error reading input");
            return;
        }
        String rev = reverseString(str);
        System.out.println("The reverse of the string word by word in place is\n");
        System.out.println(rev);
}
}