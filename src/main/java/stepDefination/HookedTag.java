//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class HookedTag {
//
//	WebDriver driver;
//	
//	@Before
//	@Given("^Login screen$")
//	public void Login_screen()
//	{
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
//	@Before("@First")
//	@When("^enter invalid username and password$")
//	public void enter_invalid_username_and_password()
//	{
//		driver.findElement(By.id("email")).sendKeys("Maxx Bhagat");
//		driver.findElement(By.id("pass")).sendKeys("MaxxBhagat@123");
//		driver.findElement(By.name("login")).click();
//
//	}
//	
//	@Before("@Second")
//	@When("^enter blank username and password$")
//	public void enter_blank_username_and_password()
//	{
//		driver.findElement(By.id("email")).sendKeys("");
//		driver.findElement(By.id("pass")).sendKeys("");
//		driver.findElement(By.name("login")).click();
//
//	}
//	
//	@Before("@Third")
//	@When("^enter valid username and password$")
//	public void enter_valid_username_and_password()
//	{
//		driver.findElement(By.id("email")).sendKeys("Kundan Bhagat");
//		driver.findElement(By.id("pass")).sendKeys("KundanBhagat@123");
//		driver.findElement(By.name("login")).click();
//
//	}
//	
//	@After
//	@Then("^browser get closed$")
//	public void browser_get_closed()
//	{
//		driver.quit();
//	}
//	
//}
