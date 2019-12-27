package com.Odoo_CRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features/",
        glue = "com/Odoo_CRM/step_definitions",
        dryRun = false
        //tags = "@wip"
)
public class CukesRunner {
}