package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="OrderConfigurationVF"
               , namespacePrefix=""
               , object="OrderItem"
               , connection="Admin"
     )             
public class OrderConfigurationVF {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!orderItemObj.Description}\"]")
	@SalesforceField(name = "Description", object = "OrderItem")
	
	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable") })
	@FindBy(xpath="//label[normalize-space(text())='Zone']/../following-sibling::td//select")
	public WebElement Zone;
	
	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "SRT"), @ChoiceListValue(value = "No Specific Make") })
	@FindBy(xpath = "//label[normalize-space(text())='Advertised Make']/../following-sibling::td//select")
	public WebElement AdvertisedMake;

	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "SRT") })
	@FindBy(xpath = "//label[normalize-space(text())='Make']/../following-sibling::td//select")
	public WebElement Make;

	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable"),
			@ChoiceListValue(value = "Dealer Managed"),
			@ChoiceListValue(value = "Autotrader Managed"),
			@ChoiceListValue(value = "OEM Managed") })
	@FindBy(xpath = "//label[normalize-space(text())='Co-op Level of Service']/../following-sibling::td//select")
	public WebElement Co_OpLevelOfService;

	@ChoiceListType(values = { @ChoiceListValue(value = "Additional Business"),
			@ChoiceListValue(value = "Down Sell"),
			@ChoiceListValue(value = "New Business"),
			@ChoiceListValue(value = "Up Sell") })
	@FindBy(xpath = "//label[normalize-space(text())='Transaction Type']/../following-sibling::td//select")
	public WebElement TransactionType;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(text())='APFD Date']/../following-sibling::td//input")
	public WebElement APFDDate;

	@ChoiceListType(values = { @ChoiceListValue(value = "12 Months") })
	@FindBy(xpath = "//label[normalize-space(text())='Term Duration (Alpha all others)']/../following-sibling::td//select")
	public WebElement TermDuration;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(text())='Total Production Cost']/../following-sibling::td//input")
	public WebElement TotalProductionCost;

	@TextType()
	@VisualforceBy(componentXPath = "apex:repeat[@value = \"{!$ObjectType.Product_Configuration__c.FieldSets.Billing_Info_Fields}\"]//apex:inputField[@value = \"{!orderItemObj[field]}\"]")
	public WebElement BillToAccount;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(text())='Artwork - PreApprove Case #']/../following-sibling::td[1]//input")
	public WebElement ArtworkPreApproveCase;

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!saveAction}']")
	public WebElement save;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!orderItemObj.Configured__c}\"]")
	@SalesforceField(name = "Configured__c", object = "OrderItem")
	public WebElement configured;

	@ChoiceListType(values = { @ChoiceListValue(value = "Alpha Restrict CPO"),
			@ChoiceListValue(value = "Alpha Restrict New"),
			@ChoiceListValue(value = "Alpha Restrict CPO & New") })
	@FindBy(xpath = "//label[normalize-space(text())='Car Type Restrictions']/../following-sibling::td[1]//select")
	public WebElement CarType;

	@ChoiceListType(values = { @ChoiceListValue(value = "Alpha Sent EQS"),
			@ChoiceListValue(value = "Alpha Use Alpha Template"),
			@ChoiceListValue(value = "Alpha Use Existing"),
			@ChoiceListValue(value = "Alpha Co-Op Pre-Approval Case") })
	@FindBy(xpath = "//label[normalize-space(text())='Artwork - Dropdown']/../following-sibling::td[1]//select")
	public WebElement Artwork;

	@ChoiceListType(values = { @ChoiceListValue(value = "ABILENE-SWEETWATER"),
			@ChoiceListValue(value = "ADA-ARDMORE"),
			@ChoiceListValue(value = "ALBANY-SCHENECTADY-TROY"),
			@ChoiceListValue(value = "ALBANY_GA"),
			@ChoiceListValue(value = "ALBUQUERQUE-SANTA_FE"),
			@ChoiceListValue(value = "ALEXANDRIA_LA"),
			@ChoiceListValue(value = "ALPENA"),
			@ChoiceListValue(value = "AMARILLO"),
			@ChoiceListValue(value = "ANCHORAGE"),
			@ChoiceListValue(value = "ATLANTA"),
			@ChoiceListValue(value = "AUGUSTA"),
			@ChoiceListValue(value = "AUSTIN"),
			@ChoiceListValue(value = "BAKERSFIELD"),
			@ChoiceListValue(value = "BALTIMORE"),
			@ChoiceListValue(value = "BANGOR"),
			@ChoiceListValue(value = "BATON_ROUGE"),
			@ChoiceListValue(value = "BEAUMONT-PORT_ARTHUR"),
			@ChoiceListValue(value = "BEND_OR"),
			@ChoiceListValue(value = "BILLINGS"),
			@ChoiceListValue(value = "BILOXI-GULFPORT"),
			@ChoiceListValue(value = "BINGHAMTON"),
			@ChoiceListValue(value = "BIRMINGHAM"),
			@ChoiceListValue(value = "BLUEFIELD-BECKLEY-OAK_HILL"),
			@ChoiceListValue(value = "BOISE"),
			@ChoiceListValue(value = "BOSTON"),
			@ChoiceListValue(value = "BOWLING_GREEN"),
			@ChoiceListValue(value = "BUFFALO"),
			@ChoiceListValue(value = "BURLINGTON-PLATTSBURGH"),
			@ChoiceListValue(value = "BUTTE"),
			@ChoiceListValue(value = "CASPER-RIVERTON"),
			@ChoiceListValue(value = "CEDAR_RAPIDS-WATERLOO_AND_DUBQ"),
			@ChoiceListValue(value = "CHAMPAIGN_AND_SPRNGFLD-DECATUR"),
			@ChoiceListValue(value = "CHARLESTON-HUNTINGTON"),
			@ChoiceListValue(value = "CHARLESTON_SC"),
			@ChoiceListValue(value = "CHARLOTTE"),
			@ChoiceListValue(value = "CHARLOTTESVILLE"),
			@ChoiceListValue(value = "CHATTANOOGA"),
			@ChoiceListValue(value = "CHEYENNE-SCOTTSBLUF-STRLNG"),
			@ChoiceListValue(value = "CHICAGO"),
			@ChoiceListValue(value = "CHICO-REDDING"),
			@ChoiceListValue(value = "CINCINNATI"),
			@ChoiceListValue(value = "CLARKSBURG-WESTON"),
			@ChoiceListValue(value = "CLEVELAND"),
			@ChoiceListValue(value = "COLORADO_SPRINGS-PUEBLO"),
			@ChoiceListValue(value = "COLUMBIA-JEFFERSON_CITY"),
			@ChoiceListValue(value = "COLUMBIA_SC"),
			@ChoiceListValue(value = "COLUMBUS-TUPELO-WEST_POINT"),
			@ChoiceListValue(value = "COLUMBUS_GA"),
			@ChoiceListValue(value = "COLUMBUS_OH"),
			@ChoiceListValue(value = "CORPUS_CHRISTI"),
			@ChoiceListValue(value = "DALLAS-FT_WORTH"),
			@ChoiceListValue(value = "DAVENPORT-RISLAND-MOLINE"),
			@ChoiceListValue(value = "DAYTON"),
			@ChoiceListValue(value = "DENVER"),
			@ChoiceListValue(value = "DES_MOINES-AMES"),
			@ChoiceListValue(value = "DETROIT"),
			@ChoiceListValue(value = "DOTHAN"),
			@ChoiceListValue(value = "DULUTH-SUPERIOR"),
			@ChoiceListValue(value = "ELMIRA"),
			@ChoiceListValue(value = "EL_PASO"),
			@ChoiceListValue(value = "ERIE"),
			@ChoiceListValue(value = "EUGENE"),
			@ChoiceListValue(value = "EUREKA"),
			@ChoiceListValue(value = "EVANSVILLE"),
			@ChoiceListValue(value = "FAIRBANKS"),
			@ChoiceListValue(value = "FARGO-VALLEY_CITY"),
			@ChoiceListValue(value = "FLINT-SAGINAW-BAY_CITY"),
			@ChoiceListValue(value = "FLORENCE-MYRTLE_BEACH"),
			@ChoiceListValue(value = "FORT_WAYNE"),
			@ChoiceListValue(value = "FRESNO-VISALIA"),
			@ChoiceListValue(value = "FT_MYERS-NAPLES"),
			@ChoiceListValue(value = "FT_SMITH"),
			@ChoiceListValue(value = "GAINESVILLE"),
			@ChoiceListValue(value = "GLENDIVE"),
			@ChoiceListValue(value = "GRAND_JUNCTION-MONTROSE"),
			@ChoiceListValue(value = "GRAND_RAPIDS-KALMZOO-BCRK"),
			@ChoiceListValue(value = "GREAT_FALLS"),
			@ChoiceListValue(value = "GREENSBORO-HPOINT-WSALEM"),
			@ChoiceListValue(value = "GREENVILLE-NBERN-WASHNGTN"),
			@ChoiceListValue(value = "GREENVILLE-SPART-ASHEVILLE"),
			@ChoiceListValue(value = "GREENWOOD-GREENVILLE"),
			@ChoiceListValue(value = "GREEN_BAY-APPLETON"),
			@ChoiceListValue(value = "HARLINGEN-WESLACO-BRNSVLLE"),
			@ChoiceListValue(value = "HARRISBURG-LNCSTR-LEB-YORK"),
			@ChoiceListValue(value = "HARRISONBURG"),
			@ChoiceListValue(value = "HARTFORD_AND_NEW_HAVEN"),
			@ChoiceListValue(value = "HATTIESBURG-LAUREL"),
			@ChoiceListValue(value = "HELENA"),
			@ChoiceListValue(value = "HONOLULU"),
			@ChoiceListValue(value = "HOUSTON"),
			@ChoiceListValue(value = "HUNTSVILLE-DECATURFLOR"),
			@ChoiceListValue(value = "IDAHO_FALLS-POCATELLO"),
			@ChoiceListValue(value = "INDIANAPOLIS"),
			@ChoiceListValue(value = "JACKSONVILLE_BRUNSWICK"),
			@ChoiceListValue(value = "JACKSON_MS"),
			@ChoiceListValue(value = "JACKSON_TN"),
			@ChoiceListValue(value = "JOHNSTOWN-ALTOONA"),
			@ChoiceListValue(value = "JONESBORO"),
			@ChoiceListValue(value = "JOPLIN-PITTSBURG"),
			@ChoiceListValue(value = "JUNEAU"),
			@ChoiceListValue(value = "KANSAS_CITY"),
			@ChoiceListValue(value = "KNOXVILLE"),
			@ChoiceListValue(value = "LAFAYETTE_IN"),
			@ChoiceListValue(value = "LAFAYETTE_LA"),
			@ChoiceListValue(value = "LAKE_CHARLES"),
			@ChoiceListValue(value = "LANSING"),
			@ChoiceListValue(value = "LAREDO"),
			@ChoiceListValue(value = "LAS_VEGAS"),
			@ChoiceListValue(value = "LA_CROSSE-EAU_CLAIRE"),
			@ChoiceListValue(value = "LEXINGTON"),
			@ChoiceListValue(value = "LIMA"),
			@ChoiceListValue(value = "LINCOLN_AND_HSTNGS-KRNY_PLUS"),
			@ChoiceListValue(value = "LITTLE_ROCK-PINE_BLUFF"),
			@ChoiceListValue(value = "LOS_ANGELES"),
			@ChoiceListValue(value = "LOUISVILLE"),
			@ChoiceListValue(value = "LUBBOCK"),
			@ChoiceListValue(value = "MACON"),
			@ChoiceListValue(value = "MADISON"),
			@ChoiceListValue(value = "MANKATO"),
			@ChoiceListValue(value = "MARQUETTE"),
			@ChoiceListValue(value = "MEDFORD-KLAMATH_FALLS"),
			@ChoiceListValue(value = "MEMPHIS"),
			@ChoiceListValue(value = "MERIDIAN"),
			@ChoiceListValue(value = "MIAMI-FT_LAUDERDALE"),
			@ChoiceListValue(value = "MILWAUKEE"),
			@ChoiceListValue(value = "MINNEAPOLIS-ST_PAUL"),
			@ChoiceListValue(value = "MINOT-BISMARCK-DICKINSON"),
			@ChoiceListValue(value = "MISSOULA"),
			@ChoiceListValue(value = "MOBILE-PENSACOLA"),
			@ChoiceListValue(value = "MONROE-EL_DORADO"),
			@ChoiceListValue(value = "MONTEREY-SALINAS"),
			@ChoiceListValue(value = "MONTGOMERY"),
			@ChoiceListValue(value = "NASHVILLE"),
			@ChoiceListValue(value = "NEW_ORLEANS"),
			@ChoiceListValue(value = "NEW_YORK"),
			@ChoiceListValue(value = "NORFOLK-PORTSMTH-NEWPT_NWS"),
			@ChoiceListValue(value = "NORTH_PLATTE"),
			@ChoiceListValue(value = "ODESSA-MIDLAND"),
			@ChoiceListValue(value = "OKLAHOMA_CITY"),
			@ChoiceListValue(value = "OMAHA"),
			@ChoiceListValue(value = "ORLANDO-DAYTONA_BCH-MELBRN"),
			@ChoiceListValue(value = "OTTUMWA-KIRKSVILLE"),
			@ChoiceListValue(value = "PADUCAH-CGIRD-HARBG-MT_VN"),
			@ChoiceListValue(value = "PALM_BEACH"),
			@ChoiceListValue(value = "PALM_SPRINGS"),
			@ChoiceListValue(value = "PANAMA_CITY"),
			@ChoiceListValue(value = "PARKERSBURG"),
			@ChoiceListValue(value = "PEORIA-BLOOMINGTON"),
			@ChoiceListValue(value = "PHILADELPHIA"),
			@ChoiceListValue(value = "PHOENIX"),
			@ChoiceListValue(value = "PITTSBURGH"),
			@ChoiceListValue(value = "PORTLAND-AUBURN"),
			@ChoiceListValue(value = "PORTLAND_OR"),
			@ChoiceListValue(value = "PRESQUE_ISLE"),
			@ChoiceListValue(value = "PROVIDENCE-NEW_BEDFORD"),
			@ChoiceListValue(value = "PUERTO_RICO"),
			@ChoiceListValue(value = "QUINCY-HANNIBAL-KEOKUK"),
			@ChoiceListValue(value = "RALEIGH-DURHAM"),
			@ChoiceListValue(value = "RAPID_CITY"),
			@ChoiceListValue(value = "RENO"),
			@ChoiceListValue(value = "RICHMOND-PETERSBURG"),
			@ChoiceListValue(value = "ROANOKE-LYNCHBURG"),
			@ChoiceListValue(value = "ROCHESTER_NY"),
			@ChoiceListValue(value = "ROCHESTR-MASON_CITY-AUSTIN"),
			@ChoiceListValue(value = "ROCKFORD"),
			@ChoiceListValue(value = "SACRAMNTO-STKTN-MODESTO"),
			@ChoiceListValue(value = "SAINT_JOSEPH"),
			@ChoiceListValue(value = "SALISBURY"),
			@ChoiceListValue(value = "SALT_LAKE_CITY"),
			@ChoiceListValue(value = "SANTABARBRA-SANMAR-SANLUOB"),
			@ChoiceListValue(value = "SAN_ANGELO"),
			@ChoiceListValue(value = "SAN_ANTONIO"),
			@ChoiceListValue(value = "SAN_DIEGO"),
			@ChoiceListValue(value = "SAN_FRANCISCO-OAK-SAN_JOSE"),
			@ChoiceListValue(value = "SAVANNAH"),
			@ChoiceListValue(value = "SEATTLE-TACOMA"),
			@ChoiceListValue(value = "SHREVEPORT"),
			@ChoiceListValue(value = "SIOUX_CITY"),
			@ChoiceListValue(value = "SIOUX_FALLSMITCHELL"),
			@ChoiceListValue(value = "SOUTH_BEND-ELKHART"),
			@ChoiceListValue(value = "SPOKANE"),
			@ChoiceListValue(value = "SPRINGFIELD-HOLYOKE"),
			@ChoiceListValue(value = "SPRINGFIELD_MO"),
			@ChoiceListValue(value = "ST_LOUIS"),
			@ChoiceListValue(value = "SYRACUSE"),
			@ChoiceListValue(value = "TALLAHASSEE-THOMASVILLE"),
			@ChoiceListValue(value = "TAMPA-ST_PETESARASOTA"),
			@ChoiceListValue(value = "TERRE_HAUTE"),
			@ChoiceListValue(value = "TOLEDO"),
			@ChoiceListValue(value = "TOPEKA"),
			@ChoiceListValue(value = "TRAVERSE_CITY-CADILLAC"),
			@ChoiceListValue(value = "TRI-CITIES_TN-VA"),
			@ChoiceListValue(value = "TUCSON_-_SIERRA_VISTA"),
			@ChoiceListValue(value = "TULSA"),
			@ChoiceListValue(value = "TWIN_FALLS"),
			@ChoiceListValue(value = "TYLER"),
			@ChoiceListValue(value = "UNASSIGNED"),
			@ChoiceListValue(value = "UTICA"),
			@ChoiceListValue(value = "VICTORIA"),
			@ChoiceListValue(value = "WACO-TEMPLE-BRYAN"),
			@ChoiceListValue(value = "WASHINGTON_DC"),
			@ChoiceListValue(value = "WATERTOWN"),
			@ChoiceListValue(value = "WAUSAU-RHINELANDER"),
			@ChoiceListValue(value = "WHEELING-STEUBENVILLE"),
			@ChoiceListValue(value = "WICHITA-HUTCHINSON_PLUS"),
			@ChoiceListValue(value = "WICHITA_FALLS_AND_LAWTON"),
			@ChoiceListValue(value = "WILKES_BARRE-SCRANTON"),
			@ChoiceListValue(value = "WILMINGTON"),
			@ChoiceListValue(value = "YAKIMA-PASCO-RCHLND-KNNWCK"),
			@ChoiceListValue(value = "YOUNGSTOWN"),
			@ChoiceListValue(value = "YUMA-EL_CENTRO"),
			@ChoiceListValue(value = "ZANESVILLE") })
	@FindBy(xpath = "//label[normalize-space(text())='DMA']/../following-sibling::td[1]//select")
	public WebElement DMA;

	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable") })
	@FindBy(xpath = "//label[normalize-space(text())='Zone']/../following-sibling::td[1]//select")
	public WebElement Zone1;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(text())='Full Rate Amount']/../following-sibling::td[1]//input")
	public WebElement FullRateAmount;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(text())=\"BMW's Dealer Center ID\"]/../following-sibling::td[1]//input")
	public WebElement BMWDealerCenter;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(text())='Call Record']/../following-sibling::td[1]//input")
	public WebElement CallRecord;

	@TextType()
	@FindByLabel(label = "Bill to Account", labelType = LabelType.PrecedingCell, qualifierXpath = "span/input")
	public WebElement billToAccount;

	@TextType()
	@FindByLabel(label = "Production Cost", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement productionCost;

	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "No Specific Make"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "SRT"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo") })
	@FindByLabel(label = "Advertised Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement AdvertisedMake1;

	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "SRT"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo") })
	@FindByLabel(label = "Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement Make1;

	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable"),
			@ChoiceListValue(value = "Dealer Managed"),
			@ChoiceListValue(value = "Autotrader Managed") })
	@FindByLabel(label = "Co-op Level of Service", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement Co_OpLevelOfService1;

	@TextType()
	@FindByLabel(label = "APFD Date", labelType = LabelType.PrecedingCell, qualifierXpath = "span/input")
	public WebElement APFDDate1;

	@BooleanType()
	@FindByLabel(label = "Form Completed?", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Zone2;

	@TextType()
	@VisualforceBy(componentXPath = "apex:pageBlock[@id='mainPgBlkId']")
	public WebElement notes;

	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"),
			@ChoiceListValue(value = "Alfa Romeo"),
			@ChoiceListValue(value = "AMC"),
			@ChoiceListValue(value = "Aston Martin"),
			@ChoiceListValue(value = "Audi"),
			@ChoiceListValue(value = "Bentley"),
			@ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "Chrysler"),
			@ChoiceListValue(value = "Daewoo"),
			@ChoiceListValue(value = "Datsun"),
			@ChoiceListValue(value = "DeLorean"),
			@ChoiceListValue(value = "Dodge"),
			@ChoiceListValue(value = "Eagle"),
			@ChoiceListValue(value = "Ferrari"),
			@ChoiceListValue(value = "FIAT"),
			@ChoiceListValue(value = "Fisker"),
			@ChoiceListValue(value = "Ford"),
			@ChoiceListValue(value = "Freightliner"),
			@ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"),
			@ChoiceListValue(value = "Honda"),
			@ChoiceListValue(value = "HUMMER"),
			@ChoiceListValue(value = "Hyundai"),
			@ChoiceListValue(value = "Infiniti"),
			@ChoiceListValue(value = "Isuzu"),
			@ChoiceListValue(value = "Jaguar"),
			@ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"),
			@ChoiceListValue(value = "Lamborghini"),
			@ChoiceListValue(value = "Land Rover"),
			@ChoiceListValue(value = "Lexus"),
			@ChoiceListValue(value = "Lincoln"),
			@ChoiceListValue(value = "Lotus"),
			@ChoiceListValue(value = "Maserati"),
			@ChoiceListValue(value = "Maybach"),
			@ChoiceListValue(value = "Mazda"),
			@ChoiceListValue(value = "McLaren"),
			@ChoiceListValue(value = "Mercedes-Benz"),
			@ChoiceListValue(value = "Mercury"),
			@ChoiceListValue(value = "MINI"),
			@ChoiceListValue(value = "Mitsubishi"),
			@ChoiceListValue(value = "Nissan"),
			@ChoiceListValue(value = "No Specific Make"),
			@ChoiceListValue(value = "Oldsmobile"),
			@ChoiceListValue(value = "Plymouth"),
			@ChoiceListValue(value = "Pontiac"),
			@ChoiceListValue(value = "Porsche"),
			@ChoiceListValue(value = "RAM"),
			@ChoiceListValue(value = "Rolls-Royce"),
			@ChoiceListValue(value = "Saab"),
			@ChoiceListValue(value = "Saturn"),
			@ChoiceListValue(value = "Scion"),
			@ChoiceListValue(value = "smart"), @ChoiceListValue(value = "SRT"),
			@ChoiceListValue(value = "Subaru"),
			@ChoiceListValue(value = "Suzuki"),
			@ChoiceListValue(value = "Tesla"),
			@ChoiceListValue(value = "Toyota"),
			@ChoiceListValue(value = "Volkswagen"),
			@ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo") })
	@FindByLabel(label = "Advertised Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement AdvertisedMake2;

	@ChoiceListType(values = { @ChoiceListValue(value = "12") })
	@FindBy(xpath = "//label[normalize-space(text())='Term Duration (12 Months)']/../following-sibling::td[1]//select")
	public WebElement termDuration12Months1;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(text())='Production Cost']/../following-sibling::td[1]//input")
	public WebElement productionCost1;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(text())='Bill to Account']/../following-sibling::td[1]//input[@type='text']")
	public WebElement BillToAccount1;

	@ChoiceListType(values = { @ChoiceListValue(value = "ABILENE-SWEETWATER"),
			@ChoiceListValue(value = "ADA-ARDMORE"),
			@ChoiceListValue(value = "ALBANY-SCHENECTADY-TROY"),
			@ChoiceListValue(value = "ALBANY_GA"),
			@ChoiceListValue(value = "ALBUQUERQUE-SANTA_FE"),
			@ChoiceListValue(value = "ALEXANDRIA_LA"),
			@ChoiceListValue(value = "ALPENA"),
			@ChoiceListValue(value = "AMARILLO"),
			@ChoiceListValue(value = "ANCHORAGE"),
			@ChoiceListValue(value = "ATLANTA"),
			@ChoiceListValue(value = "AUGUSTA"),
			@ChoiceListValue(value = "AUSTIN"),
			@ChoiceListValue(value = "BAKERSFIELD"),
			@ChoiceListValue(value = "BALTIMORE"),
			@ChoiceListValue(value = "BANGOR"),
			@ChoiceListValue(value = "BATON_ROUGE"),
			@ChoiceListValue(value = "BEAUMONT-PORT_ARTHUR"),
			@ChoiceListValue(value = "BEND_OR"),
			@ChoiceListValue(value = "BILLINGS"),
			@ChoiceListValue(value = "BILOXI-GULFPORT"),
			@ChoiceListValue(value = "BINGHAMTON"),
			@ChoiceListValue(value = "BIRMINGHAM"),
			@ChoiceListValue(value = "BLUEFIELD-BECKLEY-OAK_HILL"),
			@ChoiceListValue(value = "BOISE"),
			@ChoiceListValue(value = "BOSTON"),
			@ChoiceListValue(value = "BOWLING_GREEN"),
			@ChoiceListValue(value = "BUFFALO"),
			@ChoiceListValue(value = "BURLINGTON-PLATTSBURGH"),
			@ChoiceListValue(value = "BUTTE"),
			@ChoiceListValue(value = "CASPER-RIVERTON"),
			@ChoiceListValue(value = "CEDAR_RAPIDS-WATERLOO_AND_DUBQ"),
			@ChoiceListValue(value = "CHAMPAIGN_AND_SPRNGFLD-DECATUR"),
			@ChoiceListValue(value = "CHARLESTON-HUNTINGTON"),
			@ChoiceListValue(value = "CHARLESTON_SC"),
			@ChoiceListValue(value = "CHARLOTTE"),
			@ChoiceListValue(value = "CHARLOTTESVILLE"),
			@ChoiceListValue(value = "CHATTANOOGA"),
			@ChoiceListValue(value = "CHEYENNE-SCOTTSBLUF-STRLNG"),
			@ChoiceListValue(value = "CHICAGO"),
			@ChoiceListValue(value = "CHICO-REDDING"),
			@ChoiceListValue(value = "CINCINNATI"),
			@ChoiceListValue(value = "CLARKSBURG-WESTON"),
			@ChoiceListValue(value = "CLEVELAND"),
			@ChoiceListValue(value = "COLORADO_SPRINGS-PUEBLO"),
			@ChoiceListValue(value = "COLUMBIA-JEFFERSON_CITY"),
			@ChoiceListValue(value = "COLUMBIA_SC"),
			@ChoiceListValue(value = "COLUMBUS-TUPELO-WEST_POINT"),
			@ChoiceListValue(value = "COLUMBUS_GA"),
			@ChoiceListValue(value = "COLUMBUS_OH"),
			@ChoiceListValue(value = "CORPUS_CHRISTI"),
			@ChoiceListValue(value = "DALLAS-FT_WORTH"),
			@ChoiceListValue(value = "DAVENPORT-RISLAND-MOLINE"),
			@ChoiceListValue(value = "DAYTON"),
			@ChoiceListValue(value = "DENVER"),
			@ChoiceListValue(value = "DES_MOINES-AMES"),
			@ChoiceListValue(value = "DETROIT"),
			@ChoiceListValue(value = "DOTHAN"),
			@ChoiceListValue(value = "DULUTH-SUPERIOR"),
			@ChoiceListValue(value = "ELMIRA"),
			@ChoiceListValue(value = "EL_PASO"),
			@ChoiceListValue(value = "ERIE"),
			@ChoiceListValue(value = "EUGENE"),
			@ChoiceListValue(value = "EUREKA"),
			@ChoiceListValue(value = "EVANSVILLE"),
			@ChoiceListValue(value = "FAIRBANKS"),
			@ChoiceListValue(value = "FARGO-VALLEY_CITY"),
			@ChoiceListValue(value = "FLINT-SAGINAW-BAY_CITY"),
			@ChoiceListValue(value = "FLORENCE-MYRTLE_BEACH"),
			@ChoiceListValue(value = "FORT_WAYNE"),
			@ChoiceListValue(value = "FRESNO-VISALIA"),
			@ChoiceListValue(value = "FT_MYERS-NAPLES"),
			@ChoiceListValue(value = "FT_SMITH"),
			@ChoiceListValue(value = "GAINESVILLE"),
			@ChoiceListValue(value = "GLENDIVE"),
			@ChoiceListValue(value = "GRAND_JUNCTION-MONTROSE"),
			@ChoiceListValue(value = "GRAND_RAPIDS-KALMZOO-BCRK"),
			@ChoiceListValue(value = "GREAT_FALLS"),
			@ChoiceListValue(value = "GREENSBORO-HPOINT-WSALEM"),
			@ChoiceListValue(value = "GREENVILLE-NBERN-WASHNGTN"),
			@ChoiceListValue(value = "GREENVILLE-SPART-ASHEVILLE"),
			@ChoiceListValue(value = "GREENWOOD-GREENVILLE"),
			@ChoiceListValue(value = "GREEN_BAY-APPLETON"),
			@ChoiceListValue(value = "HARLINGEN-WESLACO-BRNSVLLE"),
			@ChoiceListValue(value = "HARRISBURG-LNCSTR-LEB-YORK"),
			@ChoiceListValue(value = "HARRISONBURG"),
			@ChoiceListValue(value = "HARTFORD_AND_NEW_HAVEN"),
			@ChoiceListValue(value = "HATTIESBURG-LAUREL"),
			@ChoiceListValue(value = "HELENA"),
			@ChoiceListValue(value = "HONOLULU"),
			@ChoiceListValue(value = "HOUSTON"),
			@ChoiceListValue(value = "HUNTSVILLE-DECATURFLOR"),
			@ChoiceListValue(value = "IDAHO_FALLS-POCATELLO"),
			@ChoiceListValue(value = "INDIANAPOLIS"),
			@ChoiceListValue(value = "JACKSONVILLE_BRUNSWICK"),
			@ChoiceListValue(value = "JACKSON_MS"),
			@ChoiceListValue(value = "JACKSON_TN"),
			@ChoiceListValue(value = "JOHNSTOWN-ALTOONA"),
			@ChoiceListValue(value = "JONESBORO"),
			@ChoiceListValue(value = "JOPLIN-PITTSBURG"),
			@ChoiceListValue(value = "JUNEAU"),
			@ChoiceListValue(value = "KANSAS_CITY"),
			@ChoiceListValue(value = "KNOXVILLE"),
			@ChoiceListValue(value = "LAFAYETTE_IN"),
			@ChoiceListValue(value = "LAFAYETTE_LA"),
			@ChoiceListValue(value = "LAKE_CHARLES"),
			@ChoiceListValue(value = "LANSING"),
			@ChoiceListValue(value = "LAREDO"),
			@ChoiceListValue(value = "LAS_VEGAS"),
			@ChoiceListValue(value = "LA_CROSSE-EAU_CLAIRE"),
			@ChoiceListValue(value = "LEXINGTON"),
			@ChoiceListValue(value = "LIMA"),
			@ChoiceListValue(value = "LINCOLN_AND_HSTNGS-KRNY_PLUS"),
			@ChoiceListValue(value = "LITTLE_ROCK-PINE_BLUFF"),
			@ChoiceListValue(value = "LOS_ANGELES"),
			@ChoiceListValue(value = "LOUISVILLE"),
			@ChoiceListValue(value = "LUBBOCK"),
			@ChoiceListValue(value = "MACON"),
			@ChoiceListValue(value = "MADISON"),
			@ChoiceListValue(value = "MANKATO"),
			@ChoiceListValue(value = "MARQUETTE"),
			@ChoiceListValue(value = "MEDFORD-KLAMATH_FALLS"),
			@ChoiceListValue(value = "MEMPHIS"),
			@ChoiceListValue(value = "MERIDIAN"),
			@ChoiceListValue(value = "MIAMI-FT_LAUDERDALE"),
			@ChoiceListValue(value = "MILWAUKEE"),
			@ChoiceListValue(value = "MINNEAPOLIS-ST_PAUL"),
			@ChoiceListValue(value = "MINOT-BISMARCK-DICKINSON"),
			@ChoiceListValue(value = "MISSOULA"),
			@ChoiceListValue(value = "MOBILE-PENSACOLA"),
			@ChoiceListValue(value = "MONROE-EL_DORADO"),
			@ChoiceListValue(value = "MONTEREY-SALINAS"),
			@ChoiceListValue(value = "MONTGOMERY"),
			@ChoiceListValue(value = "NASHVILLE"),
			@ChoiceListValue(value = "NEW_ORLEANS"),
			@ChoiceListValue(value = "NEW_YORK"),
			@ChoiceListValue(value = "NORFOLK-PORTSMTH-NEWPT_NWS"),
			@ChoiceListValue(value = "NORTH_PLATTE"),
			@ChoiceListValue(value = "ODESSA-MIDLAND"),
			@ChoiceListValue(value = "OKLAHOMA_CITY"),
			@ChoiceListValue(value = "OMAHA"),
			@ChoiceListValue(value = "ORLANDO-DAYTONA_BCH-MELBRN"),
			@ChoiceListValue(value = "OTTUMWA-KIRKSVILLE"),
			@ChoiceListValue(value = "PADUCAH-CGIRD-HARBG-MT_VN"),
			@ChoiceListValue(value = "PALM_BEACH"),
			@ChoiceListValue(value = "PALM_SPRINGS"),
			@ChoiceListValue(value = "PANAMA_CITY"),
			@ChoiceListValue(value = "PARKERSBURG"),
			@ChoiceListValue(value = "PEORIA-BLOOMINGTON"),
			@ChoiceListValue(value = "PHILADELPHIA"),
			@ChoiceListValue(value = "PHOENIX"),
			@ChoiceListValue(value = "PITTSBURGH"),
			@ChoiceListValue(value = "PORTLAND-AUBURN"),
			@ChoiceListValue(value = "PORTLAND_OR"),
			@ChoiceListValue(value = "PRESQUE_ISLE"),
			@ChoiceListValue(value = "PROVIDENCE-NEW_BEDFORD"),
			@ChoiceListValue(value = "PUERTO_RICO"),
			@ChoiceListValue(value = "QUINCY-HANNIBAL-KEOKUK"),
			@ChoiceListValue(value = "RALEIGH-DURHAM"),
			@ChoiceListValue(value = "RAPID_CITY"),
			@ChoiceListValue(value = "RENO"),
			@ChoiceListValue(value = "RICHMOND-PETERSBURG"),
			@ChoiceListValue(value = "ROANOKE-LYNCHBURG"),
			@ChoiceListValue(value = "ROCHESTER_NY"),
			@ChoiceListValue(value = "ROCHESTR-MASON_CITY-AUSTIN"),
			@ChoiceListValue(value = "ROCKFORD"),
			@ChoiceListValue(value = "SACRAMNTO-STKTN-MODESTO"),
			@ChoiceListValue(value = "SAINT_JOSEPH"),
			@ChoiceListValue(value = "SALISBURY"),
			@ChoiceListValue(value = "SALT_LAKE_CITY"),
			@ChoiceListValue(value = "SANTABARBRA-SANMAR-SANLUOB"),
			@ChoiceListValue(value = "SAN_ANGELO"),
			@ChoiceListValue(value = "SAN_ANTONIO"),
			@ChoiceListValue(value = "SAN_DIEGO"),
			@ChoiceListValue(value = "SAN_FRANCISCO-OAK-SAN_JOSE"),
			@ChoiceListValue(value = "SAVANNAH"),
			@ChoiceListValue(value = "SEATTLE-TACOMA"),
			@ChoiceListValue(value = "SHREVEPORT"),
			@ChoiceListValue(value = "SIOUX_CITY"),
			@ChoiceListValue(value = "SIOUX_FALLSMITCHELL"),
			@ChoiceListValue(value = "SOUTH_BEND-ELKHART"),
			@ChoiceListValue(value = "SPOKANE"),
			@ChoiceListValue(value = "SPRINGFIELD-HOLYOKE"),
			@ChoiceListValue(value = "SPRINGFIELD_MO"),
			@ChoiceListValue(value = "ST_LOUIS"),
			@ChoiceListValue(value = "SYRACUSE"),
			@ChoiceListValue(value = "TALLAHASSEE-THOMASVILLE"),
			@ChoiceListValue(value = "TAMPA-ST_PETESARASOTA"),
			@ChoiceListValue(value = "TERRE_HAUTE"),
			@ChoiceListValue(value = "TOLEDO"),
			@ChoiceListValue(value = "TOPEKA"),
			@ChoiceListValue(value = "TRAVERSE_CITY-CADILLAC"),
			@ChoiceListValue(value = "TRI-CITIES_TN-VA"),
			@ChoiceListValue(value = "TUCSON_-_SIERRA_VISTA"),
			@ChoiceListValue(value = "TULSA"),
			@ChoiceListValue(value = "TWIN_FALLS"),
			@ChoiceListValue(value = "TYLER"),
			@ChoiceListValue(value = "UNASSIGNED"),
			@ChoiceListValue(value = "UTICA"),
			@ChoiceListValue(value = "VICTORIA"),
			@ChoiceListValue(value = "WACO-TEMPLE-BRYAN"),
			@ChoiceListValue(value = "WASHINGTON_DC"),
			@ChoiceListValue(value = "WATERTOWN"),
			@ChoiceListValue(value = "WAUSAU-RHINELANDER"),
			@ChoiceListValue(value = "WHEELING-STEUBENVILLE"),
			@ChoiceListValue(value = "WICHITA-HUTCHINSON_PLUS"),
			@ChoiceListValue(value = "WICHITA_FALLS_AND_LAWTON"),
			@ChoiceListValue(value = "WILKES_BARRE-SCRANTON"),
			@ChoiceListValue(value = "WILMINGTON"),
			@ChoiceListValue(value = "YAKIMA-PASCO-RCHLND-KNNWCK"),
			@ChoiceListValue(value = "YOUNGSTOWN"),
			@ChoiceListValue(value = "YUMA-EL_CENTRO"),
			@ChoiceListValue(value = "ZANESVILLE") })
	@FindByLabel(label = "DMA", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement DMA1;

	@TextType()
	@FindByLabel(label = "DBA Name", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement dBAName;

	@TextType()
	@FindByLabel(label = "OEM Id", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement oemID;

	@ChoiceListType(values = { @ChoiceListValue(value = "Full Rate"),
			@ChoiceListValue(value = "Below Rate") })
	@FindByLabel(label = "Full Rate / Below Rate", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement fullRateBelowRate;

	@TextType()
	@FindByLabel(label = "Total Inventory (New / Used / Certified)", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement totalInventoryNewUsedCertified;

	@ChoiceListType(values = { @ChoiceListValue(value = "DIRECT"),
			@ChoiceListValue(value = "Dealer Specialties"),
			@ChoiceListValue(value = "Reynolds & Reynolds"),
			@ChoiceListValue(value = "HOMENET"),
			@ChoiceListValue(value = "CDMDATA"),
			@ChoiceListValue(value = "CARSFORSALE"),
			@ChoiceListValue(value = "EARTHCARS"),
			@ChoiceListValue(value = "AUTOUPLINK"),
			@ChoiceListValue(value = "EBIZAUTOS"),
			@ChoiceListValue(value = "Other Inventory Source"),
			@ChoiceListValue(value = "Use Existing") })
	@FindByLabel(label = "New Car Inventory Source", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement newCarInventorySource;

	@TextType()
	@FindByLabel(label = "TIM Dealership Contact", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement tIMDealershipContact;

	@TextType()
	@FindByLabel(label = "TIM Dealership Contact Mobile Carrier", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement tIMDealershipContactMobileCarrier;

	@TextType()
	@FindByLabel(label = "TIM Dealership XML Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement tIMDealershipXMLEmailAddress;

	@TextType()
	@FindByLabel(label = "Training Headcount", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement trainingHeadcount;

	@TextType()
	@FindByLabel(label = "Name of CRM System", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement nameOfCRMSystem;

	@TextType()
	@FindByLabel(label = "TIM Dealership Contact Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement tIMDealershipContactEmailAddress;

	@TextType()
	@FindByLabel(label = "TIM Dealership Contact Mobile Number", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement tIMDealershipContactMobileNumber;

	@TextType()
	@FindByLabel(label = "TIM Dealer Website Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement tIMDealerWebsiteAddress;

	@TextType()
	@FindByLabel(label = "vAuto ID", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement vAutoId;

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!saveAction}']")
	public WebElement save1;

	@TextType()
	@FindByLabel(label = "Co-op Contact Email", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement coOpContactEmail;
	
	@TextType()
	@FindByLabel(label = "Vehicle Sequence", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement VehicleSequence;
	
	@TextType()
	@FindByLabel(label = "Sitelink Used URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkUsedURL;
	
	@TextType()
	@FindByLabel(label = "Sitelink Used Use Existing", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkUsedUseExisting;
	
		@TextType()
	@FindByLabel(label = "Total Used Car Lot Size", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TotalUsedCarLotSize;

		@TextType()
	@FindByLabel(label = "Used Car Inventory Source", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement UsedCarInventorySource;	
	
	@TextType()
	@FindByLabel(label = "Notes", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Notes;
	
	@TextType()
	@FindByLabel(label = "Production Cost", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ProductionCost;
	
		@TextType()
	@FindByLabel(label = "SCA Artwork", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement SCAArtwork;
	
	@TextType()
	@FindByLabel(label = "Call Tracking Used Call Record", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingUsedCallRecord;
	
	@TextType()
	@FindByLabel(label = "Call Tracking Used Enhanced", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingUsedEnhanced;
	
	@TextType()
	@FindByLabel(label = "Call Tracking Used Re-Direct", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingUsedRedirect;
	
	@TextType()
	@FindByLabel(label = "Call Tracking Used Whisper", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingUsedWhisper;
	
    @TextType()
	@FindByLabel(label = "Form Completed?", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FormCompleted;

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!saveAction}']")
	public WebElement save2;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	


	
}
