package edu.escuelaing.arep.ASE.app;

public class Calculadora {

    public static  Double operar(String operarcion, Double num){
        Double resultado= 0.0;
        if(operarcion.equals("cos")){
            resultado = Math.cos(num);
        }else if (operarcion.equals("sin")){
            resultado = Math.sin(num);

        }

        return resultado;

    }

    
}
