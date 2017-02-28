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
public class HelpMenuView extends View {
    

    public HelpMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Help Menu                         |"
                + "\n-------------------------------------"
                + "\nG - Goal of Game"
                + "\nH - How to Move"
                + "\nF - Finding Clues"
                + "\nQ - Close Menu"
                + "\n-------------------------------------");
        
        
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
            case "G": // goal of game
                this.goalOfGame();
                break;
            case "H": // how to move
                this.howToMove();
                break;
            case "F": // finding clues
                this.findingClues();
                break;
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