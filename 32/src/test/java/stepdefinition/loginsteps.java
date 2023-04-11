package stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
WebDriver driver = null;
@Given("browser is open")
public void browser_is_open() {
  System.setProperty("webdriver.gecko.marionette","C:\\Users\\navee\\eclipse-workspace\\32\\src\\test\\resources\\Drivers\\geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
}

@And("user is on login page")
public void user_is_on_login_page() throws Exception{
   driver.navigate().to("https://example.testproject.io/web/");
   Thread.sleep(2000);
   
}

@When("user enters username and password")
public void user_enters_username_and_password() {
driver.findElement(By.id("name")).sendKeys("student");
driver.findElement(By.id("password")).sendKeys("12345");
   
}

@And("user clicks on login")
public void user_clicks_on_login() {



driver.findElement(By.id("login")).click();
 
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() throws Exception{
driver.findElement(By.id("logout")).isDisplayed();
//driver.findElement(By.id("logout")).isDisplayed();
Thread.sleep(2000);
driver.close();
driver.quit();
}
}
