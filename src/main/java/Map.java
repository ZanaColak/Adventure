public class Map {

    Room room1 = new Room("Room 1 ", "Room with no distinct features, East & South");
    Room room2 = new Room("Room 2 ", "Room with no distinct features, East & West");
    Room room3 = new Room("Room 3 ", "Room with no distinct features, West & South");
    Room room4 = new Room("Room 4 ", "Room with no distinct features, North & South");
    Room room5 = new Room("Room 5 ", "Room with no distinct features, South");
    Room room6 = new Room("Room 6 ", "Room with no distinct features, North & South");
    Room room7 = new Room("Room 7 ", "Room with no distinct features, North & East");
    Room room8 = new Room("Room 8 ", "Room with no distinct features, East & West & North");
    Room room9 = new Room("Room 9 ", "Room with no distinct features, North & West");

    Item item1 = new Item("bag");
    Item item2 = new Item("torch");
    Item item3 = new Item("coin");
    Item item4 = new Item("rusty sword");
    Item item5 = new Item("treasure chest");
    Item item6 = new Item("lost shoes");
    Item item7 = new Item("hat");
    Item item8 = new Item("teddy bear");
    Item item9 = new Item("painting");
    public Map() {

        // Room bliver forbundet med en setmetode
        //room1 = player.getCurrentRoom();
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItem(item1);

        room2.setEast(room3);
        room2.setWest(room1);
        room2.addItem(item2);

        room3.setSouth(room6);
        room3.setWest(room2);
        room3.addItem(item3);

        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.addItem(item4);

        room5.setSouth(room8);
        room5.addItem(item5);

        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.addItem(item6);

        room7.setNorth(room4);
        room7.setEast(room8);
        room7.addItem(item7);

        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room8.addItem(item8);

        room9.setNorth(room6);
        room9.setWest(room8);
        room9.addItem(item9);

    }

    public Room getStarterRoom() {

        return room1;
    }

}

