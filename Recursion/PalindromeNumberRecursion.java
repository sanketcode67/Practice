package Recursion;

public class PalindromeNumberRecursion {
    public static void main(String[] args) {

       palindrome(145);
    }
    public static void palindrome(int n)
    {
        int rev = reverse(n,0);
        if(rev == n) System.out.println(n+" is Palindrome number");
        else System.out.println(n+" is not Palindrome number");

    }

    public static int reverse(int n,int rev)
    {
        if(n == 0) return rev;
        int d = n % 10;
        rev = rev * 10 + d;
        return reverse(n/10,rev);
    }
}
