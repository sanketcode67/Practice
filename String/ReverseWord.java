package String;

public class ReverseWord {


    public static void main(String[] args) {
        String s = "Hello I am Sanket";

        System.out.println(reverseWord(s));
    }
    public static String reverseWord(String s)
    {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int start = arr.length-1;
        int end = arr.length-1;

        while(start >= 0)
        {
            while(start >= 0 && arr[start]!=' ')
            {
                start--;
            }
            int k = start+1;
            while(k <= end)
            {
                sb.append(arr[k]);
                k++;
            }
            if(start > 0)
                sb.append(" ");
            start = start -1;
            end = start;
        }

        return sb.toString();

    }
}
