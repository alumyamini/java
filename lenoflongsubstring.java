import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
 
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
 
        return res;
    }
 
    private boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];
 
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Main ob = new Main();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s =sc.nextLine();
        System.out.println(ob.lengthOfLongestSubstring(s));
    }
}