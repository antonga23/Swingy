package Swingy.Model.Artifacts;

import java.util.Random;
import javax.validation.constraints.NotNull;

public class Armour extends Artifacts {
    @NotNull
    private String armourNames[] = {"None", "Metal Coat", "King's Rock", "Dragon Scale"};
    Random seed = new Random();

    public Armour(){
        super();
        this.name = armourNames[seed.nextInt(4)];
        this.type = "Armour";
        this.boost = 0;
        System.out.println("default armour construct called");
    }

    public Armour (int level){
        this.level = level;
        this.boost = (level * 3);
        this.name = armourNames[seed.nextInt(4)];
        this.type = "Weapon";
    }
}