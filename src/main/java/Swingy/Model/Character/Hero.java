package Swingy.Model.Character;
import javax.validation.constraints.NotNull;
import Swingy.Model.Artifacts.*;
import lombok.Getter;
import lombok.Setter;

public class Hero extends Character{
    @NotNull @Getter @Setter
    protected String heroClass;
    @Getter @Setter
    protected int level;
    @Getter @Setter
    protected int currentExperience;
    @Getter @Setter
    protected int currentHitPpoints;
    @Getter @Setter
    protected Armour armour;
    @Getter @Setter
    protected Weapon weapon;
    @Getter @Setter
    protected Helm helm;

    public Hero(String heroName, int attack, int defense, int hitPoints, String heroClass) {
        super(heroName, attack, defense, hitPoints);
        this.level = 1;
        this.currentExperience = 0;
        this.heroClass = heroClass;
        this.currentHitPpoints = hitPoints;
    }
}
