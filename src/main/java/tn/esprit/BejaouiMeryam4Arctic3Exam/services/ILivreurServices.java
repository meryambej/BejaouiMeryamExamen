package tn.esprit.BejaouiMeryam4Arctic3Exam.services;

import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Colis;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Livreur;

import java.util.List;

public interface ILivreurServices {
    //display everything
    public List<Livreur> retrieveAllLivreurs();
    //Display by Id
    public Livreur retrieveLivreur(Long LivreurId);
    //add
    public Livreur addLivreur(Livreur livreur);
    //delete
    public void voidremoveLivreur(Long LivreurId);
    //update
    public Livreur modifyLivreur(Livreur livreur);
}
