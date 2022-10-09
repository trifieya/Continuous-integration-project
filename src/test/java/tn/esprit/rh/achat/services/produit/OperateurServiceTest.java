package tn.esprit.rh.achat.services.produit;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.services.IOperateurService;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class OperateurServiceTest {

    @Autowired
    IOperateurService os;

    @Test
    @Order(1)
     void testretrieveAllOperateurs(){
        List<Operateur> listOperateurs = os.retrieveAllOperateurs();
        Assertions.assertEquals(7,listOperateurs.size());
    }

    @Test
    @Order(2)
     void testretrieveOperateur(){
        Operateur op = os.retrieveOperateur(7L);
        Assertions.assertEquals(7L, op.getIdOperateur().longValue());
    }

    @Test
    @Order(3)
     void testaddOperateur(){
        Operateur op =Operateur.builder()
                .nom("Trifi")
                .prenom("Eya")
                .password("root")
                .build();
        os.addOperateur(op);
        Assertions.assertEquals(+ 1, os.retrieveAllOperateurs().size());


    }

    @Test
    @Order(4)
     void testdeleteOperateur(){
        Operateur op = os.retrieveOperateur(10L);
        os.deleteOperateur(op.getIdOperateur());
        //Assertions.assertEquals(- 1,os.retrieveAllOperateurs().size());
        Assertions.assertNull(op.getIdOperateur());

    }

    @Test
    @Order(5)
     void tesupdateOperateur(){
        Operateur op = os.retrieveOperateur(7L);
        op.setPrenom("Lassaad");
        os.updateOperateur(op);
        Assertions.assertEquals("Lassaad", op.getPrenom());

    }














}
