package String;

public class printPermutationWithSwap {
    public static void main(String[] args) {
        String s = "abc";
        parmutation(s,0,s.length()-1);
    }
    public static void parmutation(String s,int start, int end)
    {
        if(start == end)
        {
            System.out.println(s);
            return;
        }

        for(int i = start; i <= end;i++)
        {
            String s1 = swap(s,start,i);
            parmutation(s1,start+1,end);

        }
    }
    public static String swap(String s,int i,int j)
    {
        char []a=s.toCharArray();
        char temp=a[i];
        a[i] =a[j];
        a[j]= temp;
        return new String(a);
    }
}
