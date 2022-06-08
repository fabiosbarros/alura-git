package br.com.alquimiasolucoes.conversoesamercado.teste;

//import br.com.alquimiasolucoes.conversoesamercado.conversores.*;  Dessa maneira importa todas as classes do pacote de uma vez
//import br.com.alquimiasolucoes.conversoesamercado.conversores.Conversor;
import br.com.alquimiasolucoes.conversoesamercado.conversores.ConversorDeMoeda;
import br.com.alquimiasolucoes.conversoesamercado.verificadores.Verificador;

import javax.swing.JOptionPane;

public class TesteConversor {

	public static void main(String[] args) {
		
		while(true){
			
			String tipoConversor = "0"; 
		
			try {
				tipoConversor = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null,
						new Object[] {"Conversor de Moeda", "Conversor de Chumbo em Ouro"}, "Conversor de Moeda").toString();
			}catch(NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Valor Inválido");
			}
		
		
			if(tipoConversor == "Conversor de Moeda") {
				String valor = JOptionPane.showInputDialog("Insira um valor: ");
			
				Verificador v = new Verificador();
				if(v.validacao(valor)) {
					double valorNumeral = Double.parseDouble(valor);
					ConversorDeMoeda cm = new ConversorDeMoeda();
					cm.setValorDigitado(valorNumeral);
				
								String tipoConversao = JOptionPane.showInputDialog(null, "Escolha para qual você deseja converter seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null, 
						new Object[] {"De Reais a Dolares", "De Reais a Euros", "De Reais a Libras Esterlinas", "De Reais a Pesos Argentinos", "De Reais a Pesos Chilenos",
						"De Dolares a Reais", "De Euros a Reais", "De Libras Esterlinas a Reais", "De Pesos Argentinos a Reais", "De Pesos Chilenos a Reais" }, 
						"De Reais a Dolares").toString();
				
								if(tipoConversao == "De Reais a Dolares") {
									// aqui eu chamo a função de converter adequada e depois ploto na tela o resultado da conversão
									cm.realEmDolar();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de R$" + String.format("%.2f", cm.getValorConvertido()));
								}else if(tipoConversao == "De Reais a Euros") {
									cm.realEmEuro();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de €" + String.format("%.2f", cm.getValorConvertido()));
								}else if(tipoConversao == "De Reais a Libras Esterlinas") {
									cm.realEmLibraEsterlina();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de £" + String.format("%.2f", cm.getValorConvertido()));
								}else if(tipoConversao == "De Reais a Pesos Argentinos") {
									cm.realEmPesoArgentino();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de $" + String.format("%.2f", cm.getValorConvertido()));
								}else if(tipoConversao ==  "De Reais a Pesos Chilenos") {
									cm.realEmPesoChileno();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de $" + String.format("%.2f", cm.getValorConvertido()));
								}else if(tipoConversao == "De Dolares a Reais") {
									cm.dolarEmReal();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de R$" + String.format("%.2f", cm.getValorConvertido()));
								}else if(tipoConversao == "De Euros a Reais") {
									cm.euroEmReal();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de R$" + String.format("%.2f", cm.getValorConvertido()));
								}else if(tipoConversao == "De Libras Esterlinas a Reais") {
									cm.libraEsterlinaEmReal();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de R$" + String.format("%.2f", cm.getValorConvertido()));
								}else if(tipoConversao == "De Pesos Argentinos a Reais") {
									cm.pesoArgentinoEmReal();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de R$" + String.format("%.2f", cm.getValorConvertido()));
								}else { // tipoConversao == "De Pesos Chilenos a Reais"
									cm.pesoChilenoEmReal();
									JOptionPane.showMessageDialog(null, "O valor da conversão é de R$" + String.format("%.2f", cm.getValorConvertido()));
								}
				
				
								int continua = 0;
								continua = JOptionPane.showConfirmDialog(null, "Deseja continuar?"); // (0)-sim (1)-não (2)-cancela (-1)- Fechar
								if(continua == 1) {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
									break;
								}else if(continua == 2){
									JOptionPane.showMessageDialog(null, "Programa concluido");
									break;
								}else {}
				
				}else {
					JOptionPane.showMessageDialog(null, "Valor Inválido");
				}
				
			}else if(tipoConversor == "Conversor de Chumbo em Ouro") { // Conversor de Chumbo em Ouro
				//A ideia aqui é tratar essa parte do jogo como game simples que faz referência a Alquimia, mas usando a cotação internacional dos ativos.
				JOptionPane.showMessageDialog(null, "Em desenvolvimento........");
				
				int continua = 0;
				continua = JOptionPane.showConfirmDialog(null, "Deseja continuar?"); // (0)-sim (1)-não (2)-cancela (-1)- Fechar
				if(continua == 1) {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				}else if(continua == 2){
					JOptionPane.showMessageDialog(null, "Programa concluido");
					break;
				}else {}
				
			}
			
		}
	}

}






