package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
public class ClientModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(length = 4, unique = true, nullable = false)
  private Long id;

  @Column(
    length = 10,
    name = "identification_type",
    nullable = false,
    unique = false
  )
  private String identificationType;

  @Column(
    length = 10,
    name = "identification_number",
    nullable = false,
    unique = true
  )
  private String identificationNumber;

  @Column(length = 45, name = "firstname", nullable = false, unique = false)
  private String firstName;

  @Column(length = 45, name = "lastname", nullable = false, unique = false)
  private String lastName;

  @Column(length = 45, name = "name", nullable = false, unique = false)
  private String name;

  @Column(length = 45, name = "email", nullable = false, unique = false)
  private String email;

  @Column(length = 10, name = "cellphone", nullable = false, unique = false)
  private String cellphone;

  @OneToMany(mappedBy = "clientModel")
  List<AddressModel> addressModelList;

  public ClientModel() {}

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIdentificationType() {
    return this.identificationType;
  }

  public void setIdentificationType(String identificationType) {
    this.identificationType = identificationType;
  }

  public String getIdentificationNumber() {
    return this.identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCellphone() {
    return this.cellphone;
  }

  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }
}
