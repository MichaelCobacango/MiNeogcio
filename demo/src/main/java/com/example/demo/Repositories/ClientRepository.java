package com.example.demo.Repositories;

import com.example.demo.Models.ClientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientModel, Long> {
  public abstract ClientModel findByIdentificationNumber(
    String identificationNumber
  );

  public abstract ClientModel findByName(String name);
}
