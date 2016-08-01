package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="ChoosePriceBook2"                                
     , summary=""
     , relativeUrl=""
     , connection="DOFSalesUser"
     )             
public class ChoosePriceBook2 {

	@ChoiceListType()
	@FindByLabel(label = "Price Book")
	public WebElement priceBook;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
			
}
