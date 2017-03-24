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
    private String description;
    

            

//    public Clue(String description) {
//        //System.out.println("\n*** Clue() called ***");
//        this.description = description;
//    }
    
    public Clue(String ClueName, String description) {
        //System.out.println("\n*** Clue() called ***");
        this.clueName = clueName;
        this.description = description;
    }

    public String getClueName() {
        return clueName;
    }

    public void setClueName(String clueName) {
        this.clueName = clueName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.clueName);
        
        hash = 97 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Clue{" + "clueName=" + clueName + ", description=" + description + '}';
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
        
        return Objects.equals(this.description, other.description);
    }
    
    
    
    
    }
  