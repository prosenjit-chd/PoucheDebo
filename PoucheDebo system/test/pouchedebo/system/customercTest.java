/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pouchedebo.system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Prosenjit
 */
public class customercTest {
    
    public customercTest() {
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
     * Test of show method, of class customerc.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        int firstInstallment = 1500;
        int secondInstallment = 2000;
        customerc instance = new customerc();
        int expResult = 3500;
        int result = instance.show(firstInstallment, secondInstallment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class customerc.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        int preOrder = 2000;
        int postOrder = 5000;
        customerc instance = new customerc();
        int expResult = 3000;
        int result = instance.calculate(preOrder, postOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
