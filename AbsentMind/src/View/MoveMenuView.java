/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Josh
 */
public class MoveMenuView extends View {
    
     public MoveMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Status Menu                         |"
                + "\n-------------------------------------"
                + "\nYou can move North, East, South and"
                + "\nWest if the option is available on the"
                + "\nmap with:"
                + "\nN - North"
                + "\nE - East"
                + "\nS - South"
                + "\nW - West"
                + "\nQ - Close Menu"
                + "\n-------------------------------------");
        
        
    }

     @Override
     public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value){
            case "N": // move to new location
                this.north();
                break;
            case "E": // view map
                this.east();
                break;
            case "S": // view map
                this.south();
                break;
            case "W": // view map
                this.west();
                break;
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private void north() {
        System.out.println("\n*** north function called ***");
    }

    private void east() {
        System.out.println("\n*** east function called ***");
    }

    private void south() {
        System.out.println("\n*** south function called ***");
    }

    private void west() {
        System.out.println("\n*** west function called ***");
    }
    
}
