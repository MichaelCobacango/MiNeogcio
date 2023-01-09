package com.example.demo.Services;

import com.example.demo.Models.ClientModel;
import com.example.demo.Repositories.ClientRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {

  @Autowired
  ClientRepository clientRepository;

  public ArrayList<ClientModel> getClients() {
    return (ArrayList<ClientModel>) clientRepository.findAll();
  }

  public ClientModel addClient(ClientModel client) {
    return clientRepository.save(client);
  }

  public Optional<ClientModel> findById(Long id) {
    return clientRepository.findById(id);
  }

  public ClientModel getClientByIdentificationNumber(
    String identificationNumber
  ) {
    return clientRepository.findByIdentificationNumber(identificationNumber);
  }

  public ClientModel getClientByName(String name) {
    return clientRepository.findByName(name);
  }

  public boolean deleteClient(Long id) {
    try {
      clientRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
