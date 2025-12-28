package zakladprzetworstwa;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ZakladPrzetworstwa zaklad = new ZakladPrzetworstwa();

    public static void main(String[] args) {

        boolean dziala = true;

        while (dziala) {
            pokazMenu();
            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1 -> dodajProdukt();
                case 2 -> dodajDostawe();
                case 3 -> zaklad.raportStanMagazynu();
                case 4 -> zaklad.raportProdukcji();
                case 0 -> {
                    dziala = false;
                    System.out.println("👋 Zamykanie programu");
                }
                default -> System.out.println("❌ Nieprawidłowy wybór");
            }
        }
    }

    private static void pokazMenu() {
        System.out.println("""
                
                ==== ZAKŁAD PRZETWÓRSTWA ====
                1. Dodaj produkt (surowiec)
                2. Dodaj dostawę
                3. Pokaż stan magazynu
                4. Pokaż raport produkcji
                0. Wyjście
                ===========================
                Wybierz opcję:
                """);
    }

    private static void dodajProdukt() {
        System.out.print("Nazwa produktu: ");
        String nazwa = scanner.nextLine();

        System.out.print("Cena: ");
        double cena = scanner.nextDouble();

        System.out.print("Ilość: ");
        int ilosc = scanner.nextInt();

        System.out.println("Typ produktu:");
        for (int i = 0; i < TypProduktu.values().length; i++) {
            System.out.println(i + " - " + TypProduktu.values()[i]);
        }

        int typIndex = scanner.nextInt();
        TypProduktu typ = TypProduktu.values()[typIndex];

        Produkt produkt = new Produkt(nazwa, cena, ilosc, typ);
        zaklad.dodajProdukt(produkt);

        System.out.println("✅ Produkt dodany");
    }

    private static void dodajDostawe() {
        if (zaklad.getProdukty().isEmpty()) {
            System.out.println("❌ Brak produktów");
            return;
        }

        System.out.println("Wybierz produkt:");
        for (int i = 0; i < zaklad.getProdukty().size(); i++) {
            System.out.println(i + " - " + zaklad.getProdukty().get(i).getNazwa());
        }

        int index = scanner.nextInt();
        Produkt produkt = zaklad.getProdukty().get(index);

        System.out.print("Ilość dostawy: ");
        int ilosc = scanner.nextInt();

        new Dostawa(produkt, ilosc, LocalDate.now());
        System.out.println("🚚 Dostawa dodana");
    }
}
