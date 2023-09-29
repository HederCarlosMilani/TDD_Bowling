
public class Frame {
    enum Status {
        STRIKE,
        SPARE,
        OPEN
    }
    int jogada1;
    int jogada2;

    int points = 0;

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

    public Status getStatus() {
        if (this.jogada1 == 10) {
            return Status.STRIKE;
        }
        if ((this.jogada1 + this.jogada2) == 10) {
            return Status.SPARE;
        }
        return Status.OPEN;
    }

    public int getTotalPoint() {
        return this.getJogada1() + this.getJogada2();
    }
    public void addPoint(int point){
        this.points += point;
    }
}
