package tn.esprit.BejaouiMeryam4Arctic3Exam.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity
public class Colis {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idColis;
    String referenceColis;
    Float prixCommande;
    LocalDate dateLivraison;
    @Enumerated(EnumType.STRING)
    Etat etatColis;
    //relation 1 bi parent
    @JsonIgnore
    @ManyToOne
    Client client;
    //relation 2 bi parent
    @JsonIgnore
    @ManyToOne
    Livreur livreur;
    //relation 3 bi parent
    @JsonIgnore
    @ManyToMany
    Set<Produit> produits;
}
