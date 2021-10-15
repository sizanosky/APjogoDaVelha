package com.sizanosky;

import java.util.Scanner;

public class JogoDaVelha {
	static String nome;

	public static void main(String[] args) {
        System.out.println("Hello World!\n");
        System.out.println("#### Jogo da Velha ####\n");

        // Instância "input" para receber as entradas do usuário.
        Scanner input = new Scanner(System.in);

        // Inicializa as classes auxiliares.
        Tabuleiro pBoard = new Tabuleiro();
        JogadorHumano pHumano = new JogadorHumano();
        Computador pCPU = new Computador();
        
        // Identifica o jogador.
        System.out.println("Olá, digite as suas iniciais ou nome (ex: HUM / HUMANO): ");
        nome = input.next();

        // Armazena o nível de dificuldade.
        System.out.println("Escolha o nível de dificuldade - 1-(FÁCIL), 2-(MÉDIO) ou 3-(DIFÍCIL) / 0-(Encerrar): ");
        int opcao = input.nextInt();
        pCPU.setCPU(opcao);
        
        // Imprime uma informação sobre o tabuleiro.
        pBoard.InfoTab();

        // Inicia o contador de jogadas.
        int contJogadas = 1;
       

        // Inicia o jogo.
        while (pBoard.verificaStatus() == 0) {
        	System.out.println("*** Rodada nº" + contJogadas + " ****");
        	
            // Recebe a jogada do Humano.
            System.out.println(nome + " escolha a sua jogada: ");
            int jogadaHumano = input.nextInt();

            pHumano.setJogadaHumano(jogadaHumano);
        	
            // Verifica o status do jogo.
            pBoard.verificaStatus();
        	
            
            // Recebe jogada CPU.
            System.out.println("Jogada do CPU");
            pCPU.setJogadaCPU();
            
            // Verifica o status do jogo.
            pBoard.verificaStatus();
            
            contJogadas++;
        }
        
        System.out.println("Jogo encerrado em " + contJogadas + "jogadas.");
    }
}
