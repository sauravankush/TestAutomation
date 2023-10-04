package POMClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VtigerSignup {

	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement signup;
	
	@FindBy(xpath="//a[text()='forgot password?']")
	private WebElement fpassword;

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getFpassword() {
		return fpassword;
	}
}
