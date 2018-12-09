package Lait.pl.podsumowanie;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.implementation.EqualsMethod;

public class Common {

	static WebDriver driver;

	public static void goToMainPage()  {

	 driver = Init.getDriver();
	}
	
	public static void linkClick(String linkText)  {
		try {
			driver.findElement(By.linkText(linkText)).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			Init.printScr(driver);
			assertTrue("Nie znalazłem linku: " +
			linkText, false);
		}
		
	}

	public static void checkPageTitleAndStop(String title)  {
		boolean checkStatus = driver.getTitle().equals(title);
		assertTrue("Tytuł strony jest nieprawidłowy", checkStatus);	
	}
			
	public static WebElement findInputByName(String name) {
		return driver.findElement(By.name(name));
	}			
}
	