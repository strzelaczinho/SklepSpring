package adam.projekty.model;
public class Produkt {

    private String nazwaProduktu;
    private String kategoriaProduktu;
    private String OpisProduktu;
    private double CenaProduktu;
    private String StanProduktu;
    private String StatusProduktu;
    private int IloscWMagazynie;
    private String WykonawcaProduktu;

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
