package desafioregistroapp.util;

import desafioregistroapp.model.DadosRegistro;

public class FormularioPrinter {
	public void registroPrint(DadosRegistro dadosregistro) {
		
		StringBuilder cupom = new StringBuilder();
		cupom.append("\n");
		cupom.append(" *************************** FICHA PROFISSIONAL ***************************");
		cupom.append("\n");
		cupom.append("\n PROFISSÃO: " + dadosregistro.getProfissao());
		cupom.append("\n Nome: " + dadosregistro.getNome());
		cupom.append("\n Salário requerido: Mínimo R$ " + dadosregistro.getSalarioMinPretendido() + "           Máximo R$ " + dadosregistro.getSalarioMaxPretendido() );
		cupom.append("\n Data de Nasc.: " + dadosregistro.getDataNasc() + "     " + " CPF : " + FormatterUtil.cpf(dadosregistro.getCpf())  + "     " + " RG : " +FormatterUtil.rg(dadosregistro.getRg() ));
		cupom.append("\n Endereço : " + dadosregistro.getEndereço());
		cupom.append("\n Nº: " + dadosregistro.getNumero() + "   " + " Bairro: " + dadosregistro.getBairro() + "   " + " Município: " + dadosregistro.getMunicipio() + "   " + " UF: " + dadosregistro.getUf() );
		cupom.append("\n Cep: " + FormatterUtil.cep(dadosregistro.getCep()) + "    Naturalidade: " + dadosregistro.getNaturalidade() + "    País: " + dadosregistro.getPais());
		cupom.append("\n Telefone: " + FormatterUtil.telefone(dadosregistro.getTelefoneContato())  + "    Celular: " + FormatterUtil.celular(dadosregistro.getCelular() ));
		cupom.append("\n E-Mail " + dadosregistro.getEmail());
		cupom.append("\n");
		cupom.append("\n Grau de Instrução: ");
		cupom.append("\n Analfabeto              " + " Ensino Fundamental           " + "Superior");
		cupom.append("\n Lê e Escreve            " + " Ensino Médio Incompleto      " + "Mestrado");
		cupom.append("\n Fundamental Incompleto  " + " Ensino Médio Completo        " + "Doutorado \n");
		cupom.append("\n **************************************************************************");
		
		
		System.out.println(cupom);
	}
}
