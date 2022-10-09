public class MeleeWeapon extends Weapon{
    public MeleeWeapon (String weaponName, int weaponDamage){
        super(weaponName, weaponDamage);
    }
    public String toString (){
        return super.toString() + " " + " Weapon damage: " + getWeaponDamage ();
    }

}
