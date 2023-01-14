package com.bridgelabz.Day21;

public class MoodAnalyzerException extends Exception {

    private String error;
    private String message;

    MoodAnalyzerException(MoodAnalyzerExceptionEnum message ){
        this.error = message.getError();
        this.message = message.getName();
    }

    public String getError(){
        return error;
    }
    public String getErrorMessage(){
        return message;
    }
}
