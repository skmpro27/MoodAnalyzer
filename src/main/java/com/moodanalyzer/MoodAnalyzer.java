package com.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
        this ("I am in Sad Mood");
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyzerException {
        try {
            if(message.length() == 0)
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, "Please enter proper message");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL, "Please enter proper message");
        }
    }
}
