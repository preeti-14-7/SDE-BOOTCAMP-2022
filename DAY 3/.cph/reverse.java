import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class reverse {
    public static void reve(char[] s, int i, int j)
    {
        if(i >= j)
        {
           return; 
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reve(s,i+1,j-1);
    }
    public static void reverseString(char[] s, int n) {
        int j = s.length -1;
        int i=0;
        reve(s,i,j);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        char c[] = new char[n];
        for(int i=0; i<n; i++){
           c[i] = sc.next().charAt(0);
        }
        reverseString(c, n);
    }

}