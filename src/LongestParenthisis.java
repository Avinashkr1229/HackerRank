import java.util.Stack;

public class LongestParenthisis {

    public static int longestValidParentheses(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        int count=0;
        for(int i=0;i<array.length;i++ ){
            if(stack.isEmpty()){
                stack.push(array[i]);
                count++;
            }
            else if(array[i]=='(' && stack.pop()!=')'){
                stack.push(array[i]);
                count++;
            }
            else if(array[i]==')' && stack.pop()!='('){
                count++;
            }
            else if(!stack.isEmpty() && array[i]=='(' && stack.pop()==')'){
                stack.push(array[i]);
                count++;
            }
            else if(!stack.isEmpty() && array[i]==')' && stack.pop()=='('){
                count++;
            }

        }
        return count==1?0:count;
    }
    public static void main(String[] args) {
        longestValidParentheses("()");
    }
}
