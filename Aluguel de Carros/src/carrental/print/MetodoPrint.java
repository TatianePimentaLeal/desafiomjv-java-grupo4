package carrental.print;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Set;

import carrental.model.Cliente;
import carrental.model.Pedido;
import carrental.model.Produto;

public class MetodoPrint {
	private Formatter arquivo;

    public void abrir()
    {
        try
        {
            arquivo = new Formatter("ProgramacaoProgressiva.txt");
        }
        catch( SecurityException semPermissao) 
        {
            System.err.println(" Sem permissao para escrever no arquivo ");
            System.exit(1); //exit(0) é sucesso, outro número significa que terminou com problemas
        }
        catch( FileNotFoundException arquivoInexistente )
        {
            System.err.println(" Arquivo inexistente ou arquivo não pode ser criado");
            System.exit(1);
        }
    }
     
    public void escrever(Set<Cliente> clientes, Set<Produto> produtos, Pedido pedido)
    {
        try
        {
            arquivo.format("Dados do Cliente: " + clientes +"\nDados do produto: "+ pedido + "\nDados do Aluguel: " + produtos);
            System.out.println("Impressão em arquivo realizada com sucesso");
        }
        catch(FormatterClosedException formatoDesconhecido)
        {
                    System.err.println("Erro ao escrever");
                    return;
        }
        catch(NoSuchElementException excecaoElemento)
        {
            System.err.println("Entrada invalida. Por exemplo, era pra ser uma string, mas foi um inteiro");
        }
     
    }
 
   public void fechar()
   {
       arquivo.close();
   }

}
