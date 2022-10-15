package tn.esprit.rh.achat.services.operateur;

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
     void testaddOperateur(){
        Operateur op =Operateur.builder()
                .nom("Trifi")
                .prenom("Eya")
                .password("root")
                .build();
        os.addOperateur(op);
        Assertions.assertNotNull(op);


    }

   














}
