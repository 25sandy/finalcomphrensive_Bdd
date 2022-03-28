package com.nobroker.stepDefination;



import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.menuBar;
import com.nobroker.utility.BaseClass;

	@RunWith(Cucumber.class)
	public class Tc006_menuBar  extends BaseClass{
    menuBar menu;
	   
	    @And("^click on menu bar select post your property$")
	    public void click_on_menu_bar_select_post_your_property() throws IOException, InterruptedException  {
	       menu=new menuBar(driver, webDriver, exReport);
	       menu.getProperty();
	    }

	    @And("^check the page title is present or not$")
	    public void check_the_page_title_is_present_or_not() throws IOException  {
	    	menu.postProperty();
	      
	    }

	    
	}

