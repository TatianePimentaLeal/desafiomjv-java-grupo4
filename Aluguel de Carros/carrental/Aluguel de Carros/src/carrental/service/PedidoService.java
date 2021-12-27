package carrental.service;

import java.util.Calendar;
import java.util.Date;

public class PedidoService {	
	
	

	public static Date devolucao(Date dataPedido, int qntDias){
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataPedido);
        cal.add(Calendar.DAY_OF_MONTH, qntDias);
        Date dataDevolucao = cal.getTime();
        return dataDevolucao;
    }


}
