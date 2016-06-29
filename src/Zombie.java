/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster {

    public Zombie (int health, int damage) {
        super(health, damage);

    }
    //   Monster aDragon = new Monster();
    //   aDragon.aboutMe();

    //int aDragon.setmHealth() = 3;
    //int aDragon.setmDamage() = 8;


    public String aboutMe(){
     /*   aDragon.getmHealth();
        aDragon.getDamage();   */
        return ("I am a zombie with " + super.getmHealth() + "health and do " + super.getmDamage() +"damage!");

    }

}
