/*
 na podstawie 13.2.2. Listy tablicowe str. 684, kod 691 - Horstmann (część I wyd. polskie) 
    pomoc: https://www.cs.usfca.edu/~galles/visualization/Algorithms.html
 */
package Horstmann.Zad24;

import java.util.Objects;

public class Item implements Comparable<Item> {

    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item[" + "description=" + description + ", partNumber=" + partNumber + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;    
        if (getClass() != otherObject.getClass()) return false;  
        Item other = (Item) otherObject;
        if (this.partNumber != other.partNumber) {
            return false;
        }
        return Objects.equals(description, other.description) && partNumber == 
        other.partNumber; 
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }
    @Override
    public int compareTo(Item other) {
        return Integer.compare(partNumber, other.partNumber);
    }

    
    
    
    
    
}
