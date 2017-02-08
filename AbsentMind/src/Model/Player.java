/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Kailey
 */
public class Player implements Serializable{
    
    private String name;
    private double bestTime;
    private String endingType;

    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public String getEndingType() {
        return endingType;
    }

    public void setEndingType(String endingType) {
        this.endingType = endingType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.endingType);
        return hash;
    }
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + ", endingType=" + endingType + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.endingType, other.endingType);
    }

    
    
    
    
    
    
}