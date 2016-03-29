package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="ProductSelection"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class ProductSelection {

	@TextType()
	@FindBy(id = "search")
	public WebElement bykeyword;

	@PageRow()
	public static class Productlist {
	
	  @BooleanType()
	  @FindBy(xpath = "table/tbody/tr/td[1]/div/input")
	  public WebElement checkbox;
	
	  @TextType()
	  @FindBy(xpath = "table/tbody/tr/td[4]/div/a")
	  public WebElement productName;
	}

	@FindBy(xpath = "//*[@id='ext-gen12']/div")
	@PageTable(firstRowContainsHeaders = false, row = Productlist.class)
	public List<Productlist> Productlist;
	
	@FindBy(xpath = "//*[@id=\"dispatch\"]/div[1]/input[1]")
	@ButtonType()
	public WebElement select;

	@PageRow()
	public static class MultiLine {
	
	    @TextType()
		@FindBy(xpath = "th")
		public WebElement product;

		@TextType()
		@FindBy(xpath = "td[1]/input")
		public WebElement quantity;
		
		@TextType()
		@FindBy(xpath = "td[2]/input")
		public WebElement salesPrice;
		
		@DateType
		@FindBy(xpath = "td[3]/span/input")
		public WebElement date;
		
		@TextType()
		@FindBy(xpath = "td[4]/input")
		public WebElement description;

		
	}

	@FindBy(xpath = "//*[@id=\"editPage\"]/table/tbody/tr[@valign='top']")
	@PageTable(firstRowContainsHeaders = false, row = MultiLine.class)
	public List<MultiLine> MultiLine;

	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;

	@ButtonType()
	@FindBy(xpath = "//*[@id=\"save_filter_PricebookEntry\"]")
	public WebElement search;

	@LinkType()
	@FindBy(xpath = "//tr[2]/td[2]/a")
	public WebElement price;

	@ChoiceListType(values = { @ChoiceListValue(value = "Display 100 records per page", title = "100") })
	@FindBy(xpath = "//*[@id=\"lineItemView_paginator_rpp_target\"]/img")
	public WebElement paginator;
			
}
