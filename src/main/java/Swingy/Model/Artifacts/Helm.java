package Swingy.Model.Artifacts;

import java.util.Random;
import javax.validation.constraints.NotNull;

public class Helm extends Artifacts {
    @NotNull
    private String helmNames[] = {"Potion", "Metal Coat", "King's Rock", "Dragon Scale"};
    Random seed = new Random();

    public Helm(){
        super();
        this.name = helmNames[seed.nextInt(4)];
        this.type = "helm";
        this.boost = 0;
    }

    public Helm (int level){
        this.level = level;
        this.boost = (level * 3);
        this.name = helmNames[seed.nextInt(4)];
        this.type = "Weapon";
    }
}