package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="CustomerOpsVF"
               , namespacePrefix=""
               , object="Case"
               , connection="Admin"
     )             
public class OrderDetailsVF {

	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id37:j_id38:0:j_id39:j_id40:66:j_id41:j_id43\"]")
	public WebElement CAFranNewMakePrice;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id37:j_id38:0:j_id70:0:j_id72:j_id85:j_id87\"]")
	public WebElement CAFranPremVehMonthRate;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id37:j_id38:1:j_id70:0:j_id72:j_id85:j_id87\"]")
	public WebElement CAIndPremVehMonthRate;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id37:j_id38:4:j_id39:j_id40:66:j_id41:j_id43\"]")
	public WebElement CPFranNewMakePrice;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id37:j_id38:4:j_id70:0:j_id72:j_id85:j_id87\"]")
	public WebElement CPFranPremVehMonthRate;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id37:j_id38:5:j_id70:0:j_id72:j_id85:j_id87\"]")
	public WebElement CPIndPremMonthRate;
	
}
