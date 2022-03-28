package com.nobroker.stepDefination;




import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.footer;
import com.nobroker.utility.BaseClass;

	@RunWith(Cucumber.class)
	public class Tc009_footer extends BaseClass {

	   footer foot;

	    @And("click on aboutus link select our blogs")
	    public void click_on_aboutus_link_select_our_blogs() throws IOException, InterruptedException {
	       foot=new footer(driver, webDriver, exReport);
	       foot.footoperation();
	    }

	    @And("check the current date and time in live blog")
	    public void check_the_current_date_and_time_in_live_blog() throws IOException {
	    	foot.currentdate();
	       
	    }


	}


