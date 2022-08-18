$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/A_Login.feature");
formatter.feature({
  "name": "verify login details of Adactin website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify the login details with invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Adactin Login page.",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on Login Button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "adm123",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the login details with invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Adactin Login page.",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_is_on_Adactin_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"adm123\" and \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_should_click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the login details with valid credentials.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Adactin Login page.",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_is_on_Adactin_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User again click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_again_click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/B_SearchHotel.feature");
formatter.feature({
  "name": "Setting the details of SearchHotelPage.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Adactin Login page.",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_is_on_Adactin_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User again click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.A_Login.user_again_click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding SearchHotel queries.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "User is on SearchHotel page.",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.B_SearchHotel.user_is_on_SearchHotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the location,hotel,roomtype and  number of rooms",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.B_SearchHotel.user_selects_the_location_hotel_roomtype_and_number_of_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  enters check-in and check-out dates",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.B_SearchHotel.user_enters_check_in_and_check_out_dates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects adults and children per room",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.B_SearchHotel.user_selects_adults_and_children_per_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on search Button.",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.B_SearchHotel.user_should_click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/C_SelectHotel.feature");
formatter.feature({
  "name": "Selecting a hotel from SelectHotelPage.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Selecting a hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on SelectHotel page.",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.C_SelectHotel.user_is_on_SelectHotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects a specific hotel",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.C_SelectHotel.user_selects_a_specific_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on continue Button.",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.C_SelectHotel.user_should_click_on_continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/D_BookingHotel.feature");
formatter.feature({
  "name": "Booking a hotel from BookAHotelPage.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Booking a hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on BookAHotel page.",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.D_BookingHotel.user_is_on_BookAHotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters firstname,lastname,billing address and credit card number",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.D_BookingHotel.user_enters_firstname_lastname_billing_address_and_credit_card_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects credit card type and expiry date",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.D_BookingHotel.user_selects_credit_card_type_and_expiry_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters CVV number",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.D_BookingHotel.user_enters_CVV_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on Book Now Button.",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.D_BookingHotel.user_should_click_on_Book_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on My Itinerary Button",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.D_BookingHotel.user_will_click_on_My_Itinerary_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/E_BookedItinerary.feature");
formatter.feature({
  "name": "Verify and Cancel BookedItinerary Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User will verify OrderId",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on BookedItinerary Page.",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.E_BookedItinerary.user_is_on_BookedItinerary_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will Copy order id of first record",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.E_BookedItinerary.user_will_Copy_order_id_of_first_record()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will paste the OrderId",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.E_BookedItinerary.user_will_paste_the_OrderId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on Go Button.",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.E_BookedItinerary.user_should_click_on_Go_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancel a booked hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on BookedItinerary Page.",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.E_BookedItinerary.user_is_on_BookedItinerary_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Cancel Selected Button",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.E_BookedItinerary.user_clicks_on_Cancel_Selected_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on OK Button.",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.E_BookedItinerary.user_should_click_on_OK_Button()"
});
formatter.result({
  "status": "passed"
});
});