package br.com.oleksinski.ProjetoAutomacao.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features/google"}, glue = {"br.com.oleksinski.ProjetoAutomacao.steps"})
public class GoogleRunner {

}
