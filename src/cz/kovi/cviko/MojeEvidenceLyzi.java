package cz.kovi.cviko;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MojeEvidenceLyzi implements EvidenceLyzi{

    private final List<Lyze> kapacitaLyzi = new ArrayList<>();

    @Override
    public boolean vlozLyze(Lyze lyze) {
        boolean jizEvidovano = kapacitaLyzi.contains(lyze);
        if(jizEvidovano) {
            return false;
        }
        else {
            kapacitaLyzi.add(lyze);
            return true;
        }
    }

    @Override
    public Collection<Lyze> vratSeznam() {
        return new ArrayList<>(kapacitaLyzi);
    }

    @Override
    public Collection<Lyze> vratSeznamVolnychLyzi() {
        return kapacitaLyzi
                .stream()
                .filter(lyze -> !lyze.hasCustomer())
                .collect(Collectors.toList());
    }

    @Override
    public Lyze vratLyze(int inventarniCislo) {
        return kapacitaLyzi
                .stream()
                .filter(lyze -> lyze.getInventarniCislo() == inventarniCislo)
                .findFirst()
                .orElse(null);
    }



}
