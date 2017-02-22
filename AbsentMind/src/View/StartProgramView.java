/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import Model.Player;
import java.util.Scanner;

/**
 *
 * @author Kailey
 */
public class StartProgramView {
    
        private String promptMessage;
    
        public StartProgramView() {
            
            this.promptMessage = "\nPlease enter your name: (Must be at least four characters long) ";
            // display the banner when view is created
            this.displayBanner();
            
        }

    private void displayBanner() {
      
        System.out.println(
                "\n********************************************"
               +"\n*                                          *"
               +"\n*Welcome to Absent Mind.                   *"
               +"\n*You have awoken on the subway with no     *"
               +"\n*memory of who you are or what is going on *"
               +"\n*except your name. It's up to you and your *"
               +"\n*choices to solve the mystery and discover *"
               +"\n*your identity.                            *"
               +"\n*                                          *"
               +"\n*You will need to examine your             *"
               +"\n*surroungings, find clues, talk to people, *"
               +"\n*and choose your next destination on the   *"
               +"\n*path to solving the mystery. Your         *"
               +"\n*decisions create the adventure.           *"
               +"\n*                                          *"
               +"\n*Good luck and have fun!                   *"
        );
        
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do{
            // prompt for and get players name
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            done = this.doAction(playerName);
            
        } while (!done);
    }

    private String getPlayerName() {
       
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = "";
        boolean valid = false;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playerName) {
        if (playerName.length() < 4){
            System.out.println("\nInvalid player name: "
                    + "The name must be greater than three characters in length.");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playerName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true; // huzzah!
    }

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n======================================"
                          + "\n Welcome to Absent Mind " + player.getName() + "!"
                          + "\n=====================================");
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }

    
}
