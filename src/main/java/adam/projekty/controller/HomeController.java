package adam.projekty.controller;

import adam.projekty.dao.ProductDao;
import adam.projekty.model.Produkt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;


@Controller
public class HomeController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home() {
        return "home";
    }


    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Produkt> products = productDao.pobierzProdukty();
        model.addAttribute("produkty", products);

        return "produktLista";
    }

    @RequestMapping("/productList/viewProdukt/{produktId}") //adres z tzw PathVariable
    public String viewProdukt(@PathVariable String produktId,Model model) throws IOException //PathVariable łapie tutaj czyli zbindowana wartosc {produktId}. Wartosc ze strony :) czyli wartosc kliknieta
    {
        Produkt produkt = productDao.pobierzProduktPoId(produktId); //przekazuje tutaj produkt Id i wyszukuje caly produkt gdzies tam w bazie czy liscie po id
        model.addAttribute("produkt",produkt);
        return "produktDetail";
    }
}
