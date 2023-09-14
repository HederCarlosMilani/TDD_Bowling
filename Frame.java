public class Frame {
    int jogada1;
    int jogada2;

    Frame(int jogada) {
        if (jogada < 0 || jogada > 10) {
            throw new IllegalArgumentException("Número de pinos inválido.");
        }
        this.jogada1 = jogada;
    }

    public int getJogada1() {
        return jogada1;
    }

    public void setJogada1(int jogada1) {
        this.jogada1 = jogada1;
    }

    public int getJogada2() {
        return jogada2;
    }

    public boolean isJogada2() {
        return jogada2 != 0;
    }

    public void setJogada2(int jogada2) {
        this.jogada2 = jogada2;
    }
}
