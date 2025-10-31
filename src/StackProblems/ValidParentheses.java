package StackProblems;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

create a helepr function - check is [ is opener

create a helepr fucntion to detemrien matching pairs
 */
public class ValidParentheses {
    public boolean isValid(String s){
        return false;
    }

    // note to self java char uses '' not "" - java OR op ||
    public boolean isOpener(char token){
        return token == '[' || token == '{' || token == '(';
    }
}
