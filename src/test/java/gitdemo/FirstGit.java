package gitdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstGit {

	
	public static void main(String[] args) {
		
	} {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/venkataprasanth/Installers/eclipse-workspace/Selenium Jar Files/Driver/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");
		

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook",Keys.ENTER);
		
		driver.quit();
		
		
		
	}
}
