/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Map;
import Model.Scene;

/**
 *
 * @author Kailey
 */
public class MapControl {
    public static Map createMap(){
        Map map = new Map(5, 5);
        
        Scene[] scenes = GameControl.createScenes();
        
        GameControl.assignScenesToLocation(map, scenes);
        
        return map;
    }

    static void moveNPCtoStartingLocation(Map map) {
        System.out.println("\n*** movetostart() called ***");
    }

    static void movePlayertoStartingLocation(Map map) {
        movePlayer(map, 3, 0);
    }

    public static void movePlayer(Map map, int row, int column) {
       map.setLocation(map.getLocations()[row][column]);
       map.getLocation().setVisited(true);
       map.setCurrentRow(row);
       map.setCurrentColumn(column);
    }

    
}
