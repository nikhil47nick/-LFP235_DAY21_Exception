package com.bridgelabz.Day21;

public enum MoodAnalyzerExceptionEnum  {
    Null("Happy",null),Empty("Empty","");
    private String name;
    private String error;

    MoodAnalyzerExceptionEnum(String name,String error){
        this.error = error;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public String getError(){
        return this.error;
    }
}
