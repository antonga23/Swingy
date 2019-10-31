package Swingy.Model.Utils;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Pattern;

public class Map {
    @Getter @Setter @Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="The value must be positive")
    protected int x;
    @Getter @Setter @Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="The value must be positive")
    protected int y;

    public Map() {
        this.x = 0;
        this.y = 0;
    }

    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
