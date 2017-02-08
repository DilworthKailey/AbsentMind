/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Game implements Serializable{
    private double currentRow;
    private double currentColumn;
    private double timeExpired;
    private double timeRemaining;

    public Game() {
    }
    
    public double getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(double currentRow) {
        this.currentRow = currentRow;
    }

    public double getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(double currentColumn) {
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
    
    
    
}
