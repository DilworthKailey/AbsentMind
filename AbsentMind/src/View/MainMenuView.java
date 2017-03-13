/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import Exception.MapControlException;
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
                System.out.println(me.getMessage());
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
        System.out.println("\n*** closeMenu function called ***");
    }
    
    
}
