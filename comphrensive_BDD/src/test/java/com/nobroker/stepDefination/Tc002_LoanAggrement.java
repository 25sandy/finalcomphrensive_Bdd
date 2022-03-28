package com.nobroker.stepDefination;



import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

import com.nobroker.pageobject.LoanAggrement;
import com.nobroker.utility.BaseClass;

import java.io.IOException;
import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Tc002_LoanAggrement extends BaseClass{
	LoanAggrement loan;

  
    @Then("click on Loan Aggrement")
    public void click_on_loan_aggrement() throws IOException  {
    	loan=new LoanAggrement(driver, webDriver, exReport);
    	loan.selectLA();
    	
    	
     
    }

    @Then("check the title with this input {string}")
    public void check_the_title_with_this_inputsomething(String list1) throws Throwable {
       loan.verifyTitle(list1); 
    }

   

}
