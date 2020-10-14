package SelectHotelTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.ConfigManager;
import SelectHotelPF.BaseTestCase;

public class HomePageTC1 extends BaseTestCase{
	
	@Test(priority=1)
	public void verifytitle()
	{
		BaseTestCase.test.log(Status.INFO, "verify title");
		Assert.assertTrue(Homepage1.isTitleMatched());
		
	}
	
	@Test(priority=2)
	public void verifyAllFields() throws InterruptedException
	{
		Homepage1.methodFieldsVerification();
	}

	@Test(priority=3)
	public void verifyTextOfAllFields() throws InterruptedException
	{
		Homepage1.methodTextVerification();
	}
	
	@Test(priority=4)
	public void verifyDefaultSelections() throws InterruptedException 
	{
	    Homepage1.methodDefaultSelection(); 
	}
	  
	@Test(priority=5)
    public void verifySelectHotelOptions() throws InterruptedException 
	{
	  Homepage1.methodSelectHotelOptions(); 
	}
	 
	
	
	
	@Test(priority=6)
	public void verifyRoomTypeOptions() throws InterruptedException
	{
		Homepage2.methodRoomTypeOptions();
	}
	
	@Test(priority=7)
	public void verifyRoomCategoryOperation1() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations1();
	}
	
	@Test(priority=8)
	public void verifyRoomCategoryOperation2() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations2();
	}
	@Test(priority=9)
	public void verifyRoomCategoryOperation3() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations3();
	}
	@Test(priority=10)
	public void verifyRoomCategoryOperation4() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations4();
	}
	@Test(priority=11)
	public void verifyRoomCategoryOperation5() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations5();
	}
	@Test(priority=12)
	public void verifyRoomCategoryOperation6() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations6();
	}
	@Test(priority=13)
	public void verifyAmountPerCategory() throws InterruptedException {
		Homepage2.methodAmountVerification();
	}
	@Test(priority=14)
	public void verifyAdditionalPrice() throws InterruptedException {
		Homepage2.methodAdditonalPrice();
	}
	
}


