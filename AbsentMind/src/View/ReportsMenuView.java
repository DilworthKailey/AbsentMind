/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Exception.MenuException;
import Model.Game;
import Model.KeyItem;
import Model.NpcClue;
import Model.Clue;
import absentmind.AbsentMind;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author J.D.
 */
public class ReportsMenuView extends View{
    
     public ReportsMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Print Reports                         |"
                + "\n-------------------------------------"
                + "\nC - Clues"
                + "\nK - Key Items"
                + "\nP - People"
                + "\nQ - Return to Item Menu "
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
                case "Q": // close menu
                    return true;
                default:
                    throw new MenuException("\n*** Invalid selection. Please try again.");
            }
            
            
        } catch (MenuException ex) {
            this.console.println(ex.getMessage());
        }return false;
        }

    private void clues() {
        StringBuilder line;
        
        Game game = AbsentMind.getCurrentGame();
        ArrayList<Clue> clue = game.getClue();
        
    this.console.println("\nEnter a name for the Clue report file"
                + " to be saved.");
        String fileName = this.getInput();
        
        try{
            File myFile = new File(fileName + ".txt");
            myFile.createNewFile();
            PrintWriter myWriter = new PrintWriter(myFile);
            myWriter.println("\nLIST OF CLUES");
            line = new StringBuilder("                              ");
            line.insert(0, "DESCRIPTION");
            myWriter.println(line.toString());
        
        for (Clue clues : clue) {
            line = new StringBuilder("                          ");
            line.insert(0, clues.getDescription());
            
            myWriter.println(line.toString());
          
        }
        this.console.println("\nYou have successfully written the clue report"
                    + " to your designated file name.");
            myWriter.close();
        } catch (Exception ex) {
            ErrorView.display("ItemMenuView", ex.getMessage());
        } 
        
    }

    private void keyItems() {
        StringBuilder line;
        
        Game game = AbsentMind.getCurrentGame();
        ArrayList<KeyItem> keyItem = game.getKeyItem();
        
    this.console.println("\n\nEnter a name for your report file"
                + " to be saved.");
        String fileName = this.getInput();
        
        try{
            File myFile = new File(fileName + ".txt");
            myFile.createNewFile();
            PrintWriter myWriter = new PrintWriter(myFile);
            myWriter.println("\nLIST OF KEY ITEMS");
            line = new StringBuilder("                              ");
            line.insert(0, "DESCRIPTION");
            myWriter.println(line.toString());
        
        for (KeyItem item : keyItem) {
            line = new StringBuilder("                          ");
            line.insert(0, item.getDescription());
            
            myWriter.println(line.toString());
        }
            myWriter.close();
        } catch (Exception ex) {
            ErrorView.display("ItemMenuView", ex.getMessage());
        } 
    }

    private void people() {
        
        StringBuilder line;
        
        Game game = AbsentMind.getCurrentGame();
        ArrayList<NpcClue> npcClue = game.getNpcClue();
        
    this.console.println("\n\nEnter a name for your report file"
                + " to be saved.");
        String fileName = this.getInput();
        
        try{
            File myFile = new File(fileName + ".txt");
            myFile.createNewFile();
            PrintWriter myWriter = new PrintWriter(myFile);
            myWriter.println("\nLIST OF CLUES");
            line = new StringBuilder("                              ");
            line.insert(0, "DESCRIPTION");
            myWriter.println(line.toString());
        
        for (NpcClue item : npcClue) {
            line = new StringBuilder("                          ");
            line.insert(0, item.getDescription());
            
            myWriter.println(line.toString());
        }
            myWriter.close();
        } catch (Exception ex) {
            ErrorView.display("ItemMenuView", ex.getMessage());
        } 
    }
    
}
