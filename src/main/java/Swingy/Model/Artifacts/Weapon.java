package Swingy.Model.Artifacts;

import java.util.Random;
import javax.validation.constraints.NotNull;

public class Weapon extends Artifacts {
    @NotNull
   private String weaponNames[] = {"Pikachu", "Mew", "Mewtwo", "Squirtle"};
   Random seed = new Random();

   public Weapon(){
       super();
       this.name = weaponNames[seed.nextInt(4)];
       this.type = "Weapon";
       this.boost = 0;
   }

   public Weapon (int level){
       this.level = level;
       this.boost = (level * 3);
       this.name = weaponNames[seed.nextInt(4)];
       this.type = "Weapon";
   }
}