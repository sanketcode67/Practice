import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String s = "{[(]}";
        System.out.println(balancedString(s));;

    }
    public static boolean balancedString(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(stack.isEmpty())
            {
                stack.push(ch);
            }
            else
            {
                char top = stack.peek();
                if(top == '(' && ch ==')' || top == '{' && ch =='}' || top == '[' && ch ==']')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(ch);
                }
            }
        }

        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
