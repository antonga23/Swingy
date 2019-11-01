package Swingy.Model.Utils;
import lombok.Getter;
import lombok.Setter;


public class Map {
    @Getter @Setter
    protected int x;
    @Getter @Setter
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
