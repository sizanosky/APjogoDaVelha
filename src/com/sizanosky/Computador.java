package com.sizanosky;

/*
 * Classe Computador
 *
 * Classe que controla as jogadas do CPU
 *
 * @author  Marcos Fabricio Sizanosky
 * @version 1.0
 * @since   2021-10-15
 */

/** A classe Computador controla as jogadas do CPU e envia para o tabuleiro.*/
public class Computador {

	// Constants.
	final char CPU = 'O';

	int jogada;

	// Constructor.
	public Computador() {
	}

	// Methods.
	/** O método setCPU()... .*/
	public int setCPU(int opcao) {

		// return 1 = ComputadorA.
		// return 2 = ComputadorB.
		// return 3 = ComputadorC.

		switch (opcao) {
		case 1 -> {
			System.out.println("\nVocê selecionou o CPU A: **** FÁCIL ****\n");
			return 1;
		}
		case 2 -> {
			System.out.println("\nVocê selecionou o CPU B: **** MÉDIO ****\n");
			return 2;
		}
		case 3 -> {
			System.out.println("\nVocê selecionou o CPU C: **** DIFÍCIL ****\n");
			return 3;
		}
		default -> System.out.println("Opção invalida!");
		}
		return 0;
	}

	/** O método execJogadaCPU() inicializa a classe de acordo com o CPU escolhido e executa a jogada.*/
	public void execJogadaCPU(Tabuleiro tab, int cpuEscolhido) {


		if (cpuEscolhido == 1) {
			ComputadorA compA = new ComputadorA();
			jogada = compA.jogadaCompA(tab);
		}
		else if (cpuEscolhido == 2) {
			ComputadorB compB = new ComputadorB();
			jogada = compB.jogadaCompB(tab);
		}
		else if (cpuEscolhido == 3) {
			ComputadorC compC = new ComputadorC();
			jogada = compC.jogadaCompC(tab);
		}
		System.out.println(jogada);
		tab.armazenaJogada(jogada, CPU);

	}
}