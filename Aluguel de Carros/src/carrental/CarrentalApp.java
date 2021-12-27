package carrental;

import java.sql.Date;
import java.time.LocalDate;
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
		Produto carro = new Produto("Renault Sandeiro", "oqz1917", "Cinza chumbo", 10, 50.00, 2.55);
		repositoryP.criarProduto(carro);
		
		
		Set<Cliente> clientes = repository.getClientes();
		Set<Produto> produtos = repositoryP.getProduto();
		
		
		ClienteService service = new ClienteService();

		

		
		Joana.setCpf(service.formatarCPF(Joana.getCpf()));		
		
		
		ProdutoService serviceP = new ProdutoService();
		carro.setPlaca(serviceP.formatarPlaca(carro.getPlaca()));
		carro.setValorTotal(carro.getValorAluguel()*carro.getQtdDias());
		
		
		
		
		Date d = Date.valueOf(LocalDate.now());
		
		Date x =null;
		
		
		Pedido pedido = new Pedido(1, d , 5, x ,Joana, carro);
		
		PedidoService servicePedido = new PedidoService();
		pedido.setDataDevolucao(servicePedido.devolucao(d, carro.getQtdDias()));
		
		
		System.out.println(pedido);		

	
		MetodoPrint teste = new MetodoPrint();
        teste.abrir();
        teste.escrever(clientes, produtos, pedido);
        teste.fechar();
        
     
	}		
		
	

}
