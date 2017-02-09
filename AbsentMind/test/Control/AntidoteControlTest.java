/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class AntidoteControlTest {
    
    public AntidoteControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcWeightInKilograms() {
        
     /**
     * Test of calcWeightInKilograms method, of class AntidoteControl.
     *  THIS METHOD COMPLETED AS GROUP PROJECT: 
     *  Dave Irwin, Kailey Dilworth, J.D. Jensen
     */

        System.out.println("calcWeightInKilograms()" + " group project:");
        
        /**********************************
        * Test Case #1 
        *********************************/
 
        // Input values for test case 1
        double weight = 100.0;
        
        // expected returned output value
        double expResult = 45.36; 
        
        // create instance of AntidoteControl class
        AntidoteControl instance = new AntidoteControl();
        
        // call function to run test
        double result = instance.calcWeightInKilograms(weight);
        
        // compare expected return value with actual value returned
        assertEquals("Weight: " + weight, expResult, result, 0.5);
        System.out.println("Test case #1: Weight: " + weight + ", Expected: " 
                            + expResult + ", Result: " + result);
        /**********************************
        * Test Case #2 
        *********************************/
        
        // Input values for test case 1
        weight = 15.0;
        
        // expected returned output value
        expResult = -2.0; 
        
        // call function to run test
        result = instance.calcWeightInKilograms(weight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.5);
        System.out.println("Test case #2: Weight: " + weight + ", Expected: " 
                            + expResult + ", Result: " + result);
        
        /**********************************
        * Test Case #3 
        *********************************/
        
        // Input values for test case 1
        weight = 1200.0;
        
        // expected returned output value
        expResult = -3.0; 
        
        // call function to run test
        result = instance.calcWeightInKilograms(weight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.5);
        System.out.println("Test case #3: Weight: " + weight + ", Expected: " 
                            + expResult + ", Result: " + result);
    }

    /**
     * Test of calcDosage method, of class AntidoteControl.
     */
//    @Test
//    public void testCalcDosage() {
//        System.out.println("calcDosage");
//        double weightKilo = 0.0;
//        double expResult = 0.0;
//        double result = AntidoteControl.calcDosage(weightKilo);
//        assertEquals(expResult, result, 0.0);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dosageCompare method, of class AntidoteControl.
//     */
//    @Test
//    public void testDosageCompare() {
//        System.out.println("dosageCompare");
//        double dosageInput = 0.0;
//        double calcDosage = 0.0;
//        boolean expResult = false;
//        boolean result = AntidoteControl.dosageCompare(dosageInput, calcDosage);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
