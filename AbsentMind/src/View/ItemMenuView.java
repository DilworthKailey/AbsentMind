/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.InventoryControl;
import Exception.MenuException;
import Model.Clue;
import Model.Game;
import Model.KeyItem;
import Model.NpcClue;
import Model.Player;
import absentmind.AbsentMind;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "\nR - Reports"
                + "\nQ - Return to Game Menu "
                + "\n-------------------------------------");
        
        
    }

     
    @Override
     public boolean doAction(String value) {
        
        try {
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
                case "R": // open reports menu
                    this.displayReportsMenu();
                    break;
                case "Q": // close menu
                    return true;
                default:
                    throw new MenuException("\n*** Invalid selection. Please try again.");
            }
            
            
        } catch (MenuException ex) {
            this.console.println(ex.getMessage());
        }return false;
        }

    private void people() {
        StringBuilder line;
        
        Player player = AbsentMind.getPlayer();
        ArrayList<NpcClue> npcClue = player.getNpcClue();
        InventoryControl.doNpcSort(npcClue);
        this.console.println("\n      LIST OF CLUES");
        line = new StringBuilder("                              ");
        line.insert(0, "DESCRIPTION");
        this.console.println(line.toString());
        
        for (NpcClue item : npcClue) {
            line = new StringBuilder("                          ");
            line.insert(0, "\nThe " + item.getNpcClueName() + " told you " + item.getDescription());
            
            this.console.println(line.toString());
        }
    }

    private void clues() {
        StringBuilder line;
        
        Player player = AbsentMind.getPlayer();
        ArrayList<Clue> clue = player.getClue();
        int count = InventoryControl.countClueList(clue);
        this.console.println("\n      LIST OF CLUES");
        line = new StringBuilder("                              ");
        line.insert(0, "DESCRIPTION");
        this.console.println(line.toString());
        
        for (Clue item : clue) {
            line = new StringBuilder("                          ");
            line.insert(0, "\nYou learned " + item.getDescription());
            
            this.console.println(line.toString());
        }
        this.console.println("You have found " + count + " clue(s).");
    }

    public void keyItems() {
        StringBuilder line;
        
        Player player = AbsentMind.getPlayer();
        ArrayList<KeyItem> keyItem = player.getKeyItem();
        
        this.console.println("\n      LIST OF KEY ITEMS");
        line = new StringBuilder("                              ");
        line.insert(0, "DESCRIPTION");
        this.console.println(line.toString());
        
        for (KeyItem item : keyItem) {
            line = new StringBuilder("                          ");
            line.insert(0, "\nYou found " + item.getDescription());
            
            this.console.println(line.toString());
        }
    }

    private void displayReportsMenu() {
    ReportsMenuView reportsMenuView = new ReportsMenuView();
        
      reportsMenuView.display();    
    }
    
}

