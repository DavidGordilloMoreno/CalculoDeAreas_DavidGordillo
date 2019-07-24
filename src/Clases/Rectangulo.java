package Clases;

public class Rectangulo implements Interfaces.IRectangulo {

    double x;
    double y;
    double totalArea;

    public double calculateArea() {
        totalArea = x * y;

        return totalArea;
    }

    public void setDimensions(double x, double y) {
        this.x = x;
        this.y = y;
    }
}