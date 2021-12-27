package carrental.model;

public class Produto {
	private String nomeVeiculo;
	private String placa;
	private String descricao;
	private double valorAluguel;
	private double valorCarro;
	
	public Produto(String nomeVeiculo, String placa, String descricao, double valorAluguel, double valorCarro) {
		super();
		this.nomeVeiculo = nomeVeiculo;
		this.placa = placa;
		this.descricao = descricao;
		this.valorAluguel = valorAluguel;
		this.valorCarro = valorCarro;
	}
	
	public String getNomeVeiculo() {
		return nomeVeiculo;
	}
	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public double getValorCarro() {
		return valorCarro;
	}

	public void setValorCarro(double valorCarro) {
		this.valorCarro = valorCarro;
	}

	@Override
	public String toString() {
		return String.format("Produto [nomeVeiculo=" + nomeVeiculo + ", placa=" + placa + ", descricao=" + descricao
				+ ", valorAluguel=" + "%.2f" +  "]", valorAluguel);
	}
	
	
	
}
