package com.appdirect.standalone

import com.appdirect.RunAutomation
import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest._
import org.scalatest.selenium.Firefox

/**
 * Created by esfandiaramirrahimi on 2015-05-05.
 */
trait StandaloneSpec extends ScalaDsl with EN with Matchers with ShouldMatchers with Firefox {
  Given("AppDirect and Standalone apps are running and I can login") { () =>
    go to RunAutomation.host

    emailField("username").value = RunAutomation.username
    pwdField("password").value = RunAutomation.password

    click on "signin"
  }

  Then("close test browser") { () =>
    close()
    quit()
  }
}
