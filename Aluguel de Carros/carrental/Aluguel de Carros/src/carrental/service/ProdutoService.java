package carrental.service;

public class ProdutoService {
	
	
	public String formatarPlaca(String placa) {		
		
		return(placa.toUpperCase().substring(0, 3) + "-" + placa.substring(3, 7) );
	}
	
	

}
