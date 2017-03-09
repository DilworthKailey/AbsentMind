/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.MapControl;
import Model.Map;
import absentmind.AbsentMind;

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
                return this.north();
            case "E": // view map
                return this.east();
            case "S": // view map
                return this.south();
            case "W": // view map
                return this.west();
            default:
                System.out.println("\n*** Not a valid command *** Try again");
                break;
        }
        
            return false;
        }

    private boolean north() {
        //System.out.println("\n*** north function called ***");
         Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentRow() == map.getRowCount() - 5)
            System.out.println("\n*** You cannot move further North");
        else {
            MapControl.movePlayer(map, map.getCurrentRow() - 1, map.getCurrentColumn());
            return true;
        }
        return false;
    }

    private boolean east() {
        //System.out.println("\n*** east function called ***");
        Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentColumn() == map.getColumnCount() - 1)
            System.out.println("\n*** You cannot move further East");
        else {
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() + 1);
            return true;
        }
        return false;
    }

    private boolean south() {
        //System.out.println("\n*** south function called ***");
         Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentRow() == map.getRowCount() - 1)
            System.out.println("\n*** You cannot move further South");
        else {
            MapControl.movePlayer(map, map.getCurrentRow() + 1, map.getCurrentColumn());
            return true;
        }
        return false;
    }

    private boolean west() {
        //System.out.println("\n*** west function called ***");
         Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentColumn() == map.getColumnCount() - 5)
            System.out.println("\n*** You cannot move further West");
        else {
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() - 1);
            return true;
        }
        return false;
    }
    
}
