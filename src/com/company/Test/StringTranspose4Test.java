package com.company.Test;

import com.company.Java.StringTranspose4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTranspose4Test {
    StringTranspose4 stringTranspose4;
    @Before
    public void setUp() throws Exception {
        stringTranspose4=new StringTranspose4();
    }

    @After
    public void tearDown() throws Exception {
        stringTranspose4=null;
    }

    @Test
    public void transpose() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",stringTranspose4.transpose("a quick brown fox jumps over the lazy dog"));
        assertEquals("a",stringTranspose4.transpose("a"));
    }
    @Test
    public void transposefailure(){
        assertNull(stringTranspose4.transpose(null));
        assertNotNull(stringTranspose4.transpose(""));
    }
}