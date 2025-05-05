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
public class Livreur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idLivreur;
    String nomLivreur;
    String prenomLivreur;
    //relation bi child
    @OneToMany(mappedBy = "livreur")
    Set <Colis> colis;
}
