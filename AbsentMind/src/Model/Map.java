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
 * @author J.D.
 */
public class Map implements Serializable {
    private String mapType;
    private double rowCount;
    private double columnCount;
    private double currentRow;
    private double currentColumn;
    private double currentScene;
    
    private Location location;
    private Game game;
    

    public Map() {
    }
    
    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
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

    public double getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(double currentScene) {
        this.currentScene = currentScene;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.mapType);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.currentRow) ^ (Double.doubleToLongBits(this.currentRow) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.currentColumn) ^ (Double.doubleToLongBits(this.currentColumn) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.currentScene) ^ (Double.doubleToLongBits(this.currentScene) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "mapType=" + mapType + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", currentScene=" + currentScene + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentRow) != Double.doubleToLongBits(other.currentRow)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentColumn) != Double.doubleToLongBits(other.currentColumn)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentScene) != Double.doubleToLongBits(other.currentScene)) {
            return false;
        }
        if (!Objects.equals(this.mapType, other.mapType)) {
            return false;
        }
        return true;
    }
    
    
    
    
}