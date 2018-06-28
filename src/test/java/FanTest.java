import org.junit.Test;

public class FanTest {
    @Test
    public void TestFan_1() {
        Fan fan_1 = new Fan();

        fan_1.setColor("YELLOW");
        fan_1.setSpeed(3);
        fan_1.setRadius(10.0);
        fan_1.setOn(true);

        fan_1.fanInfoToString();
    }

    @Test
    public void TestFan_2() {
        Fan fan_2 = new Fan();

        fan_2.setSpeed(3);
        fan_2.setRadius(10.0);
        fan_2.setOn(false);

        fan_2.fanInfoToString();
    }
}
