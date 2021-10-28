package com.sizanosky;

/*
 * Classe ComputadorC
 *
 * Classe que executa o padrão de jogadas do CPU C. 
 *
 * @author: Marcos Fabricio Sizanosky
 * @version 1.0
 * @since: 2021-10-15
 */

/** A classe ComputadorC .*/
public class ComputadorC extends Computador {

	// Variables.
	final char CPU_C = 'O';
	public String nomeCompC = "CPU C";

	// Constructor.
	public ComputadorC() {
	}

	// Methods.
	
	/** O método getNomeCPU() retorna o nome do CPU escolhido. */
	@Override
	public String getNomeCPU() {
		return nomeCompC;
	}
	
	/** O método getRandomNum() gera um numero aleatório entre 1 e 9. */
	public int getRandomNum(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	/** O método execJogadaCPU() sobrescreve o método da classe Computador */
	@Override
	public void execJogadaCPU(Tabuleiro tab) {
		// Este método faz jogadas de forma aleatória buscando sempre o próximo espaço livre.

		int numSorteado = getRandomNum(1, 10);
		int pos; // Posição que sera jogada no tabuleiro.

		while (true) {
			if ((numSorteado == 1) && (tab.matrizTab[0][0] == '_')) {
				pos = 1;
				break;
			}

			else if ((numSorteado == 2) && (tab.matrizTab[0][2] == '_')) {
				pos = 2;
				break;
			}

			else if ((numSorteado == 3) && (tab.matrizTab[0][4] == '_')) {
				pos = 3;
				break;
			}

			else if ((numSorteado == 4) && (tab.matrizTab[1][0] == '_')) {
				pos = 4;
				break;
			}

			else if ((numSorteado == 5) && (tab.matrizTab[1][2] == '_')) {
				pos = 5;
				break;
			} 

			else if ((numSorteado == 6) && (tab.matrizTab[1][4] == '_')) {
				pos = 6;
				break;
			}

			else if ((numSorteado == 7) && (tab.matrizTab[2][0] == '_')) {
				pos = 7;
				break;
			}

			else if ((numSorteado == 8) && (tab.matrizTab[2][2] == '_')) {
				pos = 8;
				break;
			}

			else if ((numSorteado == 9) && (tab.matrizTab[2][4] == '_')) {
				pos = 9;
				break;
			} 

			else 
				numSorteado = getRandomNum(1, 10); // Sorteia outra posição.
		}
		
		tab.armazenaJogada(pos, CPU_C); // Armazena a jogada.
	}
}
