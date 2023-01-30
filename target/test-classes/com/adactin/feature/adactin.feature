Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario: User Login In The Web Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user click the login button And It Navigates To Search Hotel Page 

@sanityTest
Scenario: User Search The Hotel In The Search Hotel Page 
Given user Login In The Adactin Application
When user Select The Hotel Location in The Location Field
And user Select The Hotel In The Hotel Field
And user Select The Room Type In The Room Type Field
And user Select The Number Of Rooms In The Number Of Rooms Field
And user Select The Check In Date In The Check In Date Field
And user Select The Check Out Date In The Check Out Date Field
And user Select The Adults Per Room In The Adults Per Room Field
And user Select The Children Per Room In The Children Per Room Field
Then user Click The Search Button And It Navigates To Select Hotel Page

@sanityTest
Scenario: User Select The Hotel In The select Hotel Page
Given user Search The Hotel In The Search Hotel Page
When user Select The Radio Button In The Select Option
Then user Click The Continue Button And It Navigates To Book Hotel Page

@sanityTest
Scenario: User Book A Hotel In The Book Hotel Page
Given user Select The Hotel In The select Hotel Page
When user Enter The First Name In the First Name Field
And user Enter The Last name In the Last Name Field
And user Enter The Billing Address In The Billing Address Field
And user Enter The Credit Card No In The Credit Card No Field
And user Select The Credit Card Type In The Credit Card Type Field
And user Select The Expiry Date In The Expiry Date Field
And user Select The Expiry Year In The Year Field
And user Enter the CVV Number In The CVV Number Field
Then user click the Book Now Button And It Navigates To Booking Confirmation Page

@sanityTest
Scenario: User Logout The Application
Given user Booked A Hotel In The Book Hotel Page
Then user Click The Logout Button And The Application Logged out Successfully 