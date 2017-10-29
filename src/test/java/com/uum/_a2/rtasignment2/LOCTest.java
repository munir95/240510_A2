/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2.rtasignment2;

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
public class LOCTest {
    
    public LOCTest() {
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
     * Test of CountLines method, of class LOC.
     */
    @Test
    public void testCountLines() throws Exception {
        System.out.println("CountLines");
        LOC instance = new LOC();
        instance.CountLines();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLineOfCodes method, of class LOC.
     */
    @Test
    public void testGetLineOfCodes() {
        System.out.println("getLineOfCodes");
        LOC instance = new LOC();
        int expResult = 0;
        int result = instance.getLineOfCodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBlankLines method, of class LOC.
     */
    @Test
    public void testGetBlankLines() {
        System.out.println("getBlankLines");
        LOC instance = new LOC();
        int expResult = 0;
        int result = instance.getBlankLines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getComments method, of class LOC.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        LOC instance = new LOC();
        int expResult = 0;
        int result = instance.getComments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getActualLineOfCodes method, of class LOC.
     */
    @Test
    public void testGetActualLineOfCodes() {
        System.out.println("getActualLineOfCodes");
        LOC instance = new LOC();
        int expResult = 0;
        int result = instance.getActualLineOfCodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
