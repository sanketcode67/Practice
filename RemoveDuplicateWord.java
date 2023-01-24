import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String s = "cat bat mat cat mat";
        System.out.println(removeDuplicate(s));

    }
    public static String removeDuplicate(String s)
    {
        String[] arr = s.split(" ");
        Map<String,Integer> map = new LinkedHashMap<>();
        StringBuilder res = new StringBuilder();
        for(String str : arr)
            map.put(str, map.getOrDefault(str,0)+1);
        for(String str:map.keySet())
        {
            res.append(str+" ");
        }

    return res.toString().trim();
    }
}
