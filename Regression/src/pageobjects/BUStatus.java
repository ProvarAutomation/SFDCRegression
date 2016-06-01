package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="BUStatus"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceTestUser"
     )             
public class BUStatus {

	@TextType()
	@FindBy(xpath = "//img[@src=\"/resource/Flair_Logos/AutoTrader_Active.png\"]")
	public WebElement ATCStatus;
	@TextType()
	@FindBy(xpath = "//img[@src=\"/resource/Flair_Logos/HomeNet_Active.png\"]")
	public WebElement HomeNetStatus;
	@TextType()
	@FindBy(xpath = "//img[@src=\"/resource/Flair_Logos/KBB_Active.png\"]")
	public WebElement KBBStatus;
	@TextType()
	@FindBy(xpath = "//img[@src=\"/resource/Flair_Logos/vAuto_Former.png\"]")
	public WebElement vAutoStatus;
	@TextType()
	@FindBy(xpath = "//img[@src=\"/resource/Flair_Logos/VIN_Prospect.png\"]")
	public WebElement VinSolutionsStatus;
	@TextType()
	@FindBy(xpath = "//img[@src=\"/resource/Flair_Logos/TIM_Prospect.png\"]")
	public WebElement TIMStatus;
	@TextType()
	@FindBy(xpath = "//img[@src=\"/resource/Flair_Logos/Haystak_Former.png\"]")
	public WebElement HaystakStatus;
			
}
