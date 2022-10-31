$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\features\\login.feature");
formatter.feature({
  "name": "Bookcart Application tests",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login should be success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the Bookcart application",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_navigate_to_the_Bookcart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the username as ortoni",
  "keyword": "And "
});
formatter.match({
  "location": "steps.userEnterTheUsernameAsOrtoni()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password as pass1234",
  "keyword": "And "
});
formatter.match({
  "location": "steps.userEnterThePasswordAsPass()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "login should be success",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login_should_be_success()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login should be Failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "User navigate to the Bookcart application",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User enter the \"\u003cusername\u003e\" as username",
  "keyword": "And "
});
formatter.step({
  "name": "User enter the \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.step({
  "name": "login should be Failed",
  "keyword": "But "
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
        "ortoni",
        "pass123456"
      ]
    }
  ],
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.scenario({
  "name": "Login should be Failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@reg"
    },
    {
      "name": "@prod"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the Bookcart application",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_navigate_to_the_Bookcart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"ortoni\" as username",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_the_username_as_ortoni(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"pass123456\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_the_username_as_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "login should be Failed",
  "keyword": "But "
});
formatter.match({
  "location": "steps.loginShouldBeFailed()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Username or Password is incorrect.1] but found [Username or Password is incorrect.]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:629)\r\n\tat org.testng.Assert.assertEquals(Assert.java:639)\r\n\tat stepdefinations.steps.loginShouldBeFailed(steps.java:66)\r\n\tat ✽.login should be Failed(src\\test\\java\\features\\login.feature:21)\r\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
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
        "ortoni",
        "pass123456"
      ]
    }
  ],
  "tags": [
    {
      "name": "@qa"
    }
  ]
});
formatter.scenario({
  "name": "Login should be Failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@reg"
    },
    {
      "name": "@qa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the Bookcart application",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_navigate_to_the_Bookcart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"ortoni\" as username",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_the_username_as_ortoni(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"pass123456\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_the_username_as_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "login should be Failed",
  "keyword": "But "
});
formatter.match({
  "location": "steps.loginShouldBeFailed()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Username or Password is incorrect.1] but found [Username or Password is incorrect.]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:629)\r\n\tat org.testng.Assert.assertEquals(Assert.java:639)\r\n\tat stepdefinations.steps.loginShouldBeFailed(steps.java:66)\r\n\tat ✽.login should be Failed(src\\test\\java\\features\\login.feature:21)\r\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login should be success",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigate to the Bookcart application",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User enter the \"\u003cusername\u003e\" as username",
  "keyword": "And "
});
formatter.step({
  "name": "User enter the \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.step({
  "name": "login should be success",
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
        "ortoni",
        "pass1234"
      ]
    },
    {
      "cells": [
        "mustafi011994",
        "Uvwx0101"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login should be success",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the Bookcart application",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_navigate_to_the_Bookcart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"ortoni\" as username",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_the_username_as_ortoni(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"pass1234\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_the_username_as_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "login should be success",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login_should_be_success()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should be success",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the Bookcart application",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_navigate_to_the_Bookcart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"mustafi011994\" as username",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_the_username_as_ortoni(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"Uvwx0101\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_the_username_as_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "login should be success",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login_should_be_success()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});