/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author J.D.
 */
public class WeightPuzzleControlTest {
    
    public WeightPuzzleControlTest() {
    }
/**
     * Test of WeightPuzzleControl.
     */
    @Test
    public void testWeightPuzzleControl() {
        System.out.println("Weight Puzzle");
        
        System.out.println("\tTest case #1");
        
        //WeightPuzzleControl instance = new WeightPuzzleControl();
        int expResult = 0;
        int side1 = WeightPuzzleControl.side1(1, 2);
        int side2 = WeightPuzzleControl.side2(3, 4);
        int result = WeightPuzzleControl.calcWeight(side1, side2);
        assertEquals(expResult, result, 0.01);
        
        
        System.out.println("\tTest case #2");
        
        //WeightPuzzleControl instance = new WeightPuzzleControl();
        expResult = 1;
        side1 = WeightPuzzleControl.side1(4, 5);
        side2 = WeightPuzzleControl.side2(7, 8);
        result = WeightPuzzleControl.calcWeight(side1, side2);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest case #3");
        
        //WeightPuzzleControl instance = new WeightPuzzleControl();
        expResult = 1;
        side1 = WeightPuzzleControl.side1(6, 7);
        side2 = WeightPuzzleControl.side2(0, 8);
        result = WeightPuzzleControl.calcWeight(side1, side2);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest case #4");
        
        //WeightPuzzleControl instance = new WeightPuzzleControl();
        expResult = 0;
        side1 = WeightPuzzleControl.side1(0,0);
        side2 = WeightPuzzleControl.side2(0,0);
        result = WeightPuzzleControl.calcWeight(side1, side2);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest case #5");
        
        //WeightPuzzleControl instance = new WeightPuzzleControl();
        expResult = 2;
        side1 = WeightPuzzleControl.side1(4, 9);
        side2 = WeightPuzzleControl.side2(9, 5);
        result = WeightPuzzleControl.calcWeight(side1, side2);
        assertEquals(expResult, result, 0.01);
        
    }
}
