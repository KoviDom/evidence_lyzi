package cz.kovi.cviko;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MojeEvidenceLyziTest {

    private MojeEvidenceLyzi mojeEvidenceLyzi;
    private Lyze lyze = new Lyze(15, "Alza");
    private Zakaznik zakaznik = new Zakaznik("Petr", "Novák", 50);

    @BeforeEach
    public void setup() {
        mojeEvidenceLyzi = new MojeEvidenceLyzi();
    }

    @Test
    public void testVlozLyze() {

        assertTrue(mojeEvidenceLyzi.vlozLyze(lyze));
        assertFalse(mojeEvidenceLyzi.vlozLyze(lyze));

    }

    @Test
    public void testVratSeznam() {

        mojeEvidenceLyzi.vlozLyze(lyze);
        assertIterableEquals(List.of(lyze), mojeEvidenceLyzi.vratSeznam());

    }

    @Test
    public void testVratSeznamVolnychLyzi() {

        mojeEvidenceLyzi.vlozLyze(lyze);
        assertIterableEquals(List.of(lyze), mojeEvidenceLyzi.vratSeznamVolnychLyzi());
        lyze.setZakaznik(zakaznik);
        assertTrue(mojeEvidenceLyzi.vratSeznamVolnychLyzi().isEmpty());

    }

    @Test
    public void testVratLyze() {

        mojeEvidenceLyzi.vlozLyze(lyze);
        assertEquals(lyze, mojeEvidenceLyzi.vratLyze(lyze.getInventarniCislo()));
        assertNull(mojeEvidenceLyzi.vratLyze(123));

    }

}
