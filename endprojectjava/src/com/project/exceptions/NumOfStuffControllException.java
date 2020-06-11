package com.project.exceptions;

public class NumOfStuffControllException extends Exception {
    private String exceptionMessage;

    public void NumOfStuffControllException(String exText){
        exceptionMessage = exText;
    }

    public String getExceptionMessage(){
        return exceptionMessage;
    }
}
