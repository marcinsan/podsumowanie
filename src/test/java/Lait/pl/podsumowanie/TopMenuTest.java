package Lait.pl.podsumowanie;

import static org.junit.Assert.assertTrue;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuTest extends Common {
	
	
	
	@Test
	public void topMenu() {
		goToMainPage();
		checkPageTitleAndStop("Selenium - Web Browser Automation");
		
	
		//Init.printScr(driver, "TopMenuTest", testName);
		//driver.findElement(By.linkText("Support")).click();
		
	
		linkClick ("About");
		linkClick ("Suport");
		linkClick("Downloads");
		linkClick("Projects");
		findInputByName("q").sendKeys("szukany tekst");
		String h2xpath = "<h2>Selenium Projects</h2>";
		String h2text = driver.findElement(By.xpath(h2xpath)).getText();
		driver.findElement(By.xpath(h2xpath)).getText();
		System.out.println("###"+h2text);
		if(h2text.equals("Selenium Projects"))  {
			System.out.println("Znaleziono poprawny" 
					+ "komunikat na stronie");
		}
		
		//Init.printScr(driver, "TopMenuTest", testName);
		//Init.printScr(driver);
		
		

		driver.quit();
	}
	
	@Test
	public void topMenuwrongTitle() {
		WebDriver driver = Init.getDriver();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		
		title = driver.getTitle();
		
		System.out.println(title);
		
		assertTrue("Page title is wrong!", title.equals("Some wrong page title"));

		driver.quit();
	}
	
	

}
