package com.bridgelabz.Day21;

public class MoodAnalyzer {

    public String analyseMood(String message) {

        try{
        if (message.contains("Happy")) {
            return "Happy";
        } else if (message.contains("Sad")) {
            return "Sad";

        } else if (message.equals(null)) {
           throw new MoodAnalyzerException(MoodAnalyzerExceptionEnum.Null);
        }else if(message.equals("")){
            throw new MoodAnalyzerException(MoodAnalyzerExceptionEnum.Empty);
        }

            return null;
        }catch (MoodAnalyzerException e){
            return e.getErrorMessage();
        }
    }

}
