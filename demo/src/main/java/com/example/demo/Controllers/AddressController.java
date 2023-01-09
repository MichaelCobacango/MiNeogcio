package com.example.demo.Controllers;

import com.example.demo.Models.AddressModel;
import com.example.demo.Services.AddressServices;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

  @Autowired
  AddressServices addressServices;

  @GetMapping
  public ArrayList<AddressModel> getAddress() {
    return addressServices.getAddress();
  }

  @GetMapping("/search-address-client")
  public ArrayList<AddressModel> getAddressByClient(
    @RequestParam("id_client") Long id_client
  ) {
    return this.addressServices.findAddressByClient(id_client);
  }
}
