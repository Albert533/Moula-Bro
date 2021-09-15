package com.adactrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\gilla\\eclipse-workspace\\AdactinCucumber\\src\\test\\resources\\Features\\AdactPage.feature",glue = "com.adactlogin")
public class AdactinRunner
{
}

