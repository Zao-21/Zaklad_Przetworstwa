# Zaklad_Przetworstwa
Opis projektu
Projekt jest konsolową aplikacją w języku Java symulującą działanie zakładu przetwórstwa warzyw i owoców.
System umożliwia zarządzanie surowcami, produktami przetworzonymi, dostawami oraz procesem produkcji.
Aplikacja wykorzystuje programowanie obiektowe i działa w trybie tekstowym (CLI).

Funkcjonalności

-dodawanie surowców
-rejestrowanie dostaw
-kontrola stanów magazynowych
-rejestrowanie partii produkcyjnych
-generowanie raportów
-obsługa użytkownika przez Scanner

Struktura projektu

ZakladPrzetworstwa
Produkt
ProduktPrzetworzony
Partia
Dostawa
TypProduktu (enum)
TypPrzetworzonegoProduktu (enum)
Main

Opis klas
ZakladPrzetworstwa
Klasa zarządzająca systemem. Przechowuje listy produktów, produktów przetworzonych oraz partii produkcyjnych. Odpowiada za generowanie raportów.

Produkt
Reprezentuje surowiec (np. owoce lub warzywa). Przechowuje nazwę, cenę, ilość oraz typ produktu.

ProduktPrzetworzony
Reprezentuje produkt gotowy powstały z surowców (np. sok, dżem). Zawiera listę składników, ilość oraz typ produktu przetworzonego.

Partia
Opisuje pojedynczą partię produkcyjną wraz z datą i ilością zużytego surowca.

Dostawa
Reprezentuje dostawę surowców do magazynu. Po utworzeniu automatycznie zwiększa stan magazynowy produktu.

TypProduktu
Enum określający kategorie surowców (np. owoce, warzywa).

TypPrzetworzonegoProduktu
Enum określający rodzaje produktów przetworzonych (np. sok, dżem, mrożonka).

Main
Punkt startowy aplikacji. Odpowiada za menu, obsługę wejścia użytkownika oraz wywoływanie logiki systemu.

Uruchomienie
Uruchom klasę Main w środowisku IDE i obsługuj aplikację z poziomu konsoli.
