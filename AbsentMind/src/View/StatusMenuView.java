/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
            case "G": // move to new location
                this.gameStatus();
                break;
            case "T": // view map
                this.time();
                break;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void time() {
        System.out.println("\n*** time function called ***");
    }

    private void gameStatus() {
        System.out.println("\n*** gameStatus function called ***");
    }
    
}
