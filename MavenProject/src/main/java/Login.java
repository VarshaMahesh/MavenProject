

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By email=By.id("email");
	By pass= By.id("pass");
	By login =By.id("send2"); 

	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterEmail()
	{
		driver.findElement(email).sendKeys("varshammgowda@gmail.com");
	}
	
	public void enterPassword()
	{
		driver.findElement(pass).sendKeys("sathya@15");
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}

}
