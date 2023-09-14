import java.util.ArrayList;
import java.util.List;

public class Jogador {
    String nome;
    Frame[] rodadas;
    List<Frame> frames = new ArrayList<>(10);

    Jogador(String nome) {
        this.nome = nome;
    }

    void addRodada(int pinos) {
        if (this.frames.size() == 0) {
            this.frames.add(new Frame(pinos));
        } else {
            Frame ultimoFrame = this.frames.get(this.frames.size() - 1);
            if ((ultimoFrame.getJogada1() == 10) || (ultimoFrame.isJogada2())) {
                this.frames.add(new Frame(pinos));
            } else {
                ultimoFrame.setJogada2(pinos);
                this.frames.set(this.frames.size() - 1, ultimoFrame);
            }
        }
        System.out.println(frames);
    }
}
