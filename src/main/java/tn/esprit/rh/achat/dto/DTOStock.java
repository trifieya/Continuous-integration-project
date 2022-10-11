package tn.esprit.rh.achat.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.rh.achat.entities.Produit;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class DTOStock {

    private Long idStock;
    private String libelleStock;
    private Integer qte;
    private Integer qteMin;

    private Set<Produit> produits;

    public DTOStock(String libelleStock, Integer qte, Integer qteMin) {
        super();
        this.libelleStock = libelleStock;
        this.qte = qte;
        this.qteMin = qteMin;
    }
}
