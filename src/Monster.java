/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 
    private int mHealth;
    private int mDamage;

    public Monster (int health, int damage) {
        mHealth = health;
        mDamage = damage;
    }

    public int getmHealth() {
        return mHealth;
    }

    public int getmDamage() {
        return mDamage;
    }

    public abstract String aboutMe();

}
