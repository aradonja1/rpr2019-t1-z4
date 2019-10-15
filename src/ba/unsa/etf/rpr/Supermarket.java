package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Supermarket {
    private final int max_broj_artikala = 1000;
    private Artikl[] artikli = new Artikl[1000];
    private int broj_artikala_u_marketu = 0;

    public void dodajArtikl(Artikl artikl) {
        if(broj_artikala_u_marketu < max_broj_artikala) {
            artikli[broj_artikala_u_marketu] = artikl;
            broj_artikala_u_marketu = broj_artikala_u_marketu + 1;
        }
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for(int i = 0; i < broj_artikala_u_marketu; i++) {
            if(artikli[i].getKod().equalsIgnoreCase(kod)) {
                a = artikli[i];
                broj_artikala_u_marketu = broj_artikala_u_marketu - 1;
            }
        }
        return a;
    }
}
