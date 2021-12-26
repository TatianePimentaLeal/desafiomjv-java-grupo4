package carrental;

import java.util.Set;

import carrental.model.Cliente;
import carrental.repository.ClienteRepository;
import carrental.service.ClienteService;

public class CarrentalApp {

	public static void main(String[] args) {
		ClienteRepository repository = new ClienteRepository();
		Cliente Joana = new Cliente("Joana", "Joana@gmail.com", "123456", "Rua:ABS, 123","12/12/1995", "00000000000");
		repository.cadastrarCliente(Joana);
		
		Set<Cliente> clientes = repository.getClientes();
		System.out.println(clientes);
		
		ClienteService service = new ClienteService();
		
		service.formatarData(Joana.getDataNascimento());		
		
		System.out.println(Joana.getDataNascimento());
		
		
		
		Joana.setCpf(service.formatarCPF(Joana.getCpf()));		
		
		System.out.println(Joana.getCpf());
		
		
		
		
		
		
	}

}
