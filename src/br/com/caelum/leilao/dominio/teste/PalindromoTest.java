package br.com.caelum.leilao.dominio.teste;

import br.com.caelum.leilao.dominio.Palindromo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromoTest {
    @Test
    public void deveIdentificarPalindromoEFiltrarCaracteresInvalidos() {
        Palindromo p = new Palindromo();

        boolean resultado = p.ehPalindromo(
                "Socorram-me subi no onibus em Marrocos");
        Assertions.assertTrue(resultado);
    }

    @Test
    public void deveIdentificarPalindromo() {
        Palindromo p = new Palindromo();

        boolean resultado = p.ehPalindromo(
                "Anotaram a data da maratona");
        Assertions.assertTrue(resultado);
    }

    @Test
    public void deveIdentificarSeNaoEhPalindromo() {
        Palindromo p = new Palindromo();

        boolean resultado = p.ehPalindromo(
                "E preciso amar as pessoas como se nao houvesse amanha");
        Assertions.assertFalse(resultado);
    }

}
