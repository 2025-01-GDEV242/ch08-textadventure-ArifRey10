import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Player here.
 *
 * @author Arif
 * @version 2025.03.28
 */
public class Player {
    private String name;
    private String currentRoom;
    private Item carriedItem;
    
    public Player(String name, String startingRoom) {
        this.name = name;
        this.currentRoom = startingRoom;
        this.carriedItem = null;
    }

    public String getName() {
        return name;
    }

    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }
    
    public Item getCarriedItem() {
        return carriedItem;
    }
    
     public void setCarriedItem(Item item) {
        this.carriedItem = item;
    }
    
     public void dropItem() {
        carriedItem = null; // Drop the current item
    }
    
    @Override
    public String toString() {
    // Start with the name and current room
    String status = name + " is currently in: " + currentRoom;
    
    // Check if the player is carrying an item
    if (carriedItem != null) {
        status += " and carrying " + carriedItem.getName(); 
        // If carrying an item, append its name
    } else {
        status += " and not carrying any items";
        // Otherwise, state they're not carrying anything
    }
    
    return status;
    }
}
