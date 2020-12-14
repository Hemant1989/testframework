package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  
	@Test
	public void loginCheck(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://eventnoire.com");
		
		driver.close();
	}
}
