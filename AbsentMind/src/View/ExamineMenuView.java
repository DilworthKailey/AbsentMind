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
 * @author J.D.
 */
public class ExamineMenuView extends View{
    
     public ExamineMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Examine Menu                         |"
                + "\n-------------------------------------"
                + "\nP - Pick up and Examine Object"
                + "\nT - Talk to Character"
                + "\nQ - Return to Game Menu "
                + "\n-------------------------------------");
        
        
    }

     @Override
     public boolean doAction(String value) {
        
         try {
             value = value.toUpperCase(); // convert choice to upper case
             
             switch (value){
                 case "P": // Examine Clue
                     this.pickUpItem();
                     break;
                 case "T": // Interact with NPC
                     this.talk();
                     break;
                 default:
                     throw new MenuException("\n*** Invalid selection. Please try again.");
             }
             
             
         } catch (MenuException ex) {
             this.console.println(ex.getMessage());
         }return false;
        }

    private void talk() {
        this.console.println("\n*** Talk function called ***");
    }

    private void pickUpItem() {
        this.console.println("\n*** Object function called ***");
    }
    
}

