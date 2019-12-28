import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoverController {
    private  Rover rover;
    public RoverController(Rover rover) {
        this.rover = rover;
    }

    public void excute(String mission) {
        String[] strArray = mission.split(",");

        for (String s : strArray) {
            if (s.equalsIgnoreCase("L")) {
                this.rover.turnLeft();
            } else if (s.equalsIgnoreCase("R")) {
                this.rover.turnRight();
            } else if (isNumeric(s) && Integer.valueOf(s) > 0) {
                this.rover.moveForward(Integer.valueOf(s));
            } else if (isNumeric(s) && Integer.valueOf(s) < 0) {
                this.rover.moveBack(Integer.valueOf(s) * -1);
            } else {
                throw new IllegalArgumentException("mission error");
            }
        }
    }

    private boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+.*[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }
}
