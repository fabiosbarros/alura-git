package br.com.alquimiasolucoes.conversoesamercado.verificadores;

public class Verificador {
	
	private boolean valida;
	
	public Verificador() {
		this.setValida(false);
	}
		
// getters e setters	
	public boolean getValida() {
		return valida;
	}


	public void setValida(boolean valida) {
		this.valida = valida;
	}


// método de validação com uso de exceção.	
	public boolean validacao(String valor) {
		try {
			Double.parseDouble(valor);
			this.setValida(true);
			return this.getValida();
		}catch(NumberFormatException ex) {
			this.setValida(false);
			return this.getValida();
		}catch(NullPointerException ex) {
			this.setValida(false);
			return this.getValida();
		}
		
	}
	
}
