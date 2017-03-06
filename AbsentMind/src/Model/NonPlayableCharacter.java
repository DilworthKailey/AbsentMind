/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author David
 */
public enum NonPlayableCharacter implements Serializable{
    
    OldWoman("An old woman riding the subway train. She is unnerved by your presence."),
    Receptionist("An uninterested hospital receptionist. Wishes it was the end of their shift."),
    Dennis("A doctor with a PhD. in hospital stuff. Can't figure out what's wrong with you."),
    SecurityGuard("A friendly middle-aged man who seems slightly bored."),
    SocietyMember("The newest member of the secret society. Doesn't know you're not supossed to be there.");
    
    
    private final String description;
    private final String name;
    private final String dialogue;
    private final String npcClue;
    private final Point coordinates;
    
    private Game game;
    private Scene scene;

    public NonPlayableCharacter(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public String getDialogue() {
        return dialogue;
    }

    public String getNpcClue() {
        return npcClue;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
   
    

    @Override
    public String toString() {
        return "NonPlayableCharacter{" + "name=" + name + ", description=" + description + ", dialogue=" + dialogue + ", npcClue=" + npcClue + '}';
    }
 
}