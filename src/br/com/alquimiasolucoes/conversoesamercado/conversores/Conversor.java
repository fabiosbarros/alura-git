package br.com.alquimiasolucoes.conversoesamercado.conversores;


public class Conversor {

	private double valorDigitado;
	private double valorConvertido; // resultado final depois da conversão, só existe esse atributo de resultado.
	
	public Conversor() {
		this.setValorDigitado(0);
		this.setValorConvertido(0);
	}
	
	public double getValorDigitado() {
		return valorDigitado;
	}
	
	public void setValorDigitado(double valorDigitado) {
		this.valorDigitado = valorDigitado;
	}
	
	public double getValorConvertido() { 
		return valorConvertido;
	}
	
	public void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	
		
}
