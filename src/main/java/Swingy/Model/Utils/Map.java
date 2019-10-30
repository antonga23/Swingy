package Swingy.Model.Utils;

public class Map {

    protected int x;
    protected int y;

    public Map() {
        this.x = 0;
        this.y = 0;
    }

    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
