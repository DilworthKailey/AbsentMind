/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exception.PasswordControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kailey
 */
public class PasswordControlTest {
    
    public PasswordControlTest() {
    }

    /**
     * Test of setPassword method, of class PasswordControl.
     */
    @Test
    public void testSetPassword() throws PasswordControlException {
        System.out.println("setPassword");
        
        System.out.println("\tTest case #1");
        String playerName = "fred";
        PasswordControl instance = new PasswordControl();
        double expResult = 144721.0;
        double result = instance.setPassword(playerName);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        
        System.out.println("\tTest case #2");
        playerName = "zzzz";
       
        expResult = 141421.0;
        result = instance.setPassword(playerName);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        
        System.out.println("\tTest case #3");
        playerName = "zaj5";
       
        expResult = 192195.0;
        result = instance.setPassword(playerName);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        
        System.out.println("\tTest case #4");
        playerName = "1235";
       
        expResult = 141421.0;
        result = instance.setPassword(playerName);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        
        System.out.println("\tTest case #5");
        playerName = "!@#$";
       
        expResult = 141421.0;
        result = instance.setPassword(playerName);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        
        System.out.println("\tTest case #5");
        playerName = "2a55";
       
        expResult = 116619.0;
        result = instance.setPassword(playerName);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        
    }
    
}
