package gitdemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstGit {

	@Test
	public static void main1() {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/venkataprasanth/Installers/eclipse-workspace/Selenium Jar Files/Driver/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");
		

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook",Keys.ENTER);
		
		driver.close();
		
	}
}
