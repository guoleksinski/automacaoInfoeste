package br.com.oleksinski.ProjetoAutomacao.dsl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dsl {

	private WebDriver driver;
	
	public Dsl(WebDriver driver) {
		this.driver = driver;
	}
	public void clickBotao(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public void enviarCaracteres(String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	public void esperarCarregarPagina(String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains(text));
	}
}
