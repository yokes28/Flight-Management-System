package com.nineleaps.flightmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contactTable")
public class Contact {
@Id
@Column(name="contact_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String type;
private String addressLine;
private Long zipcode;
private String city;
private String state;
private String country;
private Long mobileNo;

public Contact() {
}

public Contact(Long id, String type, String addressLine, long zipcode, String city, String state, String country,
long mobileNo) {
this.id = id;
this.type = type;
this.addressLine = addressLine;
this.zipcode = zipcode;
this.city = city;
this.state = state;
this.country = country;
this.mobileNo = mobileNo;
}

public Long getId() {
return this.id;
}

public void setId(Long id) {
this.id = id;
}

public String getType() {
return this.type;
}

public void setType(String type) {
this.type = type;
}

public String getAddressLine() {
return this.addressLine;
}

public void setAddressLine(String addressLine) {
this.addressLine = addressLine;
}

public long getZipcode() {
return this.zipcode;
}

public void setZipcode(long zipcode) {
this.zipcode = zipcode;
}

public String getCity() {
return this.city;
}

public void setCity(String city) {
this.city = city;
}

public String getState() {
return this.state;
}

public void setState(String state) {
this.state = state;
}

public String getCountry() {
return this.country;
}

public void setCountry(String country) {
this.country = country;
}

public long getMobileNo() {
return this.mobileNo;
}

public void setMobileNo(long mobileNo) {
this.mobileNo = mobileNo;
}


}
