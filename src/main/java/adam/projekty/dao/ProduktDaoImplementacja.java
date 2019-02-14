package adam.projekty.dao;

import adam.projekty.model.Produkt;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository // podobne jak Service :) Repository mowwi ze to jest cos co mowi ze to kontaktuje sie z baza danych
@Transactional // teraz Spring i Hibernate wie jak traktowac transakcje w Springu . Co robic pokolei , czy kolejkowac czy nie
public class ProduktDaoImplementacja implements ProduktDao {

    @Autowired
    private SessionFactory sessionFactory; // to jest zarejestrowany bean ktory zostanie odnaleziony ( wtym przypadku w application context) i wstrzykneity

    public void dodajProdukt(Produkt produkt) {
        Session session = sessionFactory.getCurrentSession(); //session uzywany za kazdym razem kiedy chcemy uuzyc session factory
        session.saveOrUpdate(produkt);
        session.flush();
    }

    public Produkt pobierzIdProduktu(String id) {
        Session session = sessionFactory.getCurrentSession();
        Produkt produkt = (Produkt) session.get(Produkt.class,id); //hibernate teraz wie o ktora klase chdodzi i wyszuka taki obiekt z takim id;
        session.flush();
        return produkt;
    }

    public List<Produkt> pobierzWszystkieProdukty() {

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Produkt"); // czyli wszystko z produktow
        List<Produkt> listaProduuktow = query.list();
        session.flush();
        return listaProduuktow;
    }

    public void usunProdukt(String id) {

        Session session = sessionFactory.getCurrentSession();
        session.delete(pobierzIdProduktu(id));
        session.flush();
    }


}
