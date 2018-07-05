package teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import servico.Avaliador;

public class TesteDoAvaliador {

    @Test
    public void deveEntenderLancesEmOrdensCrescente() {
        //parte 1: Cenario
        Usuario joao = new Usuario("joao");
        Usuario maria = new Usuario("maria");
        Usuario jose = new Usuario("jose");

        Leilao leilao = new Leilao("Playstationn 4");

        leilao.propoe(new Lance(joao, 200));
        leilao.propoe(new Lance(maria, 360));
        leilao.propoe(new Lance(jose, 500));

        //parte 2 : acao
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        //parte 3 : validacao
        double maiorEsperado = 500;
        double menorEsperado = 200;

        Assertions.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(),0.00001);
        Assertions.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);

    }
}
