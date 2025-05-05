package tn.esprit.BejaouiMeryam4Arctic3Exam.services;

import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Colis;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Livreur;

import java.util.List;

public interface IColisServices {
    //display everything
    public List<Colis> retrieveAllColises();
    //Display by Id
    public Colis retrieveColis(Long ColisId);
    //add
    public Colis addColis(Colis colis);
    //delete
    public void voidremoveColis(Long ColisId);
    //update
    public Colis modifyColis(Colis colis);

    //affectation
    public Colis ajouterColisEtAffecterAClient(Colis c , Long idClient);
     //affectation
    public void ajouterLivreurEtAffecterColisAlivreur(Livreur l , List<String> referenceColis  );
    //scheduler
    public void mettreAjourEtAfficherColis();
    //montant
    public float montantAPayerParClient(String referenceColis);

}
