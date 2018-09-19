package com.company.Test;

import com.company.Java.CharReplace2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharReplace2Test {
    CharReplace2 charReplace2;
    @Before
    public void setUp() throws Exception {
        charReplace2=new CharReplace2();
    }

    @After
    public void tearDown() throws Exception {
        charReplace2=null;
    }

    @Test
    public void replace() {
        assertEquals("failed","faity fry",charReplace2.replace("daily dry"));
        assertEquals("failed","faity fry",charReplace2.replace("faity fry"));
    }
    @Test
    public void replaceFailure(){
        assertNotNull("failed",charReplace2.replace(""));
        assertNull("failed",charReplace2.replace(null));
    }
}