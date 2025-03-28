import java.util.HashMap;
import java.util.ArrayList;
/**
 * Write a description of class Item here.
 * These are the items of the Game
 * @author Arif Reyhan
 * @version 2025.03.28
 */
public class Item {
    private String name;       // Name of the item
    private String description; // Description of the item
    private double weight;      // Weight of the item
    
    // Constructor to initialize the item with name, description, and weight
    public Item(String name, String description, double weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    // Getter for the name of the item
    public String getName() {
        return name;
    }

    // Getter for the description of the item
    public String getDescription() {
        return description;
    }

    // Getter for the weight of the item
    public double getWeight() {
        return weight;
    }

    // Setters (optional) in case we need to change properties of an item later
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // To display the item in a readable way (including its name and weight)
    @Override
    public String toString() {
        return name + " (" + description + ", Weight: " + weight + " kg)";
    }
}

 
