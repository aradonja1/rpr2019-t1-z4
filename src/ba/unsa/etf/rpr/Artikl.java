package ba.unsa.etf.rpr;

public class Artikl {
    private String nazivArtikla, kod;
    private int cijena;
    public Artikl (String nazivArtikla, int cijena, String kod) {
        this.nazivArtikla = nazivArtikla;
        this.cijena = cijena;
        this.kod = kod;
    }
    public String getNaziv() { return nazivArtikla; }
    public String getKod() {return kod; }
    public int getCijena() {return cijena; }
}
