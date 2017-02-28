/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
            case "P": // Examine Clue
                this.pickUpItem();
                break;
            case "T": // Interact with NPC
                this.talk();
                break;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void talk() {
        System.out.println("\n*** Talk function called ***");
    }

    private void pickUpItem() {
        System.out.println("\n*** Object function called ***");
    }
    
}

