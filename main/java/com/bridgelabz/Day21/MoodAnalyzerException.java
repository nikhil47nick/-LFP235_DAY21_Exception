package com.bridgelabz.Day21;

public class MoodAnalyzerException extends Exception {

    private String error;

    MoodAnalyzerException(MoodAnalyzerExceptionEnum message ){
        this.error = message.getName();
    }

    public String getError(){
        return error;
    }
}
