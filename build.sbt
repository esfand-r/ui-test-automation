name := "ATT Standalone Auomated Test"

scalaVersion := "2.11.6"

version := "1.0"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test",
  "org.scala-lang" % "scala-library" % "2.11.6",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.2",
  "info.cukes" % "cucumber-junit" % "1.2.2",
  "info.cukes" % "cucumber-picocontainer" % "1.2.2",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.45.0",
  "com.typesafe" % "config" % "1.2.1")

