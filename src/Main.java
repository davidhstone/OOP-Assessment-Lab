/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {



    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)



        Monster[] monsters = new Monster[2];
        Monster dragon = new Dragon(3,8);
        Monster zombie = new Zombie(4, 10);
        monsters[0] = dragon;
        monsters[1] = zombie;

      //  String[] monsters = new String[2];

     //   monsters[0] = "Dragon";
      //  monsters[1] = "Zombie";


        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for (Monster monster : monsters) {

                System.out.println(monster.aboutMe());
        }

  //      Monster aDragon = new Monster();
   //     aDragon.aboutMe();
    }
}
