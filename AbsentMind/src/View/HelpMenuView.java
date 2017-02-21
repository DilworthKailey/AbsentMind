/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Kailey, JD, Dave
 */
class HelpMenuView {
    
    private String menu;

    public HelpMenuView(){
        this.menu = "\n"
                + "\n-------------------------------------"
                + "\n| Help Menu                         |"
                + "\n-------------------------------------"
                + "\nG - Goal of Game"
                + "\nH - How to Move"
                + "\nF - Finding Clues"
                + "\nC - Close Menu"
                + "\n-------------------------------------";
        
        System.out.println(menu);
    }

    public void displayHelpMenuView() {
       boolean done = false; // set flag to not done
        do {
            String menuOption = this.getMenuOption();
            
            done = this.doAction(menuOption);
                       
        } while (!done);
    }
    
     private String getMenuOption() {
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
        return value;
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "G": // goal of game
                this.goalOfGame();
                break;
            case "H": // how to move
                this.howToMove();
                break;
            case "F": // finding clues
                this.findingClues();
                break;
            case "C": // close menu
                this.menu = "\n"
                + "\n-------------------------------------"
                + "\n| Main Menu                         |"
                + "\n-------------------------------------"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nR - Reset Game (Start new game)"
                + "\nH - Help Menu"
                + "\nC - Close Menu "
                + "\nQ - Quit Game "
                + "\n-------------------------------------";
                 System.out.println(menu);
                 return true;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void goalOfGame() {
        System.out.println("\nExplore locations, find clues, and regain your memory. There is a time limit you need to reach each area.");
    
    }

    private void howToMove() {
        System.out.println("\nUse the Game Menu to move to each location using the directions given to you. You can only move in directions that are available.");

    }

    private void findingClues() {
        System.out.println("\nIn the Game Menu, use the Examine command to get a better feel for your area; directions you can move, hints, people and objects. Interact with these items to find clues and gather information. Clues, Key Items, and character profiles will be stored in your inventory.");
    
    }
   
}