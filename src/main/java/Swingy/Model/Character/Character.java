package Swingy.Model.Character;

import javax.validation.constraints.NotNull;
import Swingy.Model.*;
import Swingy.Model.Utils.Map;

import java.util.Random;

public abstract class Character {

    @NotNull
    protected String heroName;
    protected String heroClass;
    protected int level;
    protected int experience;
    protected int attack;
    protected int defense;
    protected int hitPoints;
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

    Random seed = new Random();

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public int attack() {
        int low = (30 * getAttack()) / 100;
        return seed.nextInt(getAttack() - low) + low;
    }

    public int defense() {
        int low = (70 * getDefense()) / 100;
        return seed.nextInt(getAttack() - low) + low;
    }
}
