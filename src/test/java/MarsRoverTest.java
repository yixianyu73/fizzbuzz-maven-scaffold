import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MarsRoverTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void MarsRoverErrorPointX() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("error point");
        Point point = new Point(-1, 5, Direction.EAST);
    }

    @Test
    public void MarsRoverErrorPointY() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("error point");
        Point point = new Point(5, -1, Direction.EAST);
    }

    @Test
    public void MarsRoverOutOfAreaX() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("out of area");
        Area area = new Area(10, 10);
        Point point = new Point(11, 5, Direction.EAST);
        Rover rover = new Rover();
        rover.land(area, point);
    }

    @Test
    public void MarsRoverOutOfAreaY() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("out of area");
        Area area = new Area(10, 10);
        Point point = new Point(10, 11, Direction.EAST);
        Rover rover = new Rover();
        rover.land(area, point);
    }

    @Test
    public void MarsRoverLand() {
        Area area = new Area(10, 10);
        Point point = new Point(5, 5, Direction.EAST);
        Rover rover = new Rover();
        rover.land(area, point);
        assertEquals(rover.getPoint().getX(), 5);
        assertEquals(rover.getPoint().getY(), 5);
        assertEquals(rover.getPoint().getDirection(), Direction.EAST);
        point = new Point(0, 0, Direction.EAST);
        rover.land(area, point);
        assertEquals(rover.getPoint().getX(), 0);
        assertEquals(rover.getPoint().getY(), 0);
        assertEquals(rover.getPoint().getDirection(), Direction.EAST);
        point = new Point(10, 10, Direction.EAST);
        rover.land(area, point);
        assertEquals(rover.getPoint().getX(), 10);
        assertEquals(rover.getPoint().getY(), 10);
        assertEquals(rover.getPoint().getDirection(), Direction.EAST);
    }

    @Test
    public void MarsRoverTurnLeft() {
        Area area = new Area(10, 10);
        Point point = new Point(5, 5, Direction.EAST);
        Rover rover = new Rover();
        rover.land(area, point);
        rover.turnLeft();
        assertEquals(rover.getPoint().getDirection(), Direction.NORTH);
        rover.turnLeft();
        assertEquals(rover.getPoint().getDirection(), Direction.WEST);
        rover.turnLeft();
        assertEquals(rover.getPoint().getDirection(), Direction.SOUTH);
        rover.turnLeft();
        assertEquals(rover.getPoint().getDirection(), Direction.EAST);
    }

    @Test
    public void MarsRoverTurnRight() {
        Area area = new Area(10, 10);
        Point point = new Point(5, 5, Direction.EAST);
        Rover rover = new Rover();
        rover.land(area, point);
        rover.turnRight();
        assertEquals(rover.getPoint().getDirection(), Direction.SOUTH);
        rover.turnRight();
        assertEquals(rover.getPoint().getDirection(), Direction.WEST);
        rover.turnRight();
        assertEquals(rover.getPoint().getDirection(), Direction.NORTH);
        rover.turnRight();
        assertEquals(rover.getPoint().getDirection(), Direction.EAST);
    }

    @Test
    public void MarsRoverMoveForward() {
        Area area = new Area(10, 10);
        Point point = new Point(5, 5, Direction.EAST);
        Rover rover = new Rover();
        rover.land(area, point);
        rover.moveForward(1);
        assertEquals(rover.getPoint().getX(), 6);
        assertEquals(rover.getPoint().getY(), 5);
        assertEquals(rover.getPoint().getDirection(), Direction.EAST);
        rover.turnRight();
        rover.moveForward(1);
        assertEquals(rover.getPoint().getX(), 6);
        assertEquals(rover.getPoint().getY(), 4);
        assertEquals(rover.getPoint().getDirection(), Direction.SOUTH);
        rover.turnRight();
        rover.moveForward(1);
        assertEquals(rover.getPoint().getX(), 5);
        assertEquals(rover.getPoint().getY(), 4);
        assertEquals(rover.getPoint().getDirection(), Direction.WEST);
        rover.turnRight();
        rover.moveForward(1);
        assertEquals(rover.getPoint().getX(), 5);
        assertEquals(rover.getPoint().getY(), 5);
        assertEquals(rover.getPoint().getDirection(), Direction.NORTH);
    }

    @Test
    public void MarsRoverMoveBack() {
        Area area = new Area(10, 10);
        Point point = new Point(5, 5, Direction.EAST);
        Rover rover = new Rover();
        rover.land(area, point);
        rover.moveBack(1);
        assertEquals(rover.getPoint().getX(), 4);
        assertEquals(rover.getPoint().getY(), 5);
        assertEquals(rover.getPoint().getDirection(), Direction.EAST);
        rover.turnRight();
        rover.moveBack(1);
        assertEquals(rover.getPoint().getX(), 4);
        assertEquals(rover.getPoint().getY(), 6);
        assertEquals(rover.getPoint().getDirection(), Direction.SOUTH);
        rover.turnRight();
        rover.moveBack(1);
        assertEquals(rover.getPoint().getX(), 5);
        assertEquals(rover.getPoint().getY(), 6);
        assertEquals(rover.getPoint().getDirection(), Direction.WEST);
        rover.turnRight();
        rover.moveBack(1);
        assertEquals(rover.getPoint().getX(), 5);
        assertEquals(rover.getPoint().getY(), 5);
        assertEquals(rover.getPoint().getDirection(), Direction.NORTH);
    }

    @Test
    public void MarsRoverMoveForwardOutOfArea() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("out of area");
        Area area = new Area(10, 10);
        Point point = new Point(10, 5, Direction.EAST);
        Rover rover = new Rover();
        rover.land(area, point);
        rover.moveForward(1);
    }

    @Test
    public void MarsRoverMoveBackOutOfArea() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("out of area");
        Area area = new Area(10, 10);
        Point point = new Point(10, 10, Direction.SOUTH);
        Rover rover = new Rover();
        rover.land(area, point);
        rover.moveBack(1);
    }

    @Test
    public void MarsRoverMoveBackError() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("move error");
        Area area = new Area(10, 10);
        Point point = new Point(10, 10, Direction.SOUTH);
        Rover rover = new Rover();
        rover.land(area, point);
        rover.moveBack(0);
    }

    @Test
    public void MarsRoverMoveForwardError() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("move error");
        Area area = new Area(10, 10);
        Point point = new Point(10, 10, Direction.SOUTH);
        Rover rover = new Rover();
        rover.land(area, point);
        rover.moveBack(0);
    }

}
