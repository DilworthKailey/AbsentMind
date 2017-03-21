/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import Control.PasswordControl;
import Exception.PasswordControlException;
import Model.Clue;
import Model.Player;
import absentmind.AbsentMind;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Kailey
 */
public class PasswordPuzzleView {
    private String promptMessage;
    Player player = AbsentMind.getPlayer();
    String playerName = player.getName();
    
    protected final BufferedReader keyboard = AbsentMind.getInFile();
    protected final PrintWriter console = AbsentMind.getOutFile();

    
public void displayPasswordPuzzle() throws PasswordControlException{
    
    boolean done = false;
    double playerPassword;
    double password = PasswordControl.setPassword(playerName);
    
    do{
        playerPassword = this.getPassword();

        if (playerPassword != password){
            this.console.println("\nPassword Incorrect. "
                    + "\nTo retrieve password, please enter your set keyword "
                    + "(Enter Q to quit):");
            String hint = this.getKeyword();
            if (hint.equals(playerName)){
                this.console.println("\nYour password is: " + password);
            }else{
                this.console.println("\nYour keyword is incorrect. Goodbye.");
            }
        }else{
            this.console.println("\nCorrect Password: Your phone has been unlocked."
                    + " You have one new message: "
                    + "\nHey, " + playerName + ", you were right! There is a "
                    + "\nsecret base under the gym! I thought you were crazy, "
                    + "\nbut I checked out the back of the locker room and you "
                    + "\nwere right! There were stairs that led to a door with "
                    + "\nsome strange contraption to open it. I was too scared "
                    + "\nto try to get in though... You must be onto something "
                    + "\nbig! Call me later!");
            done = true;  
        }
          
    }while (!done);
    this.console.println(("\n\n(A secret basement? I better check the back of the locker room...)"));
}

private int getPassword() throws PasswordControlException {
    this.promptMessage = "\nPlease enter Password (Enter Q to quit):";
    boolean valid = false;
    String selection = null;
    
    double playerPassword = 0;
    
    try{
    while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);
            
            selection = keyboard.readLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            playerPassword = Double.parseDouble(selection);
            } catch (NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number.");
            }
            if (playerPassword <= 99999) { // weight less than or equal to 30?
            throw new PasswordControlException("Password Incorrect. Entry must "
                    + "be 6 digits long.");
        }
        
            if (playerPassword >= 1000000) { // weight greater than or equal to 1000?
            throw new PasswordControlException("Password Incorrect. Entry must "
                    + "be only 6 digits long.");
        }
            else valid = true;
        }
    }catch (Exception e){
        ErrorView.display(this.getClass().getName(),
                "Error reading input: " + e.getMessage());
    }
        return (int) playerPassword; 
    
}

    private String getKeyword() {
        String value = null;
        boolean valid = false;
        try{
        while (!valid) { //loop while an invalid value is enter
            
            value = keyboard.readLine(); // get next line typed on keyboard
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid value: value must be at least 1 character");
                continue;
            }
                break; // end the loop
            }  
        }catch (Exception e){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return value;
    }
}
