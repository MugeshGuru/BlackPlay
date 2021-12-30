package org.sample;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class PojoClass extends BaseClass {

		public PojoClass() {
			
			PageFactory.initElements(driver, this);
		}
	
		
		@FindBy(id = "email")
	    private	List<WebElement> txtEmail;
		
		@FindBy(name = "pass")
		private List<WebElement> txtPass;
		
		@FindBy (name="login")
		private List<WebElement> btnLogin;

		public List<WebElement> getTxtEmail() {
			return txtEmail;
		}

		public List<WebElement> getTxtPass() {
			return txtPass;
		}

		public List<WebElement> getBtnLogin() {
			return btnLogin;
		}
		

		
	
		
	
	
}
