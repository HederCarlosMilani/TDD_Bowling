import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BowlingTest {
    Bowling partida = new Bowling();
    Jogador heder = new Jogador("Heder");
    Jogador lucas = new Jogador("Lucas");
    Jogador vini = new Jogador("Vini");

    @Test
    void addJogador() {
        assertEquals(1, partida.addJogador(heder));
        assertEquals(2, partida.addJogador(lucas));
        assertEquals(3, partida.addJogador(vini));
    }


}