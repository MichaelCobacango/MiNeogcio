package com.example.demo.Repositories;

import com.example.demo.Models.AddressModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressModel, Long> {}
