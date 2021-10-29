package ShivaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class form_fill_up {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\CDAC SHIVA\\Software\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Shiva");
		driver.findElement(By.id("lastName")).sendKeys("Pokhrel");
		driver.findElement(By.id("userEmail")).sendKeys("shiva@gmail.com");
		//driver.findElement(By.id("gender"));
		
		WebElement radio1 = driver.findElement(By.className("custom-control-label"));
		System.out.println("Male");
		
		radio1.click();
		
		driver.findElement(By.id("userNumber")).sendKeys("000000000");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Delhi 62 ");
	//	driver.close();
		System.out.println("Test passed");
	
		
		

	}

}
