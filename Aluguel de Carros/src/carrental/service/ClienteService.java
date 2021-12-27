package carrental.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ClienteService {
	
	//Rever
	public String formatarData(Date data) {
		Calendar cal = Calendar.getInstance();
        cal.setTime(data);

        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatado.format(LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)));

        return dataFormatada;
	}

	public String formatarCPF(String cpf) {		
		
		return(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
				cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}
	
	
	public void alterarCliente() {
		
		
	}
	public void buscarCliente() {
		
	}
	
	
	public void excluirCliente() {
		
	}
	
	
}
