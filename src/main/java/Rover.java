public class Rover {
    private Point point;
    private Area area;

    public void land(Area area, Point point) {
        this.point = point;
        this.area = area;
        if(this.area.contains(point)) {
            throw new IllegalArgumentException("out of area");
        }
    }

    public Point getPoint() {
        return point;
    }
}
