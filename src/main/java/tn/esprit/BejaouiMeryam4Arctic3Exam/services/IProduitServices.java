package tn.esprit.BejaouiMeryam4Arctic3Exam.services;

import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Colis;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Livreur;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Produit;

import java.util.List;

public interface IProduitServices {
    //display everything
    public List<Produit> retrieveAllProduits();
    //Display by Id
    public Produit retrieveProduit(Long ProduitId);
    //add
    public Produit addProduit(Produit produit);
    //delete
    public void voidremoveProduit(Long ProduitId);
    //update
    public Produit modifyProduit(Produit produit);
}
