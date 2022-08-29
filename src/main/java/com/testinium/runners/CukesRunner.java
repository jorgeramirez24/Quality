package com.testinium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
    },
    features = "src/main/resources/features",
    glue = "com/testinium/step_definitions",
    dryRun = false,
<<<<<<< HEAD:src/main/java/com/testinium/runners/CukesRunner.java
    tags = "@Deneme"
=======
    tags = "@Calendar"
>>>>>>> feature/calendar:src/main/java/com/upgenix/runners/CukesRunner.java
)
public class CukesRunner {



}
