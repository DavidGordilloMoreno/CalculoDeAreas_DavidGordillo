package Clases;

public class Cuadrado implements Interfaces.ICuadrado {

    double x;
    double y;
    double totalArea;

    public double calculateArea() {
        totalArea = x * y;

        return totalArea;
    }

    /*Dado que el tamaño de los dos lados de un cuadrado es el mismo, he implementado el método que pedía el ejercicio
    cambiando el valor de y al de x.*/
    public void setDimensions(double x, double y) {
        this.x = x;
        this.y = x;
    }
}