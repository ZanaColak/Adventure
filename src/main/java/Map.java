public class Map {
    public Room currentRoom; //Attribut

    /*public Room getCurrentRoom (){

        return currentRoom;
    }

    public void setCurrentRoom (Room room){

        this.currentRoom = currentRoom;
    }*/

    public Map() { //Konstruktør
        Room room1 = new Room("Room 1 ", "Room with no distinct features, East & South");
        Room room2 = new Room("Room 2 ", "Room with no distinct features, East & West");
        Room room3 = new Room("Room 3 ", "Room with no distinct features, West & South");
        Room room4 = new Room("Room 4 ", "Room with no distinct features, North & South");
        Room room5 = new Room("Room 5 ", "Room with no distinct features, South");
        Room room6 = new Room("Room 6 ", "Room with no distinct features, North & South");
        Room room7 = new Room("Room 7 ", "Room with no distinct features, North & East");
        Room room8 = new Room("Room 8 ", "Room with no distinct features, East & West & North");
        Room room9 = new Room("Room 9 ", "Room with no distinct features, North & West");

        // Room bliver forbundet med en setmetode
        currentRoom = room1;
        room1.setEast(room2);
        room1.setSouth(room4);


        room2.setEast(room3);
        room2.setWest(room1);

        room3.setSouth(room6);
        room3.setWest(room2);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);


        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);

        room9.setNorth(room6);
        room9.setWest(room8);
    }
}
