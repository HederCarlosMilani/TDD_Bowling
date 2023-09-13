import java.util.ArrayList;
import java.util.List;

public class Bowling {
    List<Jogador> jogadores = new ArrayList<>();

    /**
     * Adiciona um novo jogador a partida.
     *
     * @param jogador Objeto jogador
     * @return Número de jogadores na partida
     */
    int addJogador(Jogador jogador){
        this.jogadores.add(jogador);
        return this.jogadores.size();
    }

    int fazerJogada() {

    }
}
