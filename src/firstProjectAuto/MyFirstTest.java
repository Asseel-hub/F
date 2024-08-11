package firstProjectAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTest {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void mySetup() {
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/ " );
		
	}
	
	
	@Test
	public void myFirstTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Asseel Yacoub on LinkedIn");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div")).click();
		// Thread.sleep(4000);
		// driver.navigate().back();
	}
	
	
	
	
	

}
