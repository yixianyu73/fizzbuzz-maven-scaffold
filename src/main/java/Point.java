public class Point {
    private  int  x;
    private  int  y;
    private  Direction direction;
    public Point(int  x, int  y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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

}
