package adam.projekty.controller;

import adam.projekty.dao.ProduktDao;
import adam.projekty.model.Produkt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@Controller
public class HomeController {

    private Path path;

    @Autowired
    private ProduktDao produktDao;

    @RequestMapping("/")
    public String home() {
        return "home";
    }


    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Produkt> products = produktDao.pobierzWszystkieProdukty();
        model.addAttribute("produkty", products);

        return "produktLista";
    }

    @RequestMapping("/productList/viewProdukt/{produktId}") //adres z tzw PathVariable
    public String viewProdukt(@PathVariable String produktId,Model model) throws IOException //PathVariable łapie tutaj czyli zbindowana wartosc {produktId}. Wartosc ze strony :) czyli wartosc kliknieta
    {
        Produkt produkt = produktDao.pobierzIdProduktu(produktId); //przekazuje tutaj produkt Id i wyszukuje caly produkt gdzies tam w bazie czy liscie po id
        model.addAttribute("produkt",produkt);
        return "produktDetail";
    }
    @RequestMapping("/admin")
    public String stronaAdmina()
    {
        return "admin";
    }
    @RequestMapping("/admin/produktInventory")
    public String inventoryProduktu(Model model)
    {
       List<Produkt> produkty = produktDao.pobierzWszystkieProdukty();
       model.addAttribute("produkty",produkty);

       return "produktInvektory";
    }
    @RequestMapping("/admin/produktInventory/dodajProdukt")
    public String dodajProdukt(Model model) {
        Produkt produkt = new Produkt();
        produkt.setKategoriaProduktu("instrument");
        produkt.setStanProduktu("nowy");
        produkt.setStatusProduktu("aktywny");

        model.addAttribute("produkt", produkt);

        return "dodajProdukt";
    }
    @RequestMapping(value = "/admin/produktInventory/dodajProdukt", method = RequestMethod.POST)
    public String dodajProduktPost(@ModelAttribute("produkt") Produkt produkt, HttpServletRequest request) { //tutaj pobieram informacje o produkcie w modelu  , dane sa zbindowane do obiektu
        produktDao.dodajProdukt(produkt);

        MultipartFile productImage = produkt.getProductImage(); // pobieram z formy multipart :)
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\"+produkt.getProduktId()+".png");

        if (productImage != null && !productImage.isEmpty())
        {
            try
            {
                productImage.transferTo(new File(path.toString()));
            }catch(Exception e)
            {
                e.printStackTrace();
                throw new RuntimeException("Zdjecie produktu zostało zapisane błędnie");

            }
        }
        return "redirect:/admin/produktInventory";
    }
    @RequestMapping("/admin/produktInventory/usunProdukt/{id}")
    public String usunProdukt(@PathVariable String id, Model model, HttpServletRequest request) {
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\"+id+".png");

        if (Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        produktDao.usunProdukt(id);

        return "redirect:/admin/produktInventory";
    }
}
