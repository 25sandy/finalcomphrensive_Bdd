package com.nobroker.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
	@CucumberOptions(
			features ="./Features/",
			glue="com.nobroker.stepDefination" )
public class runner {

}
