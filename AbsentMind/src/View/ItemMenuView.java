/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author J.D.
 */
public class ItemMenuView {
    
 private String menu;

    public ItemMenuView(){
        this.menu = "\n"
                + "\n-------------------------------------"
                + "\n| Item Menu                         |"
                + "\n-------------------------------------"
                + "\nC - Character Notes"
                + "\nI - Inventory (Clues) found"
                + "\nA - Activity Notes"
                + "\nQ - Return to Game Menu "
                + "\n-------------------------------------";
        
        System.out.println(menu);
    }

    void displayItemMenu() {
        boolean done = false; // set flag to not done
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
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
            case "C": // see character notes
                this.people();
                break;
            case "I": // see inventory list
                this.inventory();
                break;
            case "A": // see action notes
                this.actions();
                break;
            case "Q": // close menu
                this.menu = "\n"
                + "\n-------------------------------------"
                + "\n| Game Menu                         |"
                + "\n-------------------------------------"
                + "\nM - Move"
                + "\nV - View Map"
                + "\nS - Status"
                + "\nI - Item Menu"
                + "\nE - Examine"
                + "\nT - Talk "
                + "\nW - Weight Puzzle"
                + "\nQ - Return to Main Menu "
                + "\n-------------------------------------";
                 System.out.println(menu);
                 return true;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void people() {
        System.out.println("\n*** Character Notes function called ***");
    }

    private void inventory() {
        System.out.println("\n*** Inventory List function called ***");
    }

    private void actions() {
        System.out.println("\n*** Action Notes function called ***");
    }
    
}

