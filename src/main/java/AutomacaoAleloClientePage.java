import java.io.Serializable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomacaoAleloClientePage {
    private DSL dsl;
    	
    public AutomacaoAleloClientePage(WebDriver driver) {
        dsl = new DSL(driver);
    }
    
    public void setNome(String texto) {
        dsl.escreveNome("nome", texto);        
    }
    
    public void setFilme(String texto) {
        dsl.escreveFilme("nomeFilme", texto);        
    }
    
    public void setCPF(String texto) {
        dsl.escreveCPF("cpf", texto);        
    }
    
    public void setRG(String texto) {
        dsl.escreveRG("rg", texto);        
    }
    
    public void setEndereco(String texto) {
        dsl.escreveEndereco("endereco", texto);        
    }
    
    public void setSalario(String texto) {
        dsl.escreveSalario("salario", texto);        
    }
    
    public void setTelefone(String texto) {
        dsl.escreveTelefone("telefone", texto);        
    }
    
    public void setProfissao(String texto) {
        dsl.escreveProfissao("profissao", texto);        
    }
    
    public void setDescricao(String texto) {
        dsl.escreveDescricao("descricao", texto);        
    }
    
    public void setDataNascimento(String texto) {
        dsl.escreveDataNascimento("dataNascimento", texto);        
    }
    
    public void setDataLancamento(String texto) {
        dsl.escreveDataLancamento("dataLancamento", texto);        
    }    
    
    public void clickBtSubmit() {
        dsl.clickBtSubmit();        
    }
    
    public void aguarde() throws InterruptedException {
        dsl.aguarde();        
    }
    
    public void validaTextos() {
        dsl.validaTextos();        
    }
    
    public void validaConteudo() {
        dsl.validaConteudo();        
    }
    
    public void clickLista() {
        dsl.clickLista();        
    }
    
    public void validaConteudoLista() {
        dsl.validaConteudoLista();        
    }
    
    public void clickCadastro() {
        dsl.clickCadastro();        
    }
    
    public void validaInicial() {
        dsl.validaInicial();        
    }
    
    public String consultaFilmes() {
        return dsl.consultaFilmes();        
    }
    
}