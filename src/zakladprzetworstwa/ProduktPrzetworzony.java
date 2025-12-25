package zakladprzetworstwa;
import java.util.List;

public class ProduktPrzetworzony {
  private String nazwa;
    private List<Produkt> skladniki;
    private double cena;
    private int ilosc;
    private TypPrzetworzonegoProduktu typ;

    public ProduktPrzetworzony(String nazwa, List<Produkt> skladniki, double cena, int ilosc, TypPrzetworzonegoProduktu typ) {
        this.nazwa = nazwa;
        this.skladniki = skladniki;
        this.cena = cena;
        this.ilosc = ilosc;
        this.typ = typ;
    }

    public void dodajIlosc(int ilosc) {
        this.ilosc += ilosc;
    }
    public String toString(){
        return nazwa + " (" + typ + "), ilość: " + ilosc;
    }
}

