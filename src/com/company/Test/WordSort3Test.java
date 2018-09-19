package com.company.Test;

import com.company.Java.WordSort3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordSort3Test {
    WordSort3 wordSort3;
    @Before
    public void setUp() throws Exception {
        wordSort3=new WordSort3();
    }

    @After
    public void tearDown() throws Exception {
        wordSort3=null;
    }

    @Test
    public void sortString() {
        assertEquals("failed","hello is this what world",wordSort3.sortString("hello world what is this"));
        assertEquals("failed","java string",wordSort3.sortString("java string"));
    }
    @Test
    public void sortStringFailure(){
        assertNotNull("failed","only");
        assertNotNull("");
        assertNull(null);
    }
}