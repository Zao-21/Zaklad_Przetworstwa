package zakladprzetworstwa;

public class Produkt {
  private String nazwa;
    private double cena;
    private int ilosc;
    private TypProduktu typ;

    public Produkt(String nazwa, double cena, int ilosc, TypProduktu typ) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
        this.typ = typ;
    }

    public void dodajIlosc(int ilosc) {
        this.ilosc += ilosc;
    }

    public void odejmijIlosc(int ilosc) {
        this.ilosc -= ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public String toString() {
        return nazwa + "(" + typ + "), ilosc:"+ilosc;
    }
}

