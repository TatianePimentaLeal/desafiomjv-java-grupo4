package carrental;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Set;


import carrental.model.Cliente;
import carrental.model.Pedido;
import carrental.model.Produto;
import carrental.print.MetodoPrint;
import carrental.repository.ClienteRepository;
import carrental.repository.ProdutoRepository;
import carrental.service.ClienteService;
import carrental.service.ProdutoService;

public class CarrentalApp {

	public static void main(String[] args) {
		ClienteRepository repository = new ClienteRepository(); 
		
		
		
		Cliente Joana = new Cliente("Joana", "Joana@gmail.com", "123456", "Rua:ABS, 123", "10/10/1985", "00000000000");
		repository.cadastrarCliente(Joana);
		
		ProdutoRepository repositoryP = new ProdutoRepository();
		Produto Carro = new Produto("Renault Sandeiro", "oqz1917", "Cinza chumbo", 50.00, 2.55);
		repositoryP.criarProduto(Carro);
		
		
		Set<Cliente> clientes = repository.getClientes();
		Set<Produto> produtos = repositoryP.getProduto();
		
		
		ClienteService service = new ClienteService();

		

		
		Joana.setCpf(service.formatarCPF(Joana.getCpf()));		
		
		
		ProdutoService serviceP = new ProdutoService();
		Carro.setPlaca(serviceP.formatarPlaca(Carro.getPlaca()));		
		
		System.out.println(clientes);
		System.out.println(produtos);
		
		
		Date d = Date.valueOf(LocalDate.now());
		
		Pedido pedido = new Pedido(1, d , 5, Joana, Carro);
		System.out.println(pedido);	
		
<<<<<<< HEAD
		//Eve
		double aluguel = 120.0;
		DecimalFormat valorDecimal = new DecimalFormat();
		System.out.println(valorDecimal.format(aluguel));
		
<<<<<<< HEAD
		//Eve
		double valorCarro = 1200.0;
=======
		//Usando esse formato, precisa confirar manualmente
		double aluguel = 120.0;
		DecimalFormat valorDecimal = new DecimalFormat("R$ ##.00");
		System.out.println(valorDecimal.format(aluguel));
		
		//Usando esse formato, a configuração é feita automaticamente
		double valorCarro = 130000.0;
>>>>>>> d3acca1e2342e3f9bceb69488cdc06a399663a56
		Locale localBR = new Locale("pt","BR");
		NumberFormat moedaBR = NumberFormat.getCurrencyInstance(localBR);
		moedaBR.setMinimumFractionDigits(2);
		moedaBR.setMaximumFractionDigits(2);
		System.out.println(moedaBR.format(valorCarro));
<<<<<<< HEAD
=======
		//----Eve-------- 
		double valorCarro = 130000.0;
		Locale localBR = new Locale("pt","BR");
		NumberFormat moedaBR = NumberFormat.getCurrencyInstance(localBR);
		System.out.println(moedaBR.format(valorCarro));
		
		NumberFormat formatoBR = NumberFormat.getNumberInstance(localBR);
		formatoBR.setMinimumFractionDigits(2);
		formatoBR.setMaximumFractionDigits(2);
		System.out.println(formatoBR.format(valorCarro));
=======
	
		
>>>>>>> d3acca1e2342e3f9bceb69488cdc06a399663a56
	}
	
	
	
	
>>>>>>> d8ba5d674fc7aeddb5dc3717846ca446b87fc8ee
		
		MetodoPrint teste = new MetodoPrint();
        teste.abrir();
        teste.escrever(clientes, produtos, pedido);
        teste.fechar();
     
	}		
		
	

}
