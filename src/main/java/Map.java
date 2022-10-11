public class Map {

    Room room1 = new Room("Room 1 ", "The room where it all has to begin, there is some great items in this room, only because it is the first room, lucky you!");
    Room room2 = new Room("Room 2 ", "In this room, there is no food, but there is some great items, that you might need further in this game");
    Room room3 = new Room("Room 3 ", "In this room, there is a great item and food, but be careful, there is a chance for it to be unhealthy");
    Room room4 = new Room("Room 4 ", "This is the most exciting room in this adventure! Kali-sticks yeah i know what you are thinking, durum? and shoes?, it is hard to choose one i know, so don't stress, take a break and think");
    Room room5 = new Room("Room 5 ", "The room where you are stuck, you only have one direction. There is food in this room, but choose wisely if you want to eat it, there is rumors about the berries in this room");
    Room room6 = new Room("Room 6 ", "Welcome to the most depressing room in this adventure, there is no food, weapons or useful items. I hope that you have something saved in your bag, otherwise i wish you good luck");
    Room room7 = new Room("Room 7 ", "There is a great great item in this room, i will not say if it is the mushrooms or the item. Choose wisely, it can affect your whole adventure");
    Room room8 = new Room("Room 8 ", "The room where you have a lot of choices in direction, but not with items. There is only a gun in this room, but it is not (just) a gun, so be careful");
    Room room9 = new Room("Room 9 ", "Be careful!, there is spiders in this room. Use your brain, maybe you can take it, and use it against an enemy or you can just take the gun. There is also food from McD, (i know it looks great) but look at your healtlevel before you eat it");

    public Map() {
        // Room bliver forbundet med en setmetode
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

        room1.addItemToRoom("bag");
        room1.addItemToRoom("insect");
        room2.addItemToRoom("torch");
        room2.addItemToRoom("coin");
        room3.addItemToRoom("rusty sword");
        room4.addItemToRoom("shoes");
        room5.addItemToRoom("treasure chest");
        room7.addItemToRoom("shield");
        room9.addItemToRoom("spiders");

        //Food Objects
        room1.addFoodToRoom("apple", 66);
        room3.addFoodToRoom("banana", 76);
        room4.addFoodToRoom("durum", 40);
        room5.addFoodToRoom("berries", -48);
        room7.addFoodToRoom("mushrooms", -79);
        room9.addFoodToRoom("big mac", 32);

        //Weapons objects
        room1.addMeleeWeaponsToRoom("knife", 50);
        room2.addRangedWeaponsToRoom("ak-47", 75, 2);
        room4.addMeleeWeaponsToRoom("kali-sticks", 35);
        room5.addRangedWeaponsToRoom("sniper", 100, 1);
        room8.addRangedWeaponsToRoom("m-13", 85, 3);
        room9.addRangedWeaponsToRoom("desert eagle", 65, 1);
    }

    public Room getStarterRoom() {
        return room1;
    }

}

