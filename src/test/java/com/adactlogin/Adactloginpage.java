package com.adactlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Adactloginpage
{
	WebDriver driver;
	public static void selectOptionByText(WebElement element,String data) {
		new Select(element).selectByVisibleText(data);
	}
	
	@Given("User is on the Adadctin page")
	public void user_is_on_the_Adadctin_page() {
	WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}
	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String name, String password) {
		WebElement txtusername=driver.findElement(By.id("username"));
				txtusername.sendKeys(name);
		WebElement txtpassword=driver.findElement(By.id("password"));
				txtpassword.sendKeys(password);

	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement btnclick=driver.findElement(By.id("login"));
		btnclick.click();

			}
	
	@When("Search Hotel{string},{string},{string},{string},{string},{string},{string},{string}")
	public void search_Hotel_and_and_and_and_and_and_and(String location, String hotels, String roomtype, String noofrooms, String chkindate, String chkoutdate, String adults, String childs) {
		new Select(driver.findElement(By.id("location"))).selectByVisibleText(location);
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText(hotels);
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText(roomtype);
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText(noofrooms);
		WebElement txtcheckin = driver.findElement(By.id("datepick_in"));
		txtcheckin.clear();
		txtcheckin.sendKeys(chkindate);
		WebElement txtcheckout = driver.findElement(By.id("datepick_out"));
		txtcheckout.clear();
		txtcheckout.sendKeys(chkoutdate);
		new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText(adults);
		new Select(driver.findElement(By.id("child_room"))).selectByVisibleText(childs);
	}

	
@When("User should click search button")
public void user_should_click_search_button() {
	driver.findElement(By.id("Submit")).click();
}
@When("Select and Click continue")
public void Radio() {
driver.findElement(By.id("radiobutton_0")).click();
driver.findElement(By.id("continue")).click();
}

@When("Book Hotel{string},{string},{string},{string},{string},{string},{string},{string}")
public void BookHotel(String firstname, String lastname, String address, String ccnum, String cctype, String selectmonth, String selectyear, String cvv) {
WebElement txtfirstname = driver.findElement(By.id("first_name"));
txtfirstname.sendKeys(firstname);
WebElement txtlastname = driver.findElement(By.id("last_name"));
txtlastname.sendKeys(lastname);
WebElement txtaddress = driver.findElement(By.id("address"));
txtaddress.sendKeys(address);
WebElement txtccnum = driver.findElement(By.id("cc_num"));
txtccnum.sendKeys(ccnum);
new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText(cctype);
new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText(selectmonth);
new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText(selectyear);
WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
txtcvv.sendKeys(cvv);
}

@When("User should click Booknow")
public void Booknow() {
	driver.findElement(By.id("book_now")).click();
}
	
	

	@Then("User should verify success message")
	public void user_should_verify_success_message() {
		String TxtValue = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println(TxtValue);
		driver.quit();
			}

}
