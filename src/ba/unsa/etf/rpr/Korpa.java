package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int broj_artikala_u_korpi = 0;
    public Boolean dodajArtikl (Artikl artikl) {
        if (broj_artikala_u_korpi < 50) {
            artikli[broj_artikala_u_korpi] = artikl;
            broj_artikala_u_korpi = broj_artikala_u_korpi + 1;
        } else {
            return false;
        }
    return true;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for(int i = 0; i < broj_artikala_u_korpi; i++) {
            if(artikli[i].getKod().equalsIgnoreCase(kod)) {
                a = artikli[i];
                broj_artikala_u_korpi = broj_artikala_u_korpi - 1;
            }
        }
        return a;
    }
    public Artikl[] getArtikli() {
        return artikli;
    }
    public int dajUkupnuCijenuArtikala(){
        int ukupna_cijena = 0;
        for(int i = 0; i < broj_artikala_u_korpi; i++) ukupna_cijena = ukupna_cijena + artikli[i].getCijena();
        return ukupna_cijena;
    }



}
