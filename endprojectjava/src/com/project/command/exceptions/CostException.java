package com.project.command.exceptions;

public class CostException extends Exception {
    private String exceptionMessage;

    public void CostException(String exText){
        exceptionMessage = exText;
    }

    public String getExceptionMessage(){
        return exceptionMessage;
    }
}
