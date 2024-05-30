package com.example.assignment_2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User {
  // identifier
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  // columns
  @Column(name = "email", nullable = false, length = 255)
  private String email;

  @Column(name = "name", nullable = false, length = 255)
  private String name;

  @Column(name = "password", nullable = false, length = 255)
  private String password;

  // relation
  @OneToOne(mappedBy = "user")
  private Address address;

  public User() {}

  // method with constructor
  public User(String email, String name, String password) {
    this.email = email;
    this.name = name;
    this.password = password;
  }

  // setters and getters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
