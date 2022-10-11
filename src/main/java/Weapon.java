public abstract class Weapon extends Item {
    private int weaponDamage;

    public Weapon (String weaponName, int weaponDamage){
        super(weaponName); //Super fungere lidt ligesom keyword "This"
        this.weaponDamage = weaponDamage;
    }
    public abstract int reaminingUses ();

    public int getWeaponDamage (){
        return weaponDamage;
    }
    public String toString (){
        return getItemName() + " " + weaponDamage + " ";
    }
}
