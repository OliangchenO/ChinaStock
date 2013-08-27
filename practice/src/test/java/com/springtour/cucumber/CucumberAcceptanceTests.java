package com.springtour.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:", format = { "pretty",
		"html:target/cucumber", "json:target/cucumber.json" })
public class CucumberAcceptanceTests {

}
