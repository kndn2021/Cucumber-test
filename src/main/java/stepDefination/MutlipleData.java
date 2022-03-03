//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class MutlipleData {
//
//	WebDriver driver;
//
//	@Given("^facebook login screen window$")
//	public void facebook_login_screen_window() {
//		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
//		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//	}
//
//	@When("^user enter invalid \"(.*)\" and \"(.*)\"$")     //caret and dollar symbol
//	public void user_enter_invalid_username_and_password(String usn, String pwd) {
//
//		driver.findElement(By.id("email")).sendKeys(usn);
//		driver.findElement(By.id("pass")).sendKeys(pwd);
//		driver.findElement(By.name("login")).click();
//	}
//
//	@Then("^user should get error message$")
//	public void user_should_get_error_message() {
//		driver.close();
//	}
//
//}
