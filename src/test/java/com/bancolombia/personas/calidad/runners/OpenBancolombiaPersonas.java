package com.bancolombia.personas.calidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/open_bancolombia_page.feature",
        glue = "com.bancolombia.personas.calidad.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class OpenBancolombiaPersonas {

}
