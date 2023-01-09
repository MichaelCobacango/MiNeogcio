package com.example.demo.Services;

import com.example.demo.Models.AddressModel;
import com.example.demo.Repositories.AddressRepository;
import java.util.ArrayList;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServices {

  @Autowired
  AddressRepository addressRepository;

  public ArrayList<AddressModel> getAddress() {
    return (ArrayList<AddressModel>) addressRepository.findAll();
  }

  public AddressModel addAddress(AddressModel address) {
    return addressRepository.save(address);
  }

  public ArrayList<AddressModel> findAddressByClient(Long id_client) {
    ArrayList<AddressModel> addresses = (ArrayList<AddressModel>) addressRepository.findAll();
    return (ArrayList<AddressModel>) addresses
      .stream()
      .filter(a -> a.getClientModel().getId().equals(id_client))
      .collect(Collectors.toList());
  }
}
