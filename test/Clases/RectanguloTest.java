package Clases;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectanguloTest {

    Rectangulo rectangulo = new Rectangulo();

    @Test
    public void calculateArea() {
        rectangulo.setDimensions(5,3);
        double resultadoObtenido = rectangulo.calculateArea();
        double resultadoEsperado = 15;
        assertEquals(resultadoObtenido, resultadoEsperado);
    }

    @Test
    public void setDimensions() {
        rectangulo.setDimensions(12,18);
        double resultadoObtenidoDeX = rectangulo.x;
        double resultadoEsperadoDeX = 12;
        double resultadoObtenidoDeY = rectangulo.y;
        double resultadoEsperadoDeY = 18;
        assertEquals(resultadoObtenidoDeX, resultadoEsperadoDeX);
        assertEquals(resultadoObtenidoDeY, resultadoEsperadoDeY);
    }
}