/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.SceneControl;
import Model.Scene;
import absentmind.AbsentMind;

/**
 *
 * @author J.D.
 */
public class SceneView extends View {
  private Scene currentScene; 

    public SceneView() {
        super("");
        currentScene = AbsentMind.getCurrentGame().getMap().getCurrentScene();
        this.displayMessage = currentScene.getDescription();
        if (currentScene.getKeyItem() != null){
            this.displayMessage += "/nYou found " + currentScene.getKeyItem().getDescription();
            this.displayMessage += "/nP- Put item in inventory.";
        }
    }
    
//    public void displaySceneView() {
//       
//        String description = currentScene.getDescription();
//        this.displayMessage = description;
//        
//        
//    }

    @Override
    public boolean doAction(String value) {
        
        if (currentScene.getKeyItem() = null){
            return false;
        }
        return false;
    }
}
