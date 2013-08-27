package com.springtour.cucumber;

import javax.annotation.Resource;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlusStep {
	@Resource(name="practice.plus")
	private Plus target;
	private int result;
	
	@Given("^输入参数一$")
	public void 输入参数一() {
	}
	
	@And("^输入参数二$")
	public void 输入参数二() {
	}
	
	@When("^进行计算$")
	public void 进行计算() {
		result = target.plus();
	}
	
	@Then("^得到两数相加结果$")
	public void 得到两数相加结果() {
		Assert.assertEquals(25, result);
	}
	
}
