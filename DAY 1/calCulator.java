import java.util.Scanner;

public class calCulator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the operator between (+, -, *, /, ^ ): ");
        char c =  sc.next().charAt(0);
    
        int res = 0;

        switch (c) {
            case '+' : 
               res = a + b;
               break;
            case '-' : 
               res = a - b;
               break;
            case '*' : 
               res = a * b;
               break;
            case '/' : 
               res = a / b;
               break;
             case '^': 
                res = (int) Math.pow(a, b);
                break;
            default : 
            System.out.println("invalid input");
            break;
        }
        // System.out.println(a + " " + b + " " + c);
         System.out.println(res);
         sc.close();
    }
}