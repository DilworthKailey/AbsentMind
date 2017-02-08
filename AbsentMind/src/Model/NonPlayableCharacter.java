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
public class NonPlayableCharacter implements Serializable{
    
    private String name;
    private String npcDescription;
    private String dialogue;
    private String npcClue;

    public NonPlayableCharacter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNpcDescription() {
        return npcDescription;
    }

    public void setNpcDescription(String npcDescription) {
        this.npcDescription = npcDescription;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    public String getNpcClue() {
        return npcClue;
    }

    public void setNpcClue(String npcClue) {
        this.npcClue = npcClue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.npcDescription);
        hash = 97 * hash + Objects.hashCode(this.dialogue);
        hash = 97 * hash + Objects.hashCode(this.npcClue);
        return hash;
    }

    @Override
    public String toString() {
        return "NonPlayableCharacter{" + "name=" + name + ", npcDescription=" + npcDescription + ", dialogue=" + dialogue + ", npcClue=" + npcClue + '}';
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
        final NonPlayableCharacter other = (NonPlayableCharacter) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.npcDescription, other.npcDescription)) {
            return false;
        }
        if (!Objects.equals(this.dialogue, other.dialogue)) {
            return false;
        }
        if (!Objects.equals(this.npcClue, other.npcClue)) {
            return false;
        }
        return true;
    }

    
   
    
}