




public class question {

    public static void print(int n, int i)
    {
         if(i > n)
         {
             return;
         }
         System.out.println(i);
         print(n,i+1);
    }
    public static int fact(int n)
    {
        if(n <= 1)
        {
           return 1;
        }
        return n*fact(n-1);
    }
    public static int fab(int n)
    {
        if(n <= 2)
        {
           return 1;
        }
        return  fab(n-1) + fab(n-2);
    }
    public static void main(String[] args) {
        
      //  print(100,1);
      //  System.out.println(fact(5));
        System.out.println(fab(8));
    }
}
