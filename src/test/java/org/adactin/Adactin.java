package org.adactin;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;


public class Adactin extends LibGlobal{
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException, InterruptedException {
		Adactin global = new Adactin();
		WebDriver driver = global.getChromeDriver();
		global.loadUrl("http://adactinhotelapp.com/");
		global.maximizeBrowser();
		WebElement element=driver.findElement(By.id("username"));
		global.typeInput(element, global.getData(1, 0));
		WebElement txtPassword = driver.findElement(By.id("password"));
		global.typeInput(txtPassword, global.getData(1, 1));
		WebElement btnClick = driver.findElement(By.id("login"));
		btnClick.click();
		
		
		Thread.sleep(2000);
		WebElement dDnCountry = driver.findElement(By.id("location"));
		global.typeInput(dDnCountry, global.getData(1, 2));
		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		global.typeInput(dDnHotel, global.getData(1, 3));
		WebElement dDnRoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		global.typeInput(dDnRoomType, global.getData(1, 4));
		WebElement dDnRoomNos = driver.findElement(By.id("room_nos"));
		global.typeInput(dDnRoomNos, global.getData(1, 5));
		WebElement txtCheckIn = driver.findElement(By.id("datepick_in"));
		txtCheckIn.clear();
		global.typeInput(txtCheckIn, global.getData(1, 6));
		WebElement txtCheckOut = driver.findElement(By.id("datepick_out"));
		txtCheckOut.clear();
		global.typeInput(txtCheckOut, global.getData(1, 7));
		WebElement dDnAdultPerRoom = driver.findElement(By.id("adult_room"));
		global.typeInput(dDnAdultPerRoom, global.getData(1, 8));
		WebElement dDnChildPerRoom = driver.findElement(By.id("child_room"));
		global.typeInput(dDnChildPerRoom, global.getData(1, 9));
		WebElement btnSearch = driver.findElement(By.xpath("//input[@value='Search']"));
		btnSearch.click();
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		Thread.sleep(2000);
		WebElement txtFirstName = driver.findElement(By.name("first_name"));
		global.typeInput(txtFirstName, global.getData(1, 10));
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		global.typeInput(txtLastName, global.getData(1, 11));
		WebElement billAddress = driver.findElement(By.id("address"));
		global.typeInput(billAddress, global.getData(1, 12));
		WebElement txtCreditNo = driver.findElement(By.id("cc_num"));
		global.typeInput(txtCreditNo, global.getData(1, 13));
		WebElement txtCreditCardType = driver.findElement(By.id("cc_type"));
		global.typeInput(txtCreditCardType, global.getData(1, 14));
		WebElement creditCardExpiryMonth = driver.findElement(By.id("cc_exp_month"));
		global.typeInput(creditCardExpiryMonth, global.getData(1, 15));
		WebElement creditCardExpiryear = driver.findElement(By.id("cc_exp_year"));
		global.typeInput(creditCardExpiryear, global.getData(1, 16));
		WebElement txtCVV = driver.findElement(By.id("cc_cvv"));
		global.typeInput(txtCVV, global.getData(1, 17));
		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();
		Thread.sleep(7000);
		WebElement orderNo = driver.findElement(By.id("order_no"));
		global.insertDataIntoExcel(orderNo, 1, 19);
		
		
		WebElement btnLogout = driver.findElement(By.id("logout"));
		btnLogout.click();
		
	}
		
	
	}