package tn.esprit.BejaouiMeryam4Arctic3Exam.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Livreur;

import java.util.List;
@Slf4j
@AllArgsConstructor
@Service
public class LivreurServicesImpl implements ILivreurServices{
    @Override
    public List<Livreur> retrieveAllLivreurs() {
        return null;
    }

    @Override
    public Livreur retrieveLivreur(Long LivreurId) {
        return null;
    }

    @Override
    public Livreur addLivreur(Livreur livreur) {
        return null;
    }

    @Override
    public void voidremoveLivreur(Long LivreurId) {

    }

    @Override
    public Livreur modifyLivreur(Livreur livreur) {
        return null;
    }
}
