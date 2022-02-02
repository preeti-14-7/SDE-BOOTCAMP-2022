import java.util.Scanner;

public class easyPrblm{


    //1. Try some input and outputs(get character or int or double and print the output)
    public static void takeInput()
    {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt();
        float b = sc.nextFloat();
        String c = sc.next();
        System.out.println(n + " " + b + " " + c);

    }

    // 2. Check age is greater than 18(condition statement)
    public static boolean checkAge(int n)
    {
        if( n > 18) return true;
        return false;
    }

    //Print 1 to 100 using for loops 
    public static void printForloop(int n)
    {
        for(int i=1; i<=n ; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Print 1 to 100 using  while loop
    public static void printwhileloop(int n)
    {
        int i=1;
        while(i<= n)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    //5. Check whether the number is even 
    public static boolean checkEven(int n)
    {

        if(n %2 == 0) return true;
        else return false;
    }

    //5. Check whether the number is  odd
    public static boolean checkOdd(int n)
    {

        if(n %2 != 0) return true;
        else return false;
    }

    //7. Sum of N natural numbers(1 to N)
    public static int sumOfn(int n)
    {
        int sum=0;
        for(int i=0; i<=n ; i++)
        {
            sum += i;
        }
        return sum;
    }
   // 8. Check input character is vowel or not
   public static boolean checkVowel(char c)
   {
       if(( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') || 
       ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'))
       return true;

       return false;
   }
  // factorial
   public static int factOfn(int n)
   {
       int f =1;
       for(int i=1; i<n; i++)
       {
           f = f*i;
       }
      return f;
   }

   //Try some type conversions (int to double, float to int, etc)
   public static int typeConver(float f)
   {
      return (int)f;
   }
     //largest amon three number 
     public static int maxThree(int a, int b, int c)
     {
        if (a > b && a > c) {
            return a;
        } 
        else 
        {
            if (b > c) 
            {
                return b;
            } else 
            {
                return c;
            }
        }
     }
    public static void main(String[] args) {
         takeInput();
         System.out.println(checkAge(50));

         printForloop(100);
         printwhileloop(100);

         System.out.println(checkEven(12));
         System.out.println(checkOdd(15));

         System.out.println(sumOfn(15));

         System.out.println(checkVowel('c'));

         System.out.println(factOfn(5));
         
         System.out.println(typeConver(2.18f));

         System.out.println(maxThree(1,15,18));
     }
}