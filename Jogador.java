import java.util.ArrayList;
import java.util.List;

public class Jogador {
    String nome;
    Frame[] rodadas;

    Jogador(String nome) {
        this.nome = nome;
    }

    void addRodada(int pinos) {
        this.rodadas.add(pinos);
    }
}
