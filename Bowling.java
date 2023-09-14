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
        if(jogador.rodadas.size() == 10) throw new IndexOutOfBoundsException("Jogador já realizou todas as jogadas.");
        jogador.addRodada(pinos);
        return jogador.rodadas.size();
    }

    void calculatePoints(Jogador player, int round) {
        int pontuacao = 0;
        for (int i = 0; i < player.rodadas.size(); i++) {
            int pinos = player.rodadas.get(i);
            if (pinos == 10) { // strike
                pontuacao += 10 + player.rodadas.get(i+1) + player.rodadas.get(i+2);
            } else if (i < player.rodadas.size() - 1 && pinos + player.rodadas.get(i+1) == 10) { // spare
                pontuacao += 10 + player.rodadas.get(i+2);
                i++;
            } else {
                pontuacao += pinos;
            }
        }
        System.out.println("Pontuação de " + player.nome + ": " + pontuacao);
    }

}
