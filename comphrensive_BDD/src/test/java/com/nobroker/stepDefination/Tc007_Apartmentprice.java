package com.nobroker.stepDefination;


import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.ApartmentPrice;
import com.nobroker.utility.BaseClass;

	@RunWith(Cucumber.class)
	public class Tc007_Apartmentprice extends BaseClass{
		ApartmentPrice price;

	   
	    @And("click on new apartment option select the 1BHK")
	    public void click_on_new_apartment_option_select_the_1bhk() throws IOException, InterruptedException {
	    	price=new ApartmentPrice(driver, webDriver, exReport);
	    	price.getprice();
	      
	    }

	    @And("Apartment price should be displayed")
	    public void apartment_price_should_be_displayed() throws IOException  {
	       price.printprice();
	    }


	}


