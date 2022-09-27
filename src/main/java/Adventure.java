public class Adventure {
    private Room startRoom;

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

        startRoom = room1;
        room1.setEast(room2);
        room1.setSouth(room4);

    }
}
