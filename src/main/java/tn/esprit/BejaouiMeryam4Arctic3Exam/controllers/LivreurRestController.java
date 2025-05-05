package tn.esprit.BejaouiMeryam4Arctic3Exam.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Livreur;
import tn.esprit.BejaouiMeryam4Arctic3Exam.services.ILivreurServices;

@RestController

@RequiredArgsConstructor
public class LivreurRestController {
    ILivreurServices livreurServices;
    @PostMapping("/add-livreur")
    public Livreur addLivreur(@RequestBody Livreur c)
    {
        Livreur livreur= livreurServices.addLivreur(c);
        return livreur;
    }

}
