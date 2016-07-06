package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="SalesUserProductAdd"                                
     , summary=""
     , relativeUrl=""
     , connection="AdamGrille"
     )             
public class SalesUserProductAdd {

	@TextType()
	@FindBy(id = "Quantity01uE0000004UbZb")
	public WebElement Quantity;
	@TextType()
	@FindBy(id = "UnitPrice01uE0000004UbZb")
	public WebElement SalesPrice;
			
}
