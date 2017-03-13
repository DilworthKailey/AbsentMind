/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import Control.AntidoteControl;
import Exception.AntidoteControlException;

/**
 *
 * @author J.D.
 */
class AntidotePuzzleView {
    
    private String promptMessage;
    
    public AntidotePuzzleView() {
    
}
    
    public void displayAntidotePuzzle() throws AntidoteControlException {
        
        boolean done = false;
        boolean badchoice = false;
        int weight = 0;
        
        do{
            // prompt for and get keys
            weight = this.getWeight();
            if (weight == -1){
            badchoice = true;
            }
            if (!badchoice){
                double weightKilo = AntidoteControl.calcWeightInKilograms(weight);
                
                done = this.calcDosage(weightKilo);
            }
        } while (!done);
    }

    private int getWeight() 
            throws AntidoteControlException {
        this.promptMessage = "\nPlease enter your weight.";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int weight = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            weight = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number.");
            }
            if (weight <= 30) { // weight less than or equal to 30?
            throw new AntidoteControlException("Weight must be greater than 30 lbs.");
        }
        
            if (weight >= 1000) { // weight greater than or equal to 1000?
            throw new AntidoteControlException("Weight must be less than 1000 lbs.");
        }
            else valid = true;
        }
        return weight; 
    }

    private boolean calcDosage(double weightKilo) 
            throws AntidoteControlException {
        
        double dosage = AntidoteControl.calcDosage(weightKilo);
        System.out.println("\nThe dosage is " + dosage + "mg.");
        
        return true;
    }
    }
    
