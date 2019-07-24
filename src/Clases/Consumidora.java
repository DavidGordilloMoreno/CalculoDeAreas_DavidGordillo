package Clases;

public class Consumidora extends Thread implements Interfaces.IConsumidora {

    Figure f;
    String figura;
    double totalArea;
    long cant_figuras;

    Cuadrado cuadrado = new Cuadrado();
    Rectangulo rectangulo = new Rectangulo();
    Circulo circulo = new Circulo();

    public Consumidora(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < cant_figuras; i++) {
            if (this.getName().contains("cuadrado") || this.getName().contains("circulo")) {
                System.out.println(this.getName() + " = " + getTotalArea());
            } else if (this.getName().contains("rectangulo")) {
                System.out.println("Error al intentar mostrar: " + this.getName());
            }
        }
    }

    public double getTotalArea() {
        if (this.figura == "cuadrado") {
            cuadrado.setDimensions(5, 2);
            totalArea = cuadrado.calculateArea();
        } else if (this.figura == "rectangulo") {
            rectangulo.setDimensions(5, 2);
            totalArea = rectangulo.calculateArea();
        } else if (this.figura == "circulo") {
            circulo.setDimensions(3);
            totalArea = circulo.calculateArea();
        }

        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public void setCantidad(long num_cantidad) {
        this.cant_figuras = num_cantidad;
    }

    public void sendFigure(Figure f) {
        this.f = f;
    }
}
