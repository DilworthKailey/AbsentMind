/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import Control.AntidoteControl;
import Exception.AntidoteControlException;
import absentmind.AbsentMind;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author J.D.
 */
class AntidotePuzzleView {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = AbsentMind.getInFile();
    protected final PrintWriter console = AbsentMind.getOutFile();
    
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

        boolean valid = false;
        String selection = null;
        int weight = 0;
        
        try{
        
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);
            
            selection = keyboard.readLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            weight = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number.");
            }
            if (weight <= 30) { // weight less than or equal to 30?
            throw new AntidoteControlException("Weight must be greater than 30 lbs.");
        }
        
            if (weight >= 1000) { // weight greater than or equal to 1000?
            throw new AntidoteControlException("Weight must be less than 1000 lbs.");
        }
            else valid = true;
        }
        }catch (Exception e){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return weight; 
    }

    private boolean calcDosage(double weightKilo) 
            throws AntidoteControlException {
        
        double dosage = AntidoteControl.calcDosage(weightKilo);
        this.console.println("\nThe dosage is " + dosage + "mg.");
        
        return true;
    }
    }
    
