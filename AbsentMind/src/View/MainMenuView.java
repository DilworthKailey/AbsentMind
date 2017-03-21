/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import Exception.MapControlException;
import Exception.MenuException;
import absentmind.AbsentMind;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        try {
            value = value.toUpperCase(); // convert choice to upper case
            
            switch (value){
                case "S": // save game
                    this.saveGame();
                    break;
                case "L": // load game
                    this.startExistingGame();
                    break;
                case "R": {
                    try {
                        // restart game
                        this.startNewGame();
                    } catch (MapControlException me) {
                        this.console.println(me.getMessage());
                    }
                }
                break;
                case "H": // display help menu
                    this.displayHelpMenu();
                    break;
                case "C": //Quit Menu
                    this.closeMenu();
                    break;
                default:
                    throw new MenuException("\n*** Invalid selection. Please try again.");
            }

            
        } catch (MenuException ex) {
            this.console.println(ex.getMessage());
        }return false;
        }

    private void saveGame() {
        this.console.println("\n\nEnter a name for your save file"
                + " to be saved.");
        String filePath = this.getInput();
        
        try{
            GameControl.saveGame(AbsentMind.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the name you set for your save file"
                + "  to be loaded.");
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startNewGame() throws MapControlException {
        GameControl.createNewGame(AbsentMind.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
      HelpMenuView helpMenuView = new HelpMenuView();
        
      helpMenuView.display();
    }

    private void closeMenu() {
        this.console.println("\n*** closeMenu function called ***");
    }
    
    
}
