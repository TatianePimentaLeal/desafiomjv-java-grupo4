package carrental.model;

import java.util.Date;

import carrental.service.ClienteService;

public class Cliente {
	private String nome;
	private String email;
	private String senha;
	private String endereco;	
	private Date dataNascimento;
	private String cpf;
	
	public Cliente(String nome, String email, String senha, String endereco, Date dataNascimento, String cpf) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
	@Override
	public String toString() {
		ClienteService service = new ClienteService();
		return "Cliente [nome=" + nome + ", email=" + email + ", senha=" + senha + ", endereco=" + endereco
				+ ", dataNascimento=" + service.formatarData(dataNascimento) + ", cpf=" + cpf + "]";
	}
	
	
	
	
}
	
	