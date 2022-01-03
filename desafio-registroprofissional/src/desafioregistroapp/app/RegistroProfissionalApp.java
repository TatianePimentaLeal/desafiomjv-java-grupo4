package desafioregistroapp.app;

import java.util.List;

import desafioregistroapp.util.FormatarDadosRegistro;
import desafioregistroapp.util.FormularioPrinter;
import desafioregistroapp.model.DadosRegistro;

public class RegistroProfissionalApp {

	public static void main(String[] args) {
		FormatarDadosRegistro dados = new FormatarDadosRegistro();

		List<DadosRegistro> formulario = dados.formatarForm("C:\\estudos\\alldata\\del_alldata.txt");
		
		//for (DadosRegistro register: formulario) {
			//System.out.println(register);
	//	}
		
		FormularioPrinter fprinter = new FormularioPrinter();
	
		fprinter.registroPrint(formulario.get(0));
	
	}

}