package Swingy.Model.Character;

import Swingy.Model.Artifacts.Armour;
import Swingy.Model.Artifacts.Helm;
import Swingy.Model.Artifacts.Weapon;

public class Ash  extends Hero {
    protected Armour ashArmour;
    protected Helm ashHelm;
    protected Weapon ashWeapon;

    public Ash(String heroName){
        super(heroName,100,50,230,"Trainer");
         ashArmour = new Armour();
         ashHelm = new Helm();
         ashWeapon = new Weapon();
    }
}
