package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.TheBase;


@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features",
  glue = "steps",
  monochrome = true,
  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
  tags = "@Case1 or @Case2 or @ValidateForm or @Signin or @Login"
)


public class runner {
  @AfterClass
  public static void closeBrowser() {
        TheBase.closeBrowser();
  }
}