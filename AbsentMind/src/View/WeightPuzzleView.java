/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.SceneControl;
import Control.WeightPuzzleControl;
import absentmind.AbsentMind;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author J.D.
 */
public class WeightPuzzleView {

    private String promptMessage;
    
    protected final BufferedReader keyboard = AbsentMind.getInFile();
    protected final PrintWriter console = AbsentMind.getOutFile();

    public WeightPuzzleView() {
    
       }


    public void displayWeightPuzzleView() {
        
        boolean calc = false;
        boolean badchoice = false;
        boolean done = false;
        int choice1 = 0;
        int choice2 = 0;
        int choice3 = 0;
        int choice4 = 0;
        int pickKey = 0;
        do{
            // prompt for and get keys
            choice1 = this.getChoice1();
            if (choice1 == -1){
            badchoice = true;
            }
            if (!badchoice){
                choice2 = this.getChoice2();
                if (choice2 == -2)
                    badchoice = true;
                }
            if (!badchoice){
                choice3 = this.getChoice3();
                if (choice3 == -3)
                    badchoice = true;
                }
            if (!badchoice){
                choice4 = this.getChoice4();
                if (choice4 == -4)
                    badchoice = true;
                }
            if (!badchoice){
                int side1 = WeightPuzzleControl.side1(choice1, choice2);
                int side2 = WeightPuzzleControl.side2(choice3, choice4);
            
                calc = this.calcWeight(side1, side2);
            }
        
        
            pickKey = this.pickKey();
            if (pickKey != 5){
               this.console.println("\nWrong key number, try again."); 
            }
            else {
                this.console.println("\nYou picked the correct key! You may now enter the secret door!");
                done = true;
            }
        } while (!done);
    }

    private int getChoice1() {
       
        this.promptMessage = "\nType a key number (1-8) to place it on the right side of the scale.";
        boolean valid = false;
        String selection = null;
        int choice1 = 0;
        try{
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);
            
            selection = keyboard.readLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            choice1 = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number.");
            }
            
            if (choice1 > 8 || choice1 < 1){
                ErrorView.display(this.getClass().getName(),
                        "Invalid selection, try again.");
                choice1 = -1;
            }
            else valid = true;
        }
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return choice1;       
    }

    private int getChoice2() {
       
        this.promptMessage = "\nType another key number (1-8) to place it on the right side of the scale. If you only wish to place one key, enter 0.";
        boolean valid = false;
        String selection = null;
        int choice2 = 0;
        try{
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);
            
            selection = keyboard.readLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            choice2 = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number.");
            }
            
             if (choice2 > 8 || choice2 < 0){
                ErrorView.display(this.getClass().getName(),
                        "Invalid selection, try again.");
                choice2 = -2;
            }
             else valid = true;
        }
        }catch (Exception e){
             ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return choice2;
    }
    
//    private int doAction(int choice1, int choice2) {
//        
//        
//        // call side1() control function
//         int side1 = WeightPuzzleControl.side1(choice1, choice2);
//        
//        
//        // run next step
//        this.getChoice3();
//        
//        return side1; // huzzah!
//    }

    private int getChoice3() {
       
        this.promptMessage = "\nType a key number (1-8) to place it on the left side of the scale.";
        boolean valid = false;
        String selection = null;
        int choice3 = 0;
        try{
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);
            
            selection = keyboard.readLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            choice3 = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number.");
            }
            
            if (choice3 > 8 || choice3 < 1){
                ErrorView.display(this.getClass().getName(),
                        "Invalid selection, try again.");
                choice3 = -3;
            }
            else valid = true;
        }
        } catch (Exception e){
             ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return choice3;
    }

    private int getChoice4() {
       
        this.promptMessage = "\nType another key number (1-8) to place it on the left side of the scale. If you only wish to place one key, enter 0.";
        boolean valid = false;
        String selection = null;
        int choice4 = 0;
        try{
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);
            
            selection = keyboard.readLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            choice4 = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number.");
            }
            
             if (choice4 > 8 || choice4 < 0){
                ErrorView.display(this.getClass().getName(),
                        "Invalid selection, try again.");
                choice4 = -4;
            }
             else valid = true;
        }   
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return choice4;
    }
    
//    private int doAction2(int choice3, int choice4) {
//        
//        
//        // call side2() control function
//         int side2 = WeightPuzzleControl.side2(choice3, choice4);
//        
//        
//        return side2; // huzzah!
//    }
    
     private boolean calcWeight(int side1, int side2) {
        
        
        // call calcWeight() control function
         int calcWeight = WeightPuzzleControl.calcWeight(side1, side2);
        
         switch(calcWeight) {
             case 0 : this.console.println("\nThe two sides are equal.");
             break;
             case 1 : this.console.println("\nThe right side weighs more.");
             break;
             case 2 : this.console.println("\nThe left side weighs more.");
             break;
             default : this.console.println("\nAn error occurred, please try again.");
         }
        // perform next action
        
        SceneControl.weightComplete = true;
        return true; // huzzah!
    }

    private int pickKey() {
        this.promptMessage = "\nType in the number of the correct key to unlock the door.";
        boolean valid = false;
        String selection = null;
        int keyChoice = 0;
        try{
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);
            
            selection = keyboard.readLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            keyChoice = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number.");
            }
            
             if (keyChoice > 8 || keyChoice < 0){
                ErrorView.display(this.getClass().getName(),
                        "Invalid selection, try again.");
                keyChoice = -4;
            }
             else valid = true;
        }   
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return keyChoice;
    }

    
}
