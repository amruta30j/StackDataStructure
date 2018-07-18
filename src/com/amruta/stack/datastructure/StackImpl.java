package com.amruta.stack.datastructure;

import com.amruta.stack.element.Element;
import com.amruta.stack.exception.StackOverFlowException;
import com.amruta.stack.exception.StackUnderFlowException;

/**
 * Created by amrutaj on 18/07/2018.
 */
public class StackImpl<T> implements Stack<T> {

    private int MAX_SIZE;

    private Element<T> top;
    private int size = 0;

    public StackImpl(int MAX_SIZE) {

        this.MAX_SIZE = MAX_SIZE;
    }

    @Override
    public void push(T data) throws StackOverFlowException {

        if(size==MAX_SIZE){
            throw new StackOverFlowException("Stack is full");
        }
        Element elem = new Element(data, top);
        top=elem;
        size++;

    }

    @Override
    public T pop() throws StackUnderFlowException {
        if(size==0){
            throw  new StackUnderFlowException("Stack is empty");
        }
            T data = top.getData();
            top = top.getNext();
            size--;
            return data;
    }

    @Override
    public T peek() throws StackUnderFlowException {
        if(size==0){
            throw  new StackUnderFlowException("Stack is empty");
        }
       return top.getData();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int getSize() {
        return size;
    }
}
