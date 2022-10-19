
package tn.esprit.rh.achat.Tests;


import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.SecteurActivite;
import tn.esprit.rh.achat.repositories.SecteurActiviteRepository;
import tn.esprit.rh.achat.services.ISecteurActiviteService;


@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
public class SecteurActiviteServiceImplTest {
	@Autowired
	ISecteurActiviteService secteurService;
	

	@Test
	@Order(1)
	public void testRetrieveAllSecteur() {
		List<SecteurActivite> allSActivite = secteurService.retrieveAllSecteurActivite();
		assertEquals(0, allSActivite.size());
	}

	//@Test
	//@Order(2)
	//public void testAddSecteur() throws ParseException {
	////	SecteurActivite sa = new SecteurActivite(null,"test","testtest",null);
    // SecteurActivite savedSecteur = secteurService.addSecteurActivite(sa);
	//	assertEquals(sa.getlibelleSecteurActivite(), savedSecteur.getlibelleSecteurActivite());
//}
	@Test
	@Order(3)
	public void testRetrieveSecteur() {
	SecteurActivite sec = secteurService.retrieveSecteurActivite(2L);
	assertEquals(2L, sec.getIdSecteurActivite().longValue());
	}
        @Test
	@Order(4)
	public void testDeleteSectuer() {
	secteurService.deleteSecteurActivite(2L);
	assertNull(secteurService.retrieveSecteurActivite(2L));
	}

}
