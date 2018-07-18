package com.amruta.stack.datastructure;

import com.amruta.stack.exception.StackOverFlowException;
import com.amruta.stack.exception.StackUnderFlowException;

/**
 * Created by amrutaj on 18/07/2018.
 */
public interface Stack<T> {

    void push(T data) throws StackOverFlowException;

    T pop() throws StackUnderFlowException;

    T peek() throws StackUnderFlowException;

    boolean isEmpty();

    boolean isFull();

    int getSize();
}
