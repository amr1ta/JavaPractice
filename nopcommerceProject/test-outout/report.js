$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Log in validation to nop commerce",
  "description": "",
  "id": "login;log-in-validation-to-nop-commerce",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens url \"https://www.nopcommerce.com/login.aspx\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username as \"amtesting\" and password as \"test@1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "page title should be \"nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "logout",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close bowser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_Browser()"
});
formatter.result({
  "duration": 14920830981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.nopcommerce.com/login.aspx",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "duration": 4170553303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amtesting",
      "offset": 25
    },
    {
      "val": "test@1234",
      "offset": 53
    }
  ],
  "location": "Steps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 775679824,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 8828711698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 44192887,
  "status": "passed"
});
formatter.match({
  "location": "Steps.logout()"
});
formatter.result({
  "duration": 1825221475,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_bowser()"
});
formatter.result({
  "duration": 1513641123,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Log in datadriven",
  "description": "",
  "id": "login;log-in-datadriven",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user opens url \"https://www.nopcommerce.com/login.aspx\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters username as \"\u003cuser\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "page title should be \"nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "logout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close bowser",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "login;log-in-datadriven;",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ],
      "line": 23,
      "id": "login;log-in-datadriven;;1"
    },
    {
      "cells": [
        "amtesting",
        "test@1234"
      ],
      "line": 24,
      "id": "login;log-in-datadriven;;2"
    },
    {
      "cells": [
        "admin2",
        "test123"
      ],
      "line": 25,
      "id": "login;log-in-datadriven;;3"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ],
      "line": 26,
      "id": "login;log-in-datadriven;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Log in datadriven",
  "description": "",
  "id": "login;log-in-datadriven;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user opens url \"https://www.nopcommerce.com/login.aspx\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters username as \"amtesting\" and password as \"test@1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "page title should be \"nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "logout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close bowser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_Browser()"
});
formatter.result({
  "duration": 5641417133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.nopcommerce.com/login.aspx",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "duration": 3166793102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amtesting",
      "offset": 25
    },
    {
      "val": "test@1234",
      "offset": 53
    }
  ],
  "location": "Steps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 887381820,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 2136582148,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 62708515,
  "status": "passed"
});
formatter.match({
  "location": "Steps.logout()"
});
formatter.result({
  "duration": 1427399785,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_bowser()"
});
formatter.result({
  "duration": 1210767336,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Log in datadriven",
  "description": "",
  "id": "login;log-in-datadriven;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user opens url \"https://www.nopcommerce.com/login.aspx\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters username as \"admin2\" and password as \"test123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "page title should be \"nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "logout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close bowser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_Browser()"
});
formatter.result({
  "duration": 6705094698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.nopcommerce.com/login.aspx",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "duration": 3188020325,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin2",
      "offset": 25
    },
    {
      "val": "test123",
      "offset": 50
    }
  ],
  "location": "Steps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 721283170,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 1151486424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 504045065,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat stepDefinitions.Steps.page_title_should_be(Steps.java:48)\r\n\tat ✽.Then page title should be \"nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution\"(./Features/login.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.close_bowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 26,
  "name": "Log in datadriven",
  "description": "",
  "id": "login;log-in-datadriven;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user opens url \"https://www.nopcommerce.com/login.aspx\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters username as \"admin@yourstore.com\" and password as \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "page title should be \"nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "logout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close bowser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_Browser()"
});
formatter.result({
  "duration": 5953112970,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.nopcommerce.com/login.aspx",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "duration": 3651961710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 25
    },
    {
      "val": "admin",
      "offset": 63
    }
  ],
  "location": "Steps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 801835960,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 2410243802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 288113227,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat stepDefinitions.Steps.page_title_should_be(Steps.java:48)\r\n\tat ✽.Then page title should be \"nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution\"(./Features/login.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.close_bowser()"
});
formatter.result({
  "status": "skipped"
});
});