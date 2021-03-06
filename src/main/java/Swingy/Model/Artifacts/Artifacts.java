package Swingy.Model.Artifacts;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
public abstract class Artifacts {
    @NotNull @Getter
    protected String type;
    @NotNull @Getter
    protected String name;
    @Getter
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
}


