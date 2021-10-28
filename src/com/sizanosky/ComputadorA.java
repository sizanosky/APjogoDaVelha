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
	final char CPU_A = 'O';
	public String nomeCompA = "CPU A";

	// Constructor.
	public ComputadorA() {
	}

	// Methods.
	
	/** O método getNomeCPU() retorna o nome do CPU escolhido. */
	@Override
	public String getNomeCPU() {
		return nomeCompA;
	}
	
	/** O método execJogadaCPU() sobrescreve o método da classe Computador */
	@Override
	public void execJogadaCPU(Tabuleiro tab) {
	// Este método faz jogadas de forma sequencial buscando sempre o próximo espaço livre.
		int pos = 1;	

		for (int lin=0; lin <= 2; lin++) {
			for (int col=0; col <= 4; col += 2) {

				if (tab.matrizTab[lin][col] == '_') {
					tab.armazenaJogada(pos, CPU_A);
					return;
				}
				else if (pos > 9) {
					execJogadaCPU(tab);
				}

				else {
					pos++;
				}
			}
		}
	}
}
