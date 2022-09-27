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
        Room room8 = new Room("Romm 8", "Room with no distinct features, East & West & North");
        Room room9 = new Room("Romm 9", "Room with no distinct features, North & West");

        currentRoom = room1;
        room1.setEast(room2);
        room1.setSouth(room4);

        currentRoom = room2;
        room2.setEast(room3);
        room2.setWest(room1);

        currentRoom = room3;
        room3.setSouth(room6);
        room3.setWest(room2);

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
        room7.setEast(room2);

        currentRoom = room8;
        room8.setSouth(room4);
        room8.setEast(room2);

        currentRoom = room9;
        room9.setEast(room2);
        room9.setSouth(room4);



    }
}
