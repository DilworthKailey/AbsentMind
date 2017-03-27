/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exception.AntidoteControlException;
import Exception.PasswordControlException;
import Model.Map;
import Model.Scene;
import View.AntidotePuzzleView;
import View.PasswordPuzzleView;
import View.WeightPuzzleView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kailey
 */
public class MapControl {
    public static Map createMap(){
        Map map = new Map(5, 5);
        
        Scene[] scenes = SceneControl.createScenes();
        
        SceneControl.assignScenesToLocation(map, scenes);
        
        return map;
    }

    static void movePlayertoStartingLocation(Map map){
        movePlayer(map, 3, 0);
    }

    public static void movePlayer(Map map, int row, int column)  {
       map.setLocation(map.getLocations()[row][column]);
       map.getLocation().setVisited(true);
       map.setCurrentRow(row);
       map.setCurrentColumn(column);
       if (row == 2 && column == 3){
           if (SceneControl.noteObtained == true){
           MapControl.password();
           }
       }
       if (row == 0 && column == 2){
           if (SceneControl.phoneMessage == true){
           MapControl.weightPuzzle();
           }
       }
       if (row == 0 && column == 0){
           if (SceneControl.antidoteFound == true){
           MapControl.antidotePuzzle();
           }
       }
    }

    private static void password() {
      PasswordPuzzleView passwordPuzz = new PasswordPuzzleView();
        try {
            passwordPuzz.displayPasswordPuzzle();
        } catch (PasswordControlException ex) {
            Logger.getLogger(MapControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void weightPuzzle() {
        WeightPuzzleView weightpuzz = new WeightPuzzleView();
        weightpuzz.displayWeightPuzzleView();   
    }

    private static void antidotePuzzle() {
        AntidotePuzzleView antidotePuzz = new AntidotePuzzleView();
        try {
            antidotePuzz.displayAntidotePuzzle();
        } catch (AntidoteControlException ex) {
            Logger.getLogger(MapControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
