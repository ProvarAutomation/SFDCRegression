package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="PriceOppProductLaunch"
               , namespacePrefix=""
               , object=""
               , connection="Admin"
     )             
public class PriceOppProductLaunch {

	
	@PageWait.Timed(durationSeconds = 5)
	@TextType()
	@FindBy(xpath = "//label/span[text()='Lot Size']/../../input")
	public WebElement lotSize;
	
	@ChoiceListType(values = { @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "GMC") })
	@FindBy(xpath = "//label/span[text()='Type:']/../../select")
	public WebElement gmtype;
	
	@PageWait.Timed(durationSeconds = 3)
	@TextType()
	@FindBy(xpath = "//label/span[text()='Quantity:']/../../input")
	public WebElement Quantity;
	@ButtonType()
	@FindByLabel(label = "Add")
	public WebElement add;
	@ButtonType()
	@FindByLabel(label = "Remove")
	public WebElement remove;
	
	@PageWait.Timed(durationSeconds = 3)
	@ButtonType()
	@FindByLabel(label = "Calculate")
	public WebElement calculate;
	
	@PageWait.Timed(durationSeconds = 3)
	@PageWaitAfter.Timed(durationSeconds = 5)
	@ButtonType()
	@FindByLabel(label = "Save Price")
	public WebElement savePrice;
	
	@ButtonType()
	@FindBy(xpath = "//div[5]/div[1]/input")
	public WebElement addAdjust;
	
	@TextType()
	@FindBy(xpath = "//div[5]/div[2]//input")
	public WebElement discountPercent;
	
	@PageWait.Timed(durationSeconds = 3)
	@FindBy(xpath = "//label/span[text()='DMA:']/../../select")
	@ChoiceListType()
	public WebElement Dma;
	
	@PageWait.Timed(durationSeconds = 3)
	@FindBy(xpath = "//label/span[text()='Alpha Zone:']/../../select")
	@ChoiceListType()
	public WebElement AlphaZone;
	
	@PageWait.Timed(durationSeconds = 3)
	@FindBy(xpath = "//label/span[text()='Make:']/../../select")
	@ChoiceListType()
	public WebElement Make;
	
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	
	@PageWait.Timed(durationSeconds = 3)
	@ChoiceListType(values = { @ChoiceListValue(value = "4"), @ChoiceListValue(value = "7"), @ChoiceListValue(value = "14"), @ChoiceListValue(value = "28") })
	@FindBy(xpath = "//label/span[text()='Duration:']/../../select")
	public WebElement Duration;
	
	@TextType()
	@FindBy(id = "37:13;a")
	public WebElement DMAList;
	
	@ChoiceListType()
	@FindBy(xpath = "//label/span[text()='Type:']/../../select")
	public WebElement Type;
	
	
	@FindBy(className = "stateSelect")
	@ChoiceListType()
	public WebElement State;
	
	@FindBy(className = "countySelect")
	@ChoiceListType()
	public WebElement County;
	
	@PageWait.Timed(durationSeconds = 3)
	@FindBy(xpath = "//label/span[text()='Slots:']/../../select")
	@ChoiceListType()
	public WebElement Slots;
	@PageWait.Timed(durationSeconds = 3)
	@FindBy(xpath = "//label/span[text()='Buckets:']/../../select")
	@ChoiceListType()
	public WebElement Buckets;

	@FindBy(xpath = "//label/span[text()='Discount Percent:']/../../input")
	@ChoiceListType()
	public WebElement DiscountPercent;
	
	@FindBy(xpath = "//label/span[text()='Discount Amount:']/../../input")
	@ChoiceListType()
	public WebElement DiscountAmount;

	@ButtonType()
	@FindBy(css = "div.slds-m-top--large input[type='button'][value='+']")
	public WebElement AddCounty;

	@ChoiceListType()
	@PageWait.Timed(durationSeconds = 3)
	@FindBy(xpath = "//label/span[text()='Quantity:']/../../select")
	public WebElement SpotQuantity;

	@FindBy(id = "47:23;a")
	@PageWait.Timed(durationSeconds = 5)
	@ChoiceListType()
	public WebElement New_Make_1;

	@TextType()
	@FindBy(xpath = "//div[4]//div[2]/div/input")
	public WebElement New_Quantity_1;

	@TextType()
	@FindBy(xpath = "//div[3]//div/span")
	public WebElement PricingAppAlert;

	@PageWait.Timed(durationSeconds = 5)
	@ChoiceListType()
	@FindBy(id = "418:23;a")
	public WebElement New_Make_2;


}
