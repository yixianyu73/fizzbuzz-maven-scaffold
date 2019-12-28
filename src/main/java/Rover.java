public class Rover {
    private Point point;
    private Area area;

    public void land(Area area, Point point) {
        this.point = point;
        this.area = area;
        if(!this.area.contains(point)) {
            throw new IllegalArgumentException("out of area");
        }
    }

    public Point getPoint() {
        return point;
    }

    public void turnLeft() {
        switch (this.point.getDirection()) {
            case SOUTH:
                this.point.setDirection(Direction.EAST);
                break;
            case WEST:
                this.point.setDirection(Direction.SOUTH);
                break;
            case NORTH:
                this.point.setDirection(Direction.WEST);
                break;
            case EAST:
                this.point.setDirection(Direction.NORTH);
                break;
            default:
        }
    }

    public void turnRight() {
        switch (this.point.getDirection()) {
            case SOUTH:
                this.point.setDirection(Direction.WEST);
                break;
            case WEST:
                this.point.setDirection(Direction.NORTH);
                break;
            case NORTH:
                this.point.setDirection(Direction.EAST);
                break;
            case EAST:
                this.point.setDirection(Direction.SOUTH);
                break;
            default:
        }
    }

    public void moveForward() {
        switch (point.getDirection()) {
            case SOUTH:
                this.point.setY(point.getY() - 1);
                break;
            case NORTH:
                this.point.setY(point.getY() + 1);
                break;
            case EAST:
                this.point.setX(point.getX() + 1);
                break;
            case WEST:
                this.point.setX(point.getX() - 1);
                break;
            default:
        }

        if (!this.area.contains(point)) {
            throw new IllegalArgumentException("out of area");
        }
    }

    public void moveBack() {
        switch (point.getDirection()) {
            case SOUTH:
                this.point.setY(point.getY() + 1);
                break;
            case NORTH:
                this.point.setY(point.getY() - 1);
                break;
            case EAST:
                this.point.setX(point.getX() - 1);
                break;
            case WEST:
                this.point.setX(point.getX() + 1);
                break;
            default:
        }

        if (!this.area.contains(point)) {
            throw new IllegalArgumentException("out of area");
        }
    }
}
