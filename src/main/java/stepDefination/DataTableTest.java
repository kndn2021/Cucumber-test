//package stepDefination;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DataTableTest {
//
//	WebDriver driver;
//
//	@Given("Login screen window")
//	public void login_screen_window() {
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
//	@When("user enter invalid data credentials")
//	public void user_enter_invalid_data_credentials(DataTable credentials) {
//	List<List<String>> data = credentials.asLists();
//	
//		driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("pass")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.name("login")).click();
//	}
//
//	@Then("user should get error message")
//	public void user_should_get_error_message() {
//		driver.close();
//	}
//
//}
