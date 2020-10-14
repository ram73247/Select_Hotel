package SelectHotelOR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOR {
private WebDriver driver;
	
	public HomePageOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//title")
	protected WebElement title;
	
	@FindBy(xpath ="//*[contains(text(),'Treenama Hotel Groups')]")
	protected WebElement mainHeading;
	protected String mainHeadingxpath = "//*[contains(text(),'Treenama Hotel Groups')]";
	
	@FindBy(xpath ="//h2[contains(text(),'Accomodation')]")
	protected WebElement sectionHeading;
	protected String sectionHeadingxpath = "//h2[contains(text(),'Accomodation')]";
	
	
	@FindBy(xpath ="//h3[contains(text(),'Select Hotel')]")
	protected WebElement selectHotelHeading;
	protected String selectHotelHeadingxpath = "//h3[contains(text(),'Select Hotel')]";

	@FindBy(xpath ="//*[contains(text(),'Room Category')]")
	protected WebElement roomCategoryHeading;
	protected String roomCategoryHeadingxpath = "//*[contains(text(),'Room Category')]";
	
	@FindBy(name = "one")
	protected WebElement selectHotelDropDown;
	protected String selectHotelDropDownxpath = "//*[@id=\"one\"]";
	
	
	
	@FindBy(name = "two")
	protected WebElement roomTypeDropDown;
	protected String roomTypeDropDownxpath = "//*[@id=\"two\"]";
	
	
	
	@FindBy(xpath ="/html/body/div/p/label")
	protected WebElement additonalPriceHeading;
	protected String additonalPriceHeadingxpath = "/html/body/div/p/label";
	
	@FindBy(xpath ="//input[@type='checkbox']")
	protected WebElement additionalPriceCheckBox;
	protected String additionalPriceCheckBoxxpath = "//input[@type='checkbox']";
	
	@FindBy(xpath ="//*[contains(text(),'Total:')]")
	protected WebElement totalHeading;
	protected String totalHeadingxpath = "//*[contains(text(),'Total:')]";

	@FindBy(xpath ="//*[@id=\"total\"]")
	protected WebElement totalAmountValue;
	protected String totalAmountValuexpath = "//*[@id=\"total\"]";

	
	@FindBy(xpath = "//*[@id=\"one\"]/option[4]")
	protected WebElement palmBeach;
	protected String palmBeachxpath = "//*[@id=\"one\"]/option[4]";
	
	@FindBy(xpath = "//*[@id=\"one\"]/option[3]")
	protected WebElement Laguna;
	protected String Lagunaxpath = "//*[@id=\"one\"]/option[3]";

	
	@FindBy(xpath = "//*[@id=\"one\"]/option[5]")
	protected WebElement LuxeTreoVilla;
	protected String LuxeTreoVillaxpath = "//*[@id=\"one\"]/option[5]";

	
	@FindBy(xpath = "//*[@id=\"one\"]/option[2]")
	protected WebElement Nirvana;
	protected String Nirvanaxpath = "//*[@id=\"one\"]/option[2]";

	@FindBy(xpath = "//*[@id=\"one\"]/option[1]")
	protected WebElement SelectHotelOption;
	protected String SelectHotelOptionxpath = "//*[@id=\"one\"]/option[1]";

	@FindBy(xpath = "//*[@id=\"two\"]/option[1]")
	protected WebElement economist;
	protected String economistxpath = "//*[@id=\"two\"]/option[1]";  
	
	@FindBy(xpath = "//*[@id=\"two\"]/option[2]")
	protected WebElement executive;
	protected String executivexpath = "//*[@id=\"two\"]/option[2]";  
	
	@FindBy(xpath = "//*[@id=\"two\"]/option[3]")
	protected WebElement businesse;
	protected String businessexpath = "//*[@id=\"two\"]/option[3]";  
	
	@FindBy(xpath = "//*[@id=\"two\"]/option[4]")
	protected WebElement luxury;
	protected String luxuryxpath = "//*[@id=\"two\"]/option[4]";  
	
	@FindBy(xpath = "//*[@id=\"two\"]/option")
	protected WebElement RoomType;
	protected String RoomTypexpath = "//*[@id=\"two\"]/option";  
	
	@FindBy(xpath = "//*[@id=\"two\"]/option")
	protected WebElement SelectRoomtype;
	protected String SelectRoomtypexpath = "//*[@id=\"two\"]/option"; 
}
