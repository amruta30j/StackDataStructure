package com.amruta.stack.exception;

/**
 * Created by amrutaj on 18/07/2018.
 */
public class StackUnderFlowException extends Exception {

    public StackUnderFlowException(String message) {
        super(message);
    }

    public StackUnderFlowException(String message, Throwable cause) {
        super(message, cause);
    }
}
