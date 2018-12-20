package ca.poltech.automation.authentication;

/**
 * 
 * Manages the user session for the server
 * 
 * 
 * @author Nataliia
 *
 */
public abstract class Authentication {

	public abstract boolean login(String userName, String password);
	
	public abstract boolean logout();
	
	public abstract boolean retrievePassword(String email);
	
}
