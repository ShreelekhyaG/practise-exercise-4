package com.company.Test;

import com.company.Java.StringOccRegex6;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOccRegex6Test {
    StringOccRegex6 stringOccRegex6;
    @Before
    public void setUp() throws Exception {
        stringOccRegex6=new StringOccRegex6();
    }

    @After
    public void tearDown() throws Exception {
        stringOccRegex6=null;
    }

    @Test
    public void occurence() {
        assertEquals("4-6 10-12 27-29",stringOccRegex6.occurence("She sells seashells by the seashore","se"));
        assertEquals("3-4 7-8 11-12 16-17",stringOccRegex6.occurence("trying it with single letter","i"));
    }
    @Test
    public void occurenceFailure(){
        assertNotSame("3-4 7-8",stringOccRegex6.occurence("hello world","o"));
        assertNull(stringOccRegex6.occurence(null,"d"));
    }
}