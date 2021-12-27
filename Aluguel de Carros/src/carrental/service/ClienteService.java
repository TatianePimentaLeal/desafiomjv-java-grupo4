package carrental.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteService {
	
	
	public Date formatarData(String dataNasciemnto) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataFormatada = formatter.parse(dataNasciemnto);
        return dataFormatada;
	}

	public String formatarCPF(String cpf) {		
		
		return(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
				cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}
	
	
	
	
	
}
