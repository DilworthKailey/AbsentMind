/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author J.D.
 */
public class WeightPuzzleControl {
    
    
    public static int side1(int choice1, int choice2){
        int key1 = choice1;
        int key2 = choice2; 
        int add1;
        int add2;
        
        switch (key1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                add1 = 1;
                break;
            case 5:
                add1 = 2;
                break;
            default:
                add1 = 0;
                break;
        }
        
        switch (key2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                add2 = 1;
                break;
            case 5:
                add2 = 2;
                break;
            default:
                add2 = 0;
                break;
        }
        
    int total = add1 + add2;
    return total;
    }
    
    public static int side2(int choice3, int choice4){
        int key3 = choice3;
        int key4 = choice4; 
        int add3;
        int add4;
        
        switch (key3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                add3 = 1;
                break;
            case 5:
                add3 = 2;
                break;
            default:
                add3 = 0;
                break;
        }
        
        switch (key4) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                add4 = 1;
                break;
            case 5:
                add4 = 2;
                break;
            default:
                add4 = 0;
                break;
        }
        
    int total2 = add3 + add4;
    return total2;
    }
    
    public static int calcWeight(int side1, int side2){
        
        if (side1 == side2){
            return 0;
        }
        else if (side1 > side2){
            return 1;
        }
        else {
            return 2;
        }
       
    }
    
}
