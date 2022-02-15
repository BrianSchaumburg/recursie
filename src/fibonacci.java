public class recursie {
    public static long fibonacci(long n)
    {
        if(n == 0 || n == 1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args)
    {
        System.out.println(fibonacci(12));
    }
}
