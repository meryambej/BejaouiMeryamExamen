package tn.esprit.BejaouiMeryam4Arctic3Exam.services;

import tn.esprit.BejaouiMeryam4Arctic3Exam.entities.Client;

import java.util.List;

public interface IClientServices {
    //display everything
    public List<Client> retrieveAllClients();
    //Display by Id
    public Client retrieveClient(Long ClientId);
    //add
    public Client addClient(Client c);
    //delete
    public void voidremoveClient(Long ClientId);
    //update
    public Client modifyClient(Client client);

}
