package com.acc.cucmber_27_Jan;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature"
		,glue= {"step_definition"}
		)

public class Testrunner
{
	
	

}
