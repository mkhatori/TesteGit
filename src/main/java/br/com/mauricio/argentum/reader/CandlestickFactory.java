package br.com.mauricio.argentum.reader;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import br.com.mauricio.argentum.Candlestick;
import br.com.mauricio.argentum.Negocio;

public class CandlestickFactory {
	public Candlestick constroiCandleParaData(Calendar data, List<Negocio> negocios) {
		BigDecimal maximo = negocios.get(0).getPreco();
		BigDecimal minimo = negocios.get(0).getPreco();
		BigDecimal volume = BigDecimal.ZERO;
		
		for (Negocio negocio : negocios) {
			volume = volume.add(negocio.getVolume());
			
			if (negocio.getPreco().compareTo(maximo) == 1) {
				maximo = negocio.getPreco();
			} else if (negocio.getPreco().compareTo(minimo ) == -1) {
				minimo = negocio.getPreco();
			}
		}
		
		BigDecimal abertura = negocios.get(0).getPreco();
		BigDecimal fechamento = negocios.get(negocios.size()-1).getPreco();
		
		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
	}
}
