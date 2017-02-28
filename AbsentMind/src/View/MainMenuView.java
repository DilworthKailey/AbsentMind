/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import absentmind.AbsentMind;

/**
 *
 * @author Kailey
 */
public class MainMenuView extends View {
    


    public MainMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Main Menu                         |"
                + "\n-------------------------------------"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nR - Reset Game (Start new game)"
                + "\nH - Help Menu"
                + "\nC - Close Menu "
                + "\nQ - Quit Game "
                + "\n-------------------------------------");
        
        
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
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
        
      helpMenuView.display();
    }

    private void closeMenu() {
        System.out.println("\n*** closeMenu function called ***");
    }
    
    
}
