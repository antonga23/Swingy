package Swingy.Model.Character;

public abstract class Character {

    protected String heroName;
    protected String heroClass;
    protected int level;
    protected int experience;
    protected int attack;
    protected int defense;
    protected int hitPoints;

    abstract public void attack(Character character);
    abstract public void defend(Character character, int damage);
}
