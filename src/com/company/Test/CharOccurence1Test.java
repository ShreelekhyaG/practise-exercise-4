package com.company.Test;

import com.company.Java.CharOccurence1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharOccurence1Test {
    CharOccurence1 charOccurence1;
    @Before
    public void setUp() throws Exception {
        charOccurence1=new CharOccurence1();
    }

    @After
    public void tearDown() throws Exception {
        charOccurence1=null;
    }

    @Test
    public void countOccurence() {
        assertEquals("failed",10,charOccurence1.countOccurence("Java is java again java again","a"));
    }
    @Test
    public void countOccurenceFailure(){
        assertNotNull("failed",charOccurence1.countOccurence("aaaaa","b"));
        assertEquals("failed",4,charOccurence1.countOccurence("aaaa","a"));
    }
}