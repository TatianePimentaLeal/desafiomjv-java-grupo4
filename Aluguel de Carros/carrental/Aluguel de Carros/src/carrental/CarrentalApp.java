package carrental;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

import carrental.model.Cliente;
import carrental.model.Pedido;
import carrental.model.Produto;
import carrental.print.EscreverMetodos;
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
		Produto Carro = new Produto("Renault Sandeiro", "oqz1917", "Cinza chumbo", 50.00);
		repositoryP.criarProduto(Carro);
		
		
		Set<Cliente> clientes = repository.getClientes();
		Set<Produto> produtos = repositoryP.getProduto();
		
		
		ClienteService service = new ClienteService();

		
//		try {
//			Joana.setDataNascimento(service.formatarData(Joana.getDataNascimento()));
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//		}
		
		Joana.setCpf(service.formatarCPF(Joana.getCpf()));		
		
		
		ProdutoService serviceP = new ProdutoService();
		Carro.setPlaca(serviceP.formatarPlaca(Carro.getPlaca()));		
		
		System.out.println(clientes);
		System.out.println(produtos);
		
		
		Date d = Date.valueOf(LocalDate.now());
		
		Pedido pedido = new Pedido(1, d , 5, Joana, Carro);
		System.out.println(pedido);	
		
		MetodoPrint teste = new MetodoPrint();
        teste.abrir();
        teste.escrever();
        teste.fechar();
     
	}
	
	
	
	
		
		
	

}
