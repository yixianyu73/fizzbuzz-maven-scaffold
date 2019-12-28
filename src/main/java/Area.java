public class Area {
    private  int x;
    private  int y;

    public Area(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean contains(Point point) {
        return point.getX() <= this.x && point.getY() <= this.y;
    }

}
