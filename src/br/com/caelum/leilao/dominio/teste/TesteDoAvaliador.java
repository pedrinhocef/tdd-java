package br.com.caelum.leilao.dominio.teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.dominio.servico.Avaliador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteDoAvaliador {

    @Test
    public void deveEntenderLancesEmOrdensCrescente() {
        //parte 1: Cenario
        Usuario joao = new Usuario("joao");
        Usuario maria = new Usuario("maria");
        Usuario jose = new Usuario("jose");

        Leilao leilao = new Leilao("Playstationn 4");

        leilao.propoe(new Lance(joao, 200));
        leilao.propoe(new Lance(maria, 400));
        leilao.propoe(new Lance(jose, 600));

        //parte 2 : acao
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        //parte 3 : validacao
        double maiorEsperado = 600;
        double menorEsperado = 200;
        double mediaEsperada = 400;

        assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
        assertEquals(mediaEsperada, leiloeiro.getMedia(), 0.00001);

    }

    @Test
    public void testaMediaDeZeroLance() {

        // cenario
        Usuario ewertom = new Usuario("Ewertom");

        // acao
        Leilao leilao = new Leilao("Iphone 7");

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        //validacao
        assertEquals(0, avaliador.getMedia(), 0.0001);

    }
}