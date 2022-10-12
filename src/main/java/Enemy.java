public class Enemy {
    //Attributes
    private String enemyName;
    private int enemyHealth;
    private int enemyDamage;
    private String enemyWeapon;

    public Enemy (String enemyName, int enemyHealthValue, int enemyDamagem, String enemyWeapon){ //Constructor
        this.enemyName = enemyName;
        this.enemyHealth = enemyHealthValue;
        this.enemyDamage = enemyDamage;
        this.enemyWeapon = enemyWeapon;
    }
    public String getEnemyName (){
        return enemyName;
    }
    public int getEnemyHealth (){
        return enemyHealth;
    }
    public int getEnemyDamage (){
        return enemyDamage;
    }
    public String getEnemyWeapon (){
        return enemyWeapon;
    }

    @Override
    public String toString() {
        return "Enemy{" + "enemyName:'" + enemyName + '\'' + ", enemyHealth:" + enemyHealth + ", enemyDamage:" + enemyDamage + ", enemyWeapon:'" + enemyWeapon + '\'' + '}';
    }
}

