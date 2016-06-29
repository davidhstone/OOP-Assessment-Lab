/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster {

    public Dragon (int health, int damage) {
        super(health, damage);

    }
 //   Monster aDragon = new Monster();
 //   aDragon.aboutMe();

    //int aDragon.setmHealth() = 3;
    //int aDragon.setmDamage() = 8;


    public String aboutMe(){
     /*   aDragon.getmHealth();
        aDragon.getDamage();   */
        return ("I am a dragon with " + super.getmHealth() + "health and do " + super.getmDamage() +"damage!");

    }

}
