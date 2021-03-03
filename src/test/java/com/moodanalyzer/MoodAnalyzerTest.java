package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenNullMoodShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenEmptyMoodShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
