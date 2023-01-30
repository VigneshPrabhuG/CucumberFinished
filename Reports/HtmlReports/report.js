$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 3822893000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enter_the_username_in_username_field()"
});
formatter.result({
  "duration": 246694000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enter_the_password_in_password_field()"
});
formatter.result({
  "duration": 155981300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_click_the_login_button_and_it_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 1131921100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Search The Hotel In The Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-the-hotel-in-the-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user Login In The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user Select The Hotel Location in The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user Select The Hotel In The Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select The Room Type In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select The Number Of Rooms In The Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The Check In Date In The Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The Check Out Date In The Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Adults Per Room In The Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Children Per Room In The Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Click The Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_login_in_the_adactin_application()"
});
formatter.result({
  "duration": 92700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_hotel_location_in_the_location_field()"
});
formatter.result({
  "duration": 499128600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_hotel_in_the_hotel_field()"
});
formatter.result({
  "duration": 181602800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_room_type_in_the_room_type_field()"
});
formatter.result({
  "duration": 299688400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_number_of_rooms_in_the_number_of_rooms_field()"
});
formatter.result({
  "duration": 296935000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_check_in_date_in_the_check_in_date_field()"
});
formatter.result({
  "duration": 180572200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_check_out_date_in_the_check_out_date_field()"
});
formatter.result({
  "duration": 191880500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_adults_per_room_in_the_adults_per_room_field()"
});
formatter.result({
  "duration": 254233800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_children_per_room_in_the_children_per_room_field()"
});
formatter.result({
  "duration": 190378000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_click_the_search_button_and_it_navigates_to_select_hotel_page()"
});
formatter.result({
  "duration": 809606900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User Select The Hotel In The select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel-in-the-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user Search The Hotel In The Search Hotel Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user Select The Radio Button In The Select Option",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user Click The Continue Button And It Navigates To Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_search_the_hotel_in_the_search_hotel_page()"
});
formatter.result({
  "duration": 75800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_radio_button_in_the_select_option()"
});
formatter.result({
  "duration": 137083900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_click_the_continue_button_and_it_navigates_to_book_hotel_page()"
});
formatter.result({
  "duration": 767687100,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User Book A Hotel In The Book Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-a-hotel-in-the-book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user Select The Hotel In The select Hotel Page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user Enter The First Name In the First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Enter The Last name In the Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter The Billing Address In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Credit Card No In The Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The Credit Card Type In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select The Expiry Date In The Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select The Expiry Year In The Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter the CVV Number In The CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user click the Book Now Button And It Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_select_the_hotel_in_the_select_hotel_page()"
});
formatter.result({
  "duration": 55600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enter_the_first_name_in_the_first_name_field()"
});
formatter.result({
  "duration": 207026800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enter_the_last_name_in_the_last_name_field()"
});
formatter.result({
  "duration": 205792700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enter_the_billing_address_in_the_billing_address_field()"
});
formatter.result({
  "duration": 178090300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enter_the_credit_card_no_in_the_credit_card_no_field()"
});
formatter.result({
  "duration": 136898000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_credit_card_type_in_the_credit_card_type_field()"
});
formatter.result({
  "duration": 214447000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_expiry_date_in_the_expiry_date_field()"
});
formatter.result({
  "duration": 221403600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_select_the_expiry_year_in_the_year_field()"
});
formatter.result({
  "duration": 378654200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enter_the_cvv_number_in_the_cvv_number_field()"
});
formatter.result({
  "duration": 151571900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_click_the_book_now_button_and_it_navigates_to_booking_confirmation_page()"
});
formatter.result({
  "duration": 8132144200,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "User Logout The Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-logout-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "user Booked A Hotel In The Book Hotel Page",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "user Click The Logout Button And The Application Logged out Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_booked_a_hotel_in_the_book_hotel_page()"
});
formatter.result({
  "duration": 69300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_click_the_logout_button_and_the_application_logged_out_successfully()"
});
formatter.result({
  "duration": 1018744600,
  "status": "passed"
});
});