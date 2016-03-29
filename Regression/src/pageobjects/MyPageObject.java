package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
	@ButtonType()
	@FindByLabel(label = " Sync ")
	public WebElement sync;
	@PageWait.Field(timeoutSeconds = 30)
	@ButtonType()
	@FindByLabel(label = " Done ")
	public WebElement done;
	@FindBy(xpath = "//input[@name=\"addQuoteLine\"]")
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	public WebElement addLineItem;
	@BooleanType()
	@FindBy(xpath = "//*[@id=\"01uE0000000yILK\"]")
	public WebElement select;
	@ButtonType()
	@FindByLabel(label = "Select")
	public WebElement select1;
	@TextType()
	@FindByLabel(label = "Quantity")
	public WebElement quantity;
	@TextType()
	@FindByLabel(label = "Sales Price")
	public WebElement salesPrice;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
	@FindBy(xpath = "//input[@name=\"addQuoteLine\"]")
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	public WebElement addLineItem1;
	@TextType()
	@FindBy(xpath = "//input[@name=\"Quantity01uE0000000yILK\"]")
	public WebElement quantity2;
	@TextType()
	@FindBy(xpath = "//tr[9]/td[2]")
	public WebElement salesPrice2;
	@TextType()
	@FindBy(id = "9:13;a")
	public WebElement _3_a;
}
