package tn.esprit.BejaouiMeryam4Arctic3Exam.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Colis;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Livreur;
import tn.esprit.BejaouiMeryam4Arctic3Exam.repositories.IClientRepository;
import tn.esprit.BejaouiMeryam4Arctic3Exam.repositories.IColisRepository;
import tn.esprit.BejaouiMeryam4Arctic3Exam.repositories.ILivreurRepository;

import javax.xml.stream.events.Comment;
import java.util.List;
@Slf4j
@AllArgsConstructor
@Service
public class ColisServicesImpl implements IColisServices{
    IColisRepository colisRepository;
    IClientRepository clientRepository;
    @Override
    public List<Colis> retrieveAllColises() {
        return null;
    }

    @Override
    public Colis retrieveColis(Long ColisId) {
        return null;
    }

    @Override
    public Colis addColis(Colis colis) {
        return colisRepository.save(colis);
    }

    @Override
    public void voidremoveColis(Long ColisId) {

    }

    @Override
    public Colis modifyColis(Colis colis) {
        return null;
    }
   //affectation parent
    @Override
    public Colis ajouterColisEtAffecterAClient(Colis c, Long idClient) {
        //on cherche le client
        Client cl = clientRepository.findById(idClient).orElse(null);
        //on ajoute le colis
        Colis colis =colisRepository.save(c);
        //affection le colis au client
        colis.setClient(cl);
        //on enregistre
        clientRepository.save(cl) ;
        return colis;
    }

    @Override
    public void ajouterLivreurEtAffecterColisAlivreur(Livreur l, List<String> referenceColis) {

    }

    @Override

    public void mettreAjourEtAfficherColis() {

        List <Colis> col = colisRepository.findAll();

    }

    @Override
    public float montantAPayerParClient(String referenceColis) {
        float montant = 0;
        Colis col = (Colis) colisRepository.findColisByReferenceColis(referenceColis);
        //livraison gratuite
        if (col.getPrixCommande()>100)
            montant = col.getPrixCommande();
        //+ 8dt
        else
            montant = col.getPrixCommande()+8;
        return montant;
    }
}
