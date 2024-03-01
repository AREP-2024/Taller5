package edu.escuelaing.arep.ASE.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
    private PalindromeClase palindrome = new PalindromeClase();

    @Test
    public void deberiSerPalindrome(){
        boolean aux = palindrome.esPalindrome("ana");
        assertTrue(aux);

        aux = palindrome.esPalindrome("ala");
        assertTrue(aux);

        
        aux = palindrome.esPalindrome("oso");
        assertTrue(aux);
    }

    @Test
    public void noDeberiaSerPalindrome(){
        boolean aux = palindrome.esPalindrome("hola");
        assertFalse(aux);

        aux = palindrome.esPalindrome("Luisa");
        assertFalse(aux);

        
        aux = palindrome.esPalindrome("AREP");
        assertFalse(aux);

    }
    
}
