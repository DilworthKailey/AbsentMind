/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exception.AntidoteControlException;
import Exception.PasswordControlException;
import Model.Clue;
import Model.Map;
import Model.Player;
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
    
    public static void givePlayerItem(Player player, Map map){
       Scene currentScene = map.getLocation().getScene();
       if (currentScene.getKeyItem() != null){
            player.getKeyItem().add(currentScene.getKeyItem());
            currentScene.setKeyItem(null);
        } 
       else if (currentScene.getClue() != null){
           player.getClue().add(currentScene.getClue());
           currentScene.setClue(null);
       }
       else if (currentScene.getNpcClue() != null){
           player.getNpcClue().add(currentScene.getNpcClue());
           currentScene.setNpcClue(null);
       }
    }

    public static void movePlayer(Map map, int row, int column)  {
       map.setLocation(map.getLocations()[row][column]);
       map.getLocation().setVisited(true);
       
       map.setCurrentRow(row);
       map.setCurrentColumn(column);
       if (row == 1 && column == 4 && SceneControl.keyObtained == true){
           System.out.println(
                     "You notice a locked drawer and use the key"
                             + "\n you found on the subway to open it. Inside you"
                             + "\n find a notebook and recognize your handwriting:"
                             + "\n 'I know something is going on at the Gym, something"
                             + "\nbig! I have gotten a membership and have investigated"
                             + "\n under-cover so far, but I think they are onto me."
                             + "\nI have a feeling that I should be careful to stay"
                             + "\n on high alert and away from the tanning beds.");
        Clue notebook = new Clue("Notebook","you were investigating some kind "
                + "\nof conspiracy going on at the Gym. ");
       }
       if (row == 2 && column == 1){
           SceneControl.keyObtained = true;
       } 
        if (row == 0 && column == 3){
           SceneControl.noteObtained = true;
       } 
         if (row == 1 && column == 1){
           SceneControl.antidoteFound = true;
       } 
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
           MapControl.antidotePuzzle();
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
