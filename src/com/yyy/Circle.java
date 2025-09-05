package com.yyy;

public class Circle {
    private double radius;

    public Circle(double radius) { this.radius = radius; }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    // Main method to test
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println(c);
        System.out.println("Radius = " + c.getRadius());
    }
}
 