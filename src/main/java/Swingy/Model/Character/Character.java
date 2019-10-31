package Swingy.Model.Character;

import javax.validation.constraints.NotNull;
import Swingy.Model.*;
import Swingy.Model.Utils.Map;
import lombok.Getter;
import lombok.Setter;

public abstract class Character {

    @NotNull @Getter @Setter
    protected String heroName;

    protected int level;
    @Getter @Setter
    protected int experience;
    @Getter @Setter
    protected int attack;
    @Getter @Setter
    protected int defense;
    @Getter @Setter
    protected int hitPoints;
    @Getter @Setter
    protected Map map;

    public Character() {
    }

    public Character(String heroName, int attack, int defense, int hitPoints) {
        this.heroName = heroName;
        this.attack = attack;
        this.defense = defense;
        this.hitPoints = hitPoints;
        this.map = new Map();
        this.experience = 1000;
    }

    public Character(String heroName, int attack, int defense, int hitPoints, Map map, int experience) {
        this.heroName = heroName;
        this.attack = attack;
        this.defense = defense;
        this.hitPoints = hitPoints;
        this.map = map;
        this.experience = experience;
    }

    public int getLevel(){
        int currentLevel = level*1000+(level -1)*(level -1)*450;
        return currentLevel;
    }
}
