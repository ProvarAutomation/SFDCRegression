package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="test"                                
     , summary=""
     , relativeUrl=""
     , connection="DOFSalesUser"
     )             
public class test {

	@LinkType()
	@FindBy(xpath = "//*[@id=\"001E000000MZN0B_RelatedOpportunityList_link\"]")
	public WebElement opportunities;
			
}
