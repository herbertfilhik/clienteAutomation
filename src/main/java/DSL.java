import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DSL {
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	// Métodos para escrever dados, ex: nome, crm, cip etc) no Gliese
	public void escreveNome(String nome, String texto) {
		driver.findElement(By.name(nome)).click();
		driver.findElement(By.name(nome)).clear();
		driver.findElement(By.name(nome)).sendKeys(texto);
	
		String textonome = driver.findElement(By.name(nome)).getText();
		System.out.println(textonome);
	}
	
	public void escreveFilme(String nomeFilme, String texto) {
		driver.findElement(By.name(nomeFilme)).click();
		driver.findElement(By.name(nomeFilme)).clear();
		driver.findElement(By.name(nomeFilme)).sendKeys(texto);
	}

	public void escreveCPF(String cpf, String texto) {
		driver.findElement(By.name(cpf)).click();
		driver.findElement(By.name(cpf)).clear();
		driver.findElement(By.name(cpf)).sendKeys(texto);
	}

	public void escreveRG(String rg, String texto) {
		driver.findElement(By.name(rg)).click();
		driver.findElement(By.name(rg)).clear();
		driver.findElement(By.name(rg)).sendKeys(texto);
	}

	public void escreveEndereco(String endereco, String texto) {
		driver.findElement(By.name(endereco)).click();
		driver.findElement(By.name(endereco)).clear();
		driver.findElement(By.name(endereco)).sendKeys(texto);
	}

	public void escreveSalario(String salario, String texto) {
		driver.findElement(By.name(salario)).click();
		driver.findElement(By.name(salario)).clear();
		driver.findElement(By.name(salario)).sendKeys(texto);
	}

	public void escreveTelefone(String telefone, String texto) {
		driver.findElement(By.name(telefone)).click();
		driver.findElement(By.name(telefone)).clear();
		driver.findElement(By.name(telefone)).sendKeys(texto);
	}

	public void escreveProfissao(String profissao, String texto) {
		driver.findElement(By.name(profissao)).click();
		driver.findElement(By.name(profissao)).clear();
		driver.findElement(By.name(profissao)).sendKeys(texto);
	}

	public void escreveDescricao(String descricao, String texto) {
		driver.findElement(By.name(descricao)).click();
		driver.findElement(By.name(descricao)).clear();
		driver.findElement(By.name(descricao)).sendKeys(texto);
	}

	public void escreveDataNascimento(String dataNascimento, String texto) {
		driver.findElement(By.name(dataNascimento)).click();
		driver.findElement(By.name(dataNascimento)).clear();
		driver.findElement(By.name(dataNascimento)).sendKeys(texto);
	}

	public void escreveDataLancamento(String dataLancamento, String texto) {
		driver.findElement(By.name(dataLancamento)).click();
		driver.findElement(By.name(dataLancamento)).clear();
		driver.findElement(By.name(dataLancamento)).sendKeys(texto);
	}
	
	public void clickBtSubmit() {
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[13]/td/input")).isDisplayed();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[13]/td/input")).isEnabled();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[13]/td/input")).click();
	}
	
	public void aguarde() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void validaTextos() {
		String textoElement = driver.findElement(By.xpath("/html/body/h2")).getText();
        assertEquals("Detalhes do Cliente Cadastrado", textoElement);
		
        String textoElement1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]")).getText();
        assertEquals("Nome:", textoElement1);
        
        String textoElement2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText();
        assertEquals("Nome do Filme:", textoElement2);
        
        String textoElement3 = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[1]")).getText();
        assertEquals("CPF:", textoElement3);
        
        String textoElement4 = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[1]")).getText();
        assertEquals("RG:", textoElement4);
        
        String textoElement5= driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[1]")).getText();
        assertEquals("Salário:", textoElement5);
        
        String textoElement6 = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[1]")).getText();
        assertEquals("Endereço:", textoElement6);
        
        String textoElement7 = driver.findElement(By.xpath("/html/body/table/tbody/tr[7]/td[1]")).getText();
        assertEquals("Profissão:", textoElement7);
        
        String textoElement8 = driver.findElement(By.xpath("/html/body/table/tbody/tr[8]/td[1]")).getText();
        assertEquals("Telefone:", textoElement8);
        
        String textoElement9 = driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td[1]")).getText();
        assertEquals("Descrição:", textoElement9);
        
        String textoElement10 = driver.findElement(By.xpath("/html/body/table/tbody/tr[10]/td[1]")).getText();
        assertEquals("Data de Nascimento:", textoElement10);
        
        String textoElement11 = driver.findElement(By.xpath("/html/body/table/tbody/tr[11]/td[1]")).getText();
        assertEquals("Data de Lançamento:", textoElement11);
	}
	
	public void validaConteudo() {		
		String textoEsperado01 = "Oliver Stone";
		String textoEsperado02 = "Snowden";
		String textoEsperado03 = "310.227.438-21";
		String textoEsperado04 = "40.823.111-7";
		String textoEsperado05 = "1000.0";
		String textoEsperado06 = "rua a";
		String textoEsperado07 = "diretor";
		String textoEsperado08 = "+99(99)9999-9999";
		String textoEsperado09 = "teste";
		String textoEsperado10 = "15/09/1946";
		String textoEsperado11 = "10/11/2016";
		
		String textoAtual01 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).getText();
        assertEquals(textoEsperado01, textoAtual01);        
        
		String textoAtual02 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
        assertEquals(textoEsperado02, textoAtual02);

		String textoAtual03 = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]")).getText();
        assertEquals(textoEsperado03, textoAtual03);
        
		String textoAtual04 = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
        assertEquals(textoEsperado04, textoAtual04);
        
		String textoAtual05 = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText();
        assertEquals(textoEsperado05, textoAtual05);
        
		String textoAtual06 = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]")).getText();
        assertEquals(textoEsperado06, textoAtual06);
        
		String textoAtual07 = driver.findElement(By.xpath("/html/body/table/tbody/tr[7]/td[2]")).getText();
        assertEquals(textoEsperado07, textoAtual07);
        
		String textoAtual08 = driver.findElement(By.xpath("/html/body/table/tbody/tr[8]/td[2]")).getText();
        assertEquals(textoEsperado08, textoAtual08);
        
		String textoAtual09 = driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td[2]")).getText();
        assertEquals(textoEsperado09, textoAtual09);
        
		String textoAtual10 = driver.findElement(By.xpath("/html/body/table/tbody/tr[10]/td[2]")).getText();
        assertEquals(textoEsperado10, textoAtual10);
        
		String textoAtual11 = driver.findElement(By.xpath("/html/body/table/tbody/tr[11]/td[2]")).getText();
        assertEquals(textoEsperado11, textoAtual11);
	}		
	
	public void clickLista() {	
		driver.findElement(By.xpath("/html/body/a[2]")).isDisplayed();
		driver.findElement(By.xpath("/html/body/a[2]")).click();
	}
	
	public void validaConteudoLista() {
		String textoEsperado01 = "Oliver Stone";
		String textoEsperado02 = "Snowden";
		String textoEsperado03 = "310.227.438-21";
		String textoEsperado04 = "+99(99)9999-9999";
		String textoEsperado05 = "rua a";
		String textoEsperado06 = "teste";
		String textoEsperado07 = "diretor";
		String textoEsperado08 = "40.823.111-7";
		String textoEsperado09 = "1000.0";
		String textoEsperado10 = "15/09/1946";
		String textoEsperado11 = "10/11/2016";

		String textoAtual01 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText();
        assertEquals(textoEsperado01, textoAtual01);        
        
		String textoAtual02 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
        assertEquals(textoEsperado02, textoAtual02);

		String textoAtual03 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]")).getText();
        assertEquals(textoEsperado03, textoAtual03);
        
		String textoAtual04 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[4]")).getText();
        assertEquals(textoEsperado04, textoAtual04);
        
		String textoAtual05 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[5]")).getText();
        assertEquals(textoEsperado05, textoAtual05);
        
		String textoAtual06 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[6]")).getText();
        assertEquals(textoEsperado06, textoAtual06);
        
		String textoAtual07 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[7]")).getText();
        assertEquals(textoEsperado07, textoAtual07);
        
		String textoAtual08 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[8]")).getText();
        assertEquals(textoEsperado08, textoAtual08);
        
		String textoAtual09 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[9]")).getText();
        assertEquals(textoEsperado09, textoAtual09);
        
		String textoAtual10 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[10]")).getText();
        assertEquals(textoEsperado10, textoAtual10);
        
		String textoAtual11 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[11]")).getText();
        assertEquals(textoEsperado11, textoAtual11);
	}
	
	public void clickCadastro() {	
		driver.findElement(By.xpath("/html/body/a")).isDisplayed();
		driver.findElement(By.xpath("/html/body/a")).click();
	}	
	
	public void validaInicial() {	
		driver.findElement(By.xpath("/html/body/h2")).isDisplayed();
		String textoTitulo = driver.findElement(By.xpath("/html/body/h2")).getText();
		assertEquals("Formulário de Cadastro de Cliente", textoTitulo);
	}
	
	public String consultaFilmes() {	
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).isDisplayed();
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).isEnabled();
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Oliver Stone Snowden");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"resultStats\"]")).isDisplayed();
		return driver.findElement(By.xpath("//*[@id=\"resultStats\"]")).getText();		
	}
	
}