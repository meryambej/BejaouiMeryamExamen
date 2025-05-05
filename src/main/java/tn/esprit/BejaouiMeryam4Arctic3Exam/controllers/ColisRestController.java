package tn.esprit.BejaouiMeryam4Arctic3Exam.controllers;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Colis;
import tn.esprit.BejaouiMeryam4Arctic3Exam.services.IColisServices;

@RestController

@RequiredArgsConstructor
public class ColisRestController {
    IColisServices colisServices;
    @PostMapping("/add-colis")
    public Colis addColis(@RequestBody Colis c)
    {
        Colis colis= colisServices.addColis(c);
        return colis;
    }
    @PutMapping("/ajoutColisEtAffecterAClient/{id}")
    Colis ajouterColisEtAffecterAClient(@RequestBody Colis c , @PathParam("id") Long idClient)
    {
        return colisServices.ajouterColisEtAffecterAClient(c,idClient);
    }

    @GetMapping("montant/{ref}")
    public float montantAPayerParClient(@PathVariable("ref") String referenceColis) {
       return colisServices.montantAPayerParClient(referenceColis);
    }

}
