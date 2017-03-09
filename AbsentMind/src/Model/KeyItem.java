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
public class KeyItem implements Serializable{
    
    private String keyItemType;
    private String description;
    
    private Game game;
    private Scene[] scene;

//    public KeyItem(String description) {
//       // System.out.println("\n*** KeyItem() called ***");
//       this.description = description;
//    }

    public KeyItem(String KeyItemType, String description) {
       // System.out.println("\n*** KeyItem() called ***");
       this.keyItemType = keyItemType;
       this.description = description;
    }

    public String getKeyItemType() {
        return keyItemType;
    }

    public void setKeyItemType(String keyItemType) {
        this.keyItemType = keyItemType;
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
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.keyItemType);
        hash = 59 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "KeyItem{" + "keyItemType=" + keyItemType + ", description=" + description + '}';
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
        final KeyItem other = (KeyItem) obj;
        if (!Objects.equals(this.keyItemType, other.keyItemType)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }    
    
}