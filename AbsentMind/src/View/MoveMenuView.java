/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.MapControl;
import Control.SceneControl;
import Exception.MapControlException;
import Model.Map;
import Model.Player;
import Model.Scene;
import absentmind.AbsentMind;

/**
 *
 * @author Josh
 */
public class MoveMenuView extends View {
    
     public MoveMenuView(){
        super("\n"
                + "\n-------------------------------------"
                + "\n| Move Menu                         |"
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
                     ErrorView.display(this.getClass().getName(),
                             "\n*** Not a valid command *** Try again");
                     break;
             }
         } catch (MapControlException me) {
             ErrorView.display(this.getClass().getName(),
                     "Error reading input: " + me.getMessage());
         }
         return false;
        }
     
     private void movePlayer(Map map, int Row, int Column){
         Player player = AbsentMind.getPlayer();
         MapControl.movePlayer(map, Row, Column);
         Scene currentScene = map.getLocation().getScene();
            if (currentScene.getKeyItem() != null){
                this.console.println("\nYou found " + currentScene.getKeyItem().getDescription());
            }
            if (currentScene.getClue() != null){
                this.console.println("\nYou learned " + currentScene.getClue().getDescription());
            }
            if (currentScene.getNpcClue() != null){
                this.console.println("\nThe " +currentScene.getNpcClue().getNpcClueName() + " told you " + currentScene.getNpcClue().getDescription());
            }
            this.console.println(currentScene.getDescription());
            MapControl.givePlayerItem(player, map);
     }

    private boolean north() 
            throws MapControlException {
         Map map = AbsentMind.getCurrentGame().getMap();
         
        if (map.getCurrentRow() == map.getRowCount() - 5)
            throw new MapControlException("\n*** You cannot move further North");
        if (map.getCurrentRow() == 2 && map.getCurrentColumn() == 0 && SceneControl.weightComplete == false )
            throw new MapControlException("\n*** You cannot enter this area yet");
        if (map.getCurrentRow() == 2 && map.getCurrentColumn() == 1 && SceneControl.weightComplete == false )
            throw new MapControlException("\n*** You cannot enter this area yet");
        if (map.getCurrentRow() == 2 && map.getCurrentColumn() == 2 && SceneControl.weightComplete == false )
            throw new MapControlException("\n*** You cannot enter this area yet");
        else {
            movePlayer(map, map.getCurrentRow() - 1, map.getCurrentColumn());
            
            return true;
        }
    }

    private boolean east() 
            throws MapControlException {
        Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentColumn() == map.getColumnCount() - 1)
            throw new MapControlException("\n*** You cannot move further East");
        else {
            movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() + 1);
            return true;
        }
    }

    private boolean south() 
            throws MapControlException {
         Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentRow() == map.getRowCount() - 1)
            throw new MapControlException("\n*** You cannot move further South");
        else {
            movePlayer(map, map.getCurrentRow() + 1, map.getCurrentColumn());
            return true;
        }
    }

    private boolean west() 
            throws MapControlException {
         Map map = AbsentMind.getCurrentGame().getMap();
        if (map.getCurrentColumn() == map.getColumnCount() - 5)
            throw new MapControlException("\n*** You cannot move further West");
        if (map.getCurrentRow() == 1 && map.getCurrentColumn() == 3 && SceneControl.weightComplete == false )
            throw new MapControlException("\n*** You cannot enter this area yet");
        if (map.getCurrentRow() == 0 && map.getCurrentColumn() == 2 && SceneControl.weightComplete == false )
            throw new MapControlException("\n*** You cannot enter this area yet");
        else {
            movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() - 1);
            return true;
        }
    }
    
}
