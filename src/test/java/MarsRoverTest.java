import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MarsRoverTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void MarsRoverOutOfArea() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("out of area");
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        Point point = new Point(5, 5, Direction.EAST);
        rover.land(area, point);
    }
}
