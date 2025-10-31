package StackProblems;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

create a helper function - check is [ is opener

create a helper function to determent matching pairs
 */
public class ValidParentheses {
    Deque<Character> stack = new ArrayDeque<>();


    public boolean isValid(String s){

       //for java enhanced for loops
        //Type variable: collection
        //.toCharArray converts String to an array of char
        for(char token: s.toCharArray()){
            if (isOpener(token)){
                stack.push(token);
            } else if( isClosing(token)) {
                // if stack is empty return false
                if(stack.isEmpty()){
                    return false;
                }
                char opener = stack.pop();
                if(!isMatching(opener, token)){
                    return false;
                }

            }
        }
        return stack.isEmpty();

    }

    // note to self java char uses '' not "" - java OR op ||
    public boolean isOpener(char token){
        return token == '[' || token == '{' || token == '(';
    }
    public boolean isClosing(char token){
        return token == ']' || token =='}' || token == ')';
    }

    public boolean isMatching(char opening, char closing){
        return (opening == '[' && closing ==']') ||
                (opening == '{' && closing == '}') ||
                (opening =='(' && closing ==')');
    }


}
