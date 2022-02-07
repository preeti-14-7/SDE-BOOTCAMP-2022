public class atoi {

    public static int atoiOfs(String s, int n)
    {
         if(n == 1)
         {
             return (s.charAt(0) - '0');
         }
       return 10*atoiOfs(s, n-1) + (s.charAt(n-1) - '0');    
    }
    public static void main(String[] args) {
        String s = "1234";
        int n = s.length();
        System.out.println(atoiOfs(s,n));
    }
}
