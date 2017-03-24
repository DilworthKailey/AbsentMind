/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.SceneControl;
import Model.Scene;

/**
 *
 * @author J.D.
 */
public class SceneView extends View {
   

    public SceneView() {
    }
    
    public void displaySceneView() {
       
        String description = Scene.getDescription();
        this.displayMessage = description;
        
        
    }

    @Override
    public boolean doAction(String value) {
        this.console.println("\n*** doAction() called ***");
        return false;
    }
}
