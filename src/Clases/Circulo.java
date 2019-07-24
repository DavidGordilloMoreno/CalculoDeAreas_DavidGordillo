package Clases;

public class Circulo implements Interfaces.ICirculo {

    double radius;
    double totalArea;

    public double calculateArea() {
        totalArea = Math.PI * Math.pow(radius, 2);

        return totalArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setDimensions(double radius) {
        this.radius = radius;
    }
}