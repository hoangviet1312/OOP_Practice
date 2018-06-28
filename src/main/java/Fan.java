public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;

    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "BLUE";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {

    }

    public void fanInfoToString() {
        if (on) {
            printFanInfo();
            System.out.println("Fan is ON!!!");
        } else {
            printFanInfo();
            System.out.println("Fan is OFF!!!");
        }
    }

    private void printFanInfo() {
        System.out.println("Color: " + getColor());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Radius: " + getRadius());
    }


}
