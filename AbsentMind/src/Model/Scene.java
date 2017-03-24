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
 * @author Kailey
 */
public class Scene implements Serializable{
    
    private String description;
    private double travelTime;
    private String updateDescription;
    private String clueLocation;
    private String interactions;
    private String sceneName;
    private String displaySymbol;
    private boolean blocked;
    
    private NonPlayableCharacter nonPlayableCharacter;
    private Clue[] clue;
    private Location[] location;
    private Game game;
    private NpcClue[] npcClue;
    
    
    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getUpdateDescription() {
        return updateDescription;
    }

    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    public String getClueLocation() {
        return clueLocation;
    }

    public void setClueLocation(String clueLocation) {
        this.clueLocation = clueLocation;
    }

    public String getInteractions() {
        return interactions;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }
    
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public NonPlayableCharacter getNonPlayableCharacter() {
        return nonPlayableCharacter;
    }

    public void setNonPlayableCharacter(NonPlayableCharacter nonPlayableCharacter) {
        this.nonPlayableCharacter = nonPlayableCharacter;
    }

    public Clue[] getClue() {
        return clue;
    }

    public void setClue(Clue[] clue) {
        this.clue = clue;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public NpcClue[] getNpcClue() {
        return npcClue;
    }

    public void setNpcClue(NpcClue[] npcClue) {
        this.npcClue = npcClue;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.description);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.updateDescription);
        hash = 73 * hash + Objects.hashCode(this.nonPlayableCharacter);
        hash = 73 * hash + Objects.hashCode(this.clueLocation);
        hash = 73 * hash + Objects.hashCode(this.interactions);
        hash = 73 * hash + Objects.hashCode(this.displaySymbol);
        hash = 73 * hash + Objects.hashCode(this.sceneName);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", updateDescription=" + updateDescription + ", nonPlayableCharacter=" + nonPlayableCharacter + ", clueLocation=" + clueLocation + ", interactions=" + interactions + ", sceneName=" + sceneName + ", displaySymbol=" + displaySymbol + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.updateDescription, other.updateDescription)) {
            return false;
        }
        if (!Objects.equals(this.nonPlayableCharacter, other.nonPlayableCharacter)) {
            return false;
        }
        if (!Objects.equals(this.clueLocation, other.clueLocation)) {
            return false;
        }
        if (!Objects.equals(this.interactions, other.interactions)) {
            return false;
        }
        if (!Objects.equals(this.sceneName, other.sceneName)) {
            return false;
        }
        return Objects.equals(this.displaySymbol, other.displaySymbol);
    }


    
    
    
    
          
    
}