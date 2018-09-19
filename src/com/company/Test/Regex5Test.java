package com.company.Test;

import com.company.Java.Regex5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Regex5Test {
    Regex5 regex5;
    @Before
    public void setUp() throws Exception {
        regex5=new Regex5();
    }

    @After
    public void tearDown() throws Exception {
        regex5=null;
    }

    @Test
    public void checkPresence() {
        assertEquals(true,regex5.checkPresence("hi Harry"));
        assertEquals(false,regex5.checkPresence("ref eff"));
    }
    @Test
    public void checkPresenceFailure(){
        assertNotNull(regex5.checkPresence("dfvger"));
        assertNotNull(regex5.checkPresence("edf"));
    }
}