package carrental.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Pedido {
	
	private int numeroPedido;
	private Date dataPedido;	
	private int qtdDias;
	private java.util.Date dataDevolucao;
	private Cliente cliente;
	private Produto produto;
	
	
	
	public Pedido(int numeroPedido, Date dataPedido, int qtdDias, Date dataDevolucao, Cliente cliente,
			Produto produto) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataPedido = dataPedido;
		this.qtdDias = qtdDias;
		this.dataDevolucao = dataDevolucao;
		this.cliente = cliente;
		this.produto = produto;
	}


	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}

	public java.util.Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(java.util.Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return "Pedido Nº: " + numeroPedido 
				+ "\nData do Pedido:  " + formatarData.format(dataPedido)
				+ "\nQuantidade de Dias:" + qtdDias
				+ "\nCliente:" + cliente 
				+ "\nCarro:" + produto
				+ "\nData Devolução:" + formatador.format(dataDevolucao);
	}


		
	
	
	
	
}