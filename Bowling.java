
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
    int fazerJogada(Jogador jogador, int pinos) {
        if(jogador.frames.size() >= 10) throw new IndexOutOfBoundsException("Jogador já realizou todas as jogadas.");
        jogador.addRodada(pinos);
        return jogador.frames.size();
    }

    int calculatePoints(Jogador player) {
        int pontuacao = 0;
        if (player.frames.size() == 1) {
            pontuacao += player.frames.get(0).getTotalPoint();
        }
        for (int i = 0; i < player.frames.size() - 1; i++) {
            Frame frame = player.frames.get(i);
            if (frame.getStatus() == Frame.Status.STRIKE) {
                pontuacao += 10;
                if ((player.frames.size() + 2) < i) {
                    pontuacao += player.frames.get(i + 2).getTotalPoint();
                }
                if ((player.frames.size() + 1) < i) {
                    pontuacao += player.frames.get(i + 1).getTotalPoint();
                }
            } else if (frame.getStatus() == Frame.Status.SPARE) {
                pontuacao += 10;
                if ((player.frames.size() + 1) < i) {
                    pontuacao += player.frames.get(i + 1).getTotalPoint();
                }
            } else {
                pontuacao += frame.getTotalPoint();
            }
        }
        return pontuacao;
    }

}
