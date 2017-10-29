/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2.rtasignment2;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class SOTTest {
    
    public SOTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Data method, of class SOT.
     */
    @Test
    public void testData() {
        System.out.println("Data");
        Map<String, Integer> map = null;
        String name = "";
        String matric = "";
        String loc = "";
        String blank = "";
        String comment = "";
        String actLoc = "";
        String ttl = "";
        SOT instance = new SOT();
        SOT expResult = null;
        SOT result = instance.Data(map, name, matric, loc, blank, comment, actLoc, ttl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
