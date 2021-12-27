package carrental;

import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Set;

import carrental.model.Cliente;
import carrental.model.Pedido;
import carrental.model.Produto;
import carrental.repository.ClienteRepository;
import carrental.repository.ProdutoRepository;
import carrental.service.ClienteService;
import carrental.service.ProdutoService;

public class CarrentalApp {

	public static void main(String[] args) {
		ClienteRepository repository = new ClienteRepository();
		Date data = new Date(1222, 12, 12);
		Cliente Joana = new Cliente("Joana", "Joana@gmail.com", "123456", "Rua:ABS, 123",data, "00000000000");
		repository.cadastrarCliente(Joana);
		
		ProdutoRepository repositoryP = new ProdutoRepository();
		Produto Carro = new Produto("Renault Sandeiro", "oqz1917", "Cinza chumbo", 50.00);
		repositoryP.criarProduto(Carro);
		
		Set<Cliente> clientes = repository.getClientes();
		Set<Produto> produtos = repositoryP.getProduto();
		
		
		ClienteService service = new ClienteService();

		Date data2 = new Date(2000, 10, 10);
		Joana.setDataNascimento(data2);
		
		Joana.setCpf(service.formatarCPF(Joana.getCpf()));		
		
		
		ProdutoService serviceP = new ProdutoService();
		Carro.setPlaca(serviceP.formatarPlaca(Carro.getPlaca()));		
		
		System.out.println(clientes);
		System.out.println(produtos);
		
		
		Date a = Date.valueOf(LocalDate.now());
		
		Pedido pedido = new Pedido(1, a , 5, Joana, Carro);
		System.out.println(pedido);	
		
		//----EVE------
		double aluguel = 120.0;
		DecimalFormat valorDecimal = new DecimalFormat("##.00");
		System.out.println(valorDecimal.format(aluguel));
	}
	
	
	
	
		
		
	

}
