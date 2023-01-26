package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankTransfer {
	WebDriver driver;
	@Given("User on withdraw page")
	public void user_on_withdraw_page() {
		System.setProperty("webdriver.gecko.driver","D:\\jarfiles\\geckodriver.exe");
	      driver =new FirefoxDriver();
	      driver.get("http://localhost:8081/SavingsAccount/transfer.jsp");
	      System.out.println("In given");
	}

	@When("User enters valid data1")
	public void user_enters_valid_data1() {
		driver.findElement(By.xpath("//select[@name='account_id']")).click();
	       driver.findElement(By.xpath("//option[@value='1']")).click();
	       driver.findElement(By.xpath("//body/form[@action='transfer']/table[@width='700px']/tbody/tr[3]/td[1]/input[1]")).sendKeys("2");
	       driver.findElement(By.xpath("//body/form[@action='transfer']/table[@width='700px']/tbody/tr[4]/td[1]/input[1]")).sendKeys("2");
	       driver.findElement(By.xpath("//body/form[@action='transfer']/table[@width='700px']/tbody/tr[5]/td[1]/input[1]")).sendKeys("100");
	       driver.findElement(By.xpath("//body/form[@action='transfer']/table[@width='700px']/tbody/tr[6]/td[1]/input[1]")).sendKeys("Testing");
	       driver.findElement(By.xpath("//body/form[@action='transfer']/table[@width='700px']/tbody/tr[7]/td[1]/input[1]")).sendKeys("SBID1234");
	       driver.findElement(By.xpath("//body/form[@action='transfer']/table[@width='700px']/tbody/tr[8]/td[1]/input[1]")).sendKeys("1");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Withdraw successful")
	public void withdraw_successful() {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		System.out.println("In Then");
	}


}
