public class Point {
    private  int  x;
    private  int  y;
    private  Direction direction;
    public Point(int  x, int  y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        if(x * y < 0) {
            throw new IllegalArgumentException("error point");
        }
    }
     public int getX() {
        return this.x;
     }

     public int getY() {
        return  this.y;
     }

     public Direction getDirection() {
        return this.direction;
     }

     public void setDirection(Direction direction) {
        this.direction = direction;
     }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
