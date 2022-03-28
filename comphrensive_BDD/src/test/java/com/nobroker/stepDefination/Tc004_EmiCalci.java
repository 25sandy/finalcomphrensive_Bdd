package com.nobroker.stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.nobroker.pageobject.EmiCalculator;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.ExtentReport;

@RunWith(Cucumber.class)
public class Tc004_EmiCalci extends BaseClass {
	
	public EmiCalculator emi;


    @And("click on Emi calculator in footer which will open in next tab")
    public void click_on_emi_calculator_in_footer_which_will_open_in_next_tab() throws IOException {
    	emi=new EmiCalculator(driver, webDriver, exReport);
       emi.emiCalci();
    }

    @And("enter the amount {string} interset {string}  year {string} and calculate emi")
    public void enter_the_amount_something_interset_something_year_something_and_calculate_emi(String strArg1, String strArg2, String strArg3) throws Throwable {
       emi.emipmont(strArg1, strArg2, strArg3);
       emi.monthly();
    }

   
}