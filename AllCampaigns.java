package POMClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllCampaigns {

	public WebElement getAddcampaign() {
		return addcampaign;
	}

	public WebElement getImportcampaign() {
		return importcampaign;
	}

	public WebElement getCustomize() {
		return customize;
	}

	@FindBy(css="button[id='Campaigns_listView_basicAction_LBL_ADD_RECORD']")
	private WebElement addcampaign;
	
	@FindBy(css="button[id='Campaigns_basicAction_LBL_IMPORT']")
	private WebElement importcampaign ;
	
	@FindBy(css="button[title='Settings']")
	private WebElement customize ;
	
	@FindBy(css="span[title='Vtiger Demo Administrator(admin)']")
	private WebElement VtigerDemoAdmin;
	
	@FindBy(css="a[id='menubar_item_right_LBL_SIGN_OUT']")
	private WebElement Signout;

	public WebElement getSignout() {
		return Signout;
	}

	public WebElement getVtigerDemoAdmin() {
		return VtigerDemoAdmin;
	}
}
