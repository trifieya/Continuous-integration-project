package tn.esprit.rh.achat.services.produit;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.entities.Stock;
import tn.esprit.rh.achat.services.IStockService;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class StockServiceTest {

    @Autowired
    IStockService StockServiceImpl;


    //test ajout stoc
    @Test
    @Order(1)
    public void testSaveStock(){

        Stock s= StockServiceImpl.addStock(Stock.builder().libelleStock("stock test").qte(100).qteMin(10).build());
        Assertions.assertNotNull(s);
    }
    @Test
    @Order(2)
    public void testRetrieveAllStocks() {
        int listStocks = StockServiceImpl.retrieveAllStocks().size();
        StockServiceImpl.addStock(Stock.builder().libelleStock("stock test").qte(100).qteMin(10).build());
        Assertions.assertEquals(listStocks+1, StockServiceImpl.retrieveAllStocks().size());
    }
    @Test
    @Order(3)
    public void testRetrieveOneStock() {
        Stock s= StockServiceImpl.addStock(Stock.builder().libelleStock("stock test").qte(100).qteMin(10).build());

        Assertions.assertEquals(s.getIdStock(),StockServiceImpl.retrieveStock(s.getIdStock()).getIdStock());
    }
    @Test
    @Order(4)
    public void testUpdateStock() {
        Stock s= StockServiceImpl.addStock(Stock.builder().libelleStock("stock test").qte(100).qteMin(10).build());
        s.setQteMin(5);
        Assertions.assertEquals(5,StockServiceImpl.updateStock(s).getQteMin());
    }
    @Test
    @Order(5)
    public void testDeletetock(){

        Stock s= StockServiceImpl.addStock(Stock.builder().libelleStock("stock test").qte(100).qteMin(10).build());
        StockServiceImpl.deleteStock(s.getIdStock());
        Assertions.assertNull(StockServiceImpl.retrieveStock(s.getIdStock()));

    }
}
