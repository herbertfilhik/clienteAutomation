import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LerArquivo {
    private String usuario;
    private String senha;
    

    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LerArquivo() {
        
        String linha = new String();
		String nomeArquivo = System.getProperty("user.dir") + "\\Utils\\Automation\\fileauth\\fileenv.csv";
        
        File arq = new File(nomeArquivo);
        
        if(arq.exists()) {
            try {
                FileReader leitorDeArquivo = new FileReader(nomeArquivo);
                BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);
                
                while(true) {
                    linha = bufferDeArquivo.readLine();
                    
                    String[] valoresEntreVirgulas = linha.split(",");
                    
                    if(linha == null) {
                       break; 
                    }
                    //System.out.println(linha);
                    
                    setUsuario(valoresEntreVirgulas[0]);
                    setSenha(valoresEntreVirgulas[1]);
                    
                }                
            }catch(Exception e) {
                
            }
        }
        
    }
}