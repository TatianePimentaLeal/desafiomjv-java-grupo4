package desafioregistroapp.model;

import java.time.LocalDate;

public class DadosRegistro {
	private String cpf;
	private LocalDate dataNasc;
	private String nome;
	private String sexo;
	private String escolaridade;
	private String profissao;
	private Double salarioMinPretendido;
	private Double salarioMaxPretendido;
	private String telefoneContato;
	private String estrangeiro;
	
	private String rg;
	private String endereco;
	private String numero;
	private String bairro;
	private String municipio;
	private String uf;
	private String cep;
	private String naturalidade;
	private String pais;
	private String celular;
	private String email;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate campos) {
		this.dataNasc = campos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public Double getSalarioMinPretendido() {
		return salarioMinPretendido;
	}
	public void setSalarioMinPretendido(Double salarioMinPretendido) {
		this.salarioMinPretendido = salarioMinPretendido;
	}
	public Double getSalarioMaxPretendido() {
		return salarioMaxPretendido;
	}
	public void setSalarioMaxPretendido(Double salarioMaxPretendido) {
		this.salarioMaxPretendido = salarioMaxPretendido;
	}
	public String getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public String getEstrangeiro() {
		return estrangeiro;
	}
	public void setEstrangeiro(String estrangeiro) {
		this.estrangeiro = estrangeiro;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereço() {
		return endereco;
	}
	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "DadosRegistro [cpf=" + cpf + ", dataNasc=" + dataNasc + ", nome=" + nome + ", sexo=" + sexo
				+ ", escolaridade=" + escolaridade + ", profissao=" + profissao + ", salarioMinPretendido="
				+ salarioMinPretendido + ", salarioMaxPretendido=" + salarioMaxPretendido + ", telefoneContato="
				+ telefoneContato + ", estrangeiro=" + estrangeiro + "]";
	}
	
}
