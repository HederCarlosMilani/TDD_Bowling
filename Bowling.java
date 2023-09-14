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
        if(jogador.frames.size() >= 10) throw new IndexOutOfBoundsException("Jogador já realizou todas as jogadas.");
        jogador.addRodada(pinos);
        return jogador.frames.size();
    }
}
