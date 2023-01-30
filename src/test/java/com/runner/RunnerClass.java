package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.baseclass.BaseClass;


public class RunnerClass extends BaseClass {
	
	
	public static void main( String[] args) throws Throwable {
		
		//browserlanch
		
		        browserLanch("chrome");
		
		//geturl
		 
		        getUrl("https://adactinhotelapp.com/");
		
		//sendkeys				 
		        WebElement username = driver.findElement(By.id("username"));
		        passInputValue(username,"Vigeshprabhug93");						
		        WebElement pass = driver.findElement(By.id("password"));
		        passInputValue(pass,"12345678");
			
		//click	
			    WebElement login = driver.findElement(By.id("login"));
			    click(login);
						
		//DropDown	
				WebElement loc = driver.findElement(By.id("location"));
				dropDown(loc, "index", "8");
				WebElement Hotel = driver.findElement(By.id("hotels"));
				dropDown(Hotel, "value", "Hotel Sunshine");
				WebElement room = driver.findElement(By.id("room_type"));
				dropDown(room, "index", "4");
				WebElement rooms = driver.findElement(By.id("room_nos"));
				dropDown(rooms, "index", "8");
				
		//Clear
				
			    WebElement check = driver.findElement(By.id("datepick_in"));
			    clear(check);
			    passInputValue(check, "17/01/2023");
			    WebElement out = driver.findElement(By.id("datepick_out"));
				clear(out);
				passInputValue(out, "18/01/2023");
				
		//Dropdown				
				WebElement adult = driver.findElement(By.id("adult_room"));
				dropDown(adult, "index", "3");
				WebElement child = driver.findElement(By.id("child_room"));
				dropDown(child, "index", "2");
				  				 
	    //click
				WebElement submit = driver.findElement(By.id("Submit"));
				click(submit);
			    WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
			    click(radiobutton);
				WebElement continues = driver.findElement(By.id("continue"));
				click(continues); 
			    
	   //sendkeys			
				
				WebElement firstname = driver.findElement(By.id("first_name"));
				passInputValue(firstname, "Vignesh");
	            WebElement lastname = driver.findElement(By.id("last_name"));
	            passInputValue(lastname, "Prabhu G");
			    WebElement address = driver.findElement(By.id("address"));
			    passInputValue(address, "No 23, rue street paris, France");
	            WebElement creditcard = driver.findElement(By.id("cc_num"));
	            passInputValue(creditcard, "2323232323232323");
			
	   //Dropdown         
	            WebElement cctype = driver.findElement(By.id("cc_type"));
	            dropDown(cctype, "index","3");
	            WebElement ccexp = driver.findElement(By.id("cc_exp_month"));
	            dropDown(ccexp, "index", "4");	               
		        WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
		        dropDown(ccexpyear, "index", "12");
	
       //Sendkeys
	               
                WebElement cvv = driver.findElement(By.id("cc_cvv"));
                passInputValue(cvv, "1234");
	            
       //Click
                WebElement booknow = driver.findElement(By.id("book_now"));
                click(booknow);
                Thread.sleep(8000);  
 	            WebElement logout = driver.findElement(By.id("logout"));
 	            click(logout);
 	            
 	   //Close
 	            closee();
			    
			}
	
	   
	
	
		


		
			
			
			
			
			
			
			
			
			
}		
			
			 
	

