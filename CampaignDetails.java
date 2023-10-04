package POMClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignDetails 
{


	@FindBy(id="Campaigns_editView_fieldName_campaignname")
	private WebElement campname;
	
	@FindBy(name="campaignstatus")
	private WebElement campstatus;
		
	@FindBy(id="Campaigns_editView_fieldName_targetsize")
	private WebElement targetsize;
	
	@FindBy(id="Campaigns_editView_fieldName_targetaudience")
	private WebElement tagetaudince;
	
	@FindBy(name="actualsalescount")
	private WebElement actsalecount;
	
	@FindBy(name="actualresponsecount")
	private WebElement actrespocount;
	
	@FindBy(name="closingdate")
	private WebElement expclosedate;
	
	@FindBy(name="sponsor")
	private WebElement sponser;
	
	@FindBy(name="expectedresponsecount")
	private WebElement exprespocount;
	
	@FindBy(name="actualcost")
	private WebElement actualcost;
	
	@FindBy(name="expectedrevenue")
     private WebElement exprevenue;
	
	@FindBy(name="assigned_user_id")
	private WebElement assignto;
	
	@FindBy(name="campaigntype")
	private WebElement camptype;
	
	@FindBy(id="Campaigns_editView_fieldName_budgetcost")
	private WebElement budgetcost ;
	
	@FindBy(name="expectedresponse")
	private WebElement expectedresponse;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement expsalescount;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savecamp;
	
	@FindBy(name="description")
	private WebElement campdescr;
	
	public WebElement getCampdescr() {
		return campdescr;
	}

	public WebElement getCampname() {
		return campname;
	}

	public WebElement getCampstatus() {
		return campstatus;
	}


	public WebElement getExpclosedate() {
		return expclosedate;
	}

	public WebElement getTargetsize() {
		return targetsize;
	}

	public WebElement getAssignto() {
		return assignto;
	}

	public WebElement getCamptype() {
		return camptype;
	}

	public WebElement getBudgetcost() {
		return budgetcost;
	}

	public WebElement getExpectedresponse() {
		return expectedresponse;
	}

	public WebElement getExpsalescount() {
		return expsalescount;
	}

	public WebElement getSavecamp() {
		return savecamp;
	}
	
	public WebElement getTagetaudince() {
		return tagetaudince;
	}

	public WebElement getActsalecount() {
		return actsalecount;
	}

	public WebElement getActrespocount() {
		return actrespocount;
	}

	public WebElement getSponser() {
		return sponser;
	}

	public WebElement getExprespocount() {
		return exprespocount;
	}

	public WebElement getActualcost() {
		return actualcost;
	}

	public WebElement getExprevenue() {
		return exprevenue;
	}

}
