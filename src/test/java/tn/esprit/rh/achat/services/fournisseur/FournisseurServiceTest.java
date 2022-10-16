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
    public void testSaveFournisseur(){

        Fournisseur f= FournisseurServiceImpl.addFournisseur(Fournisseur.builder().libelle("test fournisseur").code(1).build());
        Assertions.assertNotNull(s);
    }
    
    @Test
    @Order(2)
    public void testRetrieveAllFournisseurs() {
        int listFournisseurs = FournisseurServiceImpl.retrieveAllFournisseurs().size();
        FournisseurServiceImpl.addFournisseur(Fournisseur.builder().libelle("test fournisseur").code(1).build());
        Assertions.assertEquals(listFournisseurs+1, FournisseurServiceImpl.retrieveAllFournisseurs().size());
    }
    
    @Test
    @Order(3)
    public void testRetrieveOneFournisseur() {
        Fournisseur f = FournisseurServiceImpl.addFournisseur(Fournisseur.builder().libelle("test fournisseur").code(1).build());

        Assertions.assertEquals(f.getIdFournisseur(),FournisseurServiceImpl.retrieveFournisseur(f.getIdFournisseur()).getIdFournisseur());
       
    }
    
     @Test
    @Order(4)
    public void testUpdateFournisseur() {
        Fournisseur f = FournisseurServiceImpl.addFournisseur(Fournisseur.builder().libelle("test fournisseur").code(1).build());
        f.setQteMin(5);
        Assertions.assertEquals(5,FournisseurServiceImpl.updateFournisseur(f).getQteMin());
    }
    
    @Test
    @Order(5)
    public void testDeleteFournisseur(){

        Fournisseur f = FournisseurServiceImpl.addFournisseur(Fournisseur.builder().libelle("test fournisseur").code(1).build());
        FournisseurServiceImpl.deleteFournisseur(f.getIdFournisseur());
        Assertions.assertNull(FournisseurServiceImpl.retrieveFournisseur(f.getIdFournisseur()));

    }
    
    
    
    
    
    
    
    
    
}
