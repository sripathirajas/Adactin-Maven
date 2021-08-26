package org.adactin;

import java.io.IOException;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;

public class AdactinFor {
	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal global = new LibGlobal();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		@SuppressWarnings("static-access")
		WebDriver driver = global.getChromeDriver();
		global.loadUrl("http://adactinhotelapp.com/");
		global.maximizeBrowser();
		for (int i = 1; i <= nextInt; i++) {	
		WebElement element=driver.findElement(By.id("username"));
		global.typeInput(element, global.getData(i, 0));
		WebElement txtPassword = driver.findElement(By.id("password"));
		global.typeInput(txtPassword, global.getData(i, 1));
		WebElement btnClick = driver.findElement(By.id("login"));
		btnClick.click();
		Thread.sleep(2000);
		WebElement dDnCountry = driver.findElement(By.id("location"));
		global.typeInput(dDnCountry, global.getData(i, 2));
		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		global.typeInput(dDnHotel, global.getData(i, 3));
		WebElement dDnRoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		global.typeInput(dDnRoomType, global.getData(i, 4));
		WebElement dDnRoomNos = driver.findElement(By.id("room_nos"));
		global.typeInput(dDnRoomNos, global.getData(i, 5));
		WebElement txtCheckIn = driver.findElement(By.id("datepick_in"));
		txtCheckIn.clear();
		global.typeInput(txtCheckIn, global.getData(i, 6));
		WebElement txtCheckOut = driver.findElement(By.id("datepick_out"));
		txtCheckOut.clear();
		global.typeInput(txtCheckOut, global.getData(i, 7));
		WebElement dDnAdultPerRoom = driver.findElement(By.id("adult_room"));
		global.typeInput(dDnAdultPerRoom, global.getData(i, 8));
		WebElement dDnChildPerRoom = driver.findElement(By.id("child_room"));
		global.typeInput(dDnChildPerRoom, global.getData(i, 9));
		WebElement btnSearch = driver.findElement(By.xpath("//input[@value='Search']"));
		btnSearch.click();
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		Thread.sleep(2000);
		WebElement txtFirstName = driver.findElement(By.name("first_name"));
		global.typeInput(txtFirstName, global.getData(i, 10));
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		global.typeInput(txtLastName, global.getData(i, 11));
		WebElement billAddress = driver.findElement(By.id("address"));
		global.typeInput(billAddress, global.getData(i, 12));
		WebElement txtCreditNo = driver.findElement(By.id("cc_num"));
		global.typeInput(txtCreditNo, global.getData(i, 13));
		WebElement txtCreditCardType = driver.findElement(By.id("cc_type"));
		global.typeInput(txtCreditCardType, global.getData(i, 14));
		WebElement creditCardExpiryMonth = driver.findElement(By.id("cc_exp_month"));
		global.typeInput(creditCardExpiryMonth, global.getData(i, 15));
		WebElement creditCardExpiryear = driver.findElement(By.id("cc_exp_year"));
		global.typeInput(creditCardExpiryear, global.getData(i, 16));
		WebElement txtCVV = driver.findElement(By.id("cc_cvv"));
		global.typeInput(txtCVV, global.getData(i, 17));
		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();
		Thread.sleep(7000);
		WebElement orderNo = driver.findElement(By.id("order_no"));
		global.insertDataIntoExcel(orderNo, i, 19);
		
		
		WebElement btnLogout = driver.findElement(By.id("logout"));
		btnLogout.click();
		Thread.sleep(4000);
		
	WebElement btnLogAgain = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a"));
	btnLogAgain.click();
	Thread.sleep(1000);
	}
		global.closeAllBrowser();
	}
	
}
	


