/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import absentmind.AbsentMind;
import java.util.Scanner;

/**
 *
 * @author Kailey
 */
public class MainMenuView {
    
    private String menu;

    public MainMenuView(){
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
    }
    
    public void displayMainMenuView() {
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
            case "S": // save game
                this.saveGame();
                break;
            case "L": // load game
                this.startExistingGame();
                break;
            case "R": // restart game
                this.startNewGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            case "C": //Quit Menu
                this.closeMenu();
                break;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void startNewGame() {
        int value = GameControl.createNewGame(AbsentMind.getPlayer());
        if (value < 0){
            System.out.println("ERROR - Failed to create new game");
        }
        System.out.println(
                "\n********************************************"
               +"\n*                                          *"
               +"\n*It's a crowded subway train with people   *"
               +"\n*heading home from the daily grind.        *"
               +"\n*You are getting strange stares, especially*"
               +"\n*from an old woman, clutching her pocket   *"
               +"\n*book in her lap. The train is headed      *"
               +"\n*northbound with a stop incoming in        *"
               +"\n*15 minutes. You have no memory of who you *"
               +"\n*are or what you are doing there. You have *"
               +"\n*found yourself with an Absent Mind.       *"
               +"\n********************************************"
        );
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void displayHelpMenu() {
      HelpMenuView helpMenuView = new HelpMenuView();
        
      helpMenuView.displayHelpMenuView();
    }

    private void closeMenu() {
        System.out.println("\n*** closeMenu function called ***");
    }
    
    
}
