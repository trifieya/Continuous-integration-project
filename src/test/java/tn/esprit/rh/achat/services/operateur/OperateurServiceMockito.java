//package tn.esprit.rh.achat.services.operateur;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//import tn.esprit.rh.achat.entities.Operateur;
//import tn.esprit.rh.achat.repositories.OperateurRepository;
//import tn.esprit.rh.achat.services.OperateurServiceImpl;
//
//import java.util.Optional;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//public class OperateurServiceMockito {
//    @Mock
//    OperateurRepository operateurRepositoryMock;
//    @InjectMocks
//    OperateurServiceImpl operateurService;
//
//
//    Operateur op = new Operateur(22L,"Farah","Ayari","root");
//
//    @Test
//    void testretrieveOperateur(){
//        Mockito.when(operateurRepositoryMock.findById(Mockito.anyLong())).thenReturn(Optional.of(op)); //find all
//        Operateur op1 = operateurService.retrieveOperateur(50L);
//        Assertions.assertNotNull(op1);
//
//    }
//
//}
