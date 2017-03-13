/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Exception.AntidoteControlException;
import Exception.MenuException;
import Exception.PasswordControlException;
import Model.Game;
import Model.Location;
import Model.Map;
import absentmind.AbsentMind;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "\nA - Antidote Puzzle"
                + "\nW - Weight Puzzle"
                + "\nP - Password Puzzle"
                + "\nQ - Return to Main Menu "
                + "\n-------------------------------------");
        
        
    }

     
     public boolean doAction(String value) {
        
        try {
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
                case "A": {
                    try {
                        // test antidote puzzle
                        this.antidote();
                    } catch (AntidoteControlException me) {
                        System.out.println(me.getMessage());
                    }
                }
                case "P": {
                    try {
                        // test antidote puzzle
                        this.password();
                    } catch (PasswordControlException me) {
                        System.out.println(me.getMessage());
                    }
                }
                break;
                default:
                    throw new MenuException("\n*** Invalid selection. Please try again.");
            }

            
        } catch (MenuException ex) {
            System.out.println(ex.getMessage());
        }return false;
        }

    private void move() {
        MoveMenuView moveMenu = new MoveMenuView();
        moveMenu.display();
        this.viewMap();
    }

    private void viewMap() {
        String leftIndicator;
        String rightIndicator;
        // retreive the game replace PiratesOfTheOpenSeas with your game name
        Game game = AbsentMind.getCurrentGame(); 
        Map map = game.getMap(); // retreive the map from game
        
        Location[][] locations = map.getLocations(); // retreive the locations from map
            // Build the heading of the map
            System.out.print("  |");
            for( int column = 0; column < locations[0].length; column++){
             // print col numbers to side of map
            System.out.print("   " + column + "  |"); 
            }
            // Now build the map.  For each row, show the column information
            System.out.println();
            for( int row = 0; row < locations.length; row++){
              System.out.print(row + " "); // print row numbers to side of map
             for( int column = 0; column < locations[row].length; column++){
              // set default indicators as blanks
             leftIndicator = " ";
             rightIndicator = " ";
             if(locations[row][column] == map.getLocation()){
               // Set star indicators to show this is the current location.
                  leftIndicator = "*"; 
                  rightIndicator = "*"; 
                } 
                else if(locations[row][column].isVisited()){
                  // Set < > indicators to show this location has been visited.
                leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                 rightIndicator = "<"; // same as above
             }
                System.out.print("|"); // start map with a |
                if(locations[row][column].getScene() == null)
                {
                     // No scene assigned here so use ?? for the symbol
                     System.out.print(leftIndicator + " ?? " + rightIndicator);
                }
                else
                 System.out.print(leftIndicator
                     + locations[row][column].getScene().getDisplaySymbol()
                  + rightIndicator);
            }
            System.out.println("|");
    }
        
        
    }

    private void status() {
        StatusMenuView statusMenu = new StatusMenuView();
        statusMenu.display();
    }
    
    private void itemMenu() {
        ItemMenuView itemMenu = new ItemMenuView();
        itemMenu.display();
        
    }

    private void examine() {
        ExamineMenuView examineMenu = new ExamineMenuView();
        examineMenu.display();
    }


    private void weight() {
         WeightPuzzleView weightpuzz = new WeightPuzzleView();
         weightpuzz.displayWeightPuzzleView();
    }

    private void antidote() throws AntidoteControlException {
        AntidotePuzzleView antidotePuzz = new AntidotePuzzleView();
        antidotePuzz.displayAntidotePuzzle();
    }
    
    private void password() throws PasswordControlException {
        PasswordPuzzleView passwordPuzz = new PasswordPuzzleView();
        passwordPuzz.displayPasswordPuzzle();
    }

    
    
}
