package adam.projekty.dao;

import adam.projekty.model.Produkt;

import java.util.List;

public interface ProduktDao {
    void dodajProdukt(Produkt produkt);

    Produkt pobierzIdProduktu(String id);
    List<Produkt> pobierzWszystkieProdukty();

    void usunProdukt(String id);

}
