package com.sizanosky;

/*
 * Classe JogoDaVelha
 *
 * Classe principal do jogo.
 *
 * @author  Marcos Fabricio Sizanosky
 * @version 1.0
 * @since   2021-10-15
 */

import java.util.Scanner;

/** Classe principal do jogo.*/
public class JogoDaVelha {

	// Inicia as variáveis da aplicação.
	static int opcaoMenu;
	static int status;
	static int opcaoOponente;
	static String nome;
	static int cpu;
	static String nomeCPU = "CPU";
	static int contRodadas;
	static int vitoriasHumano;
	static int vitoriasCPU;
	static int empates;

	public static void main(String[] args) {

		System.out.println("Hello World!\n");
		System.out.println("#### Jogo da Velha ####\n");

		// Instância "input" para receber as entradas do usuário.
		Scanner input = new Scanner(System.in);

		// Inicializa as classes auxiliares.
		Tabuleiro pTabuleiro = new Tabuleiro();
		JogadorHumano pHumano = new JogadorHumano();
		Computador pCPU = new Computador();


		// Inicia aplicação.
		while (true) {

			System.out.println("""
					=====================
					|******* MENU ******|
					=====================
					""");

			System.out.println("Escolha uma das opções a seguir: \n");
			System.out.println("1 - Iniciar uma nova partida (Zera todos os contadores).");
			System.out.println("2 - Continuar jogando (Mantem as estatisticas anteriores.");
			System.out.println("0 - SAIR.\n");
			System.out.println("Digite a opção desejada: ");
			opcaoMenu = input.nextInt();

			if (opcaoMenu == 0) {
				System.out.println("\nAplicação encerrada!");

				System.exit(0);
			}	

			else if (opcaoMenu == 1) {
				// Zera tabuleiro e todos os contadores.
				pTabuleiro.zeraTabuleiro();
				status = 0;
				contRodadas = 1;
				vitoriasHumano = 0;
				vitoriasCPU = 0;
				empates = 0;

				// Identifica o jogador humano.
				System.out.println("Olá, digite as suas iniciais ou nome (ex: HUM / HUMANO): ");
				nome = input.next();
			}

			else if (opcaoMenu == 2) {
				// Reinicia o tabuleiro, contador de rodadas e a variável status.
				pTabuleiro.zeraTabuleiro();
				contRodadas = 1;
				status = 0;
				if (nome == null) {
					nome = "HUMANO";
				}
			}
			
			// Recebe a entrada do usuário e armazena o nome do oponente escolhido.
			System.out.println("Escolha seu oponente | 1-(CPU A), 2-(CPU B) ou 3-(CPU C): ");
			opcaoOponente = input.nextInt();
			
			// Atribui o jogador CPU com base na escolha do usuário.
			cpu = pCPU.setCPU(opcaoOponente);
			
			// Atribui um nome ao oponente CPU
			if (opcaoOponente == 1) {
				nomeCPU = "CPU A";
			} 
			else if (opcaoOponente == 2) {
				nomeCPU = "CPU B";
			} 
			else if (opcaoOponente == 3) {
				nomeCPU = "CPU C";
			}

			// Imprime uma informação sobre o tabuleiro.
			pTabuleiro.infoTab();

			// Inicia a partida.
			while (true) {

				System.out.println("*** Rodada nº" + contRodadas + " ****");

				/********** Jogador Humano **********/
				if (status == 0) {
					System.out.println(nome + " escolha a sua jogada: ");

					// Recebe a jogada do Humano.
					int jogadaHumano = input.nextInt();

					// Executa a jogada do humano e imprime o tabuleiro.
					pHumano.setJogadaHumano(pTabuleiro, jogadaHumano);
					pTabuleiro.imprimeTabuleiro();

					// Verifica o status do jogo (0 = inacabado; 1 = vencedor humano; 2 = vencedor CPU; 3 = empate).
					status = pTabuleiro.verificaStatus();
					System.out.println("status>>>>>>>>" + status);
				}

				/********** Jogador CPU **********/
				if (status == 0) {
					System.out.println("Jogada do " + nomeCPU);

					// Recebe jogada CPU e imprime o tabuleiro.
					pCPU.setJogadaCPU(pTabuleiro, cpu);
					pTabuleiro.imprimeTabuleiro();

					// Verifica o status do jogo (0 = inacabado; 1 = vencedor humano; 2 = vencedor CPU; 3 = empate).
					status = pTabuleiro.verificaStatus();
					System.out.println("status>>>>>>>>" + status);

					// Incrementa a variável contRodadas.
					contRodadas++;

					System.out.print("_________________________________________________\n"); // Separador
//					continue;
				}

				/********** Resultado **********/
				if (status != 0) {
					
					// Humano venceu.
					if (status == 1) {
						vitoriasHumano++;
						System.out.printf("\n*** PARABÉNS %s você derrotou %s !!! ***\n", nome, nomeCPU);
					}

					// CPU venceu. 
					else if (status == 2) {

						vitoriasCPU++;
						System.out.printf("\n+++ Boa tentativa %s mas você PERDEU... | %s Wins!!! +++", nome, nomeCPU);
					}

					// Empate.
					else if (status == 3) {
						empates++;
						System.out.printf("\nEMPATE!!! Até a próxima %s!\n", nome);
					}
					System.out.println("fim da pagina>>>>>>>>" + status);
					break;
				} 


			} // Fim do laço while (partida).

			// Imprime as estatísticas.
			System.out.println("Jogo encerrado em " + (contRodadas -1) + " rodadas.\n");

			System.out.println("***** Estatisticas *****");
			System.out.printf("Vitorias jogador %s : %d\n", nome, vitoriasHumano);
			System.out.printf("Vitorias CPU : %d\n", vitoriasCPU);
			System.out.printf("Empates : %d\n", empates);
			System.out.print("_________________________________________________\n\n");

		}
	}
}
