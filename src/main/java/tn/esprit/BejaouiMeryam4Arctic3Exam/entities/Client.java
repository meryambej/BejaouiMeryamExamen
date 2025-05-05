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
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idClient;
    String nomClient;
    String numTel;
    //relation bi child
    @OneToMany(mappedBy = "client")
    Set<Colis> colis;
}
