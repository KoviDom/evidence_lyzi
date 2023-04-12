package cz.kovi.cviko;

public class Main {

    public static void main(String[] args) {

        Zakaznik zakaznik = new Zakaznik("Jan", "Novák", 20);

        System.out.println(zakaznik.toString());

        Lyze lyze = new Lyze(123, "");

        System.out.println(lyze.toString());
        System.out.println(lyze.hasCustomer());

    }

}
