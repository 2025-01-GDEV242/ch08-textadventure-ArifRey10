import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Arif Reyhan
 * @version 2025.03.25
 */

public class Room {
    private String description;
    private Item item;  // The item in the room
    private HashMap<String, Room> exits;

    public Room(String description) {
        this.description = description;
        exits = new HashMap<>();
        item = null; // No item by default
    }

    public String getDescription() {
        return description;
    }

    public String getLongDescription() {
        return "You are " + description;
    }

    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public void setItem(Item item) {
        this.item = item;  // Place an item in the room
    }

    public Item getItem() {
        return item;  // Get the item in the room
    }

    public void removeItem() {
        this.item = null;  // Remove the item from the room
    }
}
