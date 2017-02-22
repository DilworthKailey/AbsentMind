/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Josh
 */
class GameMenuView {
    
    private String menu;

    public GameMenuView(){
        this.menu = "\n"
                + "\n-------------------------------------"
                + "\n| Game Menu                         |"
                + "\n-------------------------------------"
                + "\nM - Move"
                + "\nV - View Map"
                + "\nS - Status"
                + "\nS - Item Menu"
                + "\nE - Examine"
                + "\nT - Talk "
                + "\nQ - Return to Main Menu "
                + "\n-------------------------------------";
        
        System.out.println(menu);
    }

    void displayGameMenu() {
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
            case "T": // talk if there are npcs in the area
                this.talk();
                break;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void move() {
        System.out.println("\n*** move function called ***");
    }

    private void viewMap() {
        System.out.println("\n*** viewMap function called ***");
    }

    private void status() {
        System.out.println("\n*** status function called ***");
    }
    
    private void itemMenu() {
        System.out.println("\n*** itemMenu function called ***");
    }

    private void examine() {
        System.out.println("\n*** examine function called ***");
    }

    private void talk() {
        System.out.println("\n*** talk function called ***");
    }

    
    
}
