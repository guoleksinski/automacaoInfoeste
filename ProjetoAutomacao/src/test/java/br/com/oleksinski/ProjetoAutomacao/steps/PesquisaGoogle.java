package br.com.oleksinski.ProjetoAutomacao.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PesquisaGoogle {
	 private static WebDriver driver;
	 
	 
@Before
public void initialize() {
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setAcceptInsecureCerts(true);
	ChromeOptions op = new ChromeOptions();
	op.merge(dc);
	op.addArguments("--headless=new");
	driver = new ChromeDriver();
	System.out.println(driver.getTitle());
}
@After
public void close() {
	driver.quit();
}

@Given("abro a pagina do google")
public void abro_a_pagina_do_google() throws InterruptedException {
    driver.get("https://localhost:3000");
    Thread.sleep(2000);
}
@When("digito na barra de pesquisa")
public void digito_na_barra_de_pesquisa() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infoeste");
    Thread.sleep(2000);
    
}
@When("clico no botão pesquisar")
public void clico_no_botão_pesquisar() throws InterruptedException {
    driver.findElement(By.xpath("//*[@value=\"Pesquisa Google\"]")).click();
    Thread.sleep(10000);
}
@Then("deve aparecer a pesquisa feita")
public void deve_aparecer_a_pesquisa_feita() {
    Assert.assertEquals(driver.getTitle(),"Infoeste - Pesquisa Google");;
}
}


