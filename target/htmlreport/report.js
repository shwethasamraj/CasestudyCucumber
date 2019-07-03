$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Case4.feature");
formatter.feature({
  "name": "Cart Test",
  "description": "Description: User tries to move to cart without adding items",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "The one where the user moves to cart without adding item in it",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User open login page of Testme app",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user search a particular product like headphones",
  "keyword": "When "
});
formatter.step({
  "name": "user tries to access cart page",
  "keyword": "And "
});
formatter.step({
  "name": "Testme app doesn\u0027t display the cart icon",
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
        "shwesam",
        "password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The one where the user moves to cart without adding item in it",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User open login page of Testme app",
  "keyword": "Given "
});
formatter.match({
  "location": "Case4.user_open_login_page_of_Testme_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"shwesam\" and password as \"password123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case4.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Case4.user_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search a particular product like headphones",
  "keyword": "When "
});
formatter.match({
  "location": "Case4.user_search_a_particular_product_like_headphones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to access cart page",
  "keyword": "And "
});
formatter.match({
  "location": "Case4.user_tries_to_access_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Testme app doesn\u0027t display the cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "Case4.testme_app_doesn_t_display_the_cart_icon()"
});
formatter.result({
  "status": "passed"
});
});