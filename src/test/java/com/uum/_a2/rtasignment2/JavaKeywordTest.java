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
public class JavaKeywordTest {
    
    public JavaKeywordTest() {
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
     * Test of JavaKeyword method, of class JavaKeyword.
     */
    @Test
    public void testJavaKeyword() throws Exception {
        System.out.println("JavaKeyword");
        JavaKeyword instance = new JavaKeyword();
        Map<String, Integer> expResult = null;
        Map<String, Integer> result = instance.JavaKeyword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of noKeywords method, of class JavaKeyword.
     */
    @Test
    public void testNoKeywords() {
        System.out.println("noKeywords");
        JavaKeyword instance = new JavaKeyword();
        int expResult = 0;
        int result = instance.noKeywords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
