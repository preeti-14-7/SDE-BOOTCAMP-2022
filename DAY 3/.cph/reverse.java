import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Solution {
    public static void reverse(char[] s, int i, int j)
    {
        if(i >= j)
        {
           return; 
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverse(s,i+1,j-1);
    }
    public static void reverseString(char[] s) {
        int j = s.length -1;
        int i=0;
        reverse(s,i,j);
        
    }

    public static void main(String[] args) {
        
       
    }

}