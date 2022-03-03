package stepDefination;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TaggingTest {

	WebDriver driver;
	
	@Given("^login screen window$")
	public void login_screen_window() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/");
	}

	@When("^enter valid username and password$")
	public void enter_valid_username_and_password(DataTable table) {
		
		List<List<String>> data = table.asLists();
		
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@When("^application logo is display$")
	public void application_logo_is_display() {
		boolean flag = driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Flag of application is : " +flag);	
	}
	
	@When("^application text is display$")
	public void application_text_is_display() {
		String result = driver.findElement(By.xpath("//a[@href='https://seleniumjobs.com']")).getText();
		Assert.assertEquals("Selenium Jobs", result);
		System.out.println("Text of application is : " +result);
	}
	
	
	@Then("^application getting closed$")
	public void application_getting_closed() {
		driver.close();
	}

}
