package com.bridgelabz.Day21;

import junit.framework.TestCase;
import org.junit.Test;

public class MoodAnalyzerTest extends TestCase {

    @Test
    public  void testMoodAnalysereturnSad() throws MoodAnalyzerException {
        MoodAnalyzer mood = new MoodAnalyzer();
        assertEquals("Sad",mood.analyseMood("I am in Sad Mood"));
    }

    @Test
    public  void testMoodAnalysereturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer mood = new MoodAnalyzer();
        assertEquals("Happy",mood.analyseMood("I am in Happy Mood"));
    }

    @Test
    public  void testMoodAnalyseNullreturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer mood = new MoodAnalyzer();
        assertEquals("Happy",mood.analyseMood(null));
    }

    @Test
    public  void testMoodAnalyseEmptyreturnEmpty() throws MoodAnalyzerException {
        MoodAnalyzer mood = new MoodAnalyzer();
        assertEquals("Empty",mood.analyseMood(""));
    }
}