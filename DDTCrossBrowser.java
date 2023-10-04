package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMClasses.AllCampaigns;
import POMClasses.CampaignDetails;
import POMClasses.VtigerHomePage;
import POMClasses.VtigerSignup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTCrossBrowser {

	WebDriver driver;
	
	@Test
	   public void crossBrowser() throws IOException, InterruptedException
	   {
			
		FileInputStream fis=new FileInputStream("src\\\\test\\\\resources\\\\DDTVtigerCampaign.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String Browser = pro.getProperty("browser");
		
		if (Browser.equals("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		
		else if(Browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String VtUrl = pro.getProperty("url");
		driver.get(VtUrl);
		
		String VtigerUrl = pro.getProperty("url");
		String CampName = pro.getProperty("campname");
		String CampStatus = pro.getProperty("campstatus");
		String Assignto = pro.getProperty("assignto");
		String CampaignType = pro.getProperty("camptype");
		String TargetSize = pro.getProperty("targetsize");
		String TargetAud = pro.getProperty("targeaudience");
		String Sponser = pro.getProperty("sponser");
		String ExpectdRespo=pro.getProperty("expectdrspons");
		String ExpSaleCount = pro.getProperty("expsalescount");
		String ExpResCount = pro.getProperty("exprspcount");
		String ActCost = pro.getProperty("actcost");
		String ExpRevenue = pro.getProperty("exprevenue");
		String ActSaleCount = pro.getProperty("actsalecount");
		String ActRespCount = pro.getProperty("actrespcount");
		String Expcldate = pro.getProperty("Date");
		String CampDescription = pro.getProperty("campsescrip");
		
		driver.get(VtigerUrl);
		VtigerSignup sign=new VtigerSignup();
		PageFactory.initElements(driver, sign);
		sign.getSignup().click();
		
		VtigerHomePage vhome=new VtigerHomePage();
		PageFactory.initElements(driver, vhome);
		vhome.getMenubar().click();
		WebElement marketing = vhome.getMarketing();
		Actions act=new Actions(driver);
		act.moveToElement(marketing).click();
		act.perform();
		WebElement campaign = vhome.getCampaigns();
		act.moveToElement(campaign).click();
		Thread.sleep(3000);
		act.perform();
		
		AllCampaigns camp=new AllCampaigns();
		PageFactory.initElements(driver, camp);
		camp.getAddcampaign().click();
		
		CampaignDetails campdet=new CampaignDetails();
		PageFactory.initElements(driver, campdet);
		
		campdet.getCampname().sendKeys(CampName);
		campdet.getCampstatus().sendKeys(CampStatus);
		campdet.getTargetsize().sendKeys(TargetSize);
		campdet.getExpclosedate().sendKeys(Expcldate);
		campdet.getExpclosedate().sendKeys(Keys.ENTER);
		
		campdet.getAssignto().sendKeys(Assignto);
		campdet.getCamptype().sendKeys(CampaignType);
		campdet.getTagetaudince().sendKeys(TargetAud);
		campdet.getSponser().sendKeys(Sponser);
		campdet.getExpectedresponse().sendKeys(ExpectdRespo);
		campdet.getExpsalescount().sendKeys(ExpSaleCount);
		campdet.getExprespocount().sendKeys(ExpResCount);
		campdet.getActualcost().sendKeys(ActCost);
		campdet.getExprevenue().sendKeys(ExpRevenue);
		campdet.getActsalecount().sendKeys(ActSaleCount);
		campdet.getActrespocount().sendKeys(ActRespCount);
		campdet.getCampdescr().sendKeys(CampDescription);
		
		campdet.getSavecamp().click();
		
		
		/*driver.findElement(By.xpath("//a[text()='  All  ']")).click();
		 * Thread.sleep(2000);
		String allcamps = driver.getWindowHandle();
		driver.switchTo().window(allcamps);
		
		AllCampaigns allcamp=new AllCampaigns();
		PageFactory.initElements(campaign, allcamp);
		allcamp.getVtigerDemoAdmin().click();
		allcamp.getSignout().click();*/
	   }
}
