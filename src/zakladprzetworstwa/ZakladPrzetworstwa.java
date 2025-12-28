package zakladprzetworstwa;

import java.util.ArrayList;
import java.util.List;

public class ZakladPrzetworstwa {
    private List<Produkt> produkty = new ArrayList<>();
    private List<ProduktPrzetworzony> produktyPrzetworzone = new ArrayList<>();
    private List<Partia> partie = new ArrayList<>();

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void dodajProduktPrzetworzony(ProduktPrzetworzony produkt) {
        produktyPrzetworzone.add(produkt);
    }

    public void zarejestrujPartie(Partia partia) {
        partie.add(partia);
    }

    public void raportStanMagazynu() {
        System.out.println("📦 STAN MAGAZYNU:");
        produkty.forEach(System.out::println);
        produktyPrzetworzone.forEach(System.out::println);
    }

    public void raportProdukcji() {
        System.out.println("🏭 RAPORT PRODUKCJI:");
        partie.forEach(System.out::println);

    }
    public List<Produkt> getProdukty() {
        return produkty;
    }
}

