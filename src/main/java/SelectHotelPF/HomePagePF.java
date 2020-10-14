package SelectHotelPF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;

import com.aventstack.extentreports.Status;

import CommonFunctions.DriverFunction;
import SelectHotelOR.HomePageOR;

public class HomePagePF extends HomePageOR{

	WebDriver driver = null;
	DriverFunction driverfunc;
	public HomePagePF(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		driverfunc = BaseTestCase.getDriverFunc();
		if(!driver.getTitle().equalsIgnoreCase("Select Hotel")) {
			
			throw new SkipException("this is not Shaadi page");
		}	
	}
	
	public boolean isTitleMatched()
	{
		BaseTestCase.test.log(Status.INFO, "inside isTitleMatched method");
		if(title.getAttribute("innerHTML").equalsIgnoreCase("Select Hotel"))
		{
			BaseTestCase.test.log(Status.PASS, "title of the page matched as Select Hotel");
			return true;
		
		}
		else
		{
			System.out.println(title.getAttribute("innerHTML"));
			return false;
		}
	}
	
	public void methodFieldsVerification() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "This Method Verifies if all Fields are present or not");
		
		Boolean isPresent = driver.findElements(By.xpath(mainHeadingxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Treenama Hotel Groups Title is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Treenama Hotel Groups Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(sectionHeadingxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Accomodation Title is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Accomodation Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(selectHotelHeadingxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Select Hotel Title  is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Select Hotel Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(roomCategoryHeadingxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Room category Title is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Room Category Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(selectHotelDropDownxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Select Hotel Drop Down is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Select Hotel Drop Down is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(roomTypeDropDownxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Room Type Drop Down is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Room Type Drop Down is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(additonalPriceHeadingxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Additional Price title is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Additional Price Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(additionalPriceCheckBoxxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Additional Price checkBox is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Additional Price checkBox is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(totalHeadingxpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Total Title Is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Total Title is missing");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(totalAmountValuexpath)).size() > 0;
		if(isPresent)
			BaseTestCase.test.log(Status.PASS, "Total Amount Value is there");
		else
			BaseTestCase.test.log(Status.FAIL, "Total Amount value is not there");
		
			driver.navigate().refresh();
	}
	
	public void methodDefaultSelection() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "This Method Verifies the Default Selection of Drop Downs");

		
		if(SelectHotelOption.getText().equalsIgnoreCase("Select Hotel"))
			BaseTestCase.test.log(Status.PASS, "Default Select Hotel Dropdown is Select Hotel");
		else
		{
			System.out.println(selectHotelDropDown.getText());
			BaseTestCase.test.log(Status.FAIL, "Default Select Hotel Dropdown is not Select Hotel");
		}
		
		if(roomTypeDropDown.getText().trim().equalsIgnoreCase("Room Type"))
			BaseTestCase.test.log(Status.PASS, "Default Select Room Dropdown is Select Room Type");

		else
		{
			System.out.println(roomTypeDropDown.getText());
			BaseTestCase.test.log(Status.FAIL, "Default Select Room Dropdown is not Select Room Type");
		}
		
		if(totalAmountValue.getText().equalsIgnoreCase(""))
			BaseTestCase.test.log(Status.PASS, "Default Total Amount is 0");
		
		else
		{
			System.out.println(totalAmountValue.getText());
			BaseTestCase.test.log(Status.FAIL, "Default Total Amount is not 0");
		}
		driver.navigate().refresh();

	}
	
	public void methodRoomTypeOptions() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "This Method Verifies the Options of Room Categories along with the Text");

		driverfunc.click(selectHotelDropDown);
		driverfunc.click(LuxeTreoVilla);
		driverfunc.click(roomTypeDropDown);
		Boolean isPresent = driver.findElements(By.xpath(roomTypeDropDownxpath)).size() > 0;
		if(isPresent) {
			Boolean isThere = driver.findElements(By.xpath(economistxpath)).size() > 0;
			if(isThere) {
				driverfunc.click(economist);
				driverfunc.checkText(economist, "Economy");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Economy Option is not there");
			
			isThere = driver.findElements(By.xpath(executivexpath)).size() > 0;
			if(isThere) {
				driverfunc.click(executive);
				driverfunc.checkText(executive, "Executive");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Executive Option is not there");
			
			isThere = driver.findElements(By.xpath(businessexpath)).size() > 0;
			if(isThere) {
				driverfunc.click(businesse);
				driverfunc.checkText(businesse, "Business");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Business Option is not there");
		
		
			isThere = driver.findElements(By.xpath(luxuryxpath)).size() > 0;
			if(isThere) {
				driverfunc.click(luxury);
				driverfunc.checkText(luxury, "Luxury");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Luxury Option is not there");
		
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Room Type DropDown value is not there");
		
		driver.navigate().refresh();

	}
	
	public void methodSelectHotelOptions() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "This Method Verifies the Options of Select Hotel along with the Text");

		driverfunc.click(selectHotelDropDown);
		
		Boolean isPresent = driver.findElements(By.xpath(selectHotelDropDownxpath)).size() > 0;
		if(isPresent) {
			Boolean isThere = driver.findElements(By.xpath(SelectHotelOptionxpath)).size() > 0;
			if(isThere) {
				driverfunc.click(SelectHotelOption);
				driverfunc.checkText(SelectHotelOption, "Select Hotel");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Select Hotel Option is not there");
			
			isThere = driver.findElements(By.xpath(Nirvanaxpath)).size() > 0;
			if(isThere) {
				driverfunc.click(Nirvana);
				driverfunc.checkText(Nirvana, "Nirvana");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Nirvana Hotel Option is not there");
			
			isThere = driver.findElements(By.xpath(Lagunaxpath)).size() > 0;
			if(isThere) {
				driverfunc.click(Laguna);
				driverfunc.checkText(Laguna, "Laguna");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Laguna Hotel Option is not there");
		
		
			isThere = driver.findElements(By.xpath(palmBeachxpath)).size() > 0;
			if(isThere) {
				driverfunc.click(palmBeach);
				driverfunc.checkText(palmBeach, "Palm Beach");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Palm Beach Hotel Option is not there");
		
			isThere = driver.findElements(By.xpath(LuxeTreoVillaxpath)).size() > 0;
			if(isThere) {
				driverfunc.click(LuxeTreoVilla);
				driverfunc.checkText(LuxeTreoVilla, "Luxe Treo Villa");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Luxe Treo Villa Hotel Option is not there");
		
		
		
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Select Hotel DropDown is not there");
		driver.navigate().refresh();

		
	}
	
	public void methodTextVerification() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "This Method Verifies the Text of each Field");


		Boolean isPresent = driver.findElements(By.xpath(mainHeadingxpath)).size() > 0;
		if(isPresent)
			driverfunc.checkText(mainHeading, "Treenama Hotel Groups");
		else
			BaseTestCase.test.log(Status.FAIL, "Treenama Hotel Groups Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(sectionHeadingxpath)).size() > 0;
		if(isPresent)
			driverfunc.checkText(sectionHeading, "Accomodation");
		else
			BaseTestCase.test.log(Status.FAIL, "Accomodation Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(selectHotelHeadingxpath)).size() > 0;
		if(isPresent)
			driverfunc.checkText(selectHotelHeading, "Select Hotel");
		else
			BaseTestCase.test.log(Status.FAIL, "Select Hotel Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		isPresent = driver.findElements(By.xpath(roomCategoryHeadingxpath)).size() > 0;
		if(isPresent)
			driverfunc.checkText(roomCategoryHeading, "Room Category");
		else
			BaseTestCase.test.log(Status.FAIL, "Room Category Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		isPresent = driver.findElements(By.xpath(additonalPriceHeadingxpath)).size() > 0;
		if(isPresent)
			driverfunc.checkText(additonalPriceHeading, "Additional Price");
		else
			BaseTestCase.test.log(Status.FAIL, "Additional Price Title is not there");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		isPresent = driver.findElements(By.xpath(totalHeadingxpath)).size() > 0;
		if(isPresent)
			driverfunc.checkText(additonalPriceHeading, "Total:");
		else
			BaseTestCase.test.log(Status.FAIL, "Total Title is missing");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().refresh();

	}
	
	public void methodRoomCategoryOperations1() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "Verifing The Room Categories with out selecting any Hotel");
		int i = 0;
		driverfunc.click(roomTypeDropDown);
		
			if(driver.findElements(By.xpath(economistxpath)).size() > 0)
			{
				i++;
				BaseTestCase.test.log(Status.FAIL, "Economy cateogry is there");
			}
			
				
			if(driver.findElements(By.xpath(executivexpath)).size() > 0)
			{
				i++;
				BaseTestCase.test.log(Status.FAIL, "Executive cateogry is there");
			}
			
				
			if(driver.findElements(By.xpath(businessexpath)).size() > 0)
			{
				i++;
				BaseTestCase.test.log(Status.FAIL, "Business cateogry is there");
			}
			
				
			if(driver.findElements(By.xpath(luxuryxpath)).size() > 0)
			{
				i++;
				BaseTestCase.test.log(Status.FAIL, "luxury cateogry is there");
			}
				
			if(driver.findElements(By.xpath(RoomTypexpath)).size() > 0  &&  i==0) {
				BaseTestCase.test.log(Status.PASS, "Room Categories verification successful");
			}
			else
				BaseTestCase.test.log(Status.FAIL, "Room Categories Verification unsuccessful");
			driver.navigate().refresh();


	}
	
	public void methodRoomCategoryOperations2() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "Verifing The Room Categories with selecting SelectHotelOption");
		
		int i = 0;
		driverfunc.click(selectHotelDropDown);
		driverfunc.click(SelectHotelOption);
		driverfunc.click(roomTypeDropDown);
		
		if(driver.findElements(By.xpath(economistxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.FAIL, "Economy cateogry is there");
		}
		
			
		if(driver.findElements(By.xpath(executivexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.FAIL, "Executive cateogry is there");
		}
		
			
		if(driver.findElements(By.xpath(businessexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.FAIL, "Business cateogry is there");
		}
		
			
		if(driver.findElements(By.xpath(luxuryxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.FAIL, "luxury cateogry is there");
		}
			
		if(driver.findElements(By.xpath(SelectRoomtypexpath)).size() > 0  &&  i==0) {
			BaseTestCase.test.log(Status.PASS, "Room Categories Verification successful");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Room Categories Verification unsuccessful");
		driver.navigate().refresh();

		
	}
	
	public void methodRoomCategoryOperations3() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "Verifing The Room Categories with selecting Nirvana Hotel");
		
		int i = 0;
		driverfunc.click(selectHotelDropDown);
		driverfunc.click(Nirvana);
		driverfunc.click(roomTypeDropDown);
		
		if(driver.findElements(By.xpath(economistxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Economy cateogry is there");

		}
		else
			BaseTestCase.test.log(Status.FAIL, "Economy cateogry is not there");
			
		if(driver.findElements(By.xpath(executivexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Executive cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Executive cateogry is not there");			
		if(driver.findElements(By.xpath(businessexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Business cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Business cateogry is not there");		
			
		if(driver.findElements(By.xpath(luxuryxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "luxury cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "luxury cateogry is not there");	
		if(driver.findElements(By.xpath(SelectRoomtypexpath)).size() > 0  &&  i==4) {
			BaseTestCase.test.log(Status.PASS, "Room Categories Verification successful");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Room Categories Verification unsuccessful");
		driver.navigate().refresh();

		
	}
	
	public void methodRoomCategoryOperations4() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "Verifing The Room Categories with selecting Laguna Hotel");
		
		int i = 0;
		driverfunc.click(selectHotelDropDown);
		driverfunc.click(Laguna);
		driverfunc.click(roomTypeDropDown);
		
		if(driver.findElements(By.xpath(economistxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Economy cateogry is there");

		}
		else
			BaseTestCase.test.log(Status.FAIL, "Economy cateogry is not there");
			
		if(driver.findElements(By.xpath(executivexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Executive cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Executive cateogry is not there");			
		if(driver.findElements(By.xpath(businessexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Business cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Business cateogry is not there");		
			
		if(driver.findElements(By.xpath(luxuryxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "luxury cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "luxury cateogry is not there");	
		if(driver.findElements(By.xpath(SelectRoomtypexpath)).size() > 0  &&  i==4) {
			BaseTestCase.test.log(Status.PASS, "Room Categories Verification successful");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Room Categories Verification unsuccessful");
		driver.navigate().refresh();

		
	}
	
	public void methodAmountVerification() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "This Method is to verify the Amount Based on Category");
		driverfunc.click(selectHotelDropDown);
		driverfunc.click(LuxeTreoVilla);
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(economist);
		String sc1 = totalAmountValue.getText().trim();
		int n1 = Integer.parseInt(sc1);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(executive);
		String sc2 = totalAmountValue.getText().trim();
		int n2 = Integer.parseInt(sc2);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(businesse);
		String sc3 = totalAmountValue.getText().trim();
		int n3 = Integer.parseInt(sc3);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(luxury);
		String sc4 = totalAmountValue.getText().trim();
		int n4 = Integer.parseInt(sc4);
		
		if(n1 < n2  && n1<n3  && n1<n4)
		{
			BaseTestCase.test.log(Status.PASS, "Economy cateogry is Cheaper than others");
		}
		else
		{
			if(n1>n2)
				BaseTestCase.test.log(Status.FAIL, "Economy cateogry is greater than Executive");
			if(n1>n3)
				BaseTestCase.test.log(Status.FAIL, "Economy cateogry is greater than Business");
			if(n1>n4)
				BaseTestCase.test.log(Status.FAIL, "Economy cateogry is greater than Luxury");
		}
		
		if(n2 > n1 && n2<n3 && n2<n4)
			BaseTestCase.test.log(Status.PASS, "Executive is little expensive than Economy and Cheaper than Business and Luxury");
		else
		{
			if(n1>n2)
				BaseTestCase.test.log(Status.FAIL, "Economy cateogry is greater than Executive");
			if(n2>n3)
				BaseTestCase.test.log(Status.FAIL, "Executive cateogry is greater than Business");
			if(n2>n4)
				BaseTestCase.test.log(Status.FAIL, "Executive cateogry is greater than Luxury");
		}

		if(n3 > n1 && n2<n3 && n3<n4)
			BaseTestCase.test.log(Status.PASS, "Business is expensive than Economy and Executive and Cheaper than Luxury");
		else
		{
			if(n1>n3)
				BaseTestCase.test.log(Status.FAIL, "Economy cateogry is greater than Business");
			if(n2>n3)
				BaseTestCase.test.log(Status.FAIL, "Executive cateogry is greater than Business");
			if(n3>n4)
				BaseTestCase.test.log(Status.FAIL, "Business cateogry is greater than Luxury");
		}
		
		if(n4 > n1 && n2<n4 && n3<n4)
			BaseTestCase.test.log(Status.PASS, "Luxury is the Greater than remaining Categories");
		else
		{
			if(n1>n4)
				BaseTestCase.test.log(Status.FAIL, "Economy cateogry is greater than Luxury");
			if(n2>n4)
				BaseTestCase.test.log(Status.FAIL, "Executive cateogry is greater than Luxury");
			if(n3>n4)
				BaseTestCase.test.log(Status.FAIL, "Business cateogry is greater than Luxury");
		}
			
		driver.navigate().refresh();

	}
	
	public void methodAdditonalPrice() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "Verifing The Additonal Price Functioning");
		driverfunc.click(selectHotelDropDown);
		driverfunc.click(LuxeTreoVilla);
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(economist);
		String sc1 = totalAmountValue.getText().trim();
		int n1 = Integer.parseInt(sc1);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(executive);
		String sc2 = totalAmountValue.getText().trim();
		int n2 = Integer.parseInt(sc2);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(businesse);
		String sc3 = totalAmountValue.getText().trim();
		int n3 = Integer.parseInt(sc3);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(luxury);
		String sc4 = totalAmountValue.getText().trim();
		int n4 = Integer.parseInt(sc4);
		
		additionalPriceCheckBox.click();
		if(additionalPriceCheckBox.isSelected())
			BaseTestCase.test.log(Status.PASS, "Checkbox of the Additional Price is Clickable");
		else
			BaseTestCase.test.log(Status.FAIL, "Checkbox of the Additional Price is not Clickable");
		
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(economist);
		String sca1 = totalAmountValue.getText().trim();
		int a1 = Integer.parseInt(sca1);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(executive);
		String sca2 = totalAmountValue.getText().trim();
		int a2 = Integer.parseInt(sca2);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(businesse);
		String sca3 = totalAmountValue.getText().trim();
		int a3 = Integer.parseInt(sca3);
		
		driverfunc.click(roomTypeDropDown);
		driverfunc.click(luxury);
		String sca4 = totalAmountValue.getText().trim();
		int a4 = Integer.parseInt(sca4);

		if(a1-n1 == 50)
			BaseTestCase.test.log(Status.PASS, "Additional Price is succesfull for Economy");
		else
			BaseTestCase.test.log(Status.FAIL, "Additional Price is unsuccesfull for Economy");

		if(a2-n2 == 50)
			BaseTestCase.test.log(Status.PASS, "Additional Price is succesfull for Executive");
		else
			BaseTestCase.test.log(Status.FAIL, "Additional Price is unsuccesfull for Executive");

		if(a3-n3 == 50)
			BaseTestCase.test.log(Status.PASS, "Additional Price is succesfull for Business");
		else
			BaseTestCase.test.log(Status.FAIL, "Additional Price is unsuccesfull for Business");

		if(a4-n4 == 50)
			BaseTestCase.test.log(Status.PASS, "Additional Price is succesfull for Luxury");
		else
			BaseTestCase.test.log(Status.FAIL, "Additional Price is unsuccesfull for Luxury");
		driver.navigate().refresh();


			
	}
	public void methodRoomCategoryOperations5() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "Verifing The Room Categories with selecting Palm Beach Hotel");
		
		int i = 0;
		driverfunc.click(selectHotelDropDown);
		driverfunc.click(palmBeach);
		driverfunc.click(roomTypeDropDown);
		
		if(driver.findElements(By.xpath(economistxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Economy cateogry is there");

		}
		else
			BaseTestCase.test.log(Status.FAIL, "Economy cateogry is not there");
			
		if(driver.findElements(By.xpath(executivexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Executive cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Executive cateogry is not there");			
		if(driver.findElements(By.xpath(businessexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Business cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Business cateogry is not there");		
			
		if(driver.findElements(By.xpath(luxuryxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "luxury cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "luxury cateogry is not there");	
		if(driver.findElements(By.xpath(SelectRoomtypexpath)).size() > 0  &&  i==4) {
			BaseTestCase.test.log(Status.PASS, "Room Categories Verification successful");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Room Categories Verification unsuccessful");
		driver.navigate().refresh();

		
	}
	public void methodRoomCategoryOperations6() throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "Verifing The Room Categories with selecting LuxeTreoVilla Hotel");
		
		int i = 0;
		driverfunc.click(selectHotelDropDown);
		driverfunc.click(LuxeTreoVilla);
		driverfunc.click(roomTypeDropDown);
		
		if(driver.findElements(By.xpath(economistxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Economy cateogry is there");

		}
		else
			BaseTestCase.test.log(Status.FAIL, "Economy cateogry is not there");
			
		if(driver.findElements(By.xpath(executivexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Executive cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Executive cateogry is not there");			
		if(driver.findElements(By.xpath(businessexpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "Business cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Business cateogry is not there");		
			
		if(driver.findElements(By.xpath(luxuryxpath)).size() > 0)
		{
			i++;
			BaseTestCase.test.log(Status.PASS, "luxury cateogry is there");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "luxury cateogry is not there");	
		if(driver.findElements(By.xpath(SelectRoomtypexpath)).size() > 0  &&  i==4) {
			BaseTestCase.test.log(Status.PASS, "Room Categories Verification successful");
		}
		else
			BaseTestCase.test.log(Status.FAIL, "Room Categories Verification unsuccessful");
		driver.navigate().refresh();

	}
	
	
}
