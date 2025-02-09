//Arely Gil
//January 30th, 2025
//Module 6 Programming Assingment

//This code is for creating a fan object with settings for speed, state,
//color and radies. It also lets you get those settings and gives a description of the fan.

public class Fan {

    // Here we have the constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Here we have the private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // This is the default constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Here we have the constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Here we have the getter and setter methods
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

    // Here shows the toString method to return the state of the fan
    public String toString() {
        String speedDescription;
        switch (speed) {
            case STOPPED: speedDescription = "STOPPED"; break;
            case SLOW: speedDescription = "SLOW"; break;
            case MEDIUM: speedDescription = "MEDIUM"; break;
            case FAST: speedDescription = "FAST"; break;
            default: speedDescription = "UNKNOWN"; break;  // In case of unexpected values
        }

        return "Fan [speed=" + speedDescription + 
                ", on=" + (on ? "ON" : "OFF") + 
                ", radius=" + radius + 
                ", color=" + color + "]";
    }

    // This is the main method for testing
    public static void main(String[] args) {
        // Here I am creating a fan using the default constructor
        Fan fan1 = new Fan();
        System.out.println("Default Fan: " + fan1);

        // Here I am creating a fan using the constructor with arguments
        Fan fan2 = new Fan(FAST, true, 10.0, "blue");
        System.out.println("Fan with arguments: " + fan2);

        // Here is where you can change attributes of the second fan
        fan2.setSpeed(SLOW);
        fan2.setRadius(7.5);
        fan2.setColor("green");
        fan2.setOn(false);

        // Finally displaying updated fan details
        System.out.println("Updated Fan: " + fan2);
    }
}
