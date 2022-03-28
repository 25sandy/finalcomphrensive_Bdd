package com.nobroker.stepDefination;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.Login;
import com.nobroker.utility.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class Tc001_Login extends BaseClass {

     Login loggin;
		 @And("click on sigin in")
		    public void click_on_sigin_in() throws Throwable {
		      
		    }
		

	    @Then("entering phone number {string} and passord as {string}")
	    public void entering_phone_number_something_and_passord_as_something(String strArg1, String strArg2) throws Throwable {
	       loggin=new Login(driver, webDriver, exReport);
	      
	    	loggin.clicklogin();
	    	loggin.enterDetails(strArg1, strArg2);
	    }

	    @Then("it must login into account")
	    public void it_must_login_into_account() {
	    	loggin.continuee();
	      
	    }

	    
	}


