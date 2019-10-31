package Swingy.Model.Character;

import Swingy.Model.Artifacts.Armour;
import Swingy.Model.Artifacts.Helm;
import Swingy.Model.Artifacts.Weapon;

public class Brock  extends Hero {
    protected Armour brockArmour;
    protected Helm brockHelm;
    protected Weapon brockWeapon;

    public Brock(String heroName){
        super(heroName,50,150,156,"Trainer");
        brockArmour = new Armour();
        brockHelm = new Helm();
        brockWeapon = new Weapon();
    }
}
