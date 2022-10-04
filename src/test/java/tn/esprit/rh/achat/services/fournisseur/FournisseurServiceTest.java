package tn.esprit.rh.achat.services.fournisseur;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.services.IFournisseurService;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FournisseurServiceTest {
    @Autowired
    IFournisseurService fs;
    @Test
    @Order(1)
    public void retrieveAll() {
        List<Fournisseur> listFournisseurs = fs.retrieveAllFournisseurs();
        Assertions.assertEquals(0, listFournisseurs.size());
    }
}
