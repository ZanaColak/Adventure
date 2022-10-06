public class Food extends Item {
    private int health;

    public Food(String itemName, int health) {
        super(itemName);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String toString (){
        return super.toString() + " " + health;
    }
}
