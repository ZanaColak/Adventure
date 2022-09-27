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
}
