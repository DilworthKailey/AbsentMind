/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.InventoryControl;
import Model.Clue;
import Model.Game;
import Model.KeyItem;
import Model.NpcClue;
import absentmind.AbsentMind;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author J.D.
 */
public class ItemMenuView extends View{
    
 

    public ItemMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Item Menu                         |"
                + "\n-------------------------------------"
                + "\nC - Clues"
                + "\nK - Key Items"
                + "\nP - People"
                + "\nQ - Return to Game Menu "
                + "\n-------------------------------------");
        
        
    }

     
     public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
            case "C": // see character notes
                this.clues();
                break;
            case "K": // see inventory list
                this.keyItems();
                break;
            case "P": // see action notes
                this.people();
                break;
            case "Q": // close menu
                 return true;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void people() {
        StringBuilder line;
        
        Game game = AbsentMind.getCurrentGame();
        ArrayList<NpcClue> npcClue = game.getNpcClue();
        InventoryControl.doNpcSort(npcClue);
        System.out.println("\n      LIST OF CLUES");
        line = new StringBuilder("                              ");
        line.insert(0, "DESCRIPTION");
        System.out.println(line.toString());
        
        for (NpcClue item : npcClue) {
            line = new StringBuilder("                          ");
            line.insert(0, item.getDescription());
            
            System.out.println(line.toString());
        }
    }

    private void clues() {
        StringBuilder line;
        
        Game game = AbsentMind.getCurrentGame();
        ArrayList<Clue> clue = game.getClue();
        int count = InventoryControl.countClueList(clue);
        System.out.println("\n      LIST OF CLUES");
        line = new StringBuilder("                              ");
        line.insert(0, "DESCRIPTION");
        System.out.println(line.toString());
        
        for (Clue item : clue) {
            line = new StringBuilder("                          ");
            line.insert(0, item.getDescription());
            
            System.out.println(line.toString());
        }
        System.out.println("You have found " + count + " clue(s).");
    }

    private void keyItems() {
        StringBuilder line;
        
        Game game = AbsentMind.getCurrentGame();
        ArrayList<KeyItem> keyItem = game.getKeyItem();
        
        System.out.println("\n      LIST OF KEY ITEMS");
        line = new StringBuilder("                              ");
        line.insert(0, "DESCRIPTION");
        System.out.println(line.toString());
        
        for (KeyItem item : keyItem) {
            line = new StringBuilder("                          ");
            line.insert(0, item.getDescription());
            
            System.out.println(line.toString());
        }
    }
    
}

