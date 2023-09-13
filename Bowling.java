import java.util.ArrayList;
import java.util.List;

public class Bowling {
    List<Jogador> jogadores = new ArrayList<>();

    int addJogador(Jogador jogador){
        this.jogadores.add(jogador);
        return this.jogadores.size();
    }

    void fazerJogada() {

    }
}
