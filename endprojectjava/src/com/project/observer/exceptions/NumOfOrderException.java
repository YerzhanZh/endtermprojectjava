package com.project.observer.exceptions;

public class NumOfOrderException extends Exception {
    private String exceptionMessage;

    public void NumOfOrderException(String exText){
        exceptionMessage = exText;
    }

    public String getExceptionMessage(){
        return exceptionMessage;
    }
}
