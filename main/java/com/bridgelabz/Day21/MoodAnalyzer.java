package com.bridgelabz.Day21;

public class MoodAnalyzer {

    public String analyseMood(String message) {

        try {
            if (message.contains("Happy")) {
                return "Happy";
            } else if (message.contains("Sad")) {
                return "Sad";
            }
        }catch (MoodAnalyzerException e){
            switch (e.getErrorMessage()){
                case null:return e.getMessage();
                break;
                case "":return e.getMessage();
                break;
                default:break;
            }
        }
return null;
    }

}
