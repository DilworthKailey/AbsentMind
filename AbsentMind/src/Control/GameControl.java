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

    public static int createNewGame(Player player) {
        Game game = new Game(); // create new game
        AbsentMind.setCurrentGame(game); // save in AbsentMind
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // sve map in game
        
        // move actors to starting position in the map
        MapControl.moveNPCtoStartingLocation(map);
        
    }
    
    
}
