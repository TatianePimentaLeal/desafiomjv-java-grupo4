package desafioregistroapp.util;

public class FormatterUtil {

	public static String cpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(9,11);
		String cpfFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
		return cpfFormatado;
		
	}
	
	
	public static String rg(String rg) {
		String reg1 = rg.substring(0,2);
		String reg2 = rg.substring(2,5);
		String reg3 = rg.substring(5,8);
		String reg4 = rg.substring(8,9);
		String rgFormatado = reg1.concat(".").concat(reg2).concat(".").concat(reg3).concat("-").concat(reg4);
		return rgFormatado;
	}
	
	public static String cep(String cep) {
		String cep1 = cep.substring(0,5);
		String cep2 = cep.substring(5,8);
		String cepFormatado = cep1.concat("-").concat(cep2);
		return cepFormatado;
	}
	
	public static String celular(String celular) {
		String cel1 = celular.substring(0,2);
		String cel2 = celular.substring(2,7);
		String cel3 = celular.substring(7,11);
		String celularFormatado = cel1.concat(" ").concat(cel2).concat("-").concat(cel3);
		return celularFormatado;
	}
	
	public static String telefone(String telefone) {
		String tel1 = telefone.substring(0,2);
		String tel2 = telefone.substring(2,6);
		String tel3 = telefone.substring(6,10);
		String telefoneFormatado = tel1.concat(" ").concat(tel2).concat("-").concat(tel3);
		return telefoneFormatado;
	}
	
}
