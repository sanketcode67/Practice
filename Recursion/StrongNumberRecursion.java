package Recursion;

public class StrongNumberRecursion {
    public static void main(String[] args) {

        strong(145);


    }
    public static void strong(int n)
    {
        int sum = factorialSum(n);
        if(n == sum) System.out.println(n+" is Strong Number");
        else System.out.println(n+" is Not a Strong Number");
    }

    public static int factorialSum(int n)
    {
        //base case
        if(n==0) return 0;

        //myself
        int d = n % 10;
        int factofd = factorial(d);

        //recursion will do
        int r = factorialSum(n/10);

        //my work
        return  factofd + r;

    }
    public static int factorial(int n)
    {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
}
