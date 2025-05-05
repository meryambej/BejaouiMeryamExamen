package tn.esprit.BejaouiMeryam4Arctic3Exam.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;
import tn.esprit.BejaouiMeryam4Arctic3Exam.repositories.IClientRepository;

import java.util.List;
@Slf4j
@AllArgsConstructor
@Service
public class ClientServicesImpl implements IClientServices {
    IClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client retrieveClient(Long ClientId) {
        return clientRepository.findById(ClientId).orElse(null);


    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void voidremoveClient(Long ClientId) {
        clientRepository.deleteById(ClientId);
    }

    @Override
    public Client modifyClient(Client client) {
        return clientRepository.save(client);

    }



}
