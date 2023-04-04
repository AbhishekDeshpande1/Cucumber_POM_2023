package com.test.practice.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" },
				glue = { "com/test/practice/stepDefinations","MyHooks"},
				tags="@Smoke or @Smoke1 or @Smoke2",
				
				plugin = {"pretty",
							"json:target/MyReports/report.json",
							"junit:target/MyReports/report.xml",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				publish = true
		)
 class Runner {
}
