package StackProblems;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 150.
public class EvaluateReversePolishNotation {
        public int evalRPN(String[] tokens) {
            // import deque
            Deque<Integer> stack = new ArrayDeque<>();

            for (String token: tokens){
                if(isNumber(token)){
                    stack.push(Integer.parseInt(token));
                } else if(isOpperand(token)){
//                    if (stack.isEmpty()){
//                        return 0;
//                    }
                    int num1 = stack.pop() ;
                    int num2 = stack.pop() ;
                    int result = completeOperation(token.charAt(0),num1,num2);
                    stack.push(result);
                }

            }
            return stack.pop();
        }

        public boolean isOpperand(String token){
            return token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/");
        }
        public boolean isNumber(String token){
            try {
                Integer.parseInt(token);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        public int completeOperation(char token, int num1, int num2){
            return switch (token){
                case '+' -> num2 + num1;
                case '-' -> num2 - num1;
                case '/' -> num2 / num1;
                case '*' -> num2 * num1;
                default -> 0;

            };
        }
        // post fix solution
        // start iterating @ the front of the string
        // if where is a number you add it to the stack
        // if you see an operand
        // if stack is empty return false
        // 1 pop froms tack goes right
        // 2 pop from stack goes left
        // append to stack 2pop operand 1 pop





}
