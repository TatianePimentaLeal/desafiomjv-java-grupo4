package desafioregistroapp.util;

import desafioregistroapp.model.DadosRegistro;

public class FormularioPrinter {
	public void registroPrint(DadosRegistro dadosregistro) {
		
		StringBuilder cupom = new StringBuilder();
		cupom.append("\n");
		cupom.append(" *************************** FICHA PROFISSIONAL ***************************");
		cupom.append("\n");
		cupom.append("\n PROFISS�O: " + dadosregistro.getProfissao());
		cupom.append("\n Nome: " + dadosregistro.getNome());
		cupom.append("\n Sal�rio requerido: M�nimo R$ " + dadosregistro.getSalarioMinPretendido() + "           M�ximo R$ " + dadosregistro.getSalarioMaxPretendido() );
		cupom.append("\n Data de Nasc.: " + dadosregistro.getDataNasc() + "     " + " CPF : " + FormatterUtil.cpf(dadosregistro.getCpf())  + "     " + " RG : " +FormatterUtil.rg(dadosregistro.getRg() ));
		cupom.append("\n Endere�o : " + dadosregistro.getEndere�o());
		cupom.append("\n N�: " + dadosregistro.getNumero() + "   " + " Bairro: " + dadosregistro.getBairro() + "   " + " Munic�pio: " + dadosregistro.getMunicipio() + "   " + " UF: " + dadosregistro.getUf() );
		cupom.append("\n Cep: " + FormatterUtil.cep(dadosregistro.getCep()) + "    Naturalidade: " + dadosregistro.getNaturalidade() + "    Pa�s: " + dadosregistro.getPais());
		cupom.append("\n Telefone: " + FormatterUtil.telefone(dadosregistro.getTelefoneContato())  + "    Celular: " + FormatterUtil.celular(dadosregistro.getCelular() ));
		cupom.append("\n E-Mail " + dadosregistro.getEmail());
		cupom.append("\n");
		cupom.append("\n Grau de Instru��o: ");
		cupom.append("\n Analfabeto              " + " Ensino Fundamental           " + "Superior");
		cupom.append("\n L� e Escreve            " + " Ensino M�dio Incompleto      " + "Mestrado");
		cupom.append("\n Fundamental Incompleto  " + " Ensino M�dio Completo        " + "Doutorado \n");
		cupom.append("\n **************************************************************************");
		
		
		System.out.println(cupom);
	}
}
