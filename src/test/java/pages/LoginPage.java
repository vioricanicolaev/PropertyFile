package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public  LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Sign in")
	public WebElement signIn;
	
	@FindBy(id = "email")
	public WebElement userName;
	
	@FindBy(id = "passwd")
	public WebElement pasword;
	
	@FindBy(id = "SubmitLogin")
	public WebElement submitLogin;

}
