package br.com.mauricio.argentum;

import java.math.BigDecimal;
import java.util.Calendar;

public final class Negocio {
	private final BigDecimal preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negocio(BigDecimal preco, int quantidade, Calendar data) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	public final BigDecimal getPreco() {
		return preco;
	}

	public final int getQuantidade() {
		return quantidade;
	}

	public final Calendar getData() {
		return data;
	}
	
	public BigDecimal getVolume() {
		return this.preco.multiply(new BigDecimal(quantidade));
	}

}
