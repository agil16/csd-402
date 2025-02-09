//Arely Gil
//Assignment 7
//02/07/2025

//This code can create and manage fans, letting you set their speed, size, and color, 
//and also display their details, even for multiple fans at once.

import java.util.ArrayList;
import java.util.List;

public class Fan {

    // Here I have fan speed settings as constant values
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // This is instance variables for fan properties
    private int fanSpeed;
    private boolean isFanOn;
    private double fanRadius;
    private String fanColor;

    // Here I have the default constructor initializing default values
    public Fan() {
        this.fanSpeed = STOPPED;
        this.isFanOn = false;
        this.fanRadius = 6.0;
        this.fanColor = "white";
    }

    // Here is the parameterized constructor for custom initialization
    public Fan(int speed, boolean on, double radius, String color) {
        this.fanSpeed = speed;
        this.isFanOn = on;
        this.fanRadius = radius;
        this.fanColor = color;
    }

    // Here I have the getter and setter methods for fan properties
    public int getFanSpeed() {
        return this.fanSpeed;
    }

    public void setFanSpeed(int speed) {
        this.fanSpeed = speed;
    }

    public boolean isFanOn() {
        return this.isFanOn;
    }

    public void setFanOn(boolean on) {
        this.isFanOn = on;
    }

    public double getFanRadius() {
        return this.fanRadius;
    }

    public void setFanRadius(double radius) {
        this.fanRadius = radius;
    }

    public String getFanColor() {
        return this.fanColor;
    }

    public void setFanColor(String color) {
        this.fanColor = color;
    }

    // Now the method to display fan details without using toString()
    public void displayFanDetails() {
        System.out.println("Fan Details: ");
        System.out.println("Speed: " + (this.fanSpeed == STOPPED ? "STOPPED" : this.fanSpeed == SLOW ? "SLOW" : this.fanSpeed == MEDIUM ? "MEDIUM" : "FAST"));
        System.out.println("Status: " + (this.isFanOn ? "ON" : "OFF"));
        System.out.println("Radius: " + this.fanRadius);
        System.out.println("Color: " + this.fanColor);
        System.out.println();
    }

    // Here I have the method to display all fans in a collection
    public static void displayAllFans(List<Fan> fanList) {
        for (Fan fan : fanList) {
            fan.displayFanDetails();
        }
    }

    public static void main(String[] args) {
        // Now I am creating a collection to store multiple Fan objects
        List<Fan> fanCollection = new ArrayList<>();
        
        // Here I am adding different fan instances to the collection
        fanCollection.add(new Fan()); // Default fan
        fanCollection.add(new Fan(FAST, true, 10.0, "blue"));
        fanCollection.add(new Fan(MEDIUM, false, 8.0, "red"));
        fanCollection.add(new Fan(SLOW, true, 7.5, "green"));
        
        // Now I have the display each fan's details individually
        System.out.println("Displaying individual fans:");
        for (Fan fan : fanCollection) {
            fan.displayFanDetails();
        }
        
        // At last, displaying all fans using the collection method
        System.out.println("Displaying all fans from the collection:");
        displayAllFans(fanCollection);
    }
}

//https://www.w3schools.com/java/ref_string_tostring.asp