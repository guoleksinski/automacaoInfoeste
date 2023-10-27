package br.com.oleksinski.ProjetoAutomacao.steps.cadastro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.oleksinski.ProjetoAutomacao.pages.CadastroPage;
import br.com.oleksinski.ProjetoAutomacao.pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroSteps {

	private WebDriver driver;
	private HomePage homePage;
	private CadastroPage cadastroPage;
	
	@Before
	public void initialize() {
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		cadastroPage = new CadastroPage();
		
		driver.get("https://localhost:3000");
		homePage.aguardarHomePageCarregar();
	}
	
	@Given("entro na página de cadastro")
	public void entro_na_página_de_cadastro() {
	    homePage.clicarBotaoCadastrar();
	}
	@When("escolho a opção professor")
	public void escolho_a_opção_professor() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("preencho os campos")
	public void preencho_os_campos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("devo ser cadastrado")
	public void devo_ser_cadastrado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
