import java.util.List;

public class Main {
    static void main() {

        // shopservice erstellen
        ShopService shopService = new ShopService();

        // beispiel produkte erstellen
        Product tv = new Product("tv1", "TV", "Elektro", 300);
        Product handy = new Product("handy1", "Handy", "Elektro", 500);

        //produkte zu repo hinzufügen
        shopService.productRepo.add(tv);
        shopService.productRepo.add(handy);

        System.out.println("Erfolgreiche Bestellung");
        // erstelle eine liste für die bestellung
        List<String> bestellteIds1 = List.of("tv1", "handy1");
        Order ersteBestellung = shopService.addOrder(bestellteIds1);    //bestellungen (mit id und Produkt) werden hinzugefügt und in variable ersteBestellungen gespeichert
        System.out.println("Bestellung erfolgreich aufgegeben: " + ersteBestellung);    //hier wird die ganze bestellung mit (ersteBestellung) angezeigt

        System.out.println("\nBestellung mit Fehler");

        List<String> bestellteIds2 = List.of("tv1", "test1");
        Order zweiteBestellung = shopService.addOrder(bestellteIds2);
        System.out.println("Zweite Bestellung aufgegeben: " + zweiteBestellung);

    }
}
