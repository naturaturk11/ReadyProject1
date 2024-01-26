package com.vaga.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/vaga/step_definitions",//path from source root
        features = "@target/rerun.txt"




)
public class FailedTestRunner {
}
