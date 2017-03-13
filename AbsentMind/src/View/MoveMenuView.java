/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.MapControl;
import Exception.MapControlException;
import Model.Map;
import absentmind.AbsentMind;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
         try {
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
         } catch (MapControlException me) {
             System.out.println(me.getMessage());
         }
         return false;
        }

    private boolean north() 
            throws MapControlException {
        //System.out.println("\n*** north function called ***");
         Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentRow() == map.getRowCount() - 5)
            throw new MapControlException("\n*** You cannot move further North");
        else {
            MapControl.movePlayer(map, map.getCurrentRow() - 1, map.getCurrentColumn());
            return true;
        }
    }

    private boolean east() 
            throws MapControlException {
        //System.out.println("\n*** east function called ***");
        Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentColumn() == map.getColumnCount() - 1)
            throw new MapControlException("\n*** You cannot move further East");
        else {
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() + 1);
            return true;
        }
    }

    private boolean south() 
            throws MapControlException {
        //System.out.println("\n*** south function called ***");
         Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentRow() == map.getRowCount() - 1)
            throw new MapControlException("\n*** You cannot move further South");
        else {
            MapControl.movePlayer(map, map.getCurrentRow() + 1, map.getCurrentColumn());
            return true;
        }
    }

    private boolean west() 
            throws MapControlException {
        //System.out.println("\n*** west function called ***");
         Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentColumn() == map.getColumnCount() - 5)
            throw new MapControlException("\n*** You cannot move further West");
        else {
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() - 1);
            return true;
        }
    }
    
}
