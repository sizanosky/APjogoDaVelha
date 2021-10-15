package com.sizanosky;

public class JogadorHumano extends Tabuleiro {

	// Constants.
	final char HUMANO = 'X';
//	final char OPONENTE = 'O';

	public JogadorHumano() {

	}

	public void setJogadaHumano(int jogadaHumano)  {

		for (int lin=0; lin < 2; lin++) {
			for (int col=0; col <= 4; col++) {

				if (matrizTab[lin][col] == '_') {
					ArmazenaJogada(jogadaHumano, HUMANO);
				}
				
				else {
					lin++;
					col++;
				}

			}
		}
		
	}
}
