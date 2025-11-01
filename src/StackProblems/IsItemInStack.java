package StackProblems;

import stack3130.ArrayStack3130;
import stack3130.Stack3130;

import java.util.Objects;

public class IsItemInStack<E> {
    public boolean inStack(ArrayStack3130<E> stack, E item){
        ArrayStack3130<E> revstack = new ArrayStack3130<>();
        boolean found = false;
        while(!stack.isEmpty()){
            E element = stack.pop();
            if(Objects.equals(element,item)){
                found = true;
            }
                revstack.push(element);

        }
        while (!revstack.isEmpty()){
            stack.push(revstack.pop());
        }
        //create an empty stack
        // while stack is not empty
        // pop item from stack
        // check if item popped is equal to item given
        // if it is return true
        //ele
        return found;
}}
