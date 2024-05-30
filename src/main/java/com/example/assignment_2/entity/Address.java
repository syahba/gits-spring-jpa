package com.example.assignment_2.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "addresses")

public class Address {
  // identifier
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  // columns
  @Column(name = "city", nullable = false, length = 255)
  private String city;

  @Column(name = "country", nullable = false, length = 255)
  private String country;

  @Column(name = "state", nullable = false, length = 255)
  private String state;

  @Column(name = "street", nullable = false, length = 255)
  private String street;

  @Column(name = "zip_code", nullable = false, length = 255)
  private String zipCode;

  // relation
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id", referencedColumnName = "id") // saves id from user table to user_id column
  private User user;

  public Address() {}

  // constructor
  public Address(String city, String country, String state, String street, String zipCode, User user) {
    this.city = city;
    this.country = country;
    this.state = state;
    this.street = street;
    this.zipCode = zipCode;
    this.user = user;
  }

  // getters and setters
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
