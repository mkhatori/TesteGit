package br.com.mauricio.argentum.testes;

import java.math.BigDecimal;

public class TesteBigDec {

	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(11.5);
		BigDecimal bd2 = new BigDecimal(12.5);
		
		System.out.println(bd2.compareTo(bd) == 1);
	}

}
