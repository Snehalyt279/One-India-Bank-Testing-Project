package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankTransaction {
	WebDriver driver;
	
		@Given("User on deposit page")
		public void user_on_deposit_page() {
			System.setProperty("webdriver.gecko.driver","D:\\jarfiles\\geckodriver.exe");
		      driver =new FirefoxDriver();
		      driver.get("http://localhost:8081/SavingsAccount/deposit.jsp");
		      System.out.println("In given");
		}

		@When("User enters valid data")
		public void user_enters_valid_data() {
			   driver.findElement(By.xpath("//select[@name='account_id']")).click();
		       driver.findElement(By.xpath("//option[@value='1']")).click();
		       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1000");
		       driver.findElement(By.xpath("//input[@type='submit']")).click();
		       System.out.println("In When");
		}

		@Then("Deposit successful")
		public void deposit_successful() {
			driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			System.out.println("In Then");
		}


	}


