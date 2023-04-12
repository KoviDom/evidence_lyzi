package cz.kovi.cviko;

public class Zakaznik {

    private String jmeno;
    private String prijemni;
    private int vek;

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijemni() {
        return prijemni;
    }

    public int getVek() {
        return vek;
    }

    public Zakaznik(String jmeno, String prijemni, int vek) {
        this.jmeno = jmeno;
        this.prijemni = prijemni;
        this.vek = vek;
    }

    @Override
    public String toString() {

        return jmeno + " " + prijemni;

    }

}
