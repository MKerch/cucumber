package com.pluralsight.bdd.cafe;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cafe",
glue = "com.pluralsight.bdd.cafe")
public class SuperSmoothieProgramTestSuite {


}
