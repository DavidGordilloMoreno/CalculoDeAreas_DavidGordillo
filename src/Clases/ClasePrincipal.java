package Clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        Productora productora = new Productora();
        productora.setFrequency(productora.seconds);
        productora.setNumberOfFigures(productora.n);

        Consumidora proceso_cuadrado = new Consumidora("Area del cuadrado");
        Consumidora proceso_rectangulo = new Consumidora("Area del rectangulo");
        Consumidora proceso_circulo = new Consumidora("Area del circulo");

        /* Dado que el máximo número de figuras a crear es de 100, he decidido dividir el máximo entre 3 para que no
        pueda crear más de 100. */
        proceso_cuadrado.setCantidad(productora.getNumberOfFigures() / 3);
        proceso_rectangulo.setCantidad(productora.getNumberOfFigures() / 3);
        proceso_circulo.setCantidad(productora.getNumberOfFigures() / 3);

        proceso_cuadrado.setFigura("cuadrado");
        proceso_cuadrado.setTotalArea(proceso_cuadrado.getTotalArea());
        proceso_cuadrado.start();
        try {
            proceso_cuadrado.sleep(productora.getFrequency());
        } catch (Exception e) {
            System.out.println(e);
        }

        proceso_rectangulo.setFigura("rectangulo");
        proceso_rectangulo.setTotalArea(proceso_rectangulo.getTotalArea());
        proceso_rectangulo.start();
        try {
            proceso_cuadrado.sleep(productora.getFrequency());
        } catch (Exception e) {
            System.out.println(e);
        }

        proceso_circulo.setFigura("circulo");
        proceso_circulo.setTotalArea(proceso_circulo.getTotalArea());
        proceso_circulo.start();
        try {
            proceso_cuadrado.sleep(productora.getFrequency());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
