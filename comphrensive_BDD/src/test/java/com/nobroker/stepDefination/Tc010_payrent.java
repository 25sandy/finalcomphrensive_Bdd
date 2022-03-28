package com.nobroker.stepDefination;




import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.payrent;
import com.nobroker.utility.BaseClass;

	@RunWith(Cucumber.class)
	public class Tc010_payrent extends BaseClass {
		payrent pay;

	    @And("click on the pay rent option it will open in new tab")
	    public void click_on_the_pay_rent_option_it_will_open_in_new_tab() throws IOException  {
	     pay=new payrent(driver, webDriver, exReport);
	     pay.printrent();
	    }

	    @And("check the title present in page or not")
	    public void check_the_title_present_in_page_or_not() throws IOException {
	    pay.check();
	    }


	}

