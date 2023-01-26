
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.firefox.FirefoxDriver;
	

	public class TransactionBank {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://localhost:8081/SavingsAccount/");
			 driver.findElement(By.xpath("//a[contains(text(),'Customer')]")).click();
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Transaction')]")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Deposit')]")).click();
			 driver.findElement(By.xpath("//select[@name='account_id']")).click();
			 driver.findElement(By.xpath("//option[@value='1']")).click();
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1000");
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2");
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Transaction')]")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Withdraw')]")).click();
			 driver.findElement(By.xpath("//select[@name='account_id']")).click();
			 driver.findElement(By.xpath("//option[@value='1']")).click();
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("100");
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Transaction')]")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Transfer')]")).click();
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
	}