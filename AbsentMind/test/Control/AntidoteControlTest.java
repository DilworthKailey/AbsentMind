/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exception.AntidoteControlException;
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

    /**
     * Test of calcWeightInKilograms method, of class AntidoteControl.
     */    
    @Test
    public void testCalcWeightInKilograms() throws AntidoteControlException {

        System.out.println("calcWeightInKilograms");
        
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
        System.out.println("Test case #1: Weight: " + weight + ", Expected: " 
                    + expResult + ", Result: " + result);
        assertEquals("Weight: " + weight, expResult, result, 0.5);

        /**********************************
        * Test Case #2 
        *********************************/
        
        // Input values for test case 2
        weight = 15.0;
        
        // expected returned output value
        expResult = -2.0; 
        
        // call function to run test
        result = instance.calcWeightInKilograms(weight);
        
        // compare expected return value with actual value returned
        System.out.println("Test case #2: Weight: " + weight + ", Expected: " 
                            + expResult + ", Result: " + result);
        assertEquals(expResult, result, 0.5);
        
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
        System.out.println("Test case #3: Weight: " + weight + ", Expected: " 
                            + expResult + ", Result: " + result);
        assertEquals(expResult, result, 0.5);
    }

    /**
     * Test of calcDosage method, of class AntidoteControl.
     */    
    @Test
    public void testCalcDosage() throws AntidoteControlException {
        System.out.println("\ncalcDosage");
        
        /**********************************
        * Test Case #1
        *********************************/
        
        // Input values for test case 1 
        double weightKilo = 173.49;
        
        // expected returned output value        
        double expResult = 750.0;
        
        // call function to run test
        double result = AntidoteControl.calcDosage(weightKilo);
        
        // compare expected return value with actual value returned
        System.out.println("Test case #1: Weight: " + weightKilo + ", Expected: " 
                            + expResult + ", Result: " + result);
        assertEquals(expResult, result, 0.0);
                
        /**********************************
        * Test Case #2
        *********************************/
        
        // Input values for test case 2 
        weightKilo = 200.0;
        
        // expected returned output value        
        expResult = 1000.0;
        
        // call function to run test
        result = AntidoteControl.calcDosage(weightKilo);
        
        // compare expected return value with actual value returned
        System.out.println("Test case #2: weightKilo: " + weightKilo + ", Expected: " 
                            + expResult + ", Result: " + result);
        assertEquals(expResult, result, 0.0);
        
        /**********************************
        * Test Case #3
        *********************************/
        
        // Input values for test case 3 
        weightKilo = 10.0;
        
        // expected returned output value        
        expResult = -2.0;
        
        // call function to run test
        result = AntidoteControl.calcDosage(weightKilo);
        
        // compare expected return value with actual value returned
        System.out.println("Test case #3: weightKilo: " + weightKilo + ", Expected: " 
                            + expResult + ", Result: " + result);
        assertEquals(expResult, result, 0.0);
        
        /**********************************
        * Test Case #4
        *********************************/
        
        // Input values for test case 4 
        weightKilo = 576.74;
        
        // expected returned output value        
        expResult = -3.0;
        
        // call function to run test
        result = AntidoteControl.calcDosage(weightKilo);
        
        // compare expected return value with actual value returned
        System.out.println("Test case #4: weightKilo: " + weightKilo + ", Expected: " 
                            + expResult + ", Result: " + result);
        assertEquals(expResult, result, 0.0);        
        
    }

    /**
     * Test of dosageCompare method, of class AntidoteControl.
     */
    @Test
    public void testDosageCompare() {
        
        /**********************************
        * Test Case #1
        *********************************/
        System.out.println("\ndosageCompare");
        
        // inputs
        double dosageInput = 40.0;
        double calcDosage = 500.0;
        
        // expected output
        boolean expResult = false;
        
        // call function to run test
        boolean result = AntidoteControl.dosageCompare(dosageInput, calcDosage);
        
        // compare expcted result with actual result
        System.out.println("Test case #1: dosageInput: " + dosageInput + 
                ", calcDosage: " + calcDosage + " , Expected: " + expResult + 
                ", Result: " + result);
        assertEquals(expResult, result);
        
        /**********************************
        * Test Case #2
        *********************************/
       
        // inputs
        dosageInput = 250.0;
        calcDosage = 250.0;
        
        // expected output
        expResult = true;
        
        // call function to run test
        result = AntidoteControl.dosageCompare(dosageInput, calcDosage);
        
        // compare expcted result with actual result
        System.out.println("Test case #2: dosageInput: " + dosageInput + 
                ", calcDosage: " + calcDosage + " , Expected: " + expResult + 
                ", Result: " + result);
        assertEquals(expResult, result);
        
        }    
}
