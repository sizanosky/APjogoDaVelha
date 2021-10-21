package com.sizanosky;

/*
 * Classe ComputadorB
 *
 * Classe que executa o padrão de jogadas do CPU B
 *
 * @author: Marcos Fabricio Sizanosky
 * @version 1.0
 * @since: 2021-10-15
 */

/** A classe ComputadorB .*/
public class ComputadorB extends Computador {

	// Variables.
	String nomeCompB;

	// Constructor.
	public ComputadorB() {
		this.nomeCompB = "CPU B";
	}

	// Methods.
	/** O método jogadaCompB() .*/
	public int jogadaCompB(Tabuleiro tab) {
		// Este método faz jogadas de forma sequencial do maior número (9) até (1) buscando sempre o próximo espaço livre.


		int pos = 9;

		for (int lin=2; lin >= 0; lin--) {
			for (int col=4; col >= 0; col -= 2) {

				if (tab.matrizTab[lin][col] == '_') {
					return pos;
				}
				else {
					pos--;
				}
			}
		}
		return pos;
	}
}
