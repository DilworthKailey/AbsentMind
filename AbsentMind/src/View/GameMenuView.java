/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Kailey
 */
public class GameMenuView extends View {
    

    public GameMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Game Menu                         |"
                + "\n-------------------------------------"
                + "\nM - Move"
                + "\nV - View Map"
                + "\nS - Status"
                + "\nI - Item Menu"
                + "\nE - Examine"
                + "\nW - Weight Puzzle"
                + "\nQ - Return to Main Menu "
                + "\n-------------------------------------");
        
        
    }

     
     public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
            case "M": // move to new location
                this.move();
                break;
            case "V": // view map
                this.viewMap();
                break;
            case "S": // see player/game status
                this.status();
                break;
            case "I": // check inventory
                this.itemMenu();
                break;
            case "E": // examine command
                this.examine();
                break;
            case "W": // test weight puzzle
                this.weight();
                break;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }
     
        private boolean doMove(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "N": // move to new location
                this.north();
                break;
            case "E": // view map
                this.east();
                break;
            case "S": // see player/game status
                this.south();
                break;
            case "W": // check inventory
                this.west();
                break;
            case "Q": // examine command
                return true;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void move() {
        System.out.println("\nYou can move North, East, South and West if the option is available on the map with N, E, S, and W." + "\nPress Q to return to the Game Menu.");
        
        boolean done = false; // set flag to not done
        do {
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doMove(menuOption);
                       
        } while (!done);
    
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = "";
        boolean valid = false;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\nEnter a command:");
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value must be at least 1 character");
                continue;
            }
                break; // end the loop
            }           
    }

    private void viewMap() {
        System.out.println("\n*** viewMap function called ***");
        
    }

    private void status() {
        System.out.println("\n*** status function called ***");
    }
    
    private void itemMenu() {
        ItemMenuView itemMenu = new ItemMenuView();
        itemMenu.displayItemMenu();
        
    }

    private void examine() {
        System.out.println("\n*** examine function called ***");
    }


    
    // Move Options

    private void north() {
        System.out.println("\n*** north function called ***");
    }

    private void east() {
        System.out.println("\n*** east function called ***");
    }

    private void south() {
        System.out.println("\n*** south function called ***");
    }

    private void west() {
        System.out.println("\n*** west function called ***");
    }

    private void weight() {
         WeightPuzzleView weightpuzz = new WeightPuzzleView();
         weightpuzz.displayWeightPuzzleView();
    }

    
    
}
