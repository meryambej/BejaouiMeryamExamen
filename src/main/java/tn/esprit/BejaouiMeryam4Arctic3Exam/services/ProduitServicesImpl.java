package tn.esprit.BejaouiMeryam4Arctic3Exam.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Produit;

import java.util.List;
@Slf4j
@AllArgsConstructor
@Service
public class ProduitServicesImpl implements IProduitServices{
    @Override
    public List<Produit> retrieveAllProduits() {
        return null;
    }

    @Override
    public Produit retrieveProduit(Long ProduitId) {
        return null;
    }

    @Override
    public Produit addProduit(Produit produit) {
        return null;
    }

    @Override
    public void voidremoveProduit(Long ProduitId) {

    }

    @Override
    public Produit modifyProduit(Produit produit) {
        return null;
    }
}
