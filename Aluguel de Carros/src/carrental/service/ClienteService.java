package carrental.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import carrental.model.Cliente;

public class ClienteService {
	
	
	public String formatarData(String dataNascimento) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		LocalDate data = LocalDate.parse(dataNascimento, formato);
	
		return dataNascimento;
	}
	public String formatarCPF(String cpf) {		
		
		cpf = String.format("xxx.xxx.xxx-xx", cpf);
		return cpf;
	}

	
	public void alterarCliente() {
		
		
	}
	public void buscarCliente() {
		
	}
	
	
	public void excluirCliente() {
		
	}
	
	
}
