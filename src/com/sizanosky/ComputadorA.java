package com.sizanosky;

/*
 * Classe ComputadorA
 *
 * Classe que executa o padrão de jogadas do CPU A
 *
 * @author: Marcos Fabricio Sizanosky
 * @version 1.0
 * @since: 2021-10-15
 */

/** A classe ComputadorA .*/
public class ComputadorA extends Computador {

	// Variables.
	public String nomeCompA;

	// Constructor.
	public ComputadorA() {
		
		this.nomeCompA = "CPU A";
	}

	// Methods;
	/** O método jogadaCompA() .*/
	public int jogadaCompA(Tabuleiro tab) {
		// Este método faz jogadas de forma sequencial buscando sempre o próximo espaço livre.
		
		int pos = 1;

		for (int lin=0; lin <= 2; lin++) {
			for (int col=0; col <= 4; col += 2) {

				if (tab.matrizTab[lin][col] == '_') {
					return pos;
				}
				else if (pos > 9) {
					jogadaCompA(tab);
				}

				else {
					pos++;
				}
			}
		}
		return pos;
	}
}
