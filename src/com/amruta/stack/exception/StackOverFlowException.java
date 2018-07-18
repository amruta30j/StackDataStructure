package com.amruta.stack.exception;

/**
 * Created by amrutaj on 18/07/2018.
 */
public class StackOverFlowException extends Exception {

    public StackOverFlowException(String message) {
        super(message);
    }

    public StackOverFlowException(String message, Throwable cause) {
        super(message, cause);
    }

}
