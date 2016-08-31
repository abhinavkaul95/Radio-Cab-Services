/** 
 * 
 */
package com.training.model;


import com.training.utils.TaxiUserDAO;

/** Java Bean to validate.
 * @author akaul5
 *
 */
public class ValidateBean {
  /**
   * TaxiUser DAO implementation.
   */
  private TaxiUserDAO userdao;
  
  /** 
   * No-arg constructor.
   */
  public ValidateBean() {
    super();
    userdao = new TaxiUserDAO();
  }
  
  /**
   * Initialisation function.
   */
  private void init() {

  }
  /**
   * Validation Function.
   * @param username
   * @param password
   * @return
   */
  public boolean validate(String email, String password) {
	init();
	boolean valid = false;
	
	if(password.equals(userdao.findPasswordForEmail(email))){
		valid = true;
	}
	return valid;
  }
}
