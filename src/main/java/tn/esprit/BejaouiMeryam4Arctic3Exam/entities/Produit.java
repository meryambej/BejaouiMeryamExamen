package tn.esprit.BejaouiMeryam4Arctic3Exam.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idProduit;
    String identifiant;
    @Enumerated(EnumType.STRING)
    Categorie categorieProd;
    //relation bi child
    @ManyToMany(mappedBy = "produits" )
    Set<Colis> colises;

}
