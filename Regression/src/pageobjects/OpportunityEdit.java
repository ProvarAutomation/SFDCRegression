package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="OpportunityEdit"                                
     , summary=""
     , relativeUrl=""
     , connection="DOFSalesUser"
     )             
public class OpportunityEdit {

	@ButtonType()
	@FindByLabel(label = "Unlock Record")
	public WebElement unlockRecord;
			
}
