package teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import servico.Avaliador;

public class TesteDoAvaliador {

    public static void main(String[] args) {

        Usuario joao = new Usuario("joao");
        Usuario maria = new Usuario("maria");
        Usuario jose = new Usuario("jose");

        Leilao leilao = new Leilao("Playstationn 4");

        leilao.propoe(new Lance(joao, 200));
        leilao.propoe(new Lance(maria, 360));
        leilao.propoe(new Lance(jose, 500));


        Avaliador leiloeiro = new Avaliador();

        leiloeiro.avalia(leilao);

        System.out.println(leiloeiro.getMaiorLance());
    }
}
