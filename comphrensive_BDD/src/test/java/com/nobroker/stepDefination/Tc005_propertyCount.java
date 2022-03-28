package com.nobroker.stepDefination;




import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.propertyCount;
import com.nobroker.utility.BaseClass;

	@RunWith(Cucumber.class)
	public class Tc005_propertyCount extends BaseClass{
		propertyCount count;
		
		    @And("^select the city Bangalore and search place \"([^\"]*)\"$")
		    public void select_the_city_bangalore_and_search_place_something(String strArg1) throws IOException, InterruptedException {
		       count=new propertyCount(driver, webDriver, exReport);
		       count.countingofplots(strArg1);
		    }

		    @And("^mark checkbox office and coworkers and verify the count$")
		    public void mark_checkbox_office_and_coworkers_and_verify_the_count() throws IOException  {
		        count.checkcount();
		    }

		   
		}

	   

	

