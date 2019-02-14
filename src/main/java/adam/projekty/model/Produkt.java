package adam.projekty.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //productId generowany automatycznie
    private String produktId;

    public String getProduktId() {
        return produktId;
    }

    public void setProduktId(String produktId) {
        this.produktId = produktId;
    }

    private String nazwaProduktu;
    private String kategoriaProduktu;
    private String OpisProduktu;
    private double CenaProduktu;
    private String StanProduktu;
    private String StatusProduktu;
    private int IloscWMagazynie;
    private String WykonawcaProduktu;


    @Transient
    private MultipartFile productImage; //obiekt nie nalezy do Pojo :) dlatego transient przechowuje go w images:)

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public String getKategoriaProduktu() {
        return kategoriaProduktu;
    }

    public void setKategoriaProduktu(String kategoriaProduktu) {
        this.kategoriaProduktu = kategoriaProduktu;
    }

    public String getOpisProduktu() {
        return OpisProduktu;
    }

    public void setOpisProduktu(String opisProduktu) {
        OpisProduktu = opisProduktu;
    }

    public double getCenaProduktu() {
        return CenaProduktu;
    }

    public void setCenaProduktu(double cenaProduktu) {
        CenaProduktu = cenaProduktu;
    }

    public String getStanProduktu() {
        return StanProduktu;
    }

    public void setStanProduktu(String stanProduktu) {
        StanProduktu = stanProduktu;
    }

    public String getStatusProduktu() {
        return StatusProduktu;
    }

    public void setStatusProduktu(String statusProduktu) {
        StatusProduktu = statusProduktu;
    }

    public int getIloscWMagazynie() {
        return IloscWMagazynie;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        IloscWMagazynie = iloscWMagazynie;
    }

    public String getWykonawcaProduktu() {
        return WykonawcaProduktu;
    }

    public void setWykonawcaProduktu(String wykonawcaProduktu) {
        WykonawcaProduktu = wykonawcaProduktu;
    }
}
