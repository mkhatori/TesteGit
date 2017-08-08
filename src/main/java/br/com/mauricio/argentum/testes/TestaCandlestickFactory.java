package br.com.mauricio.argentum.testes;
/*
 * Realizando testes no git
 * 
 * :D
 * 
 * */
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.mauricio.argentum.Candlestick;
import br.com.mauricio.argentum.Negocio;
import br.com.mauricio.argentum.reader.CandlestickFactory;

public class TestaCandlestickFactory {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		Negocio negocio1 = new Negocio(new BigDecimal("40.5"), 100, hoje);
		Negocio negocio2 = new Negocio(new BigDecimal("45.0"), 100, hoje);
		Negocio negocio3 = new Negocio(new BigDecimal("39.8"), 100, hoje);
		Negocio negocio4 = new Negocio(new BigDecimal("42.3"), 100, hoje);
		
		List<Negocio> negocios = Arrays.asList(negocio1, negocio2, negocio3, negocio4);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
		
		System.out.println(candle);
	}

}
