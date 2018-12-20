package ca.poltech.automation.exception;

import java.io.IOException;

import ca.poltech.automation.util.DriverFactory;




public class DriverNotAvailableException extends Exception  {

	private static final long serialVersionUID = 1L;

	public DriverNotAvailableException(String message) {

		super(message);
	}

}
