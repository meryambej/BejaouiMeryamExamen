package tn.esprit.BejaouiMeryam4Arctic3Exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Colis;

import java.util.List;
import java.util.Set;

public interface IColisRepository extends JpaRepository<Colis,Long> {
    List <Colis> findColisByReferenceColis(String ref);
}
