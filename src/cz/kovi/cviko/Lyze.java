package cz.kovi.cviko;

import java.util.Objects;

public class Lyze {

    private int inventarniCislo;
    private String vyrobce;
    private Zakaznik zakaznik;

    public int getInventarniCislo() {
        return inventarniCislo;
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public Zakaznik getZakaznik() {
        return zakaznik;
    }

    public void setZakaznik(Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
    }

    public Lyze(int inventarniCislo, String vyrobce) {
        this.inventarniCislo = inventarniCislo;
        this.vyrobce = vyrobce;
    }

    public boolean hasCustomer() {
        return zakaznik != null;
    }

    @Override
    public String toString() {
        if (zakaznik == null) {
            return "Lyže " + getInventarniCislo() + " nejsou vypůjčené.";
        }else
            //return "Lyže " + getInventarniCislo() + "má půjčené " + zakaznik.getJmeno() + " " + zakaznik.getPrijmeni();
            return "Lyže " + getInventarniCislo() + " má půjčené " + zakaznik;

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Lyze)) {
            return false;
        }
        Lyze lyze = (Lyze) o;
        return Objects.equals(inventarniCislo, lyze.inventarniCislo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventarniCislo);
    }


}
