package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessageToAnalyseWhenSadReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageToAnalyseWhenNotSadReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
