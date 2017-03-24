/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exception.MapControlException;
import Exception.GameControlException;
import Model.Clue;
import Model.Player;
import absentmind.AbsentMind;
import Model.Game;
import Model.KeyItem;
import Model.Location;
import Model.Map;
import Model.NpcClue;
import Model.Scene;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Kailey
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

    public static void createNewGame(Player player) throws MapControlException {
        
        Game game = new Game(); // create new game
        AbsentMind.setCurrentGame(game); // save in AbsentMind
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        ArrayList<KeyItem> KeyItemList = GameControl.createKeyItemList();
        game.setKeyItem(KeyItemList);
        
        ArrayList<Clue> ClueList = GameControl.createClueList();
        game.setClue(ClueList);
        
        ArrayList<NpcClue> NpcClueList = GameControl.createNpcClueList();
        game.setNpcClue(NpcClueList);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveNPCtoStartingLocation(map);
        MapControl.movePlayertoStartingLocation(map);
        
    } 

    public static ArrayList<KeyItem> createKeyItemList() {
        
        ArrayList<KeyItem> keyItem = new ArrayList<>();
        
        KeyItem key = new KeyItem("Key", "The unmarked key you found in your pocket. It appears to be a door key.");
        keyItem.add(key);
        
        keyItem.add(new KeyItem("Gym Membership Card", "A membership card to Gym Neighbors with your name on it."));
        keyItem.add(new KeyItem("Cellphone", "The cellphone you found in your coat pocket. It is password protected."));
        keyItem.add(new KeyItem("Antidote", "The antidote to your poison."));

       return keyItem;
    }

    private static ArrayList<Clue> createClueList() {
        
        ArrayList<Clue> clue = new ArrayList<>();
        
        Clue newspaper = new Clue("Newspaper", "Newspaper from the Big City Gazette. The front page article was written by you.");
        clue.add(newspaper);
        
        clue.add(new Clue("Notebook", "Notebook info tbd"));
        clue.add(new Clue("Locker Combination", "A sticky note with your Gym locker number and combination on it."));
        clue.add(new Clue("Sticky Note", "A sticky note explaining the phone password puzzle."));
        clue.add(new Clue("Phone Message", "Phone message info tbd"));

       return clue;
    }

    private static ArrayList<NpcClue> createNpcClueList() {
        
        ArrayList<NpcClue> npcClue = new ArrayList<>();
        
        NpcClue oldWoman = new NpcClue("Old Woman", "Clue obtained from the old woman on the subway.");
        npcClue.add(oldWoman);
        
        npcClue.add(new NpcClue("Receptionist", "Hospital Receptionist gave you no new information."));
        npcClue.add(new NpcClue("Dr. Dennis", "Dr. Dennis told you that you were poisoned."));
        npcClue.add(new NpcClue("Security Guard", "Info from the security guard goes here."));
        npcClue.add(new NpcClue("Society Member", "Missing info from Society Member goes here."));
        
       return npcClue;
    }

    public static void saveGame(Game game, String filepath) throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filepath) throws GameControlException {
        
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        AbsentMind.setCurrentGame(game);

    }
    
    
    
   
    
}
