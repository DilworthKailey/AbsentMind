/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Exception.MenuException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kailey
 */
public class StatusMenuView extends View{
    
     public StatusMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Status Menu                         |"
                + "\n-------------------------------------"
                + "\nG - Game Percentage Complete"
                + "\nT - Time Spent/Remaining"
                + "\nQ - Return to Game Menu "
                + "\n-------------------------------------");
        
        
    }

     @Override
     public boolean doAction(String value) {
        
         try {
             value = value.toUpperCase(); // convert choice to upper case
             
             switch (value){
                 case "G": // move to new location
                     this.gameStatus();
                     break;
                 case "T": // view map
                     this.time();
                     break;
                 default:
                     throw new MenuException("\n*** Invalid selection. Please try again.");
             }
             
             
         } catch (MenuException ex) {
             this.console.println(ex.getMessage());
         }return false;
        }

    private void time() {
        this.console.println("\n*** time function called ***");
    }

    private void gameStatus() {
        this.console.println("\n*** gameStatus function called ***");
    }
    
}
