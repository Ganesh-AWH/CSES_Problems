import java.util.Scanner;
import java.util.Stack;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int maxLength = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            while(!stack.isEmpty() && stack.peek() != c){
                stack.pop();
            }
            stack.push(c);
            maxLength = Integer.max(maxLength, stack.size());
        }

        System.out.println(maxLength);
        sc.close();
    }
}
