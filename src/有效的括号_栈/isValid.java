package 有效的括号_栈;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class isValid {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid2(s));
    }

    public static boolean isValid(String s){
        int n = s.length();
        if(n % 2 == 1)
            return false;


        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                }
                //
                stack.pop();

            }else {
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }






















    private static final Map<Character, Character> map = new HashMap<Character, Character>(){
        {
            put('{','}');
            put('[',']');
            put('(',')');
        }
    };



    public static boolean isValid2(String s) {
        int n = s.length();
        if (n % 2 == 1)
            return false;
        LinkedList<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                stack.push(c);
            }else {
                if (stack.isEmpty() ||map.get(stack.peek()) != c){
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
 }

