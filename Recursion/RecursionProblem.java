package Recursion;

public class RecursionProblem {

    public static void main(String[] args) {
//        int soad = sumOfAllDigit(3456);
//        System.out.println(soad);
//        System.out.println(untillSumBecome1Digit(9451267));
//        System.out.println(factorial(5));
        printNGivenRange(10,30);
    }
    public static int sumOfAllDigit(int n)
    {
        //base case
        if(n==0) return 0;

        //myself
        int d = n % 10;

        //recursion will do
        int r = sumOfAllDigit(n/10);

        //my work
        return  d + r;

    }
    public static int untillSumBecome1Digit(int n)
    {
        if(n / 10 == 0) return n;

        int sum = sumOfAllDigit(n);
        int result = untillSumBecome1Digit(sum);

        return result;
    }
    public static int factorial(int n)
    {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
    public static void printNGivenRange(int a , int b)
    {
        if(a == b)
        {
            System.out.print(a+" ");
            return;
        }
        System.out.print(a+" ");
        printNGivenRange(a+1,b);
    }


}
