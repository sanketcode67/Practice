package Pattern;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String s = "lugguage";
        System.out.println(removeDup(s));
    }

    public static String removeDup(String s)
    {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(char ch : map.keySet())
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}
