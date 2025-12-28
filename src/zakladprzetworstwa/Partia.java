package zakladprzetworstwa;

import java.time.LocalDate;

public class Partia {
    private Produkt produkt;
    private int iloscSurowca;
    private LocalDate dataProdukcji;

    public Partia(Produkt produkt, int iloscSurowca, LocalDate dataProdukcji) {
        this.produkt = produkt;
        this.iloscSurowca = iloscSurowca;
        this.dataProdukcji = dataProdukcji;
    }

    @Override
    public String toString() {
        return "Partia: " + produkt.getNazwa() +
                ", surowiec: " + iloscSurowca +
                ", data: " + dataProdukcji;
    }
}

