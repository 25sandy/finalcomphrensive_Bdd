package com.nobroker.stepDefination;




import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.Testimonials;
import com.nobroker.utility.BaseClass;

	@RunWith(Cucumber.class)
	public class Tc008_Testimonials extends BaseClass {
      Testimonials test;
	    @And("^click on testimonial link it will open in new tab$")
	    public void click_on_testimonial_link_it_will_open_in_new_tab() throws IOException, InterruptedException  {
	      test=new Testimonials(driver, webDriver, exReport);
	      test.getdetails();
	    }

	    @And("^check the testimonials and ratings$")
	    public void check_the_testimonials_and_ratings() throws IOException  {
	        test.testimonial();
	    }

	    

	}

