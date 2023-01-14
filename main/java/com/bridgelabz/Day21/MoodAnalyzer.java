package com.bridgelabz.Day21;

public class MoodAnalyzer {

    public String analyseMood(String message) throws MoodAnalyzerException{
        try {
            if (message.contains("Happy")) {
                return "Happy";
            } else if (message.contains("Sad")) {
                return "Sad";
            }
            return "";
        }catch (NullPointerException e){
            return "Happy";
        }

    }

}
