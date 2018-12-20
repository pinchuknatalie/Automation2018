package ca.poltech.automation.util;

import org.openqa.selenium.WebDriver;

import ca.poltech.automation.exception.DriverNotAvailableException;

public class Main {


		
		public static void main(String[] args) throws InterruptedException, DriverNotAvailableException {

			WebDriver driver = DriverFactory.getDriver(DriverFactory.CHROME_DRIVER);

			driver.get(Constants.SERVER_ADDRESS);

			Thread.sleep(5000);

			DriverFactory.quitDriverGracefully();

		}
	}


