public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room (String name, String description){
        this.name = name;
        this.description = description;
    }

    public void setName(){
        name = name;

    }
    public void setDescription(){
        description = description;
    }
    public void setNorth (){
        north = north;
    }
    public void setEast (){
        east = east;
    }
    public void setWest (){
        west = west;
    }
    public void setSouth (){
        south = south;
    }
    public Room getNorth() {
        return north;
    }
    public Room getEast (){
        return east;
    }
    public Room getWest (){
        return west;
    }
    public Room getSouth (){
        return south;
    }
}
