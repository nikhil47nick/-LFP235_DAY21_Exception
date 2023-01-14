package com.bridgelabz.Day21;

public enum MoodAnalyzerExceptionEnum  {
    Null("Happy"),Empty("Empty");
    private String name;

    MoodAnalyzerExceptionEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
