package Swingy.Model.Artifacts;

import java.util.Random;

public class Weapon extends Artifacts {
   private String weaponNames[] = {"Club", "Dagger", "Handaxe", "Spear", "Warhammer"};
   private int addedAttack;
   Random seed = new Random();

   public Weapon(){
       super();
       this.name = weaponNames[seed.nextInt(5)];
       boost = addedAttack = 0;
       this.type = "Weapon";
   }

   public Weapon (int level){
       this.level = level;
       this.name = weaponNames[seed.nextInt(5)];
       this.addedAttack = seed.nextInt(10 * level);
       this.type = "Weapon";
   }

   public Weapon(String name, int addedAttack){
       this.name = name;
       this.type = "Weapon";
       this.addedAttack = addedAttack;
   }

}
