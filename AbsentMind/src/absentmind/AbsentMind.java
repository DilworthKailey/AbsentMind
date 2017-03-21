/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absentmind;

import Control.AntidoteControl;
import Model.Location;
import Model.Game;
import Model.Player;
import Model.Scene;
import Model.Clue;
import Model.Map;
import Model.NonPlayableCharacter;
import Model.KeyItem;
import View.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Josh
 */
public class AbsentMind {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        AbsentMind.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        AbsentMind.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        AbsentMind.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        AbsentMind.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        AbsentMind.logFile = logFile;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            AbsentMind.inFile = 
                       new BufferedReader(new InputStreamReader(System.in));
            AbsentMind.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            AbsentMind.logFile = new PrintWriter(filePath);
           
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;
        } catch (Throwable te){
            System.out.println("Exception: " + te.toString() +
                               "\nCause: " + te.getCause() + 
                               "\nMessage: " + te.getMessage());
            te.printStackTrace();
        }
        
        finally {
            try {
                if(AbsentMind.inFile != null)
                   AbsentMind.inFile.close();
                
                if(AbsentMind.outFile != null)
                   AbsentMind.outFile.close();
                
                if(AbsentMind.logFile != null)
                   AbsentMind.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
        
        
//        double weightTest = AntidoteControl.calcWeightInKilograms(50);
//        System.out.println("Calc weight equals " + weightTest);
//        Player playerOne = new Player();
//        
//        playerOne.setName("John Doe");
//        playerOne.setBestTime(7.00);
//        playerOne.setEndingType("You died.");
//        
//        String playerInfo = playerOne.toString();
//        System.out.println(playerInfo);
//        
//        Clue newClue = new Clue();
//        
//        newClue.setClueName("Sword");
//        newClue.setClueType("Weapon");
//        newClue.setDescription("A samurai sword left behind.");
//        
//        String clueInfo = newClue.toString();
//        System.out.println(clueInfo);
//        
//        Scene newScene = new Scene();
//        
//        newScene.setDescription("The first car of the subway");
//        newScene.setTravelTime(25);
//        newScene.setUpdateDescription("There is an old woman staring at you intently.");
//        newScene.setNonPlayableCharacter("Old Lady");
//        newScene.setClueLocation("Shoe");
//        newScene.setInteractions("Jump out of Train");
//        newScene.setSceneName("Subway Doors");
//        newScene.setDisplaySymbol("ASCII Art");
//        
//        String sceneInfo = newScene.toString();
//        System.out.println(sceneInfo);
//        
//        Map map = new Map();
//        
//        map.setMapType("subway");
//        map.setColumnCount(9);
//        map.setRowCount(4);
//        map.setCurrentColumn(0);
//        map.setCurrentRow(0);
//        map.setCurrentScene(0);
//        
//        String mapInfo = map.toString();
//        System.out.println(mapInfo);
//        
//        Location here = new Location();
//        
//        here.setRow(1);
//        here.setColumn(1);
//        here.setVisited("Y");
//        
//        String Here = here.toString();
//        System.out.println(Here);
//        
//        KeyItem keyItem = new KeyItem();
//        
//        keyItem.setKeyItemType("Key");
//        keyItem.setDescription("rusty skeleton key");
//        
//        String myItem = keyItem.toString();
//        System.out.println(myItem);
//        
//        NonPlayableCharacter npcOne = new NonPlayableCharacter();
//        
//        npcOne.setNpcDescription("Tall, slender chef with a fat, bulbous nose.");
//        npcOne.setName("Gaston");
//        npcOne.setDialogue("Here, have a crossant!");
//        npcOne.setNpcClue("You bite down, nearly breaking your teeth on what appears to be a rusty skeleton key.");
//        
//        String npcInfo = npcOne.toString();
//        System.out.println(npcInfo);



        
    }
    
} 
