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
        do{
            // prompt for and get keys
            int choice1 = this.getChoice1();
            int choice2 = this.getChoice2();
            int choice3 = this.getChoice3();
            int choice4 = this.getChoice4();
            int side1 = this.doAction(choice1, choice2);
            int side2 = this.doAction2(choice3, choice4);
            
            done = this.calcWeight(side1, side2);
            
        } while (!done);
    }

    private int getChoice1() {
       
        this.promptMessage = "\nType a key number to place it on the right side of the scale.";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int choice1 = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            int option = Integer.parseInt(selection);
            
            switch(option) {
                case '1':   choice1 = 1;
                break;
                case '2':   choice1 = 2;
                break;
                case '3':   choice1 = 3;
                break;
                case '4':   choice1 = 4;
                break;
                case '5':   choice1 = 5;
                break;
                case '6':   choice1 = 6;
                break;
                case '7':   choice1 = 7;
                break;
                case '8':   choice1 = 8;
                break;
                default: System.out.println("Invalid selection, try again.");
                
                
            }
               
        }        
        return choice1;
    }

    private int getChoice2() {
       
        this.promptMessage = "\nType another key number to place it on the right side of the scale. If you only wish to place one key, enter 0.";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int choice2 = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            int option = Integer.parseInt(selection);
            
            switch(option) {
                case '0':   choice2 = 0;
                break;
                case '1':   choice2 = 1;
                break;
                case '2':   choice2 = 2;
                break;
                case '3':   choice2 = 3;
                break;
                case '4':   choice2 = 4;
                break;
                case '5':   choice2 = 5;
                break;
                case '6':   choice2 = 6;
                break;
                case '7':   choice2 = 7;
                break;
                case '8':   choice2 = 8;
                break;
                default: System.out.println("Invalid selection, try again.");
                
                
            }
               
        }        
        return choice2;
    }
    
    private int doAction(int choice1, int choice2) {
        
        
        // call side1() control function
         int side1 = WeightPuzzleControl.side1(choice1, choice2);
        
        
        // run next step
        this.getChoice3();
        
        return side1; // huzzah!
    }

    private int getChoice3() {
       
        this.promptMessage = "\nType a key number to place it on the left side of the scale.";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int choice3 = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            int option = Integer.parseInt(selection);
            
            switch(option) {
                case '1':   choice3 = 1;
                break;
                case '2':   choice3 = 2;
                break;
                case '3':   choice3 = 3;
                break;
                case '4':   choice3 = 4;
                break;
                case '5':   choice3 = 5;
                break;
                case '6':   choice3 = 6;
                break;
                case '7':   choice3 = 7;
                break;
                case '8':   choice3 = 8;
                break;
                default: System.out.println("Invalid selection, try again.");
                
                
            }
               
        }        
        return choice3;
    }

    private int getChoice4() {
       
        this.promptMessage = "\nType another key number to place it on the left side of the scale. If you only wish to place one key, enter 0.";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false;
        String selection = null;
        int choice4 = 0;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim(); // trim off leading and trailing blanks
            int option = Integer.parseInt(selection);
            
            switch(option) {
                case '0':   choice4 = 0;
                break;
                case '1':   choice4 = 1;
                break;
                case '2':   choice4 = 2;
                break;
                case '3':   choice4 = 3;
                break;
                case '4':   choice4 = 4;
                break;
                case '5':   choice4 = 5;
                break;
                case '6':   choice4 = 6;
                break;
                case '7':   choice4 = 7;
                break;
                case '8':   choice4 = 8;
                break;
                default: System.out.println("Invalid selection, try again.");
                
                
            }
               
        }        
        return choice4;
    }
    
    private int doAction2(int choice3, int choice4) {
        
        
        // call side2() control function
         int side2 = WeightPuzzleControl.side2(choice3, choice4);
        
        
        return side2; // huzzah!
    }
    
     private boolean calcWeight(int side1, int side2) {
        
        
        // call calcWeight() control function
         int calcWeight = WeightPuzzleControl.calcWeight(side1, side2);
        
         switch(calcWeight) {
             case 0 : System.out.println("The two sides are equal.");
             break;
             case 1 : System.out.println("The right side weighs more.");
             break;
             case 2 : System.out.println("The left side weighs more.");
             break;
             default : System.out.println("An error occurred, please try again.");
         }
        // perform next action
        
        
        return true; // huzzah!
    }

    
}
