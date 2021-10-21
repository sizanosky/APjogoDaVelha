package com.sizanosky;

/*
 * Classe Computador
 *
 * Classe que controla as jogadas do CPU
 *
 * @author: Marcos Fabricio Sizanosky 
 * @version 1.0
 * @since: 2021-10-15
 */

/** A classe Computador controla as jogadas do CPU e envia para o tabuleiro.*/
public class Computador {

	// Constants.
	final char CPU = 'O';

	private String nomeCPU;
	int jogadaComp;


	// Constructor.
	public Computador() {
	}
	public Computador(String nomeCPU) {
		this.nomeCPU = nomeCPU;
	}

	// Getter and Setter.
	public String getNomeCPU() {
		return nomeCPU;
	}


	// Methods.
	/** O método setCPU()... .*/
	public int setCPU(int opcao) {

		// return 1 = ComputadorA.
		// return 2 = ComputadorB.
		// return 3 = ComputadorC.

		switch (opcao) {
		case 1 -> {
			ComputadorA compA = new ComputadorA();
			this.nomeCPU = compA.nomeCompA;
			System.out.println("\nVocê selecionou o CPU A: **** FÁCIL ****\n");
			return 1;
		}
		case 2 -> {
			ComputadorB compB = new ComputadorB();
			this.nomeCPU = compB.nomeCompB;
			System.out.println("\nVocê selecionou o CPU B: **** MÉDIO ****\n");
			return 2;
		}
		case 3 -> {
			ComputadorC compC = new ComputadorC();
			this.nomeCPU = compC.nomeCompC;
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
			jogadaComp = compA.jogadaCompA(tab);
		}
		else if (cpuEscolhido == 2) {
			ComputadorB compB = new ComputadorB();
			jogadaComp = compB.jogadaCompB(tab);
		}
		else if (cpuEscolhido == 3) {
			ComputadorC compC = new ComputadorC();
			jogadaComp = compC.jogadaCompC(tab);
		}
		System.out.println(jogadaComp);
		tab.armazenaJogada(jogadaComp, CPU);

	}
}