public class Weapon extends Item {
    private String weaponName;
    private int weaponDamage;

    public Weapon (String weaponName, int weaponDamage){
        super(weaponName); //Super fungere lidt ligesom keyword "This"
        this.weaponDamage = weaponDamage;
    }
    public int getWeaponDamage (){
        return weaponDamage;
    }
    public String toString (){
        return weaponName + " " + weaponDamage + " ";
    }
}
