package Recursion;

public class ArmstrongRecursion {
    public static void main(String[] args) {
//        System.out.println(isArmstrong(153));
        rangeArmstrong();
    }
    public static void rangeArmstrong()
    {
        int a = 100;
        int b = 10000;
        printArm(a,b);

    }
    public static void printArm(int a,int b)
    {
        if(a > b) return;

        if(isArmstrong(a))
            System.out.println(a);
        printArm(a+1,b);
    }

    public static boolean isArmstrong(int n)
    {
        int p = digitCount(n);
        int sum = powerSum(n,p);
        if(n == sum) return true;
        return false;
    }
    public static int digitCount(int n)
    {
        if(n / 10 == 0) return 1;
        return 1 + digitCount(n/10);
    }
    public static int powerSum(int n,int p)
    {
        //base case
        if(n == 0) return 0;

        int d = n % 10;
        int myself = (int)Math.pow(d,p);
        int rec = powerSum(n/10,p);

        return myself + rec;
    }


}
