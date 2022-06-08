package br.com.alquimiasolucoes.conversoesamercado.conversores;

public class ConversorDeMoeda extends Conversor {
								 // Futuramente atualizar com uma API que busca dados na intenet em tempo real.	
	private double cotacaoDolar; // Os valores foram inseridos de acordo com a cotação em 07/06/2022 as 16:28 SP.
	private double cotacaoEuro;
	private double cotacaoLibraEsterlina;
	private double cotacaoPesoArgentino;
	private double cotacaoPesoChileno;
	
	public ConversorDeMoeda() {
		super.setValorDigitado(0);
		super.setValorConvertido(0);
		
		this.setCotacaoDolar(0);
		this.setCotacaoEuro(0);
		this.setCotacaoLibraEsterlina(0);
		this.setCotacaoPesoArgentino(0);
		this.setCotacaoPesoChileno(0);
	}
	

	public double getCotacaoDolar() {
		return cotacaoDolar;
	}

	public void setCotacaoDolar(double cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}

	public double getCotacaoEuro() {
		return cotacaoEuro;
	}

	public void setCotacaoEuro(double cotacaoEuro) {
		this.cotacaoEuro = cotacaoEuro;
	}

	public double getCotacaoLibraEsterlina() {
		return cotacaoLibraEsterlina;
	}

	public void setCotacaoLibraEsterlina(double cotacaoLibraEsterlina) {
		this.cotacaoLibraEsterlina = cotacaoLibraEsterlina;
	}

	public double getCotacaoPesoArgentino() {
		return cotacaoPesoArgentino;
	}

	public void setCotacaoPesoArgentino(double cotacaoPesoArgentino) {
		this.cotacaoPesoArgentino = cotacaoPesoArgentino;
	}

	public double getCotacaoPesoChileno() {
		return cotacaoPesoChileno;
	}

	public void setCotacaoPesoChileno(double cotacaoPesoChileno) {
		this.cotacaoPesoChileno = cotacaoPesoChileno;
	}
	
	// Aqui os métodos de conversão de reais para outras moedas
	
	public void realEmDolar() {
		// Aqui eu uso o set para colocar a cotação da moeda em questão
		this.setCotacaoDolar(4.87);
		double valorTemp = super.getValorDigitado()/this.getCotacaoDolar(); 
		super.setValorConvertido(valorTemp); 		
	} 
	
	public void realEmEuro( ) {
		this.setCotacaoEuro(5.21);
		double valorTemp = super.getValorDigitado()/this.getCotacaoEuro();
		super.setValorConvertido(valorTemp);
	}
	
	public void realEmLibraEsterlina() {
		this.setCotacaoLibraEsterlina(6.13);
		double valorTemp = super.getValorDigitado()/this.getCotacaoLibraEsterlina();
		super.setValorConvertido(valorTemp);
	}
	
	public void realEmPesoArgentino() {
		this.setCotacaoPesoArgentino(0.040);
		double valorTemp = super.getValorDigitado()/this.getCotacaoPesoArgentino();
		super.setValorConvertido(valorTemp);
	}
	
	public void realEmPesoChileno() {
		this.setCotacaoPesoChileno(0.0059);
		double valorTemp = super.getValorDigitado()/this.getCotacaoPesoChileno();
		super.setValorConvertido(valorTemp);
	}
	
	// Aqui os métodos para converter outras moedas em reais
	
	public void dolarEmReal() {
		this.setCotacaoDolar(4.87);
		double valorTemp = this.getCotacaoDolar()*super.getValorDigitado();
		super.setValorConvertido(valorTemp);
	}
	
	public void euroEmReal() {
		this.setCotacaoEuro(5.21);
		double valorTemp = this.getCotacaoEuro()*super.getValorDigitado();
		super.setValorConvertido(valorTemp);
	}
	
	public void libraEsterlinaEmReal() {
		this.setCotacaoLibraEsterlina(6.13);
		double valorTemp = this.getCotacaoLibraEsterlina()*super.getValorDigitado();
		super.setValorConvertido(valorTemp);
	}
	
	public void pesoArgentinoEmReal() {
		this.setCotacaoPesoArgentino(0.040);
		double valorTemp = this.getCotacaoPesoArgentino()*super.getValorDigitado();
		super.setValorConvertido(valorTemp);
	}
	
	public void pesoChilenoEmReal() {
		this.setCotacaoPesoChileno(0.0059);
		double valorTemp = this.getCotacaoPesoChileno()*super.getValorDigitado();
		super.setValorConvertido(valorTemp);
	}
	
}
