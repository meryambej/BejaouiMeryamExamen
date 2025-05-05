package tn.esprit.BejaouiMeryam4Arctic3Exam.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;
import tn.esprit.BejaouiMeryam4Arctic3Exam.services.IClientServices;

@RestController

@RequiredArgsConstructor
public class ClientRestController {
    IClientServices  clientServices;
    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c)
    {
        Client client= clientServices.addClient(c);
        return client;
    }

}
