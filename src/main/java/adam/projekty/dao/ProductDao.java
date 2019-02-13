package adam.projekty.dao;

import adam.projekty.model.Produkt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ProductDao {

    private List<Produkt> listaProduktow;

    public List<Produkt> pobierzProdukty() {
        Produkt product1 = new Produkt();
        product1.setProduktId("1");
        product1.setNazwaProduktu("Gitara");
        product1.setKategoriaProduktu("Instrument");
        product1.setOpisProduktu("Jakas!");
        product1.setCenaProduktu(1200);
        product1.setStanProduktu("new");
        product1.setStatusProduktu("Aktywny");
        product1.setIloscWMagazynie(11);
        product1.setWykonawcaProduktu("Znawca");

        Produkt product2 = new Produkt();
        product2.setProduktId("2");
        product2.setNazwaProduktu("Record1");
        product2.setKategoriaProduktu("Record");
        product2.setOpisProduktu("Najlepszy Mix kawalkoww!");
        product2.setCenaProduktu(25);
        product2.setStanProduktu("new");
        product2.setStatusProduktu("Aktywny");
        product2.setIloscWMagazynie(51);
        product2.setWykonawcaProduktu("EMI");

        Produkt product3 = new Produkt();
        product3.setProduktId("3");
        product3.setNazwaProduktu("Record2");
        product3.setKategoriaProduktu("Record");
        product3.setOpisProduktu("Inny Mix");
        product3.setCenaProduktu(25);
        product3.setStanProduktu("new");
        product3.setStatusProduktu("Aktywny");
        product3.setIloscWMagazynie(51);
        product3.setWykonawcaProduktu("EMI");

        listaProduktow =new ArrayList<Produkt>();
        listaProduktow.add(product1);
        listaProduktow.add(product2);
        listaProduktow.add(product3);


        return listaProduktow;
    }
    public Produkt pobierzProduktPoId(String produktId) throws IOException {
        for (Produkt produkt:listaProduktow)
        {

                if(produkt.getProduktId().equals(produktId)) {
                    return produkt;
                }
        }
        throw new IOException("Nie znaleziono produktu");
    }


}
