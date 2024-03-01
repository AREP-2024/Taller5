package edu.escuelaing.arep.ASE.app;

public class Calculadora {

    /*
     * Devuelve el seno o coseno de un numero 
     * @param operacion indica que operacion se desea hacer si sin o cos
     * @param num es el numero al cual se le desea sacar el sin o cos
     * @return retorna un Double con el sin o cos de un numero
     */
    public Double operar(String operacion, Double num){
        Double resultado= 0.0;
        if(operacion.equals("cos")){
            resultado = Math.cos(num);
        }else if (operacion.equals("sin")){
            resultado = Math.sin(num);

        }
        return resultado;
    }

    /*
     * Devuelve la maginitud de un vector real de dos dimensiones
     * @param x es la posicion en x del vector
     * @param y es la posicion en y del vector 
     * @return retorna un double con la magnitud del vector
     */
    public double magnitudVectorial(double x, double y){
        return Math.sqrt(x * x + y * y);
    }

    
}
