package com.appdirect.standalone.amos

import com.appdirect.RunAutomation
import com.appdirect.standalone.StandaloneSpec
import org.scalatest.time.{Seconds, Span}

/**
 * Created by esfandiaramirrahimi on 2015-05-11.
 */
class AmosSpec extends StandaloneSpec {
  When("I have gone into telephone management section") { () =>
    click on "tnManage"
  }

  When("I am in mobile number associations edit telephone number popup") { () =>
    implicitlyWait(Span(10, Seconds))
    click on xpath("//*[@id=\"main\"]/div/div/nav/ul/li[5]/a")
    click on xpath("//*[@id=\"main\"]/div/div/nav/div/div[5]/div/table/tbody/tr[3]/td[6]/menu/button")
    click on xpath("//*[@id=\"main\"]/div/div/nav/div/div[5]/div/table/tbody/tr[3]/td[6]/menu/div/ul/li/a")
  }

  When( """^I enter telephone number "(.*?)"$""") { (telephoneNumber: String) =>
    //// Write code here that turns the phrase above into concrete actions
    textField("ctn").value = telephoneNumber
    click on xpath("//*[@id=\"ng-app\"]/body/div[4]/div/div/div[2]/div[1]/button")
  }

  Then("Telephone number validation should fail") { () =>
    val errorElement: Option[Element] = find(xpath("//*[@id=\"ng-app\"]/body/div[4]/div/div/div[2]/div[1]/span[2]"))
    errorElement.get.isDisplayed should be(true)
    // Case Sensitive
    errorElement.get.text should be("INVALID")
  }
}
