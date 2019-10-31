package Swingy.Model.Character;

import Swingy.Model.Artifacts.Armour;
import Swingy.Model.Artifacts.Helm;
import Swingy.Model.Artifacts.Weapon;

public class Misty  extends Hero {
    protected Armour mistyArmour;
    protected Helm mistyHelm;
    protected Weapon mistyWeapon;

    public Misty(String heroName){
        super(heroName,60,50,300,"Trainer");
        mistyArmour = new Armour();
        mistyHelm = new Helm();
        mistyWeapon = new Weapon();
    }
}
