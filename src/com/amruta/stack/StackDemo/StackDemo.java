package com.amruta.stack.StackDemo;

import com.amruta.stack.datastructure.Stack;
import com.amruta.stack.datastructure.StackImpl;
import com.amruta.stack.exception.StackOverFlowException;
import com.amruta.stack.exception.StackUnderFlowException;

/**
 * Created by amrutaj on 18/07/2018.
 */
public class StackDemo {

    public static void main(String args[]) throws StackUnderFlowException,StackOverFlowException{
        Stack<Integer> integerStack = new StackImpl<>(4);
        integerStack.push(3);
        integerStack.push(2);
        integerStack.push(1);

        System.out.println("Stack size: " + integerStack.getSize());
        System.out.println("Stack full?: " + integerStack.isFull());
        System.out.println("Stack empty?: " + integerStack.isEmpty());

        integerStack.push(4);

        System.out.println("Stack size: " + integerStack.getSize());
        System.out.println("Stack full?: " + integerStack.isFull());

        System.out.println("Stack top elemt (using peek) " + integerStack.peek());

        integerStack.pop();
        integerStack.pop();
        integerStack.pop();
        integerStack.pop();

        System.out.println("Stack size: " + integerStack.getSize());
        System.out.println("Stack full?: " + integerStack.isFull());
        System.out.println("Stack empty?: " + integerStack.isEmpty());
    }
}
