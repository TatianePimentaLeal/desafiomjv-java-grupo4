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
import carrental.service.PedidoService;
import carrental.service.ProdutoService;

public class CarrentalApp {

	public static void main(String[] args) {
		ClienteRepository repository = new ClienteRepository(); 
		
		
		
		Cliente Joana = new Cliente("Joana", "Joana@gmail.com", "123456", "Rua:ABS, 123", "10/10/1985", "00000000000");
		repository.cadastrarCliente(Joana);
		
		ProdutoRepository repositoryP = new ProdutoRepository();
		Produto Carro = new Produto("Renault Sandeiro", "oqz1917", "Cinza chumbo", 5, 50.00, 2.55);
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
		
		Date x =null;
		
		
		Pedido pedido = new Pedido(1, d , 5, x ,Joana, Carro);
		
		PedidoService servicePedido = new PedidoService();
		pedido.setDataDevolucao(servicePedido.devolucao(d, Carro.getQtdDias()));
		
		
		System.out.println(pedido);	
		

		
		

		//----Eve--------
		double aluguel = 120.0;
		DecimalFormat valorDecimal = new DecimalFormat("R$ ##.00");
		System.out.println(valorDecimal.format(aluguel));	
	

		
		//----Eve-------- 
		double valorCarro = 130000.0;
		Locale localBR = new Locale("pt","BR");
		NumberFormat moedaBR = NumberFormat.getCurrencyInstance(localBR);
		System.out.println(moedaBR.format(valorCarro));
		
//		NumberFormat formatoBR = NumberFormat.getNumberInstance(localBR);
//		formatoBR.setMinimumFractionDigits(2);
//		formatoBR.setMaximumFractionDigits(2);
//		System.out.println(formatoBR.format(valorCarro));

	

	
		MetodoPrint teste = new MetodoPrint();
        teste.abrir();
        teste.escrever(clientes, produtos, pedido);
        teste.fechar();
        
     
	}		
		
	

}
