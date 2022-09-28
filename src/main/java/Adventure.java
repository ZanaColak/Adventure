public class Adventure {
    //Attribut
    // private Room currentRoom;
    //Map map = new Map();

    /*public Adventure() { // Konstruktør

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
        Map.currentRoom = room1;
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
        room9.setWest(room8);*/


        //Metode til at flytte
        public boolean goNorth () {
            if (Map.currentRoom.getNorth() == null) {
                return false;
            } else {
                Map.currentRoom = Map.currentRoom.getNorth();
                return true;
            }

        }

        public boolean goEast () {
            if (Map.currentRoom.getEast() == null) {
                return false;
            } else {
                Map.currentRoom = Map.currentRoom.getEast();
                return true;
            }
        }

        public boolean goWest () {
            if (Map.currentRoom.getWest() == null) {
                return false;
            } else {
                Map.currentRoom = Map.currentRoom.getWest();
                return true;
            }
        }

        public boolean goSouth () {
            if (Map.currentRoom.getSouth() == null) {
                return false;
            } else {
                Map.currentRoom = Map.currentRoom.getSouth();
                return true;
            }
        }

        public void lookRoom () {
            System.out.println("You are in " + Map.currentRoom.getName() + "\n" + Map.currentRoom.getDescription());
        }

        public void handleRoomDirection (boolean goDirection, String direction){
            if (goDirection) {
                System.out.println("You are going: " + direction + "\nYou are now in " + Map.currentRoom.getName() + "\n" + Map.currentRoom.getDescription());
            } else {
                System.out.println("You cannot go this way");
            }
        }
    //}
}
