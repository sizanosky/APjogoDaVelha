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
	final char CPU_B = 'O';
	public String nomeCompB = "CPU B";

	// Constructor.
	public ComputadorB() {
	}

	// Methods.
	
	/** O método getNomeCPU() retorna o nome do CPU escolhido. */
	@Override
	public String getNomeCPU() {
		return nomeCompB;
	}
	
	/** O método execJogadaCPU() sobrescreve o método da classe Computador */
	@Override
	public void execJogadaCPU(Tabuleiro tab) {
		// Este método faz jogadas de forma sequencial do maior número (9) ao menor numero (1) 
		// buscando sempre o próximo espaço livre.

		int pos = 9;

		for (int lin=2; lin >= 0; lin--) {
			for (int col=4; col >= 0; col -= 2) {

				if (tab.matrizTab[lin][col] == '_') {
					tab.armazenaJogada(pos, CPU_B);
					return;
				}
				else {
					pos--;
				}
			}
		}
	}
}
