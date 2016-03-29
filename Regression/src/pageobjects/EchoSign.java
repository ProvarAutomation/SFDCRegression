package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="EchoSign"                                
     , summary=""
     , relativeUrl=""
     , connection="Jason_Stage"
     )             
public class EchoSign {

	@ChoiceListType(values = { @ChoiceListValue(value = "Contact"), @ChoiceListValue(value = "Lead"), @ChoiceListValue(value = "User"), @ChoiceListValue(value = "Email") })
	@FindBy(id = "j_id0:AgreementFormId:detailPageBlock:recipientsSection:recipientItems:0:recipientType")
	public WebElement RecipientType;
	@PageWaitAfter.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(id = "j_id0:AgreementFormId:detailPageBlock:recipientsSection:recipientItems:0:email")
	public WebElement Recipient;
	@ButtonType()
	@FindByLabel(label = "Send for Signature")
	public WebElement SendForSignature;
	@ButtonType()
	@FindByLabel(label = "Close")
	public WebElement Close;
	
	@TextType()
	@FindBy(css = "div.faux_field")
	public WebElement Signature;
	@PageWait.Timed(durationSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//*[@id=\"document\"]/ul/li[2]/div[1]/div[3]")
	public WebElement Signature1;
	@TextType()
	@FindBy(css = "input.form-control.signature-name")
	public WebElement enterYourNameHere;
	@ButtonType()
	@FindByLabel(label = "Apply")
	public WebElement apply;
	@PageWaitAfter.Timed(durationSeconds = 10)
	@ButtonType()
	@FindByLabel(label = "Click to sign")
	public WebElement clickToSign;
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(css = "h1.title")
	public WebElement SuccessMessage;
	@TextType()
	@FindByLabel(label = "DBA Name", labelType = LabelType.PrecedingCell, qualifierXpath = "/td[1]")
	public WebElement DBAName;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"document\"]/ul/li/div[1]/div[3]")
	public WebElement DealershipAuthorizedSignature;
			
}
