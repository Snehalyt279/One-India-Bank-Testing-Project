package CucumberRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"C:\\jarfiles\\cucumberMaven\\Infotech\\Feature\\BankWithdraw.feature"},glue= {"BankWithdraw"})
	public class BankWithdraw {
}