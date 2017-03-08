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
public class Clue implements Serializable{
    
    private String clueName;
    private String clueType;
    private String description;
    
    private Game game;
    private Scene[] scene;
            

    public Clue(String newspaper) {
        System.out.println("\n*** Clue() called ***");
    }
    

    public String getClueName() {
        return clueName;
    }

    public void setClueName(String clueName) {
        this.clueName = clueName;
    }

    public String getClueType() {
        return clueType;
    }

    public void setClueType(String clueType) {
        this.clueType = clueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Scene[] getScene() {
        return scene;
    }

    public void setScene(Scene[] scene) {
        this.scene = scene;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.clueName);
        hash = 97 * hash + Objects.hashCode(this.clueType);
        hash = 97 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Clue{" + "clueName=" + clueName + ", clueType=" + clueType + ", description=" + description + '}';
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
        final Clue other = (Clue) obj;
        if (!Objects.equals(this.clueName, other.clueName)) {
            return false;
        }
        if (!Objects.equals(this.clueType, other.clueType)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }
    
    
    
    
    }
  