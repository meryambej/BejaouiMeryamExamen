package tn.esprit.BejaouiMeryam4Arctic3Exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;

import java.util.List;

public interface IClientRepository extends JpaRepository <Client , Long>
{

}
