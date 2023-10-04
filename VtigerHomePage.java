package POMClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VtigerHomePage {

	@FindBy(xpath="(//span[@class='app-icon fa fa-bars'])[1]")
	private WebElement menubar;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement marketing;
	
	@FindBy(xpath="//span[text()=' Campaigns']")
	private WebElement campaigns;

	public WebElement getMenubar() {
		return menubar;
	}

	public WebElement getMarketing() {
		return marketing;
	}

	public WebElement getCampaigns() {
		return campaigns;
	}
}
