package testcases;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;


//tags = "not @smoke" 
//tags = "@smoke and @Regression"
//tags = "@smoke or @Regression"
@CucumberOptions(features = "src/main/java/features", glue = {"pages"}, monochrome=true, publish=true)
public class RunnerClass extends BaseClass  {

}
