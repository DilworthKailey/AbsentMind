/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import absentmind.AbsentMind;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Kailey
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = AbsentMind.getInFile();
    protected final PrintWriter console = AbsentMind.getOutFile();
    
    public View(){
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do{
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
            
        } while (!done);
    }
    
    @Override
    public String getInput() {
       

        boolean valid = false;
        String value = null;
        try{
        
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.displayMessage);
            
            value = keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value must be at least 1 character");
                continue;
            }
                break; // end the loop
            }  
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return value;
    }
    
}
