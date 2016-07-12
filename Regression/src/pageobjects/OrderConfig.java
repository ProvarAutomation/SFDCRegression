package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;


/**
 * OLD FIELDS ARE STILL IN HERE
 **/

@Page( title="OrderConfig"                                
, summary="Mega Page Object for Order Product Edit Configuration page"
, remarks = "Follow naming conventions as listed in source", connection="Admin"
		)             
public class OrderConfig {

	@TextType()
	@FindByLabel(label = "Line Description", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement LineDescription;
	@TextType()
	@FindByLabel(label = "Total Used Car Lot Size", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TotalUsedCarLotSize;
	@TextType()
	@FindByLabel(label = "Total Production Cost", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TotalProductionCost;
	@TextType()
    @FindBy(xpath = "//label[normalize-space(text())=\"BMW's Dealer Center ID\"]/../following-sibling::td[1]//input")
    public WebElement BMWDealerCenterID;
	@TextType()
	@FindByLabel(label = "Notes", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Notes;
	@TextType()
	@FindByLabel(label = "Non-reimbursable amount", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NonReimbursableAmount;
	@BooleanType()
	@FindByLabel(label = "Enhanced Call Tracking", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement EnhancedCallTracking;
	@BooleanType()
	@FindByLabel(label = "Approved for Future Delivery?", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ApprovedForFutureDelivery;
	@BooleanType()
	@FindByLabel(label = "Form Completed?", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FormCompleted;
	@TextType()
	@FindByLabel(label = "Re-direct #", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement RedirectNo;
	@TextType()
	@FindByLabel(label = "First Name", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FirstName;
	@TextType()
	@FindByLabel(label = "Last Name", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement LastName;
	@TextType()
	@FindByLabel(label = "Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement EmailAddress;
	@TextType()
	@FindByLabel(label = "Phone Number", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement PhoneNumber;
	@TextType()
	@FindByLabel(label = "Link", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Link;
	@TextType()
	@FindByLabel(label = "Haystak URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement HaystakURL;
	@TextType()
	@FindByLabel(label = "Click-thru URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ClickThruURL;
	@TextType()
	@FindByLabel(label = "New Car Contact Email", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NewCarContactEmail;
	@TextType()
	@FindByLabel(label = "Other Email", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement OtherEmail;
	@TextType()
	@FindByLabel(label = "Primary Contact Email", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement PrimaryContactEmail;
	@BooleanType()
	@FindByLabel(label = "Sitelink Used Advanced", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkUsedAdvanced;
	@BooleanType()
	@FindByLabel(label = "Sitelink Used Pro OPT IN", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkUsedProOptIN;
	@BooleanType()
	@FindByLabel(label = "Sitelink Used Use Existing", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkUsedUseExisting;
	@BooleanType()
	@FindByLabel(label = "Use Existing Facebook", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement UseExistingFacebook;
	@BooleanType()
	@FindByLabel(label = "Use Existing Twitter", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement UseExistingTwitter;
	@TextType()
	@FindByLabel(label = "Sitelink Used URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkUsedURL;
	@TextType()
	@FindByLabel(label = "Facebook ID", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FacebookId;
	@TextType()
	@FindByLabel(label = "Facebook Inventory", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FacebookInventory;
	@TextType()
	@FindByLabel(label = "Twitter ID", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TwitterId;
	@TextType()
	@FindByLabel(label = "Facebook.com/", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FacebookDotComSlash;
	@ChoiceListType(values = { @ChoiceListValue(value = "Additional Business"),
			@ChoiceListValue(value = "Down Sell"),
			@ChoiceListValue(value = "New Business"),
			@ChoiceListValue(value = "Up Sell") })
	@FindByLabel(label = "Transaction Type", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TransactionType;
	@ChoiceListType(values = { @ChoiceListValue(value = "Yes"), @ChoiceListValue(value = "No") })
	@FindByLabel(label = "Alpha Full Rate", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement AlphaFullRate;
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
	@FindByLabel(label = "Used Car Inventory Source", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement UsedCarInventorySource;
	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable"),
			@ChoiceListValue(value = "Opt Out of Automated Co-op Submission") })
	@FindByLabel(label = "Opt-Out Co-op Submission CPO", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement OptOutCoOpSubmissionCPO;
	@ChoiceListType(values = { @ChoiceListValue(value = "CitySearch.com"), @ChoiceListValue(value = "DealerRater.com"), @ChoiceListValue(value = "Kudzu.com"), @ChoiceListValue(value = "Yelp.com"), @ChoiceListValue(value = "Other") })
	@FindByLabel(label = "Provider", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement Provider;
	@ChoiceListType(values = { @ChoiceListValue(value = "Enclosed"), @ChoiceListValue(value = "Make simple logo"), @ChoiceListValue(value = "Use Dealer Site"), @ChoiceListValue(value = "Use Existing") })
	@FindByLabel(label = "SCA Artwork", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement SCAArtwork;
	@ChoiceListType(values = { @ChoiceListValue(value = "ABILENE-SWEETWATER"), @ChoiceListValue(value = "ADA-ARDMORE"), @ChoiceListValue(value = "ALBANY-SCHENECTADY-TROY"), @ChoiceListValue(value = "ALBANY_GA"), @ChoiceListValue(value = "ALBUQUERQUE-SANTA_FE"), @ChoiceListValue(value = "ALEXANDRIA_LA"), @ChoiceListValue(value = "ALPENA"), @ChoiceListValue(value = "AMARILLO"), @ChoiceListValue(value = "ANCHORAGE"), @ChoiceListValue(value = "ATLANTA"), @ChoiceListValue(value = "AUGUSTA"), @ChoiceListValue(value = "AUSTIN"), @ChoiceListValue(value = "BAKERSFIELD"), @ChoiceListValue(value = "BALTIMORE"), @ChoiceListValue(value = "BANGOR"), @ChoiceListValue(value = "BATON_ROUGE"), @ChoiceListValue(value = "BEAUMONT-PORT_ARTHUR"), @ChoiceListValue(value = "BEND_OR"), @ChoiceListValue(value = "BILLINGS"), @ChoiceListValue(value = "BILOXI-GULFPORT"), @ChoiceListValue(value = "BINGHAMTON"), @ChoiceListValue(value = "BIRMINGHAM"), @ChoiceListValue(value = "BLUEFIELD-BECKLEY-OAK_HILL"), @ChoiceListValue(value = "BOISE"), @ChoiceListValue(value = "BOSTON"), @ChoiceListValue(value = "BOWLING_GREEN"), @ChoiceListValue(value = "BUFFALO"), @ChoiceListValue(value = "BURLINGTON-PLATTSBURGH"), @ChoiceListValue(value = "BUTTE"), @ChoiceListValue(value = "CASPER-RIVERTON"), @ChoiceListValue(value = "CEDAR_RAPIDS-WATERLOO_AND_DUBQ"), @ChoiceListValue(value = "CHAMPAIGN_AND_SPRNGFLD-DECATUR"), @ChoiceListValue(value = "CHARLESTON-HUNTINGTON"), @ChoiceListValue(value = "CHARLESTON_SC"), @ChoiceListValue(value = "CHARLOTTE"), @ChoiceListValue(value = "CHARLOTTESVILLE"), @ChoiceListValue(value = "CHATTANOOGA"), @ChoiceListValue(value = "CHEYENNE-SCOTTSBLUF-STRLNG"), @ChoiceListValue(value = "CHICAGO"), @ChoiceListValue(value = "CHICO-REDDING"), @ChoiceListValue(value = "CINCINNATI"), @ChoiceListValue(value = "CLARKSBURG-WESTON"), @ChoiceListValue(value = "CLEVELAND"), @ChoiceListValue(value = "COLORADO_SPRINGS-PUEBLO"), @ChoiceListValue(value = "COLUMBIA-JEFFERSON_CITY"), @ChoiceListValue(value = "COLUMBIA_SC"), @ChoiceListValue(value = "COLUMBUS-TUPELO-WEST_POINT"), @ChoiceListValue(value = "COLUMBUS_GA"), @ChoiceListValue(value = "COLUMBUS_OH"), @ChoiceListValue(value = "CORPUS_CHRISTI"), @ChoiceListValue(value = "DALLAS-FT_WORTH"), @ChoiceListValue(value = "DAVENPORT-RISLAND-MOLINE"), @ChoiceListValue(value = "DAYTON"), @ChoiceListValue(value = "DENVER"), @ChoiceListValue(value = "DES_MOINES-AMES"), @ChoiceListValue(value = "DETROIT"), @ChoiceListValue(value = "DOTHAN"), @ChoiceListValue(value = "DULUTH-SUPERIOR"), @ChoiceListValue(value = "ELMIRA"), @ChoiceListValue(value = "EL_PASO"), @ChoiceListValue(value = "ERIE"), @ChoiceListValue(value = "EUGENE"), @ChoiceListValue(value = "EUREKA"), @ChoiceListValue(value = "EVANSVILLE"), @ChoiceListValue(value = "FAIRBANKS"), @ChoiceListValue(value = "FARGO-VALLEY_CITY"), @ChoiceListValue(value = "FLINT-SAGINAW-BAY_CITY"), @ChoiceListValue(value = "FLORENCE-MYRTLE_BEACH"), @ChoiceListValue(value = "FORT_WAYNE"), @ChoiceListValue(value = "FRESNO-VISALIA"), @ChoiceListValue(value = "FT_MYERS-NAPLES"), @ChoiceListValue(value = "FT_SMITH"), @ChoiceListValue(value = "GAINESVILLE"), @ChoiceListValue(value = "GLENDIVE"), @ChoiceListValue(value = "GRAND_JUNCTION-MONTROSE"), @ChoiceListValue(value = "GRAND_RAPIDS-KALMZOO-BCRK"), @ChoiceListValue(value = "GREAT_FALLS"), @ChoiceListValue(value = "GREENSBORO-HPOINT-WSALEM"), @ChoiceListValue(value = "GREENVILLE-NBERN-WASHNGTN"), @ChoiceListValue(value = "GREENVILLE-SPART-ASHEVILLE"), @ChoiceListValue(value = "GREENWOOD-GREENVILLE"), @ChoiceListValue(value = "GREEN_BAY-APPLETON"), @ChoiceListValue(value = "HARLINGEN-WESLACO-BRNSVLLE"), @ChoiceListValue(value = "HARRISBURG-LNCSTR-LEB-YORK"), @ChoiceListValue(value = "HARRISONBURG"), @ChoiceListValue(value = "HARTFORD_AND_NEW_HAVEN"), @ChoiceListValue(value = "HATTIESBURG-LAUREL"), @ChoiceListValue(value = "HELENA"), @ChoiceListValue(value = "HONOLULU"), @ChoiceListValue(value = "HOUSTON"), @ChoiceListValue(value = "HUNTSVILLE-DECATURFLOR"), @ChoiceListValue(value = "IDAHO_FALLS-POCATELLO"), @ChoiceListValue(value = "INDIANAPOLIS"), @ChoiceListValue(value = "JACKSONVILLE_BRUNSWICK"), @ChoiceListValue(value = "JACKSON_MS"), @ChoiceListValue(value = "JACKSON_TN"), @ChoiceListValue(value = "JOHNSTOWN-ALTOONA"), @ChoiceListValue(value = "JONESBORO"), @ChoiceListValue(value = "JOPLIN-PITTSBURG"), @ChoiceListValue(value = "JUNEAU"), @ChoiceListValue(value = "KANSAS_CITY"), @ChoiceListValue(value = "KNOXVILLE"), @ChoiceListValue(value = "LAFAYETTE_IN"), @ChoiceListValue(value = "LAFAYETTE_LA"), @ChoiceListValue(value = "LAKE_CHARLES"), @ChoiceListValue(value = "LANSING"), @ChoiceListValue(value = "LAREDO"), @ChoiceListValue(value = "LAS_VEGAS"), @ChoiceListValue(value = "LA_CROSSE-EAU_CLAIRE"), @ChoiceListValue(value = "LEXINGTON"), @ChoiceListValue(value = "LIMA"), @ChoiceListValue(value = "LINCOLN_AND_HSTNGS-KRNY_PLUS"), @ChoiceListValue(value = "LITTLE_ROCK-PINE_BLUFF"), @ChoiceListValue(value = "LOS_ANGELES"), @ChoiceListValue(value = "LOUISVILLE"), @ChoiceListValue(value = "LUBBOCK"), @ChoiceListValue(value = "MACON"), @ChoiceListValue(value = "MADISON"), @ChoiceListValue(value = "MANKATO"), @ChoiceListValue(value = "MARQUETTE"), @ChoiceListValue(value = "MEDFORD-KLAMATH_FALLS"), @ChoiceListValue(value = "MEMPHIS"), @ChoiceListValue(value = "MERIDIAN"), @ChoiceListValue(value = "MIAMI-FT_LAUDERDALE"), @ChoiceListValue(value = "MILWAUKEE"), @ChoiceListValue(value = "MINNEAPOLIS-ST_PAUL"), @ChoiceListValue(value = "MINOT-BISMARCK-DICKINSON"), @ChoiceListValue(value = "MISSOULA"), @ChoiceListValue(value = "MOBILE-PENSACOLA"), @ChoiceListValue(value = "MONROE-EL_DORADO"), @ChoiceListValue(value = "MONTEREY-SALINAS"), @ChoiceListValue(value = "MONTGOMERY"), @ChoiceListValue(value = "NASHVILLE"), @ChoiceListValue(value = "NEW_ORLEANS"), @ChoiceListValue(value = "NEW_YORK"), @ChoiceListValue(value = "NORFOLK-PORTSMTH-NEWPT_NWS"), @ChoiceListValue(value = "NORTH_PLATTE"), @ChoiceListValue(value = "ODESSA-MIDLAND"), @ChoiceListValue(value = "OKLAHOMA_CITY"), @ChoiceListValue(value = "OMAHA"), @ChoiceListValue(value = "ORLANDO-DAYTONA_BCH-MELBRN"), @ChoiceListValue(value = "OTTUMWA-KIRKSVILLE"), @ChoiceListValue(value = "PADUCAH-CGIRD-HARBG-MT_VN"), @ChoiceListValue(value = "PALM_BEACH"), @ChoiceListValue(value = "PALM_SPRINGS"), @ChoiceListValue(value = "PANAMA_CITY"), @ChoiceListValue(value = "PARKERSBURG"), @ChoiceListValue(value = "PEORIA-BLOOMINGTON"), @ChoiceListValue(value = "PHILADELPHIA"), @ChoiceListValue(value = "PHOENIX"), @ChoiceListValue(value = "PITTSBURGH"), @ChoiceListValue(value = "PORTLAND-AUBURN"), @ChoiceListValue(value = "PORTLAND_OR"), @ChoiceListValue(value = "PRESQUE_ISLE"), @ChoiceListValue(value = "PROVIDENCE-NEW_BEDFORD"), @ChoiceListValue(value = "PUERTO_RICO"), @ChoiceListValue(value = "QUINCY-HANNIBAL-KEOKUK"), @ChoiceListValue(value = "RALEIGH-DURHAM"), @ChoiceListValue(value = "RAPID_CITY"), @ChoiceListValue(value = "RENO"), @ChoiceListValue(value = "RICHMOND-PETERSBURG"), @ChoiceListValue(value = "ROANOKE-LYNCHBURG"), @ChoiceListValue(value = "ROCHESTER_NY"), @ChoiceListValue(value = "ROCHESTR-MASON_CITY-AUSTIN"), @ChoiceListValue(value = "ROCKFORD"), @ChoiceListValue(value = "SACRAMNTO-STKTN-MODESTO"), @ChoiceListValue(value = "SAINT_JOSEPH"), @ChoiceListValue(value = "SALISBURY"), @ChoiceListValue(value = "SALT_LAKE_CITY"), @ChoiceListValue(value = "SANTABARBRA-SANMAR-SANLUOB"), @ChoiceListValue(value = "SAN_ANGELO"), @ChoiceListValue(value = "SAN_ANTONIO"), @ChoiceListValue(value = "SAN_DIEGO"), @ChoiceListValue(value = "SAN_FRANCISCO-OAK-SAN_JOSE"), @ChoiceListValue(value = "SAVANNAH"), @ChoiceListValue(value = "SEATTLE-TACOMA"), @ChoiceListValue(value = "SHREVEPORT"), @ChoiceListValue(value = "SIOUX_CITY"), @ChoiceListValue(value = "SIOUX_FALLSMITCHELL"), @ChoiceListValue(value = "SOUTH_BEND-ELKHART"), @ChoiceListValue(value = "SPOKANE"), @ChoiceListValue(value = "SPRINGFIELD-HOLYOKE"), @ChoiceListValue(value = "SPRINGFIELD_MO"), @ChoiceListValue(value = "ST_LOUIS"), @ChoiceListValue(value = "SYRACUSE"), @ChoiceListValue(value = "TALLAHASSEE-THOMASVILLE"), @ChoiceListValue(value = "TAMPA-ST_PETESARASOTA"), @ChoiceListValue(value = "TERRE_HAUTE"), @ChoiceListValue(value = "TOLEDO"), @ChoiceListValue(value = "TOPEKA"), @ChoiceListValue(value = "TRAVERSE_CITY-CADILLAC"), @ChoiceListValue(value = "TRI-CITIES_TN-VA"), @ChoiceListValue(value = "TUCSON_-_SIERRA_VISTA"), @ChoiceListValue(value = "TULSA"), @ChoiceListValue(value = "TWIN_FALLS"), @ChoiceListValue(value = "TYLER"), @ChoiceListValue(value = "UNASSIGNED"), @ChoiceListValue(value = "UTICA"), @ChoiceListValue(value = "VICTORIA"), @ChoiceListValue(value = "WACO-TEMPLE-BRYAN"), @ChoiceListValue(value = "WASHINGTON_DC"), @ChoiceListValue(value = "WATERTOWN"), @ChoiceListValue(value = "WAUSAU-RHINELANDER"), @ChoiceListValue(value = "WHEELING-STEUBENVILLE"), @ChoiceListValue(value = "WICHITA-HUTCHINSON_PLUS"), @ChoiceListValue(value = "WICHITA_FALLS_AND_LAWTON"), @ChoiceListValue(value = "WILKES_BARRE-SCRANTON"), @ChoiceListValue(value = "WILMINGTON"), @ChoiceListValue(value = "YAKIMA-PASCO-RCHLND-KNNWCK"), @ChoiceListValue(value = "YOUNGSTOWN"), @ChoiceListValue(value = "YUMA-EL_CENTRO"), @ChoiceListValue(value = "ZANESVILLE") })
	@FindByLabel(label = "DMA", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement DMA;
	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable") })
	@FindByLabel(label = "Zone", labelType = LabelType.PrecedingCell, qualifierXpath = "span/select")
	public WebElement Zone;
	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "SRT"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo") })
	@FindByLabel(label = "Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement Make; 
	@TextType()
	@FindByLabel(label = "Franchise", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Franchise; 
	@TextType()
	@FindByLabel(label = "Front-Line Pro Model", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FrontLineProModel;
	@TextType()
	@FindByLabel(label = "New Quantity", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NewQuantity; 
	@TextType()
	@FindByLabel(label = "Spotlight Quantity Enter Multiples of 5", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SpotlightQuantity; 
	@TextType()
	@FindByLabel(label = "Total Inventory (New / Used / Certified)", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TotalInventoryNewUsedCertified; 
	@TextType()
	@FindByLabel(label = "Total New Car Lot Size", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TotalNewCarLotSize;
	@TextType()
	@FindByLabel(label = "Monthly Advertising Budget", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement MonthlyAdvertisingBudget;
	@TextType()
	@FindByLabel(label = "Tier Governor Vehicle Quantity", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TierGovernorVehicleQuantity;
	@TextType()
	@FindByLabel(label = "Tier Governor Vehicle Monthly Rate", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TierGovernorVehicleMonthlyRate;
	@TextType()
	@FindByLabel(label = "New Car Make Quantity 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NewCarMakeQuantity1;
	@TextType()
	@FindByLabel(label = "New Car Make Quantity 2", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NewCarMakeQuantity2;
	@TextType()
	@FindByLabel(label = "New Car Make Quantity 3", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NewCarMakeQuantity3;
	@TextType()
	@FindByLabel(label = "New Car Make Quantity 4", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NewCarMakeQuantity4;
	@TextType()
	@FindByLabel(label = "New Car Make Quantity 5", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NewCarMakeQuantity5;
	@TextType()
	@FindByLabel(label = "Used Car Make Quantity 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement UsedCarMakeQuantity1;
	@TextType()
	@FindByLabel(label = "Used Car Make Quantity 2", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement UsedCarMakeQuantity2;
	@TextType()
	@FindByLabel(label = "Used Car Make Quantity 3", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement UsedCarMakeQuantity3;
	@TextType()
	@FindByLabel(label = "Used Car Make Quantity 4", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement UsedCarMakeQuantity4;
	@TextType()
	@FindByLabel(label = "Used Car Make Quantity 5", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement UsedCarMakeQuantity5;
	@TextType()
	@FindByLabel(label = "Term Duration", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TermDuration;
	@TextType()
	@FindByLabel(label = "Agency", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Agency;
	@TextType()
	@FindByLabel(label = "BAC Code", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement BACCode;
	@TextType()
	@FindByLabel(label = "Dealer Code", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DealerCode;
	@TextType()
	@FindByLabel(label = "Porsche Dealer Code", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement PorscheDealerCode;
	@TextType()
    @FindBy(xpath = "//label[normalize-space(text())=\"BMW's Location ID\"]/../following-sibling::td[1]//input")
    public WebElement BMWLocationID;
	@TextType()
    @FindBy(xpath = "//label[normalize-space(text())=\"MINI's Dealer Center ID\"]/../following-sibling::td[1]//input")
    public WebElement MINIDealerCenterId;
	@TextType()
    @FindBy(xpath = "//label[normalize-space(text())=\"MINI's Location ID\"]/../following-sibling::td[1]//input")
    public WebElement MINILocationId;
	@TextType()
	@FindByLabel(label = "Haystak Dealer Code", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement HaystakDealerCode;
	@TextType()
	@FindByLabel(label = "Name of CRM System", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NameOfCRMSystem;
	@TextType()
	@FindByLabel(label = "TIM Dealership Contact", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TIMDealershipContact;
	@PageWait.Timed(durationSeconds = 3)
	@TextType()
	@FindByLabel(label = "TIM Dealership Contact Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TIMDealershipContactEmailAddress;
	@TextType()
	@FindByLabel(label = "TIM Dealership Contact Mobile Carrier", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TIMDealershipContactMobileCarrier;
	@TextType()
	@FindByLabel(label = "TIM Dealership Contact Mobile Number", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TIMDealershipContactMobileNumber;
	@TextType()
	@FindByLabel(label = "TIM Dealership Contact phone", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TIMDealershipContactPhone;
	@TextType()
	@FindByLabel(label = "TIM Dealership XML Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TIMDealershipXMLEmailAddress;
	@TextType()
	@FindByLabel(label = "TIM Dealer Website Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TIMDealerWebsiteAddress;
	@TextType()
	@FindByLabel(label = "Training Headcount", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TrainingHeadcount;
	@TextType()
	@FindByLabel(label = "vAuto ID", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement VAutoId;
	@TextType()
	@FindByLabel(label = "Technical Contact E-mail", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TechnicalContactEmail;
	@TextType()
	@FindByLabel(label = "Technical Contact Name", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TechnicalContactName;
	@TextType()
	@FindByLabel(label = "Technical Contact Phone", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TechnicalContactPhone;
	@TextType()
	@FindByLabel(label = "Full Rate Amount", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FullRateAmount;
	@TextType()
	@FindByLabel(label = "Artwork - PreApprove Case #", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ArtworkPreApproveCaseNo;
	@TextType()
	@FindByLabel(label = "Dealership Website", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DealershipWebsite;
	@TextType()
	@FindByLabel(label = "Cars.com ID#", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CarsComId;
	@TextType()
	@FindByLabel(label = "Report Recipients Name 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ReportRecipientsName1;
	@TextType()
	@FindByLabel(label = "Report Recipients Name 2", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ReportRecipientsName2;
	@TextType()
	@FindByLabel(label = "Report Recipients Name 3", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ReportRecipientsName3;
	@TextType()
	@FindByLabel(label = "Report Recipients Email Address 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ReportRecipientsEmailAddress1;
	@TextType()
	@FindByLabel(label = "Report Recipients Email Address 2", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ReportRecipientsEmailAddress2;
	@TextType()
	@FindByLabel(label = "Report Recipients Email Address 3", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ReportRecipientsEmailAddress3;
	@TextType()
	@FindByLabel(label = "Top 6 cities: 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Top6cities1;
	@TextType()
	@FindByLabel(label = "Top 6 cities: 2", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Top6cities2;
	@TextType()
	@FindByLabel(label = "Top 6 cities: 3", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Top6cities3;
	@TextType()
	@FindByLabel(label = "Top 6 cities: 4", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Top6cities4;
	@TextType()
	@FindByLabel(label = "Top 6 cities: 5", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Top6cities5;
	@TextType()
	@FindByLabel(label = "Top 6 cities: 6", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Top6cities6;
	@TextType()
	@FindByLabel(label = "Tracking Number", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TrackingNumber;
	@TextType()
	@FindByLabel(label = "Cobalt URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CobaltURL;
	@TextType()
	@FindByLabel(label = "Dealer Website URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DealerWebsiteURL;
	@TextType()
	@FindByLabel(label = "Sitelink New URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkNewURL;
	@BooleanType()
	@FindByLabel(label = "Deliver 1st of the next month", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement Deliver1stOfTheNextMonth;
	@BooleanType()
	@FindByLabel(label = "Replace Current Spotlights", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ReplaceCurrentSpotlights;
	@BooleanType()
	@FindByLabel(label = "Dealer Specialties Customer", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DealerSpecialtiesCustomer;
	@BooleanType()
	@FindByLabel(label = "Dealer logo submitted to Autotrader", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DealerLogoSubmittedToAutotrader;
	@BooleanType()
	@FindByLabel(label = "Sitelink New Advanced", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkNewAdvanced;
	@BooleanType()
	@FindByLabel(label = "Sitelink New Pro OPT IN", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkNewProOPTIN;
	@BooleanType()
	@FindByLabel(label = "Sitelink New Use Existing", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SitelinkNewUseExisting;
	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable"), @ChoiceListValue(value = "Dealer Managed"), @ChoiceListValue(value = "Autotrader Managed") })
	@FindByLabel(label = "Co-op Level of Service", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement CoOpLevelOfService;
	@ChoiceListType(values = { @ChoiceListValue(value = "Registration"),
			@ChoiceListValue(value = "Renewal"),
			@ChoiceListValue(value = "Transfer") })
	@FindByLabel(label = "Custom URL Type", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement CustomURLType;
	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "No Specific Make"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "SRT"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo") })
	@FindByLabel(label = "Advertised Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement AdvertisedMake;
	@ChoiceListType(values = { @ChoiceListValue(value = "All Makes") })
	@FindByLabel(label = "Spotlight Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement SpotlightMake;
	@ChoiceListType(values = { @ChoiceListValue(value = "4 Day"), @ChoiceListValue(value = "7 Day"), @ChoiceListValue(value = "14 Day"), @ChoiceListValue(value = "28 Day") })
	@FindByLabel(label = "Spotlight Duration", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement SpotlightDuration;
	@ChoiceListType(values = { @ChoiceListValue(value = "1"), @ChoiceListValue(value = "2"), @ChoiceListValue(value = "3"), @ChoiceListValue(value = "4"), @ChoiceListValue(value = "5"), @ChoiceListValue(value = "6") })
	@FindByLabel(label = "Skyscrapers Buckets", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement SkyscrapersBuckets;
	@ChoiceListType(values = { @ChoiceListValue(value = "1"), @ChoiceListValue(value = "2"), @ChoiceListValue(value = "3"), @ChoiceListValue(value = "4"), @ChoiceListValue(value = "5"), @ChoiceListValue(value = "6") })
	@FindByLabel(label = "Skyscrapers Slots", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement SkyscrapersSlots;
	@ChoiceListType(values = { @ChoiceListValue(value = "All Car") })
	@FindByLabel(label = "Tier Governor Type", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement Tier_Governor_Type;
	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable") })
	@FindByLabel(label = "Tier Governor Value", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TierGovernorValue;
	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"),
			@ChoiceListValue(value = "Alfa Romeo"),
			@ChoiceListValue(value = "AMC"),
			@ChoiceListValue(value = "HUMMER"),
			@ChoiceListValue(value = "MINI"),
			@ChoiceListValue(value = "Scion"),
			@ChoiceListValue(value = "Aston Martin"),
			@ChoiceListValue(value = "Audi"),
			@ChoiceListValue(value = "Bentley"),
			@ChoiceListValue(value = "Ferrari"),
			@ChoiceListValue(value = "FIAT"),
			@ChoiceListValue(value = "Lamborghini"),
			@ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Lotus"),
			@ChoiceListValue(value = "Maserati"),
			@ChoiceListValue(value = "Maybach"),
			@ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "Chrysler"),
			@ChoiceListValue(value = "Rolls-Royce"),
			@ChoiceListValue(value = "DeLorean"),
			@ChoiceListValue(value = "Datsun"),
			@ChoiceListValue(value = "Dodge"),
			@ChoiceListValue(value = "Eagle"),
			@ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Geo"),
			@ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"),
			@ChoiceListValue(value = "Hyundai"),
			@ChoiceListValue(value = "Infiniti"),
			@ChoiceListValue(value = "Isuzu"),
			@ChoiceListValue(value = "Jaguar"),
			@ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"),
			@ChoiceListValue(value = "Lexus"),
			@ChoiceListValue(value = "Lincoln"),
			@ChoiceListValue(value = "Mazda"),
			@ChoiceListValue(value = "Mercedes-Benz"),
			@ChoiceListValue(value = "Mercury"),
			@ChoiceListValue(value = "Mitsubishi"),
			@ChoiceListValue(value = "Nissan"),
			@ChoiceListValue(value = "Oldsmobile"),
			@ChoiceListValue(value = "Plymouth"),
			@ChoiceListValue(value = "Pontiac"),
			@ChoiceListValue(value = "Porsche"),
			@ChoiceListValue(value = "Land Rover"),
			@ChoiceListValue(value = "Saab"),
			@ChoiceListValue(value = "Saturn"),
			@ChoiceListValue(value = "Subaru"),
			@ChoiceListValue(value = "Suzuki"),
			@ChoiceListValue(value = "Toyota"),
			@ChoiceListValue(value = "Volkswagen"),
			@ChoiceListValue(value = "Volvo"),
			@ChoiceListValue(value = "Yugo"),
			@ChoiceListValue(value = "Daewoo"),
			@ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "smart"),
			@ChoiceListValue(value = "Tesla"),
			@ChoiceListValue(value = "McLaren"),
			@ChoiceListValue(value = "Fisker"),
			@ChoiceListValue(value = "Freightliner"),
			@ChoiceListValue(value = "SRT") })
	@FindByLabel(label = "Tier Governor Advertised Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TierGovernorAdvertisedMake;
	@ChoiceListType(values = { @ChoiceListValue(value = "Dealer Managed"),
			@ChoiceListValue(value = "Autotrader Managed"),
			@ChoiceListValue(value = "OEM Managed"),
			@ChoiceListValue(value = "Not Applicable") })
	@FindByLabel(label = "Tier Governor Co-op Level of Service", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TierGovernorCoopLevelOfService;
	@ChoiceListType(values = { @ChoiceListValue(value = "GMC"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac") })
	@FindByLabel(label = "New Car Make 1", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement NewCarMake1;
	@ChoiceListType(values = { @ChoiceListValue(value = "GMC"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac") })
	@FindByLabel(label = "New Car Make 2", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement NewCarMake2;
	@ChoiceListType(values = { @ChoiceListValue(value = "GMC"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac") })
	@FindByLabel(label = "New Car Make 3", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement NewCarMake3;
	@ChoiceListType(values = { @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac") })
	@FindByLabel(label = "Used 1 GM Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement Used1GMMake;
	@ChoiceListType(values = { @ChoiceListValue(value = "GMC"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac") })
	@FindByLabel(label = "Used Car Make 1", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement UsedCarMake1;
	@ChoiceListType(values = { @ChoiceListValue(value = "GMC"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac") })
	@FindByLabel(label = "Used Car Make 2", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement UsedCarMake2;
	@ChoiceListType(values = { @ChoiceListValue(value = "GMC"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac") })
	@FindByLabel(label = "Used Car Make 3", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement UsedCarMake3;
	@ChoiceListType(values = { @ChoiceListValue(value = "DIRECT"), @ChoiceListValue(value = "Dealer Specialties"), @ChoiceListValue(value = "Reynolds & Reynolds"), @ChoiceListValue(value = "HOMENET"), @ChoiceListValue(value = "CDMDATA"), @ChoiceListValue(value = "CARSFORSALE"), @ChoiceListValue(value = "EARTHCARS"), @ChoiceListValue(value = "AUTOUPLINK"), @ChoiceListValue(value = "EBIZAUTOS"), @ChoiceListValue(value = "Other Inventory Source"), @ChoiceListValue(value = "Use Existing") })
	@FindByLabel(label = "New Car Inventory Source", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement NewCarInventorySource;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Tier Governor Sequence Sent EQS"),
			@ChoiceListValue(value = "Tier Governor Use Default Sequence Order") })
	@FindByLabel(label = "Tier Governor Sequence", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TierGovernorSequence;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Tier Governor Sorting Sent EQS"),
			@ChoiceListValue(value = "Tier Governor Use Default Sorting Order") })
	@FindByLabel(label = "Tier Governor Sorting", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TierGovernorSorting;
	@ChoiceListType(values = { @ChoiceListValue(value = "12 Months") })
	@FindByLabel(label = "Term Duration (Alpha all others)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TermDurationAlphaAllOthers;
	@ChoiceListType(values = { @ChoiceListValue(value = "3 Months"),
			@ChoiceListValue(value = "6 Months"),
			@ChoiceListValue(value = "9 Months"),
			@ChoiceListValue(value = "12 Months") })
	@FindByLabel(label = "Term Duration (Skyscrapers)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TermDurationSkyscrapers;
	@ChoiceListType(values = { @ChoiceListValue(value = "Yes"),
			@ChoiceListValue(value = "No") })
	@FindByLabel(label = "iMR Opt-In", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement IMROptIn;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Not Applicable"),
			@ChoiceListValue(value = "Opt Out of Automated Co-op Submission"),
			@ChoiceListValue(value = "Opt Out of OEM Graphics & Automated Co-op Submission") })
	@FindByLabel(label = "Opt-Out Co-op Submission", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement OptOutCoOpSubmission;
	@ChoiceListType(values = { @ChoiceListValue(value = "Alpha Restrict CPO"), @ChoiceListValue(value = "Alpha Restrict New"), @ChoiceListValue(value = "Alpha Restrict CPO & New") })
	@FindByLabel(label = "Car Type Restrictions", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement CarTypeRestrictions;
	@ChoiceListType(values = { @ChoiceListValue(value = "Alpha Sent EQS"), @ChoiceListValue(value = "Alpha Use Alpha Template"), @ChoiceListValue(value = "Alpha Use Existing"), @ChoiceListValue(value = "Alpha Co-Op Pre-Approval Case") })
	@FindByLabel(label = "Artwork - Dropdown", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement ArtworkDropdown;
	@ChoiceListType(values = { @ChoiceListValue(value = "Sent EQS") })
	@FindByLabel(label = "Inline Display New Car Ad Artwork", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement InlineDisplayNewCarAdArtwork;
	@ChoiceListType(values = { @ChoiceListValue(value = "Sent EQS"), @ChoiceListValue(value = "Use GM New Car Templates") })
	@FindByLabel(label = "Inline Display New Car Ad Artwork (GM )", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement InlineDisplayNewCarAdArtworkGM;
	@ChoiceListType(values = { @ChoiceListValue(value = "Sent EQS") })
	@FindByLabel(label = "Inline Display Used Car Ad Artwork", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement InlineDisplayUsedCarAdArtwork;
	@ChoiceListType(values = { @ChoiceListValue(value = "Use GM CPO Templates") })
	@FindByLabel(label = "Inline Display Used Car Ad Artwork (GM)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement InlineDisplayUsedCarAdArtworkGM;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Co-Op Pre-Approval Case"), @ChoiceListValue(value = "Enclosed"), @ChoiceListValue(value = "Make simple logo"), @ChoiceListValue(value = "Sent EQS"), @ChoiceListValue(value = "Use Co-op Template"), @ChoiceListValue(value = "Use Dealer Site"), @ChoiceListValue(value = "Use Existing"), @ChoiceListValue(value = "Use GM New Car Templates"), @ChoiceListValue(value = "Use GM Used Car Templates") })
	@FindByLabel(label = "Leaderboard New Artwork", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement LeaderboardNewArtwork;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Use GM New Car Templates"), @ChoiceListValue(value = "Use GM Used Car Templates") })
	@FindByLabel(label = "Leaderboard New Artwork (Gm packages)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement LeaderboardNewArtworkGmpackages;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Co-Op Pre-Approval Case"), @ChoiceListValue(value = "Enclosed"), @ChoiceListValue(value = "Make simple logo"), @ChoiceListValue(value = "Sent EQS"), @ChoiceListValue(value = "Use Co-op Template"), @ChoiceListValue(value = "Use Dealer Site"), @ChoiceListValue(value = "Use Existing"), @ChoiceListValue(value = "Use GM New Car Templates"), @ChoiceListValue(value = "Use GM Used Car Templates") })
	@FindByLabel(label = "Leaderboard Used Artwork", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement LeaderboardUsedArtwork;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Use GM New Car Templates"), @ChoiceListValue(value = "Use GM Used Car Templates") })
	@FindByLabel(label = "Leaderboard Used Artwork (GM Packages)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement LeaderboardUsedArtworkGMPackages;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Co-Op Pre-Approval Case"), @ChoiceListValue(value = "Enclosed"), @ChoiceListValue(value = "Sent EQS"), @ChoiceListValue(value = "Use Co-op Template"), @ChoiceListValue(value = "Use Existing"), @ChoiceListValue(value = "Use GM New Car Templates"), @ChoiceListValue(value = "Use GM Used Car Templates") })
	@FindByLabel(label = "Skyscrapers Co-Op Artwork", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement SkyscrapersCoOpArtwork;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Use GM New Car Templates"), @ChoiceListValue(value = "Use GM Used Car Templates") })
	@FindByLabel(label = "Skyscrapers Co-Op Artwork (GM Packages)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement SkyscrapersCoOpArtworkGMPackages;
	@ChoiceListType(values = { @ChoiceListValue(value = "All Car") })
	@FindByLabel(label = "Featured Type", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement FeaturedType;
	@ChoiceListType(values = { @ChoiceListValue(value = "Not Applicable") })
	@FindByLabel(label = "Featured Value", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement FeaturedValue;
	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "SRT") })
	@FindByLabel(label = "Featured Advertised Make", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement FeaturedAdvertisedMake;
	@ChoiceListType(values = { @ChoiceListValue(value = "Dealer Managed"), @ChoiceListValue(value = "Autotrader Managed"), @ChoiceListValue(value = "OEM Managed"), @ChoiceListValue(value = "Not Applicable") })
	@FindByLabel(label = "Featured Co-op Level of Service", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement FeaturedCoOpLevelOfService;
	@ChoiceListType(values = { @ChoiceListValue(value = "12") })
	@FindByLabel(label = "Term Duration (12 Months)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TermDuration12m;
	@ChoiceListType(values = { @ChoiceListValue(value = "1 month"),
			@ChoiceListValue(value = "2 months"),
			@ChoiceListValue(value = "3 months"),
			@ChoiceListValue(value = "6 months (Skyscraper Open only)") })
	@FindByLabel(label = "Term Duration (1, 2, 3, 6 months)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TermDuration1m2m3m6m;
	@ChoiceListType(values = { @ChoiceListValue(value = "3 Months"),
			@ChoiceListValue(value = "6 Months"),
			@ChoiceListValue(value = "9 Months"),
			@ChoiceListValue(value = "12 Months") })
	@FindByLabel(label = "Term Duration (3, 6, 9, 12 months)", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement TermDuration3m6m9m12m;
	@TextType()
	@FindByLabel(label = "Production Cost", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement ProductionCost;
	@TextType()
	@FindByLabel(label = "Featured Vehicle Quantity", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FeatuedVehicleQuantity;
	@TextType()
	@FindByLabel(label = "Featured Vehicle Monthly Rate", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement FeaturedVehicleMonthlyRate;
	@TextType()
	@FindByLabel(label = "Call Tracking New Re-Direct", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingNewRedirect;
	@TextType()
	@FindByLabel(label = "Call Tracking Used Re-Direct", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingUsedRedirect;
	@ChoiceListType()
	@FindByLabel(label = "Dealer Ratings Link", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DealerRatingsLink;
	@TextType()
	@FindByLabel(label = "KBB Dealer Ratings Link", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBDealerRatingsLink;
	@ChoiceListType(values = { @ChoiceListValue(value = "DealerRater.com") })
	@FindByLabel(label = "KBB Dealer Ratings Provider", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement KBBDealerRatingsProvider;
	@ChoiceListType(values = { @ChoiceListValue(value = "Sent EQS"),
			@ChoiceListValue(value = "Use Default") })
	@FindByLabel(label = "Vehicle Sequence", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement VehicleSequence;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Tier Governor Sorting Sent EQS"),
			@ChoiceListValue(value = "Tier Governor Use Default Sorting Order") })
	@FindByLabel(label = "Vehicle Sorting", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement VehicleSorting;
	@BooleanType()
	@FindByLabel(label = "Call Tracking New Call Record", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingNewCallRecord;
	@BooleanType()
	@FindByLabel(label = "Call Tracking New Enhanced", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingNewEnhanced;
	@BooleanType()
	@FindByLabel(label = "Call Tracking New Whisper", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingNewWhisper;
	@BooleanType()
	@FindByLabel(label = "Call Tracking Used Call Record", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingUsedCallRecord;
	@BooleanType()
	@FindByLabel(label = "Call Tracking Used Enhanced", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingUsedEnhanced;
	@BooleanType()
	@FindByLabel(label = "Call Tracking Used Whisper", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CallTrackingUsedWhisper;
	@BooleanType()
	@FindByLabel(label = "KBB Call Tracking New Call Record", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBCallTrackingNewCallRecord;
	@BooleanType()
	@FindByLabel(label = "KBB Call Tracking New Whisper", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBCallTrackingNewWhisper;
	@TextType()
	@FindByLabel(label = "KBB Call Tracking New Re-Direct", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBCallTrackingNewRedirect;
	@BooleanType()
	@FindByLabel(label = "KBB Call Tracking Used Call Record", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBCallTrackingUsedCallRecord;
	@BooleanType()
	@FindByLabel(label = "KBB Call Tracking Used Whisper", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBCallTrackingUsedWhisper;
	@TextType()
	@FindByLabel(label = "KBB Call Tracking Used Re-Direct", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBCallTrackingUsedRedirect;
	@BooleanType()
	@FindByLabel(label = "KBB Showcase Call Tracking Call Record", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBShowcaseCallTrackingCallRecord;
	@BooleanType()
	@FindByLabel(label = "KBB Showcase Call Tracking Whisper", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBShowcaseCallTrackingWhisper;
	@TextType()
	@FindByLabel(label = "KBB Showcase Call Tracking Re-Direct", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBShowcaseCallTrackingRedirect;
	@TextType()
	@FindByLabel(label = "KBB Showcase XML Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBShowcaseXMLEmailAddress;
	@TextType()
	@FindByLabel(label = "KBB Showcase Text Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement KBBShowcaseTextEmailAddress;
	@TextType()
	@FindByLabel(label = "Leaderboard New Click-thru URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement LeaderboardNewClickThruURL;
	@TextType()
	@FindByLabel(label = "Leaderboard New Co-Op Pre-Approval Case", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement LeaderboardNewCoOpPreApprovalCase;
	@TextType()
	@FindByLabel(label = "Leaderboard Used Click-thru URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement LeaderboardUsedClickThruURL;
	@TextType()
	@FindByLabel(label = "Leaderboard Used Co-Op Pre-Approval Case", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement LeaderboardUsedCoOpPreApprovalCase;
	@TextType()
	@FindByLabel(label = "Skyscrapers Click-thru URL", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SkyscrapersClickthruURL;
	@TextType()
	@FindByLabel(label = "Skyscrapers Co-Op Pre-Approval Case #", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement SkyscrapersCoOpPreApprovalCaseNo;
	@TextType()
	@FindByLabel(label = "LeadDriver Text Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement LeadDriverTextEmailAddress;
	@TextType()
	@FindByLabel(label = "LeadDriver XML Email Address", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement LeadDriverXMLEmailAddress;
	@ChoiceListType(values = { @ChoiceListValue(value = "Make"),
			@ChoiceListValue(value = "Early Model"),
			@ChoiceListValue(value = "All Car") })
	@FindByLabel(label = "Premium Type 1", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement PremiumType1;
	@ChoiceListType()
	@FindByLabel(label = "Premium Value 1", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement PremiumValue1;
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
	@FindByLabel(label = "Premium Advertised Make 1", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement PremiumAdvertisedMake1;
	@TextType()
	@FindByLabel(label = "Premium Vehicle Quantity 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement PremiumVehicleQuantity1;
	@TextType()
	@FindByLabel(label = "Premium Vehicle Monthly Rate 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement PremiumVehicleMonthlyRate1;
	@ChoiceListType(values = { @ChoiceListValue(value = "Dealer Managed"),
			@ChoiceListValue(value = "Autotrader Managed"),
			@ChoiceListValue(value = "OEM Managed"),
			@ChoiceListValue(value = "Not Applicable") })
	@FindByLabel(label = "Premium Co-op Level of Service 1", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement PremiumCoOpLevelOfService1;
	@LinkType()
	@FindBy(linkText = "Add Car Make Fields")
	public WebElement AddCarMakeFields;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement Save;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"pgId:frmId:mainPgBlkId:j_id111\"]/div[2]/table/tbody/tr[1]/td[2]/span/span/a")
	public WebElement APFDToday;
	@LinkType()
	@FindBy(xpath = "//label[normalize-space(text())=\"Bill to Account\"]/../following-sibling::td[1]//input")
	public WebElement BillAccountLookup;
	@ChoiceListType(values = { @ChoiceListValue(value = "Buick"),
			@ChoiceListValue(value = "Cadillac"),
			@ChoiceListValue(value = "Chevrolet"),
			@ChoiceListValue(value = "GMC") })
	@FindByLabel(label = "Advertised Make GM", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement AdvertisedMakeGM;
	@TextType()
	@FindByLabel(label = "APFD Date", labelType = LabelType.PrecedingCell, qualifierXpath = "span/input")
	public WebElement APFDDate;
	@TextType()
	@FindByLabel(label = "Third Party Bill to Account", labelType = LabelType.PrecedingCell, qualifierXpath = "span/input")
	public WebElement BillToAccount;
	@ChoiceListType(values = { @ChoiceListValue(value = "CitySearch.com"),
			@ChoiceListValue(value = "DealerRater.com"),
			@ChoiceListValue(value = "Kudzu.com"),
			@ChoiceListValue(value = "Yelp.com"),
			@ChoiceListValue(value = "Other") })
	@FindByLabel(label = "Dealer Ratings Provider", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement DealerRatingsProvider;
	@TextType()
	@FindByLabel(label = "DBA Name 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DBAName1;
	@TextType()
	@FindByLabel(label = "OEM Id 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement OEMId1;
	@TextType()
	@FindByLabel(label = "DBA Name", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DBAName;
	@TextType()
	@FindByLabel(label = "OEM Id", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement OEMId;
	@ChoiceListType(values = { @ChoiceListValue(value = "Full Rate"), @ChoiceListValue(value = "Below Rate") })
	@FindByLabel(label = "Full Rate / Below Rate", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement FullRateBelowRate;
	@TextType()
	@FindByLabel(label = "Co-op Contact Email", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CoOpContactEmail;
	@TextType()
	@FindByLabel(label = "Co-op Contact Email 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement CoOpContactEmail1;
	@TextType()
	@FindByLabel(label = "New Co-op Contact Email 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement NewCoOpContactEmail1;
	@TextType()
	@FindByLabel(label = "Used Co-op Contact Email 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement UsedCoOpContactEmail1;
	@TextType()
	@FindByLabel(label = "Dealer Website URL 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement DealerWebsiteURL1;
	@TextType()
	@FindByLabel(label = "Text Email Address 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TextEmailAddress1;
	@TextType()
	@FindByLabel(label = "XML Email Address 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement XMLEmailAddress1;
	@ChoiceListType(values = { @ChoiceListValue(value = "Acura"), @ChoiceListValue(value = "Alfa Romeo"), @ChoiceListValue(value = "AMC"), @ChoiceListValue(value = "Aston Martin"), @ChoiceListValue(value = "Audi"), @ChoiceListValue(value = "Bentley"), @ChoiceListValue(value = "BMW"), @ChoiceListValue(value = "Buick"), @ChoiceListValue(value = "Cadillac"), @ChoiceListValue(value = "Chevrolet"), @ChoiceListValue(value = "Chrysler"), @ChoiceListValue(value = "Daewoo"), @ChoiceListValue(value = "Datsun"), @ChoiceListValue(value = "DeLorean"), @ChoiceListValue(value = "Dodge"), @ChoiceListValue(value = "Eagle"), @ChoiceListValue(value = "Ferrari"), @ChoiceListValue(value = "FIAT"), @ChoiceListValue(value = "Fisker"), @ChoiceListValue(value = "Ford"), @ChoiceListValue(value = "Freightliner"), @ChoiceListValue(value = "Geo"), @ChoiceListValue(value = "GMC"), @ChoiceListValue(value = "Honda"), @ChoiceListValue(value = "HUMMER"), @ChoiceListValue(value = "Hyundai"), @ChoiceListValue(value = "Infiniti"), @ChoiceListValue(value = "Isuzu"), @ChoiceListValue(value = "Jaguar"), @ChoiceListValue(value = "Jeep"), @ChoiceListValue(value = "Kia"), @ChoiceListValue(value = "Lamborghini"), @ChoiceListValue(value = "Land Rover"), @ChoiceListValue(value = "Lexus"), @ChoiceListValue(value = "Lincoln"), @ChoiceListValue(value = "Lotus"), @ChoiceListValue(value = "Maserati"), @ChoiceListValue(value = "Maybach"), @ChoiceListValue(value = "Mazda"), @ChoiceListValue(value = "McLaren"), @ChoiceListValue(value = "Mercedes-Benz"), @ChoiceListValue(value = "Mercury"), @ChoiceListValue(value = "MINI"), @ChoiceListValue(value = "Mitsubishi"), @ChoiceListValue(value = "Nissan"), @ChoiceListValue(value = "Oldsmobile"), @ChoiceListValue(value = "Plymouth"), @ChoiceListValue(value = "Pontiac"), @ChoiceListValue(value = "Porsche"), @ChoiceListValue(value = "RAM"), @ChoiceListValue(value = "Rolls-Royce"), @ChoiceListValue(value = "Saab"), @ChoiceListValue(value = "Saturn"), @ChoiceListValue(value = "Scion"), @ChoiceListValue(value = "smart"), @ChoiceListValue(value = "SRT"), @ChoiceListValue(value = "Subaru"), @ChoiceListValue(value = "Suzuki"), @ChoiceListValue(value = "Tesla"), @ChoiceListValue(value = "Toyota"), @ChoiceListValue(value = "Volkswagen"), @ChoiceListValue(value = "Volvo"), @ChoiceListValue(value = "Yugo") })
	@FindByLabel(label = "KBB Lead Driver Make 1", labelType = LabelType.PrecedingCell, qualifierXpath = "select")
	public WebElement KBBLeadDriverMake1;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"801c00000002WCT_RelatedOrderItemList_body\"]/div/a[1]")
	public WebElement ShowMore;
	@LinkType()
	@FindBy(xpath = "//div[@class=\"pShowMore\"]/a[1]")
	public WebElement ShowMoreProducts;
	@TextType()
	@FindByLabel(label = "TIM Dealership Contact title", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement TIMDealershipContactTitle;
	@TextType()
	@FindBy(name = "pgId:frmId:mainPgBlkId:j_id48:j_id49:4:j_id50:j_id52")
	public WebElement New1GMFrontLinePro;
	@BooleanType()
	@FindByLabel(label = "Additional Contract", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement AdditionalContract;
	@TextType()
	@FindByLabel(label = "Porsche Inventory Quantity", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
	public WebElement PorscheInventoryQuantity;
//	@TextType()
//	@FindByLabel(label = "New Spotlight Quantity 1", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
//	public WebElement NewSpotlightQuantity1;
//	@TextType()
//	@FindByLabel(label = "New Spotlight Quantity 2", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
//	public WebElement NewSpotlightQuantity2;
//	@TextType()
//	@FindByLabel(label = "New Spotlight Quantity 3", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
//	public WebElement NewSpotlightQuantity3;
//	@TextType()
//	@FindByLabel(label = "New Spotlight Quantity 4", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
//	public WebElement NewSpotlightQuantity4;
//	@TextType()
//	@FindByLabel(label = "New Spotlight Quantity 5", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
//	public WebElement NewSpotlightQuantity5;
//	@TextType()
//	@FindByLabel(label = "New Spotlight Quantity 6", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
//	public WebElement NewSpotlightQuantity6;
//	@TextType()
//	@FindByLabel(label = "New Spotlight Quantity 7", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
//	public WebElement NewSpotlightQuantity7;
//	@TextType()
//	@FindByLabel(label = "New Spotlight Quantity 8", labelType = LabelType.PrecedingCell, qualifierXpath = "input")
//	public WebElement NewSpotlightQuantity8;
}
