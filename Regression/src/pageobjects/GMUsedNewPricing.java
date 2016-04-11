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
	@ChoiceListType(values = { @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "GMC") })
	@FindBy(xpath = "//*[@id=\"31:16;a\"]")
	public WebElement UsedType;
	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "SRT"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo") })
	@FindByLabel(label = "Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement Make; 
	@TextType()
	@FindBy(xpath = "//div[4]/div/input")
	public WebElement UsedLotSize;
	@TextType()
	@FindBy(xpath = "//div[1]/div[5]//div[2]/div/input[1]")
	public WebElement UsedQuantity;
	@PageWait.Timed(durationSeconds = 3)
	@ChoiceListType(values = { @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "GMC") })
	@FindBy(xpath = "//*[@id=\"335:16;a\"]")
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
			
}
