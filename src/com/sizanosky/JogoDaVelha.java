package com.sizanosky;

/*
 * Classe JogoDaVelha
 *
 * Classe principal do jogo.
 *
 * @author: Marcos Fabricio Sizanosky RU3395570
 * @version 1.0
 * @since: 2021-10-15
 */

import java.util.Scanner;

/** Classe principal do jogo.*/
public class JogoDaVelha {
	
	static final int INACABADO = 0; // Usado como parâmetro para verificar o status da partida.
	static int opcaoMenu;
	// Contadores.
	static int vitoriasHumano;
	static int vitoriasCPU;
	static int empates;
	

	public static void main(String[] args) {

		System.out.println("Hello World!\n");
		System.out.println("#### Jogo da Velha ####\n");

		String nomeJogador;
		String nomeCPU;

		// Inicializa Scanner para receber as entradas do usuário.
		Scanner input = new Scanner(System.in);

		// Inicializa as classes auxiliares.
		Tabuleiro pTabuleiro = new Tabuleiro();
		JogadorHumano pHumano = new JogadorHumano("HUMANO");
		Computador pCPU;


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
				// Zera todos os contadores.
				vitoriasHumano = 0;
				vitoriasCPU = 0;
				empates = 0;

				// Identifica o jogador humano.
				System.out.println("Olá, digite as suas iniciais ou nome (ex: HUM / HUMANO): ");
				nomeJogador = input.next();
				pHumano.setNomeJogador(nomeJogador);
			}

			// Recebe a entrada do usuário, define o nível de dificuldade e o nome do oponente escolhido.
			while (true) {
				System.out.println("Escolha seu oponente | 1-(CPU A), 2-(CPU B) ou 3-(CPU C): ");
				int oponente = input.nextInt();
			
				if (oponente == 1) {
					pCPU = new ComputadorA();
					nomeCPU = pCPU.getNomeCPU();
					System.out.println("\nVocê selecionou o CPU A:  **** FÁCIL ****\n");
					break;
				}
				else if (oponente == 2) {
					pCPU = new ComputadorB();
					nomeCPU = pCPU.getNomeCPU();
					System.out.println("\nVocê selecionou o CPU B:  **** MÉDIO ****\n");
					break;
				}
				else if (oponente == 3){
					pCPU = new ComputadorC();
					nomeCPU = pCPU.getNomeCPU();
					System.out.println("\nVocê selecionou o CPU C:  **** DIFÍCIL ****\n");
					break;
				}
				else {
					System.out.println("Opção invalida!");
				}
			}

			// Imprime uma informação sobre o tabuleiro.
			pTabuleiro.infoTab();

			// Cria um tabuleiro vazio.
			pTabuleiro.criaTab();
			int contRodadas = 1;
			int status = 0;


			// Inicia a partida.
			while (status == INACABADO) {

				/* ********* Jogador Humano ********* */
				System.out.println(pHumano.getNomeJogador() + " escolha a sua jogada: ");

				// Recebe a jogada do Humano.
				int jogadaHumano = input.nextInt();

				// Executa a jogada do humano e imprime o tabuleiro.
				pHumano.execJogadaHumano(pTabuleiro, jogadaHumano);
				pTabuleiro.imprimeTabuleiro();

				// Verifica o status do jogo (0 = inacabado; 1 = vencedor humano; 2 = vencedor CPU; 3 = empate).
				status = pTabuleiro.verificaStatus();

				/* ********* Jogador CPU ********* */
				if (status == 0) {
					System.out.println("Jogada do " + nomeCPU);

					// Recebe jogada CPU e imprime o tabuleiro.
					pCPU.execJogadaCPU(pTabuleiro);
					pTabuleiro.imprimeTabuleiro();

					// Verifica o status do jogo (0 = inacabado; 1 = vencedor humano; 2 = vencedor CPU; 3 = empate).
					status = pTabuleiro.verificaStatus();

					// Incrementa a variável contRodadas.
					contRodadas++;

					System.out.println("_________________________________________________\n"); // Separador
				}
			}

			/* ********* Resultado ********* */
			
			System.out.print("_________________________________________________\n");
			// Humano venceu.
			if (status == 1) {
				vitoriasHumano++;
				System.out.printf("\n*** PARABÉNS %s você derrotou %s !!! ***\n", pHumano.getNomeJogador(), nomeCPU);
			}

			// CPU venceu. 
			else if (status == 2) {

				vitoriasCPU++;
				System.out.printf("\n+++ Boa tentativa %s mas você PERDEU... | %s Wins!!! +++",
								  pHumano.getNomeJogador(), nomeCPU);
			}

			// Empate.
			else if (status == 3) {
				empates++;
				System.out.printf("\nEMPATE!!! Até a próxima %s!\n", pHumano.getNomeJogador());
			}

			// Imprime as estatísticas.
			System.out.println("Jogo encerrado em " + (contRodadas -1) + " rodadas.\n");

			System.out.println("***** Estatisticas *****");
			System.out.printf("Vitorias jogador %s : %d\n", pHumano.getNomeJogador(), vitoriasHumano);
			System.out.printf("Vitorias CPU : %d\n", vitoriasCPU);
			System.out.printf("Empates : %d\n", empates);
			System.out.print("_________________________________________________\n\n");

		}
	}
}
