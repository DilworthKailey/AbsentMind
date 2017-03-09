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
 * @author Josh
 */
public class NpcClue implements Serializable{
   
    private String npcClueName;
    private String description;
    


//    public NpcClue(String description) {
//        //System.out.println("\n*** NpcClue() called ***");
//        this.description = description;
//    }
    
    public NpcClue(String npcClueName, String description) {
        //System.out.println("\n*** NpcClue() called ***");
        this.npcClueName = npcClueName;
        this.description = description;
        
    }
    
    public String getNpcClueName() {
        return npcClueName;
    }

    public void setNpcClueName(String npcClueName) {
        this.npcClueName = npcClueName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.npcClueName);
        hash = 97 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "NPCClue{" + "npcClueName=" + npcClueName + ", description=" + description + '}';
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
        final NpcClue other = (NpcClue) obj;
        if (!Objects.equals(this.npcClueName, other.npcClueName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
   
    
}
