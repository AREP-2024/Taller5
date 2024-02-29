package edu.escuelaing.arep.ASE.app;

public class Calculadora {

    public Double operar(String operacion, Double num){
        Double resultado= 0.0;
        if(operacion.equals("cos")){
            resultado = Math.cos(num);
        }else if (operacion.equals("sin")){
            resultado = Math.sin(num);

        }
        return resultado;
    }

    public double magnitudVectorial(double x, double y){
        return Math.sqrt(x * x + y * y);

    }

    
}
