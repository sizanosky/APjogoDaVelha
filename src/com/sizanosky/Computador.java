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
public abstract class Computador {

	// Constructor.
	public Computador() {
	}

	// Methods.
	/** O método getNomeCPU() retorna o nome do CPU escolhido. */
	public abstract String getNomeCPU();
	
	/** O método execJogadaCPU() de acordo com o CPU escolhido. */
	public abstract void execJogadaCPU(Tabuleiro tab);
	
}