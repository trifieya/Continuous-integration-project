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
public class OperateurServiceTest {

    @Autowired
    IOperateurService os;

    @Test
    @Order(1)
    public void testretrieveAllOperateurs(){
        List<Operateur> listOperateurs = os.retrieveAllOperateurs();
        Assertions.assertEquals(4,listOperateurs.size());
    }

    @Test
    @Order(2)
    public void testretrieveOperateur(){
        Operateur op = os.retrieveOperateur(7L);
        Assertions.assertEquals(7L, op.getIdOperateur().longValue());
    }

    @Test
    @Order(3)
    public void testaddOperateur(){
        Operateur op =Operateur.builder()
                .nom("Trifi")
                .prenom("Eya")
                .password("root")
                .build();
        os.addOperateur(op);


    }

    @Test
    @Order(4)
    public void testdeleteOperateur(){
        Operateur op = os.retrieveOperateur(6L);
        os.deleteOperateur(6L);
        //Assertions.assertEquals(- 1,os.retrieveAllOperateurs().size());
        //Assertions.assertNull(op);

    }

    @Test
    @Order(5)
    public void tesupdateOperateur(){
        Operateur op = os.retrieveOperateur(7L);
        op.setPrenom("Lassaad");
        os.updateOperateur(op);
        Assertions.assertEquals("Lassaad", op.getPrenom());

    }














}
