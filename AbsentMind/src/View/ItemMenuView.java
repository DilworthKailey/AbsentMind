/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
                + "\nC - Character Notes"
                + "\nI - Inventory (Clues) found"
                + "\nA - Activity Notes"
                + "\nQ - Return to Game Menu "
                + "\n-------------------------------------");
        
        
    }

     
     public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
            case "C": // see character notes
                this.people();
                break;
            case "I": // see inventory list
                this.inventory();
                break;
            case "A": // see action notes
                this.actions();
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
        System.out.println("\n*** Character Notes function called ***");
    }

    private void inventory() {
        System.out.println("\n*** Inventory List function called ***");
    }

    private void actions() {
        System.out.println("\n*** Action Notes function called ***");
    }
    
}

