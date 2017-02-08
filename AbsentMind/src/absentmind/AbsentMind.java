/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absentmind;

import Model.Location;
import Model.Player;
import Model.Scene;
import Model.Clue;
import Model.Map;
import Model.NonPlayableCharacter;
import Model.KeyItem;

/**
 *
 * @author Josh
 */
public class AbsentMind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setName("John Doe");
        playerOne.setBestTime(7.00);
        playerOne.setEndingType("You died.");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Clue newClue = new Clue();
        
        newClue.setClueName("Sword");
        newClue.setClueType("Weapon");
        newClue.setDescription("A samurai sword left behind.");
        
        String clueInfo = newClue.toString();
        System.out.println(clueInfo);
        
        Scene newScene = new Scene();
        
        newScene.setDescription("The first car of the subway");
        newScene.setTravelTime(25);
        newScene.setUpdateDescription("There is an old woman staring at you intently.");
        newScene.setNonPlayableCharacter("Old Lady");
        newScene.setClueLocation("Shoe");
        newScene.setInteractions("Jump out of Train");
        newScene.setSceneName("Subway Doors");
        newScene.setDisplaySymbol("ASCII Art");
        
        String sceneInfo = newScene.toString();
        System.out.println(sceneInfo);
        
        Map map = new Map();
        
        map.setMapType("subway");
        map.setColumnCount(9);
        map.setRowCount(4);
        map.setCurrentColumn(0);
        map.setCurrentRow(0);
        map.setCurrentScene(0);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        Location here = new Location();
        
        here.setRow(1);
        here.setColumn(1);
        here.setVisited("Y");
        
        String Here = here.toString();
        System.out.println(Here);
        
        KeyItem keyItem = new KeyItem();
        
        keyItem.setKeyItemType("Key");
        keyItem.setDescription("rusty skeleton key");
        
        String myItem = keyItem.toString();
        System.out.println(myItem);
        
        NonPlayableCharacter npcOne = new NonPlayableCharacter();
        
        npcOne.setNpcDescription("Tall, slender chef with a fat, bulbous nose.");
        npcOne.setName("Gaston");
        npcOne.setDialogue("Here, have a crossant!");
        npcOne.setNpcClue("You bite down, nearly breaking your teeth on what appears to be a rusty skeleton key.");
        
        String npcInfo = npcOne.toString();
        System.out.println(npcInfo);
        
    }
    
}