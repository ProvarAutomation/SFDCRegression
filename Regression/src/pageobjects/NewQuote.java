package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="NewQuote"                                
     , summary=""
     , relativeUrl=""
     , connection="DOFSalesUser"
     )             
public class NewQuote {

	@ButtonType()
	@FindByLabel(label = "New Quote")
	public WebElement NewQuote;
			
}
