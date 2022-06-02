import java.util.Stack;

/**
 *
 * we are gonna use stack here
 *
 * logic,get opening character store it in stack,
 *
 * check next character,if it is the closing character of the on in top of stack then pop it from stack
 */

public class ValidParanthesis {

    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();
        String s = "([}}])";
        boolean b =vp.Solution(s);
        System.out.println(b);
    }
    public boolean Solution(String s){

        if (s.length() % 2 !=0)
            return false;

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c =='['){
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else return false;
        }

        return stack.isEmpty();
    }
}
