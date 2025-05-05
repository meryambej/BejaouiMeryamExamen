package tn.esprit.BejaouiMeryam4Arctic3Exam.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Produit;
import tn.esprit.BejaouiMeryam4Arctic3Exam.services.IProduitServices;

@RestController
@RequiredArgsConstructor
public class ProduitRestController {
    IProduitServices produitServices;
    @PostMapping("/add-produit")
    public Produit addProduit(@RequestBody Produit c)
    {
       Produit produit=produitServices.addProduit(c);
       return produit;
    }

}
