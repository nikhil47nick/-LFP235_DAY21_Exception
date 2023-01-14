package com.bridgelabz.Day21;

import junit.framework.TestCase;
import org.junit.Test;

public class MoodAnalyzerTest extends TestCase {

    @Test
    public  void testMoodAnalysereturnSad(){
        MoodAnalyzer mood = new MoodAnalyzer();
        assertEquals("Sad",mood.analyseMood("“I am in Sad Mood”"));
    }

    @Test
    public  void testMoodAnalysereturnHappy(){
        MoodAnalyzer mood = new MoodAnalyzer();
        assertEquals("Happy",mood.analyseMood("“I am in Happy Mood”"));
    }
}