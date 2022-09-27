public class Adventure {
    private Room currentRoom;

    public Adventure() {

        Room room1 = new Room("Romm 1", "Room with no distinct features, East & South");
        Room room2 = new Room("Romm 2", "Room with no distinct features, East & West");
        Room room3 = new Room("Romm 3", "Room with no distinct features, West & South");
        Room room4 = new Room("Romm 4", "Room with no distinct features, North & South");
        Room room5 = new Room("Romm 5", "Room with no distinct features, South");
        Room room6 = new Room("Romm 6", "Room with no distinct features, North & South");
        Room room7 = new Room("Romm 7", "Room with no distinct features, North & East");
        Room room8 = new Room("Romm 8", "Room with no distinct features, East & West");
        Room room9 = new Room("Romm 9", "Room with no distinct features, North & West");

        currentRoom = room1;
        room1.setEast(room2);
        room1.setSouth(room4);

        currentRoom = room2;
        room2.setEast(room2);
        room2.setSouth(room4);

        currentRoom = room3;
        room3.setEast(room2);
        room3.setSouth(room4);

        currentRoom = room4;
        room4.setEast(room2);
        room4.setSouth(room4);

        currentRoom = room5;
        room5.setEast(room2);

        currentRoom = room6;
        room6.setSouth(room4);
        room6.setEast(room2);

        currentRoom = room7;
        room7.setSouth(room4);

    }
}
