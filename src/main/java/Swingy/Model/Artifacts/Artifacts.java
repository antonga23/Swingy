package Swingy.Model.Artifacts;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Artifacts {
    protected String type;
    protected String name;
    protected int boost;
    protected int level;

    public Artifacts() {
        this.type = "Artifact"; //getArtifactType (Armour, Weapon...)
        this.name = "Artifact"; // getArmourname, getWeaponName...
        this.boost = 0;
        this.level = 0;
    }

    public Artifacts(int level) {
        this.level = level;
    }

    public String getName(){
        return this.name;
    }

    public int getBoost(){
        return this.boost;
    }

    public String getType(){
        return this.type;
    }
}


