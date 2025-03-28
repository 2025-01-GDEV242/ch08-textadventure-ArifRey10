import java.util.HashMap;
import java.util.ArrayList;
/**
 * Write a description of class Item here.
 * These are the items of the Game
 * @author Arif Reyhan
 * @version 2025.03.28
 */
public class Item
{
    private String description;
    private double weight;

    public Item(String description, double weight) {
        this.description = description;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return description + " (Weight: " + weight + " kg)";
    }
}

 
