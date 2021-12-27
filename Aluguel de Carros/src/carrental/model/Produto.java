package carrental.model;

public class Produto {
	private String nomeVeiculo;
	private String placa;
	private String descricao;
	private int qtdDias; 
	private double valorAluguel;
	private double valorTotal;
	
	
	public Produto(String nomeVeiculo, String placa, String descricao, int qtdDias, double valorAluguel,
			double valorTotal) {
		super();
		this.nomeVeiculo = nomeVeiculo;
		this.placa = placa;
		this.descricao = descricao;
		this.qtdDias = qtdDias;
		this.valorAluguel = valorAluguel;
		this.valorTotal = valorTotal;
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
	public int getQtdDias() {
		return qtdDias;
	}
	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public double getValorCarro() {
		return valorTotal;
	}
	public void setValorCarro(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public String toString() {
		return String.format("Detalhes do Produto "
				+ "\nNome Veiculo: " + nomeVeiculo 
				+ "\nPlaca: " + placa 
				+ "\nDescricao: " + descricao
				+ "\nQuantidade de dias que ficará alugado: " + qtdDias
				+ "\nValor do Aluguel: " +  valorAluguel
				+ "\nValor do Total: " +  valorTotal);
				 
	}
	
	
	
}
