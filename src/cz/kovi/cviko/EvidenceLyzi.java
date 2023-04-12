package cz.kovi.cviko;

import java.util.Collection;

public interface EvidenceLyzi {

    boolean vlozLyze(Lyze lyze);
    Collection<Lyze> vratSeznam();
    Collection<Lyze> vratSeznamVolnychLyzi();
    Lyze vratLyze(int inventarniCislo);

}
