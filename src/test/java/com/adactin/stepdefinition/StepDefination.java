package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;



public class StepDefination {
public static WebDriver driver = RunnerClass.driver;
	@cucumber.api.java.en.Given("user Launch The Adactin Application")
	public void user_launch_the_adactin_application() {
		driver.get("https://adactinhotelapp.com/");
	}
	@cucumber.api.java.en.When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Vigeshprabhug93");
	}
	@cucumber.api.java.en.When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345678");
	}
	@cucumber.api.java.en.Then("user click the login button And It Navigates To Search Hotel Page")
	public void user_click_the_login_button_and_it_navigates_to_search_hotel_page() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@cucumber.api.java.en.Given("user Login In The Adactin Application")
	public void user_login_in_the_adactin_application() {
	}
	
	@cucumber.api.java.en.When("user Select The Hotel Location in The Location Field")
	public void user_select_the_hotel_location_in_the_location_field() {
		WebElement Loc = driver.findElement(By.id("location"));
		Select Location = new Select(Loc);
		Location.selectByIndex(8);	
	}
	
	@cucumber.api.java.en.When("user Select The Hotel In The Hotel Field")
	public void user_select_the_hotel_in_the_hotel_field() {
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select Ho = new Select(Hotel);
		Ho.selectByValue("Hotel Sunshine");	
	}
	
	@cucumber.api.java.en.When("user Select The Room Type In The Room Type Field")
	public void user_select_the_room_type_in_the_room_type_field() {
		WebElement room = driver.findElement(By.id("room_type"));
		Select roomType = new Select(room);
		roomType.selectByIndex(4);
	}
	
	@cucumber.api.java.en.When("user Select The Number Of Rooms In The Number Of Rooms Field")
	public void user_select_the_number_of_rooms_in_the_number_of_rooms_field() {
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select roomnum = new Select(rooms);
		roomnum.selectByIndex(8);
	}
	
	@cucumber.api.java.en.When("user Select The Check In Date In The Check In Date Field")
	public void user_select_the_check_in_date_in_the_check_in_date_field() {
		WebElement check = driver.findElement(By.id("datepick_in"));
		check.clear();
		check.sendKeys("09/01/2023");
	}
	
	@cucumber.api.java.en.When("user Select The Check Out Date In The Check Out Date Field")
	public void user_select_the_check_out_date_in_the_check_out_date_field() {
		WebElement out = driver.findElement(By.id("datepick_out"));
		out.clear();
		out.sendKeys("10/01/2023");
	}
	
	@cucumber.api.java.en.When("user Select The Adults Per Room In The Adults Per Room Field")
	public void user_select_the_adults_per_room_in_the_adults_per_room_field() {
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select adultroom = new Select(adult);
		adultroom.selectByIndex(3);
	}
	
	@cucumber.api.java.en.When("user Select The Children Per Room In The Children Per Room Field")
	public void user_select_the_children_per_room_in_the_children_per_room_field() {
		WebElement child = driver.findElement(By.id("child_room"));
		Select childroom = new Select(child);
		childroom.selectByIndex(2);
	}
	
	@cucumber.api.java.en.Then("user Click The Search Button And It Navigates To Select Hotel Page")
	public void user_click_the_search_button_and_it_navigates_to_select_hotel_page() {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
	}

@cucumber.api.java.en.Given("user Search The Hotel In The Search Hotel Page")
public void user_search_the_hotel_in_the_search_hotel_page() {	
}

@cucumber.api.java.en.When("user Select The Radio Button In The Select Option")
public void user_select_the_radio_button_in_the_select_option() {
        WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
        radiobutton.click();
}
@cucumber.api.java.en.Then("user Click The Continue Button And It Navigates To Book Hotel Page")
public void user_click_the_continue_button_and_it_navigates_to_book_hotel_page() {  

	    WebElement continues = driver.findElement(By.id("continue"));
	    continues.click();
}

@cucumber.api.java.en.Given("user Select The Hotel In The select Hotel Page")
public void user_select_the_hotel_in_the_select_hotel_page() {
}

@cucumber.api.java.en.When("user Enter The First Name In the First Name Field")
public void user_enter_the_first_name_in_the_first_name_field() {

	WebElement firstname = driver.findElement(By.id("first_name"));
	firstname.sendKeys("Vignesh");
}
@cucumber.api.java.en.When("user Enter The Last name In the Last Name Field")
public void user_enter_the_last_name_in_the_last_name_field() {

               WebElement lastname = driver.findElement(By.id("last_name"));
               lastname.sendKeys("Prabhu G");
}

@cucumber.api.java.en.When("user Enter The Billing Address In The Billing Address Field")
public void user_enter_the_billing_address_in_the_billing_address_field() {

               WebElement address = driver.findElement(By.id("address"));
               address.sendKeys("No 23, rue street paris, France");
}

@cucumber.api.java.en.When("user Enter The Credit Card No In The Credit Card No Field")
public void user_enter_the_credit_card_no_in_the_credit_card_no_field() {

               WebElement creditcard = driver.findElement(By.id("cc_num"));
               creditcard.sendKeys("2323232323232323");	
}

@cucumber.api.java.en.When("user Select The Credit Card Type In The Credit Card Type Field")
public void user_select_the_credit_card_type_in_the_credit_card_type_field() {

               WebElement cctype = driver.findElement(By.id("cc_type"));
               Select creditcard = new Select(cctype);
	           creditcard.selectByIndex(3);
}

@cucumber.api.java.en.When("user Select The Expiry Date In The Expiry Date Field")
public void user_select_the_expiry_date_in_the_expiry_date_field() {

               WebElement ccexp = driver.findElement(By.id("cc_exp_month"));
               Select exp = new Select(ccexp);
               exp.selectByIndex(4);              
}
               
@cucumber.api.java.en.When("user Select The Expiry Year In The Year Field")
public void user_select_the_expiry_year_in_the_year_field() {
               
	           WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
               Select expyear = new Select(ccexpyear);
               expyear.selectByIndex(12);
}

@cucumber.api.java.en.When("user Enter the CVV Number In The CVV Number Field")
public void user_enter_the_cvv_number_in_the_cvv_number_field() {
               
	           WebElement cvv = driver.findElement(By.id("cc_cvv"));
               cvv.sendKeys("1234"); 
}

@cucumber.api.java.en.Then("user click the Book Now Button And It Navigates To Booking Confirmation Page")
public void user_click_the_book_now_button_and_it_navigates_to_booking_confirmation_page() throws Throwable {

               WebElement booknow = driver.findElement(By.id("book_now"));
               booknow.click();
               Thread.sleep(8000);
}

@cucumber.api.java.en.Given("user Booked A Hotel In The Book Hotel Page")
public void user_booked_a_hotel_in_the_book_hotel_page() {
}

@cucumber.api.java.en.Then("user Click The Logout Button And The Application Logged out Successfully")
public void user_click_the_logout_button_and_the_application_logged_out_successfully() {
 
	           WebElement logout = driver.findElement(By.id("logout"));
	           logout.click();

}


}
    
    
    
