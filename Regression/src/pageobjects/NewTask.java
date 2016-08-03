package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="NewTask"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceTestUser"
     )             
public class NewTask {

	@ButtonType()
	@FindByLabel(label = "Attach File")
	public WebElement attachFile;
	@ButtonType()
	@FindBy(id = "file")
	public WebElement chooseFile;
	@ButtonType()
	@FindBy(id = "file")
	public WebElement ChooseFIle;
			
}
