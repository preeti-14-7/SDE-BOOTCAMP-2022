import java.util.Scanner;

public class pattern {

    public static void printQues1(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n ; j++)
            System.out.print("*");
            System.out.println();
        }
        
    }

    public static void printQues2(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i+1 ; j++)
            System.out.print("*");
            System.out.println();
        }
        
    }
    public static void printQues3(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=n-i-1; j>=0 ; j--)
            System.out.print("*");
            System.out.println();
        }
        
    }
    public static void printQues4(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<i+1 ; j++)
            System.out.print(j);
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       // printQues1(n);
       // printQues2(n);
        // printQues3(n);
        printQues4(n);
    }
}
