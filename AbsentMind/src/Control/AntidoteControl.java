/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

public class AntidoteControl {
    
    public static double calcWeightInKilograms(double weight) {
        
        /**
        *   calcWeightInKilograms() completed as group project:
        *   Dave Irwin, J.D. Jensen, Kailey Dilworth
        **/
        
        if (weight <= 30) { // weight less than or equal to 30?
            return -2;
        }
        
        if (weight >= 1000) { // weight greater than or equal to 1000?
            return -3;
        }
                      
        double weightKilo = weight * 0.45359237; // conversion factor to kilos
        
        return weightKilo;
    
    }
    
    public static double calcDosage(double weightKilo) {
        
        if (weightKilo < 13.6078) {
            return - 2;
        }
        
        if (weightKilo > 455) {
            return -3;
        }
        
        int dosage = (int)((Math.round(weightKilo * 5))); // round & cast to int
        
        if (dosage % 250 != 0) {
            if (dosage < 375) {
                dosage = 250; 
            }   else if (dosage < 625) {
                dosage = 500;
            }   else if (dosage < 875) {
                dosage = 750;
            }   else if (dosage < 1125) {
                dosage = 1000;
            }   else if (dosage < 1375) {
                dosage = 1250;
            }   else if (dosage < 1625) {
                dosage = 1500;
            }   else if (dosage < 1875) {
                dosage = 1750;
            }   else if (dosage < 2125) {
                dosage = 2000;
            }   else if (dosage < 2375) {
                dosage = 2250;
            }   else dosage = 2500;           
        } 
        
        return (double) dosage;
    } 
    
    public static boolean dosageCompare(double dosageInput, double calcDosage) {
        if (dosageInput != calcDosage) {
            return false;
        } else return true;
    }
}