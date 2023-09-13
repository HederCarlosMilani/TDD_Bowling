import org.jetbrains.annotations.NotNull;

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

    /**
     * Faz uma jogada para o jogador Selecionado.
     *
     * @param jogador Objeto jogador
     * @param pinos Número de pinos derrubados
     * @return Número de jogadas realizadas pelo jogador
     */
    int fazerJogada(@NotNull Jogador jogador, int pinos) {
        jogador.addRodada(pinos);
        return jogador.rodadas.size();
    }
}
