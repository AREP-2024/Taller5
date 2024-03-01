package edu.escuelaing.arep.ASE.app;

public class Palindrome {


    /*
     *Devuelve si una palabra es palindrome
     *@param cadena es la palabra de la cual se desea saber si es palindrome
     *@return retorna true en caso que la palabra sea palindrome y false en dado caso de que no lo sea
     */
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
