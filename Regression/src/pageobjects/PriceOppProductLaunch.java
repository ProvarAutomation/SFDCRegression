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

	
	@TextType()
	@FindBy(xpath = "//label/span[text()='Lot Size']/../../input")
	public WebElement lotSize;
	
	@ChoiceListType()
	@FindBy(xpath = "//label/span[text()='Type:']/../../select")
	public WebElement type;
	
	@TextType()
	@FindBy(xpath = "//label/span[text()='Quantity:']/../../input")
	public WebElement Quantity;
	@ButtonType()
	@FindByLabel(label = "Add")
	public WebElement add;
	@ButtonType()
	@FindByLabel(label = "Remove")
	public WebElement remove;
	
	@ButtonType()
	@FindByLabel(label = "Calculate")
	public WebElement calculate;
	
	@ButtonType()
	@FindByLabel(label = "Save Price")
	public WebElement savePrice;
	
	@ButtonType()
	@FindBy(xpath = "//div[5]/div[1]/input")
	public WebElement addAdjust;
	
	@TextType()
	@FindBy(xpath = "//div[5]/div[2]//input")
	public WebElement discountPercent;
	
	@TextType()
	@FindBy(xpath = "//label/span[text()='Lot Size']/../../input")
	public WebElement LotSize;
	
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
	
	@ChoiceListType()
	@FindBy(xpath = "//label/span[text()='Duration:']/../../input")
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
	
	@FindBy(xpath = "//label/span[text()='Slots:']/../../select")
	@ChoiceListType()
	public WebElement Slots;
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


}
