package com.training.model;

public class TaxiUser {
private String name;
private String email;
private String password;
private String telephone;
private String city;

/**
 * 
 */
public TaxiUser() {
super();
}

/**
 * @param name
 * @param email
 * @param password
 * @param telephone
 * @param city
 */
public TaxiUser(String name, String email, String password, String telephone, String city) {
super();
this.name = name;
this.email = email;
this.password = password;
this.telephone = telephone;
this.city = city;
}


/**
 * @return the name
 */
public String getName() {
return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
this.name = name;
}

/**
 * @return the email
 */
public String getEmail() {
return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
this.email = email;
}

/**
 * @return the password
 */
public String getPassword() {
return password;
}

/**
 * @param password the password to set
 */
public void setPassword(String password) {
this.password = password;
}

/**
 * @return the telephone
 */
public String getTelephone() {
return telephone;
}

/**
 * @param telephone the telephone to set
 */
public void setTelephone(String telephone) {
this.telephone = telephone;
}

/**
 * @return the city
 */
public String getCity() {
return city;
}

/**
 * @param city the city to set
 */
public void setCity(String city) {
this.city = city;
}
}