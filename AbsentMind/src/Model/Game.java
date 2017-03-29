/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Game implements Serializable{
    private int currentRow;
    private int currentColumn;
    private double timeExpired;
    private double timeRemaining;
    
    private NonPlayableCharacter[] nonPlayableCharacter;
    
    private Map map;
    private Player player;
    

    public Game() {
    }
    
    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public double getTimeExpired() {
        return timeExpired;
    }

    public void setTimeExpired(double timeExpired) {
        this.timeExpired = timeExpired;
    }

    public double getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(double timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public NonPlayableCharacter[] getNonPlayableCharacter() {
        return nonPlayableCharacter;
    }

    public void setNonPlayableCharacter(NonPlayableCharacter[] nonPlayableCharacter) {
        this.nonPlayableCharacter = nonPlayableCharacter;
    }

  

    public Map getMap() {
        return map;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.currentRow) ^ (Double.doubleToLongBits(this.currentRow) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.currentColumn) ^ (Double.doubleToLongBits(this.currentColumn) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.timeExpired) ^ (Double.doubleToLongBits(this.timeExpired) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.timeRemaining) ^ (Double.doubleToLongBits(this.timeRemaining) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", timeExpired=" + timeExpired + ", timeRemaining=" + timeRemaining + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.currentRow) != Double.doubleToLongBits(other.currentRow)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentColumn) != Double.doubleToLongBits(other.currentColumn)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeExpired) != Double.doubleToLongBits(other.timeExpired)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeRemaining) != Double.doubleToLongBits(other.timeRemaining)) {
            return false;
        }
        return true;
    }

    public void setMap(Map map) {
       this.map = map;
    }
    
    
    
}
