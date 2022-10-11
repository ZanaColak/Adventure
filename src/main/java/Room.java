import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;

    private ArrayList<Item> items = new ArrayList<>();

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

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItemToRoom(String itemName) {
        items.add(new Item(itemName));
    }

    public void addFoodToRoom(String foodName, int health) { //adder food objekter til map klassen
        items.add(new Food(foodName, health));
    }
    public void addMeleeWeaponsToRoom(String weaponName, int weaponDamage){ //Adder vi våben objekter til map klassen
        items.add(new MeleeWeapon(weaponName, weaponDamage));
    }
    public void addRangedWeaponsToRoom(String weaponName, int weaponDamage, int ammo){ //Adder vi våben objekter til map klassen
        items.add(new RangedWeapon(weaponName, weaponDamage,ammo));
    }
    public ArrayList<Item> getItemList() {
        return items;
    }


    public void removeItem(Item item) { //Fjerner vi items
        items.remove(item);
    }

    public String getItem(String itemName) { //Get metode til items
        for (Item item : items) {
            if (item.getItemName().equals(itemName)) {
                items.add(item);
            }
        }
        return null;
    }

    public Item findItem(String itemName) { // Finder vi items
        for (Item item : items) {
            if (item.getItemName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }


    @Override
    public String toString() { //To String metode
        return name + "\n" + description + "\n" + "Items: " + items + " \n";
    }


}

