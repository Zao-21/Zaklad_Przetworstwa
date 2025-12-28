package zakladprzetworstwa;

import java.time.LocalDate;

public class Dostawa {
    private Produkt produkt;
    private int ilosc;
    private LocalDate dataDostawy;

    public Dostawa(Produkt produkt, int ilosc, LocalDate dataDostawy) {
        this.produkt = produkt;
        this.ilosc = ilosc;
        this.dataDostawy = dataDostawy;
        produkt.dodajIlosc(ilosc);
    }

    @Override
    public String toString() {
        return "Dostawa: " + produkt.getNazwa() +
                ", ilość: " + ilosc +
                ", data: " + dataDostawy;
    }
}

