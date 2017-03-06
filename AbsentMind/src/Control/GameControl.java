/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Clue;
import Model.Player;
import absentmind.AbsentMind;
import Model.Game;
import Model.KeyItem;
import Model.Map;
import Model.NpcClue;
import Model.Scene;

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

    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        AbsentMind.setCurrentGame(game); // save in AbsentMind
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        KeyItem[] KeyItemList = GameControl.createKeyItemList();
        game.setKeyItem(KeyItemList);
        
        Clue[] clueList = GameControl.createClueList();
        game.setClue(clueList);
        
        NpcClue[] npcClueList = GameControl.createNpcClueList();
        game.setNpcClue(npcClueList);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveNPCtoStartingLocation(map);
        
    } 

    private static KeyItem[] createKeyItemList() {
        
        KeyItem[] keyItem = 
                new KeyItem[4];
        
       KeyItem key = new KeyItem();
       key.setDescription("Key");
       keyItem[0] = key;
       
       KeyItem membershipCard = new KeyItem();
       membershipCard.setDescription("Gym Membership Card");
       keyItem[1] = membershipCard;
       
       KeyItem phone = new KeyItem();
       phone.setDescription("Your Cellphone, complete with cute kitty keychain");
       keyItem[2] = phone;
       
       KeyItem antidote = new KeyItem();
       antidote.setDescription("The Antidote to your deadly poison");
       keyItem[3] = antidote;
       
       return keyItem;
    }

    private static Clue[] createClueList() {
        Clue[] clue = 
                new Clue[5];
        
       Clue newspaper = new Clue();
       newspaper.setDescription("Your name is written as the author of the front page article.");
       clue[0] = newspaper;
       
       Clue notebook = new Clue();
       notebook.setDescription("Your personal notebook. Has notes about some sort of secret society and a deadly poison.");
       clue[1] = notebook;
       
       Clue lockerCombination = new Clue();
       lockerCombination.setDescription("Locker 462, Combination 10-5-22");
       clue[2] = lockerCombination;
       
       Clue stickyNote = new Clue();
       stickyNote.setDescription("Phone Password: My Name");
       clue[3] = stickyNote;
       
       Clue phoneMessage = new Clue();
       phoneMessage.setDescription("Message: Hurry to the Gym's Sub Basement! You're poisoned and will die by the end of the day!");
       clue[4] = phoneMessage;

       return clue;
    }

    private static NpcClue[] createNpcClueList() {
        NpcClue[] npcClue = 
                new NpcClue[5];
        
       NpcClue oldWoman = new NpcClue();
       oldWoman.setDescription("The Old Woman on the Subway told you that you were in a scuffle trying to be taken to the hospital.");
       npcClue[0] = oldWoman;
       
       NpcClue receptionist = new NpcClue();
       receptionist.setDescription("The receptionist was no help at all, but at least got you in to see the doctor.");
       npcClue[1] = receptionist;
       
       NpcClue dennis = new NpcClue();
       dennis.setDescription("Dr. Dennis revealed that you have a deadly, uncurable poison.");
       npcClue[2] = dennis;
       
       NpcClue guard = new NpcClue();
       guard.setDescription("The security guard recognized you and said that you often go to the third floor.");
       npcClue[3] = guard;
       
       NpcClue member = new NpcClue();
       member.setDescription("The Secret Society member directed you to find the antidote in the red vase.");
       npcClue[4] = member;


       return npcClue;
    }

    static void assignScenesToLocation(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
