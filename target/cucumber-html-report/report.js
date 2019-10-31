$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/training_h2a.06.17/Desktop/cucumber/Features/casestudy2.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to Demo webshop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "name": "User fills valid credential \"\u003cusername\u003e\", \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should be able to Login",
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
        "dhdhdhda@gmail.com",
        "akshay123"
      ]
    },
    {
      "cells": [
        "quwywswhha@gmail.com",
        "shweta123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to Demo webshop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy2.user_is_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills valid credential \"dhdhdhda@gmail.com\", \"akshay123\"",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy2.user_fills_valid_credential(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to Login",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy2.user_should_be_able_to_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login to Demo webshop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy2.user_is_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills valid credential \"quwywswhha@gmail.com\", \"shweta123\"",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy2.user_fills_valid_credential(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to Login",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy2.user_should_be_able_to_Login()"
});
formatter.result({
  "status": "passed"
});
});