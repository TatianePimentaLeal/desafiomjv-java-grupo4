package portifolio.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import portifolio.model.Estado;
import portifolio.model.Registro;

public class LeitorRemessa {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	private List<String> ler(String caminhoArquivo) {
		try {
			List<String> registros = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
			return registros;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
    public List<Registro> converter (String caminhoArquivo) {
    	List<String> conteudos = ler(caminhoArquivo);
    	List<Registro> registros = new ArrayList();
    	
	    for(String linha:conteudos) {
            String [] campos = linha.split(";");
	    	Registro r = new Registro();
	    	r.setProfissao(campos[0]);
	    	r.setNomeCompleto(campos[1]);
	    	r.setMinimoSalario(Double.valueOf(campos[2]));
	    	r.setMaximoSalario(Double.valueOf(campos[3]));
	    	
	    	String date = campos[4];
			LocalDate data = LocalDate.parse(date,formatter);
			r.setDataNascimento(data);
		    	
	    	r.setCpf(campos[5]);
	    	r.setRg(campos[6]);
	    	r.setLogradouro(campos[7]);
	        
	    	String numero = campos [8];
	        Integer  number =  Integer.parseInt(numero);
	        r.setNumeroCasa(number);
				
	    	r.setBairro(campos[9]);
	    	r.setCidade(campos[10]);
	    	r.setUf(Estado.valueOf(campos[11]));
	    	r.setCep(campos[12]);
	    	r.setNaturalidade(campos[13]);
	    	 r.setPais(campos[14]);
	    	r.setTelefone(campos[15]);
	    	r.setCelular(campos[16]);
	        r.setEmail(campos[17]);
            
          
           
	    	registros.add(r);
	    }
	    
	    return  registros;
	}
    
    

}