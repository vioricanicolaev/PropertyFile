package properties;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class RunnerTest {

	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;


	@BeforeClass
	public void setUpClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	@Test
	public void f() {
		driver.get(Runner.getMyValue("URL"));
		
		loginPage = new LoginPage(driver);
	    loginPage.signIn.click();
		loginPage.userName.sendKeys( Runner.getMyValue("User") );
		loginPage.pasword.sendKeys( Runner.getMyValue("Password") );
		loginPage.submitLogin.click();
		
		homePage = new HomePage(driver);
		String actual = homePage.myAcountText.getText();
		String expected = "My account";
		
		assertEquals(actual, expected);

	}
}
