package SelectHotelTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.ConfigManager;
import SelectHotelPF.BaseTestCase;

public class HomePageTC2 extends BaseTestCase{

	@Test
	public void verifyRoomTypeOptions() throws InterruptedException
	{
		Homepage2.methodRoomTypeOptions();
	}
	
	@Test
	public void verifyRoomCategoryOperation1() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations1();
	}
	
	@Test
	public void verifyRoomCategoryOperation2() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations2();
	}
	@Test
	public void verifyRoomCategoryOperation3() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations3();
	}
	@Test
	public void verifyRoomCategoryOperation4() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations4();
	}
	@Test
	public void verifyRoomCategoryOperation5() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations5();
	}
	@Test
	public void verifyRoomCategoryOperation6() throws InterruptedException
	{
		Homepage2.methodRoomCategoryOperations6();
	}
}
