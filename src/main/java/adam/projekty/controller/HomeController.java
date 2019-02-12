package adam.projekty.controller;

import adam.projekty.dao.ProductDao;
import adam.projekty.model.Produkt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
