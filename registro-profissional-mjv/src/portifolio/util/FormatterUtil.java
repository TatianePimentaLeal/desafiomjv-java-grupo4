package portifolio.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatterUtil {
	public static String moeda(Double valor) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
			symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
		DecimalFormat formatter = new DecimalFormat("¤ ###,###.###", symbols);
		return formatter.format(valor);
		
	}
	
	public static String cpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(9,11);
		String cpfFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
		return cpfFormatado;
	}
	
	public static String rg(String rg) {
		String part1 = rg.substring(0,2);
		String part2 = rg.substring(2,5);
		String part3 = rg.substring(5,8);
		String part4 = rg.substring(8,9);
		String rgFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
		return rgFormatado;
	}
	
	public static String cep(String cep) {
		String part1 = cep.substring(0,5);
		String part2 = cep.substring(5,8);
		String cepFormatado = part1.concat("-").concat(part2);
		return cepFormatado;
	}
		
	
	
	public static String data(LocalDate localDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return localDate.format(formatter);
	}
	
	public static String formataTelefone(String telefone) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");

        String telString = String.valueOf(telefone);

        if (telString.length() == 10) {
            stringBuilder.append(telString, 0, 2).append(") ");
            stringBuilder.append(telString, 2, 6).append("-");
            stringBuilder.append(telString, 6, 10);

            return stringBuilder.toString();

        } else if (telString.length() == 11) {
            stringBuilder.append(telString, 0, 2).append(") ");
            stringBuilder.append(telString, 2, 3).append(" ");
            stringBuilder.append(telString, 3, 7).append("-");
            stringBuilder.append(telString, 7, 11);

            return stringBuilder.toString();
        }
        return telString;

	}
}
