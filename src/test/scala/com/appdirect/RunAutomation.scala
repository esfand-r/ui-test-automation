package com.appdirect

import com.typesafe.config.ConfigFactory
import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("com.appdirect.standalone"),
  plugin = Array("pretty", "html:target/cucumber-report"),
  tags = Array("@wip")
)
class RunAutomation {
}

object RunAutomation {
  val conf = ConfigFactory.load
  val host = conf.getString("standalone.host")
  val username = conf.getString("standalone.username")
  val password = conf.getString("standalone.password")
}