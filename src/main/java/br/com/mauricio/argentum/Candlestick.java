package br.com.mauricio.argentum;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Candlestick {
	private final BigDecimal abertura;
	private final BigDecimal fechamento;
	private final BigDecimal minimo;
	private final BigDecimal maximo;
	private final BigDecimal volume;
	private final Calendar data;
	
	public Candlestick(BigDecimal abertura, BigDecimal fechamento, BigDecimal minimo, BigDecimal maximo, BigDecimal volume, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	public final BigDecimal getAbertura() {
		return abertura;
	}

	public final BigDecimal getFechamento() {
		return fechamento;
	}

	public final BigDecimal getMinimo() {
		return minimo;
	}

	public final BigDecimal getMaximo() {
		return maximo;
	}

	public final BigDecimal getVolume() {
		return volume;
	}

	public final Calendar getData() {
		return data;
	}
	
	public boolean isAlta() {
		return this.abertura.compareTo(this.fechamento) == -1;
	}
	
	public boolean isBaixa() {
		return this.abertura.compareTo(this.fechamento) == 1;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		return "Abertura " + this.getAbertura() + ", Fechamento " + this.getFechamento() + ", Mínima " + this.getMinimo() + 
				", Máxima " + this.getMaximo() + ", Volume " + this.getVolume() + ", Data " + dataFormatada.format(this.data.getTime());
	}
}
