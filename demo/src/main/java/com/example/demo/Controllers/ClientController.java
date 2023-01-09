package com.example.demo.Controllers;

import com.example.demo.Models.ClientModel;
import com.example.demo.Services.ClientServices;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

  @Autowired
  ClientServices clientServices;

  @GetMapping
  public ArrayList<ClientModel> getClients() {
    return clientServices.getClients();
  }

  @PostMapping
  public ClientModel addClient(@RequestBody ClientModel client) {
    return this.clientServices.addClient(client);
  }

  @GetMapping(path = "/{id}")
  public Optional<ClientModel> getClientById(@PathVariable("id") Long id) {
    return this.clientServices.findById(id);
  }

  @GetMapping("/search-identification-number")
  public ClientModel getClientByIdentification(
    @RequestParam("identification_number") String identificationNumber
  ) {
    return this.clientServices.getClientByIdentificationNumber(
        identificationNumber
      );
  }

  @GetMapping("/search-name")
  public ClientModel getClientByName(@RequestParam("name") String name) {
    return this.clientServices.getClientByName(name);
  }

  @DeleteMapping(path = "/{id}")
  public String deleteById(@PathVariable("id") Long id) {
    boolean response = this.clientServices.deleteClient(id);
    if (response) {
      return "Cliente con id: " + id + " eliminado correctamente";
    } else {
      return "Cliente con id: " + id + " no se pudo eliminar";
    }
  }
}
