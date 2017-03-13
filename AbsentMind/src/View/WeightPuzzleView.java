/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import Control.WeightPuzzleControl;

/**
 *
 * @author J.D.
 */
public class WeightPuzzleView {

    private String promptMessage;

    public WeightPuzzleView() {
    
       }


    public void displayWeightPuzzleView() {
        
        boolean done = false;
        boolean badchoice = false;
        int choice1 = 0;
        int choice2 = 0;
        int choice3 = 0;
        int choice4 = 0;
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
            
                done = this.calcWeight(side1, side2);
            }
        } while (!done);
    }

    private int getChoice1() {
       
        this.promptMessage = "\nType a key number (1-8) to place it on the right side of the scale.";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int choice1 = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            choice1 = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number.");
            }
            
            if (choice1 > 8 || choice1 < 1){
                System.out.println("Invalid selection, try again.");
                choice1 = -1;
            }
            else valid = true;
        }
        return choice1;       
    }

    private int getChoice2() {
       
        this.promptMessage = "\nType another key number (1-8) to place it on the right side of the scale. If you only wish to place one key, enter 0.";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int choice2 = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            choice2 = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number.");
            }
            
             if (choice2 > 8 || choice2 < 0){
                System.out.println("Invalid selection, try again.");
                choice2 = -2;
            }
             else valid = true;
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
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int choice3 = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            choice3 = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number.");
            }
            
            if (choice3 > 8 || choice3 < 1){
                System.out.println("Invalid selection, try again.");
                choice3 = -3;
            }
            else valid = true;
        }        
        return choice3;
    }

    private int getChoice4() {
       
        this.promptMessage = "\nType another key number (1-8) to place it on the left side of the scale. If you only wish to place one key, enter 0.";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int choice4 = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            try {
            choice4 = Integer.parseInt(selection);
            } catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number.");
            }
            
             if (choice4 > 8 || choice4 < 0){
                System.out.println("Invalid selection, try again.");
                choice4 = -4;
            }
             else valid = true;
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
             case 0 : System.out.println("\nThe two sides are equal.");
             break;
             case 1 : System.out.println("\nThe right side weighs more.");
             break;
             case 2 : System.out.println("\nThe left side weighs more.");
             break;
             default : System.out.println("\nAn error occurred, please try again.");
         }
        // perform next action
        
        
        return true; // huzzah!
    }

    
}
