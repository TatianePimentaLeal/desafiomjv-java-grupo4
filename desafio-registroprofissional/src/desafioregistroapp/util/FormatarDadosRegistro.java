package desafioregistroapp.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import desafioregistroapp.model.DadosRegistro;


public class FormatarDadosRegistro {
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	private List<String> ler(String caminhoArquivo) {
		 try {
	            List<String> formulario = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
	            return formulario;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	}
	
	public List<DadosRegistro> formatarForm (String caminhoArquivo) {
		List<String> conteudos = ler(caminhoArquivo);
		List<DadosRegistro> formulario = new ArrayList();
		
		for (String linha:conteudos) {
			String [] campos = linha.split(";");
			DadosRegistro register = new DadosRegistro();
			register.setCpf(campos[0]);
			register.setNome(campos[2]);
			register.setSexo(campos[3]);
			register.setEscolaridade(campos[4]);
			register.setProfissao(campos[5]);
			register.setSalarioMinPretendido(Double.valueOf(campos[6]));
			register.setSalarioMaxPretendido(Double.valueOf(campos[7]));
			register.setTelefoneContato(campos[8]);
			register.setEstrangeiro(campos[9]);
			register.setRg(campos[10]);
			register.setEndereço(campos[11]);
			register.setNumero(campos[12]);
			register.setBairro(campos[13]);
			register.setMunicipio(campos[14]);
			register.setUf(campos[15]);
			register.setCep(campos[16]);
			register.setNaturalidade(campos[17]);
			register.setPais(campos[18]);
			register.setCelular(campos[19]);
			register.setEmail(campos[20]);
			
			String date = campos[1].trim();
			
			LocalDate data = LocalDate.parse(date, formatter);
			register.setDataNasc(data);
			
			formulario.add(register);
		}
		
		return formulario;
	}

}
