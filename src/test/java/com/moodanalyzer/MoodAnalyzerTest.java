package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer;

    @Before
    public void setUp() throws Exception {
        moodAnalyzer = new MoodAnalyzer();
    }

    @Test
    public void givenMessageToAnalyseWhenSadReturnSad() {
        String mood = moodAnalyzer.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageToAnalyseWhenNotSadReturnHappy() {
        String mood = moodAnalyzer.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}
