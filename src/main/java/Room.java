import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;
    private String item;

    private ArrayList<Item> items = new ArrayList<Item>();

    //Konstruktør
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Set metoder
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    //Get metoder
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public Room getSouth() {
        return south;
    }
    public void addItems (Item item){
        items.add(item);
    }
    public String getItem (String itemName){
        for (Item item : items) {
            if (item.getItemName().equals(itemName)) {
                items.add(item);
            }
        }
        return null;
    }
    public Item findItem (String itemName){
        for (Item item : items) {
            if (item.getItemName().equals(itemName)) {
                return item;
            }
        }
    return null;
    }
}

