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
        Map map = new Map(3, 3);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocation(map, scenes);
        
        return map;
    }

    static void moveNPCtoStartingLocation(Map map) {
        System.out.println("\n*** movetostart() called ***");
    }

    private static Scene[] createScenes() {
        System.out.println("\n*** createScenes() called ***");
        return null;
    }


    
}
