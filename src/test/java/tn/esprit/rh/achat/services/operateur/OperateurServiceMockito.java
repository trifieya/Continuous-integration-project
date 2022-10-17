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
public class OperateurServiceMockito {
    @Mock
    OperateurRepository operateurRepositoryMock;
    @InjectMocks
    OperateurServiceImpl operateurService;

    Operateur op = Operateur.builder().nom("Eya").prenom("Trifi").password("root").build();
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
    public void testaddOperateur() {
        Mockito.when(operateurRepositoryMock.save(op)).thenReturn(op);
        Operateur op1 = operateurService.addOperateur(op);
        Assertions.assertNotNull(op1);

    }

    @Test
    public void testretrieveAllOperateurs() {
        Mockito.when(operateurRepositoryMock.findAll()).thenReturn(listOperateurs);
        List<Operateur> listOp = operateurService.retrieveAllOperateurs();
        Assertions.assertNotNull(listOp);
    }









}