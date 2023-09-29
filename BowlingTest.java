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


    @Test
    void fazerJogada1() {
        System.out.println("?");
        assertThrows(IllegalArgumentException.class, () -> partida.fazerJogada(heder, 11));
        assertEquals(1, partida.fazerJogada(heder, 10));
        assertEquals(2, partida.fazerJogada(heder, 10));
        assertEquals(3, partida.fazerJogada(heder, 10));
        assertEquals(4, partida.fazerJogada(heder, 10));
        assertEquals(5, partida.fazerJogada(heder, 10));
        assertEquals(6, partida.fazerJogada(heder, 10));
        assertEquals(7, partida.fazerJogada(heder, 10));
        assertEquals(8, partida.fazerJogada(heder, 10));
        assertEquals(9, partida.fazerJogada(heder, 9));
        assertEquals(9, partida.fazerJogada(heder, 1));
        assertEquals(10, partida.fazerJogada(heder, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> partida.fazerJogada(heder, 10));
    }

    @Test
    void fazerJogada2() {
        assertEquals(1, partida.fazerJogada(heder, 15));
    }

    @Test
    void shouldCaculatePoint() {
        partida.fazerJogada(vini, 10);
        partida.fazerJogada(vini, 10);
        partida.fazerJogada(vini, 10);
        partida.fazerJogada(vini, 7);
        partida.fazerJogada(vini, 2);
        partida.fazerJogada(vini, 8);
        partida.fazerJogada(vini, 2);
        partida.fazerJogada(vini, 0);
        partida.fazerJogada(vini, 9);
        partida.fazerJogada(vini, 10);
        partida.fazerJogada(vini, 7);
        partida.fazerJogada(vini, 3);
        partida.fazerJogada(vini, 9);
        partida.fazerJogada(vini, 0);
        partida.fazerJogada(vini, 10);
        partida.fazerJogada(vini, 10);
        partida.fazerJogada(vini, 8);
        System.out.println(vini.frames.size());
    }
}