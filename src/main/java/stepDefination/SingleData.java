//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class SingleData {
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
//
//	}
//
//	@When("^user enter invalid \"(.*)\" and \"(.*)\"$")
//	public void user_enter_invalid_and(String user, String pwd) {
//		driver.findElement(By.id("email")).sendKeys(user);
//		driver.findElement(By.id("pass")).sendKeys(pwd);
//		driver.findElement(By.name("login")).click();
//
//	}
//	
//	@Then("^user should get error message$")
//	public void user_should_get_error_message() {
//		driver.close();
//	}
//
//}
