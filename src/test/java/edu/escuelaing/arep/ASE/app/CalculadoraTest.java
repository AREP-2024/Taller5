package edu.escuelaing.arep.ASE.app;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;



public class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();
    
    @Test 
    public void deberiaCalcularSeno(){
        Double aux = calculadora.operar("sin", 0.0);
        assertEquals(0.0, aux.doubleValue(), 0.0001);

        aux = calculadora.operar("sin", -1.0);
        assertEquals(-0.841470984808, aux.doubleValue(), 0.0001);
        
        aux = calculadora.operar("sin", 45.0);
        assertEquals(0.850903524534, aux.doubleValue(), 0.0001);
    }

    @Test 
    public void deberiaCalcularCoseno(){
        Double aux = calculadora.operar("cos", 0.0);
        assertEquals(1.0, aux.doubleValue(), 0.0001);

        aux = calculadora.operar("cos", -1.0);
        assertEquals(0.540302305868, aux.doubleValue(), 0.0001);
        
        aux = calculadora.operar("cos", 45.0);
        assertEquals(0.525321988818, aux.doubleValue(), 0.0001);

    }

    @Test 
    public void deberiaCalcularMagnitud(){
        double aux = calculadora.magnitudVectorial(3, 4);
        assertEquals(5.0, aux, 0.0001);

        aux = calculadora.magnitudVectorial(-1, 3.14);
        assertEquals(3.295390720385, aux, 0.0001);

        aux = calculadora.magnitudVectorial(6, 8);
        assertEquals(10.0, aux, 0.0001);

    }
}
