package tn.esprit.rh.achat.services.operateur;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.repositories.OperateurRepository;
import tn.esprit.rh.achat.services.OperateurServiceImpl;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
 class OperateurServiceMockito {
    @Mock
    OperateurRepository operateurRepositoryMock;
    @InjectMocks
    OperateurServiceImpl operateurService;


    Operateur op = Operateur.builder().nom("Eyaaaaaaaaaaaaa").prenom("Trifi").password("root").build();
    List<Operateur> listOperateurs = new ArrayList<Operateur>(){
        {
            add(Operateur.builder().nom("Amina").prenom("Trifi").password("root").build());
            add(Operateur.builder().nom("Amine").prenom("Trifi").password("root").build());
            add(Operateur.builder().nom("Noura").prenom("Trifi").password("root").build());
            add(Operateur.builder().nom("Lassaad").prenom("Trifi").password("root").build());

        }

    };

    @Test
    void testretrieveOperateur(){
        Mockito.when(operateurRepositoryMock.findById(Mockito.anyLong())).thenReturn(Optional.of(op)); //find all
        Operateur op1 = operateurService.retrieveOperateur(2L);
        Assertions.assertNotNull(op1);

    }
    @Test
     void testaddOperateur() {
        Mockito.when(operateurRepositoryMock.save(op)).thenReturn(op);
        Operateur op1 = operateurService.addOperateur(op);
        Assertions.assertNotNull(op1);

    }

    @Test
     void testretrieveAllOperateurs() {
        Mockito.when(operateurRepositoryMock.findAll()).thenReturn(listOperateurs);
        List<Operateur> listOp = operateurService.retrieveAllOperateurs();
        Assertions.assertNotNull(listOp);
    }



    @Test
     void tesupdateOperateur() {
        op.setPrenom("Hamdi");
        Mockito.when(operateurRepositoryMock.save(op)).thenReturn(op);
        Operateur op1 = operateurService.updateOperateur(op);
        Assertions.assertEquals(op.getPrenom(),op1.getPrenom());

    }

    @Test
     void testdeleteOperateur() {
        Operateur op2 = Operateur.builder().nom("Miral").prenom("Trifi").password("root").build();
        operateurService.deleteOperateur(op2.getIdOperateur());
        Mockito.verify(operateurRepositoryMock).deleteById(op2.getIdOperateur());

    }

}
