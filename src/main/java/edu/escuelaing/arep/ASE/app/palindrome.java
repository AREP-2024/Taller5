package edu.escuelaing.arep.ASE.app;

public class Palindrome {

    public boolean esPalindrome(String cadena){
        boolean bandera = true;
        for (int i = 0; i < cadena.length()/2; i ++){
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                bandera = false;    
            }

        }
        return bandera;
    }
    
}
