package com.sizanosky;

/*
 *  Classe JogadorHumano
 *
 *  Classe que controla as jogadas do jogadorHumano.
 *
 * @author  Marcos Fabricio Sizanosky
 * @version 1.0
 * @since   2021-10-15 
 */

/** A classe JogadorHumano controla as jogadas do jogadorHumano e envia para o tabuleiro.*/
public class JogadorHumano {

	// Constants.
	final char HUMANO = 'X';

	public JogadorHumano() {
	}

	// Methods.
	/** O método execJogadasHumano() recebe a entrada do usuário e envia para o tabuleiro.*/
	public void execJogadaHumano(Tabuleiro tab, int jogadaHumano)  {

		tab.armazenaJogada(jogadaHumano, HUMANO);
	}
}
