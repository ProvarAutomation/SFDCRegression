package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="GMUsedNewPricing"                                
     , summary=""
     , relativeUrl=""
     , connection="DOFSalesUser"
     )             
public class GMUsedNewPricing {

	@PageWait.Timed(durationSeconds = 3)
	@TextType()
	@FindBy(xpath = "//div[4]/div/input")
	public WebElement UsedLotSize;
	@PageWait.Timed(durationSeconds = 3)
	@TextType()
	@FindBy(xpath = "//div[1]/div[5]//div[2]/div/input[1]")
	public WebElement UsedQuantity;
	@PageWait.Timed(durationSeconds = 3)
	@ChoiceListType(values = { @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "GMC") })
	@FindBy(xpath = "//*[@id=\"360:16;a\"]")
	public WebElement NewType;
	@TextType()
	@FindBy(xpath = "//div[4]//div[2]/div/input[1]")
	public WebElement NewQuantity;
	@ButtonType()
	@FindByLabel(label = "Calculate")
	public WebElement Calculate;
	@ButtonType()
	@FindByLabel(label = "Save Price")
	public WebElement SavePrice;
	@ChoiceListType()
	@FindBy(xpath = "//*[@id=\"34:21;a\"]")
	public WebElement UsedMake;
	@ChoiceListType()
	@FindBy(xpath = "//*[@id=\"418:21;a\"]")
	public WebElement NewMake;
	@ButtonType()
	@FindByLabel(label = " Sync ")
	public WebElement sync;
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@FindByLabel(label = " Done ")
	public WebElement done;
			
}
