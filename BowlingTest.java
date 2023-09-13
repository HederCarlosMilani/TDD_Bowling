import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BowlingTest {
    Bowling jogo = new Bowling();
    Jogador heder = new Jogador("Heder");
    Jogador lucas = new Jogador("Lucas");
    Jogador vini = new Jogador("Vini");

    @Test
    void addJogador() {
        assertEquals(1, jogo.addJogador(heder));
        assertEquals(2, jogo.addJogador(lucas));
        assertEquals(3, jogo.addJogador(vini));
    }
}