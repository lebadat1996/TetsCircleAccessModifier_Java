package testCricle;

public class testCircle {
    private double radius = 1;
    private String color = "red";

    public testCircle() {

    }

    public testCircle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
