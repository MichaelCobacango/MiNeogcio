package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class AddressModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(length = 4, unique = true, nullable = false)
  private Long id;

  @Column(length = 1, name = "type_address", nullable = false, unique = false)
  private Integer typeAddress;

  @Column(length = 45, name = "province", nullable = false, unique = false)
  private String province;

  @Column(length = 45, name = "city", nullable = false, unique = false)
  private String city;

  @Column(length = 45, name = "address", nullable = false, unique = false)
  private String address;

  @ManyToOne
  @JoinColumn(name = "id_client")
  ClientModel clientModel;

  public AddressModel() {}

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getTypeAddress() {
    return this.typeAddress;
  }

  public void setTypeAddress(Integer typeAddress) {
    this.typeAddress = typeAddress;
  }

  public String getProvince() {
    return this.province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ClientModel getClientModel() {
    return this.clientModel;
  }

  public void setClientModel(ClientModel clientModel) {
    this.clientModel = clientModel;
  }
}
