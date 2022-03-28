package com.nobroker.stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.hotelAddress;
import com.nobroker.utility.BaseClass;

@RunWith(Cucumber.class)
public class Tc003_hotelAddress extends BaseClass {
	hotelAddress address;

	@And("click on search and enter place {string}")
	public void click_on_search_and_enter_place_something(String strArg1) throws IOException, InterruptedException {
		address = new hotelAddress(driver, webDriver, exReport);
		address.getAddress(strArg1);
	}

	@And("click on enter and check the address is present or not")
	public void click_on_enter_and_check_the_address_is_present_or_not() throws IOException {
		address.fetchaddress();

	}

}
