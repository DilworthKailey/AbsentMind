/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import absentmind.AbsentMind;

/**
 *
 * @author Josh
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        
        if (playerName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        AbsentMind.setPlayer(player); // save the player
        
        return player;
        
    }
    
}
